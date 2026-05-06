package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) return _wechatLogo!!
        _wechatLogo = phosphorThinIcon(
            name = "WechatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM188 132c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM235.5 212.6c1.24 4.213 .079 8.768-3.026 11.874-3.106 3.106-7.66 4.267-11.874 3.026l-26.21-7.71c-19.114 9.691-41.432 10.862-61.455 3.224C112.912 215.376 97.044 199.639 89.24 179.68c-9.632-.825-19.015-3.504-27.63-7.89l-26.21 7.71c-4.213 1.24-8.768 .079-11.874-3.026-3.106-3.106-4.267-7.66-3.026-11.874l7.71-26.21C15.638 113.405 17.806 83.534 33.854 60.626 49.901 37.717 77.234 25.475 105.011 28.754c27.777 3.279 51.508 21.55 61.779 47.566 25.111 2.25 47.471 16.806 59.692 38.857 12.221 22.051 12.711 48.728 1.308 71.213ZM86.5 171.32C80.608 148.874 85.294 124.965 99.224 106.404 113.154 87.843 134.801 76.664 158 76.05 147.665 53.609 125.97 38.539 101.332 36.687 76.695 34.835 52.991 46.493 39.417 67.137 25.843 87.781 24.535 114.164 36 136.05c.484 .923 .595 1.997 .31 3l-8.17 27.76c-.436 1.416-.053 2.958 .994 4.006 1.048 1.048 2.589 1.431 4.006 .994l27.76-8.17c1.003-.285 2.077-.174 3 .31 7.033 3.786 14.687 6.282 22.6 7.37ZM227.83 214.86l-8.17-27.76c-.285-1.003-.174-2.077 .31-3 15.89-29.724 7.608-66.603-19.465-86.679C173.432 77.345 135.737 80.131 111.909 103.968c-23.829 23.837-26.6 61.532-6.514 88.598 20.086 27.066 56.967 35.334 86.685 19.434 .583-.307 1.231-.469 1.89-.47 .382-.001 .763 .053 1.13 .16l27.76 8.17c1.416 .436 2.958 .053 4.006-.994 1.048-1.048 1.431-2.589 .994-4.006Z"),
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
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
