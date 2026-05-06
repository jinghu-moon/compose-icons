package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorLightIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 34h-24C96.268 34 90 40.268 90 48v160c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM130 208c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM200 34h-24c-7.732 0-14 6.268-14 14v160c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM202 208c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM70 128c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
