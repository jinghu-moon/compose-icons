package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Capsule: ImageVector
    get() {
        if (_capsule != null) return _capsule!!
        _capsule = tablerFilledIcon(
            name = "Capsule",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 11.757 2.004 C 7.989 2.137 5.002 5.229 5.000 9.000 L 5.000 15.000 C 5.000 18.866 8.134 22.000 12.000 22.000 L 12.243 21.996 C 16.011 21.863 18.998 18.771 19.000 15.000 L 19.000 9.000 C 19.000 5.134 15.866 2.000 12.000 2.000 Z"),
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
        return _capsule!!
    }

private var _capsule: ImageVector? = null
