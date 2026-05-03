package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerFilledIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.874 3.486 L 17.700 11.000 L 21.000 11.000 C 21.846 11.000 22.293 11.973 21.791 12.612 L 21.717 12.697 L 14.817 19.792 C 12.878 21.739 10.030 22.470 7.393 21.697 C 4.756 20.924 2.753 18.771 2.172 16.086 C 1.591 13.400 2.525 10.612 4.607 8.818 L 12.353 2.238 C 13.075 1.624 14.167 2.266 13.981 3.196 L 13.404 6.075 L 20.514 2.125 C 21.394 1.637 22.363 2.606 21.874 3.485M 9.500 11.000 C 7.641 11.000 6.107 12.452 6.005 14.308 L 6.000 14.500 C 6.000 16.433 7.567 18.000 9.500 18.000 C 11.433 18.000 13.000 16.433 13.000 14.500 C 13.000 12.567 11.433 11.000 9.500 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _meteor!!
    }

private var _meteor: ImageVector? = null
