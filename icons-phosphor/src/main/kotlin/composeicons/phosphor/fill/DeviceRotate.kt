package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorFillIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 221.66l-24 24c-2.288 2.291-5.731 2.976-8.722 1.737C169.947 246.158 167.997 243.238 168 240v-16h-88C66.745 224 56 213.255 56 200v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v96c0 4.418 3.582 8 8 8h88v-16c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM80 72c4.418 0 8-3.582 8-8v-16h88c4.418 0 8 3.582 8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96C200 42.745 189.255 32 176 32h-88v-16C88.003 12.762 86.053 9.842 83.062 8.603 80.071 7.364 76.628 8.049 74.34 10.34l-24 24C48.838 35.841 47.994 37.877 47.994 40c0 2.123 .844 4.159 2.346 5.66L74.34 69.66C75.842 71.16 77.878 72.002 80 72Z"),
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
