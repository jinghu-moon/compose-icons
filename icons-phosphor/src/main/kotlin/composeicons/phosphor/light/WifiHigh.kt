package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorLightIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 204c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM235.81 88.55C173.13 37.139 82.87 37.139 20.19 88.55c-1.667 1.358-2.479 3.504-2.131 5.625 .349 2.121 1.806 3.894 3.82 4.647 2.014 .753 4.276 .371 5.931-1.002 58.252-47.771 142.128-47.771 200.38 0 1.655 1.372 3.917 1.754 5.931 1.002 2.014-.753 3.471-2.525 3.82-4.647 .349-2.121-.464-4.267-2.131-5.625ZM203.73 124.34C159.355 89.207 96.645 89.207 52.27 124.34c-2.598 2.06-3.035 5.837-.975 8.435 2.06 2.599 5.836 3.035 8.435 .975 40.006-31.666 96.534-31.666 136.54 0 1.068 .824 2.382 1.264 3.73 1.25 2.553 0 4.826-1.615 5.666-4.025 .84-2.41 .063-5.088-1.936-6.675ZM171.53 160.15c-25.95-18.876-61.11-18.876-87.06 0-2.597 1.977-3.137 5.666-1.217 8.305 1.92 2.639 5.598 3.258 8.277 1.395 21.742-15.814 51.198-15.814 72.94 0 2.679 1.949 6.43 1.358 8.38-1.32 1.949-2.679 1.358-6.43-1.32-8.38Z"),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
