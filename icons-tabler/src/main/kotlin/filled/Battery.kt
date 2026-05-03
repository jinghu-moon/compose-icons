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
                pathData = parseSvgPathData("M 17.000 6.000 C 18.589 6.000 19.902 7.238 19.995 8.824 L 20.000 9.000 L 20.000 9.086 L 20.052 9.105 C 20.575 9.312 20.939 9.795 20.993 10.355 L 21.000 10.500 L 21.000 13.500 C 21.000 14.115 20.624 14.669 20.052 14.895 L 20.000 14.913 L 20.000 15.000 C 20.000 16.589 18.762 17.902 17.176 17.995 L 17.000 18.000 L 6.000 18.000 C 4.411 18.000 3.098 16.762 3.005 15.176 L 3.000 15.000 L 3.000 9.000 C 3.000 7.411 4.238 6.098 5.824 6.005 L 6.000 6.000 L 17.000 6.000 Z"),
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
