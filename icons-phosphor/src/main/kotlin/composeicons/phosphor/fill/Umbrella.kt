package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorFillIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 126.63C235.02 68.508 186.335 23.896 128 24h0C69.684 23.922 21.029 68.527 16.05 126.63c-.384 4.467 1.124 8.89 4.156 12.192 3.032 3.302 7.311 5.181 11.794 5.178h88v56c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-56h88c4.492 .016 8.784-1.856 11.827-5.16 3.043-3.304 4.558-7.735 4.173-12.21ZM32 128C35.641 85.682 66.617 50.767 108.2 42.11 96.48 58 81.85 86.11 80.17 128h-48.17ZM175.83 128c-1.68-41.89-16.31-70-28-85.94C189.432 50.71 220.409 85.661 224 128Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
