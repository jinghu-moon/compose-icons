package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorLightIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 34h-24C48.268 34 42 40.268 42 48v160c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-160C94 40.268 87.732 34 80 34ZM82 208c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM152 34h-24c-7.732 0-14 6.268-14 14v160c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM154 208c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h24c1.105 0 2 .895 2 2ZM246 128c0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
