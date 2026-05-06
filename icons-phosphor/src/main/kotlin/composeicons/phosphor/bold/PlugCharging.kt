package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorBoldIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48h-44v-32C180 9.373 174.627 4 168 4c-6.627 0-12 5.373-12 12v32h-56v-32C100 9.373 94.627 4 88 4 81.373 4 76 9.373 76 16v32h-43.45C24.4 48 20 54.18 20 60c0 6.627 5.373 12 12 12h12v92c.028 24.289 19.711 43.972 44 44h28v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32h28c24.289-.028 43.972-19.711 44-44v-92h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM188 164c0 11.046-8.954 20-20 20h-80C76.954 184 68 175.046 68 164v-92h120ZM102.14 134.83c-2.228-3.222-2.743-7.328-1.38-11l12-32c2.325-6.208 9.242-9.355 15.45-7.03 6.208 2.325 9.355 9.242 7.03 15.45L129.32 116h14.68c3.936-.001 7.621 1.928 9.864 5.162 2.243 3.234 2.757 7.362 1.376 11.048l-12 32c-2.325 6.208-9.242 9.355-15.45 7.03-6.208-2.325-9.355-9.242-7.03-15.45L126.68 140h-14.68c-3.936-.002-7.62-1.934-9.86-5.17Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
