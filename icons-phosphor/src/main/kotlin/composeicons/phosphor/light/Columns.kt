package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorLightIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 34h-40C56.268 34 50 40.268 50 48v160c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM106 208c0 1.105-.895 2-2 2h-40c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h40c1.105 0 2 .895 2 2ZM192 34h-40c-7.732 0-14 6.268-14 14v160c0 7.732 6.268 14 14 14h40c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM194 208c0 1.105-.895 2-2 2h-40c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h40c1.105 0 2 .895 2 2Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
