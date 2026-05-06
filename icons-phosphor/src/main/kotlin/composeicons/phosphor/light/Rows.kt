package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorLightIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 138h-160c-7.732 0-14 6.268-14 14v40c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14ZM210 192c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-40c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM208 50h-160C40.268 50 34 56.268 34 64v40c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-40c0-7.732-6.268-14-14-14ZM210 104c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-40c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
