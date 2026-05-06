package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorRegularIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 221.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L180.69 224h-100.69C66.745 224 56 213.255 56 200v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v96c0 4.418 3.582 8 8 8h100.69L170.34 197.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM80 72c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722L75.31 48h100.69c4.418 0 8 3.582 8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96C200 42.745 189.255 32 176 32h-100.69L85.66 21.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-24 24C48.838 35.841 47.994 37.877 47.994 40c0 2.123 .844 4.159 2.346 5.66L74.34 69.66C75.842 71.16 77.878 72.002 80 72Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
