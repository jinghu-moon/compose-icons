package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorLightIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 162h-160c-7.732 0-14 6.268-14 14v24c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-24c0-7.732-6.268-14-14-14ZM210 200c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-24c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM208 90h-160c-7.732 0-14 6.268-14 14v24c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-24c0-7.732-6.268-14-14-14ZM210 128c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-24c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM98 40c0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
