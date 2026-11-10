# Travel App

Explore curated destinations by search and category, view photo cards and load a destination guide with current Wikipedia summary data.

Pynexia Android Development / Week 3.

[Hosted showcase](https://engeyad.github.io/pynexia-week3-travel/) · [PDF report](https://github.com/ENGEyad/pynexia-week3-travel/releases/latest/download/Travel-App-Report.pdf) · [APK](https://github.com/ENGEyad/pynexia-week3-travel/releases/latest/download/Travel-App.apk) · [Source ZIP](https://github.com/ENGEyad/pynexia-week3-travel/releases/latest/download/Travel-App.zip)

## Implementation

### Destination discovery

Search ten destinations by place, country or highlight and filter the list by culture, history, nature, coast or city.

### Image cards and navigation

RecyclerView cards use Glide to load destination imagery and open a dedicated detail screen.

### Live destination guide

Retrofit requests the Wikimedia page-summary REST endpoint for the current extract, thumbnail and source link.

## Build

JDK 17/21, Android SDK 35, Android 8.0/API 26 or newer. Initial dependency sync requires internet.

```powershell
.\gradlew.bat :travel:assembleDebug :travel:lintDebug
```

## Walkthrough

1. Browse the destination cards and category filters.
2. Search a place, country or travel highlight.
3. Tap a card to load its live destination summary.
4. Open the Wikipedia travel guide for more details. A curated offline overview remains available if the service is unreachable.

## Verification

Debug build passed. Automated tests were not run. Lint reported 0 errors and 23 warnings; see `verification/`. Pixel 8 emulator, Android 17/API 37. No physical-device or API 26 review.

## Scope

Destination summaries are provided by Wikipedia and may change or be unavailable. If the service is unreachable, the detail screen shows a curated offline overview. Cover photos use remote Unsplash image URLs. Internet access is required for live guide details and photos.

## References

- https://www.mediawiki.org/wiki/Wikimedia_REST_API
- https://github.com/bumptech/glide

The hosted page displays screenshots and downloads; it is not an Android emulator.
