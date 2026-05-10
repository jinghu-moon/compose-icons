package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorFillIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M159.8 151.82c3.782 4.816 5.106 11.119 3.58 17.05l-12.18 48c-2.309 8.946-10.401 15.18-19.64 15.13h-7.12c-9.239 .05-17.331-6.184-19.64-15.13l-12.18-48c-1.526-5.931-.202-12.234 3.58-17.05 3.832-4.948 9.742-7.836 16-7.82h31.5c6.293-.048 12.247 2.845 16.1 7.82ZM156 116C156 100.536 143.464 88 128 88c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM182 143c-.84 2.776-.112 5.79 1.904 7.876 2.016 2.086 5.003 2.918 7.806 2.173 2.804-.744 4.985-2.948 5.7-5.759 8.15-29.321-3.015-60.6-27.89-78.133-24.875-17.533-58.086-17.533-82.961 0C61.685 86.69 50.52 117.969 58.67 147.29c1.499 3.824 5.649 5.891 9.604 4.785C72.229 150.968 74.704 147.046 74 143 67.742 120.216 76.457 95.955 95.784 82.362c19.327-13.593 45.105-13.593 64.432 0C179.543 95.955 188.258 120.216 182 143ZM128 24C82.191 23.991 41.77 53.955 28.463 97.789c-13.307 43.834 3.634 91.212 41.717 116.671 3.673 2.458 8.642 1.473 11.1-2.2 2.458-3.673 1.473-8.642-2.2-11.1C46.865 179.616 32.537 139.532 43.794 102.448 55.052 65.364 89.245 40.011 128 40.011c38.755 0 72.948 25.354 84.206 62.438 11.258 37.084-3.071 77.167-35.286 98.712-3.673 2.458-4.658 7.427-2.2 11.1 2.458 3.673 7.427 4.658 11.1 2.2 38.083-25.459 55.024-72.837 41.717-116.671C214.23 53.955 173.809 23.991 128 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
