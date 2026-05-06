package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorLightIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.34 52.86C160.035 39.88 146.181 28.461 131.09 18.86c-1.902-1.142-4.278-1.142-6.18 0-15.091 9.601-28.945 21.02-41.25 34C56.4 81.48 42 113 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 113 199.6 81.48 172.34 52.86ZM94 184c0-29.8 25.11-50.41 34-56.78 8.91 6.35 34 26.87 34 56.78-.001 18.105-14.17 33.043-32.25 34-.59 0-1.16 0-1.75 0-.59 0-1.16 0-1.75 0C108.17 217.043 94.001 202.105 94 184ZM168.42 205.94c3.671-6.729 5.59-14.274 5.58-21.94 0-42.9-41.16-68.09-42.91-69.14-1.902-1.142-4.278-1.142-6.18 0C123.16 115.91 82 141.1 82 184c-.01 7.666 1.909 15.211 5.58 21.94C66.645 192.289 54.015 168.993 54 144 54 84.17 113.62 40.74 128 31.14c14.39 9.6 74 53 74 112.86-.015 24.993-12.645 48.289-33.58 61.94Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
