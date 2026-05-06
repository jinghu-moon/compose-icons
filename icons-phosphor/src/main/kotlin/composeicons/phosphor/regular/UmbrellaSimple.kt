package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorRegularIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 126.63C236.274 83.908 208.571 47.026 168.58 31.543 128.588 16.061 83.272 24.674 51.75 53.75 31.123 72.7 18.379 98.716 16.05 126.63c-.384 4.467 1.124 8.89 4.156 12.192 3.032 3.302 7.311 5.181 11.794 5.178h88v56c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-56h88c4.492 .016 8.784-1.856 11.827-5.16 3.043-3.304 4.558-7.735 4.173-12.21ZM32 128h0C35.217 91.384 58.97 59.781 93.248 46.511c34.278-13.27 73.119-5.898 100.152 19.009C211.107 81.748 222.036 104.062 224 128Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
