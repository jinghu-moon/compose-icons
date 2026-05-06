package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Battery: ImageVector
    get() {
        if (_battery != null) return _battery!!
        _battery = tablerFilledIcon(
            name = "Battery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 6c1.589-0 2.902 1.238 2.995 2.824L20 9v.086l.052 .019c.523 .207 .887 .69 .941 1.25l.007 .145v3c0 .615-.376 1.169-.948 1.395L20 14.913v.087c0 1.589-1.238 2.902-2.824 2.995L17 18h-11C4.411 18 3.098 16.762 3.005 15.176L3 15v-6C3 7.411 4.238 6.098 5.824 6.005L6 6h11Z"),
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
        return _battery!!
    }

private var _battery: ImageVector? = null
