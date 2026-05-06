package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorLightIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 172c0 18.778-15.222 34-34 34-18.778 0-34-15.222-34-34v-102h-68v130c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-130h-10C48.804 70 30 88.804 30 112c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C18.033 82.19 42.19 58.033 72 58h152c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-50v102c0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
