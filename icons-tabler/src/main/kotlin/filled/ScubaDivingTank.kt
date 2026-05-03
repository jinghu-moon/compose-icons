package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ScubaDivingTank: ImageVector
    get() {
        if (_scubaDivingTank != null) return _scubaDivingTank!!
        _scubaDivingTank = tablerFilledIcon(
            name = "ScubaDivingTank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 17.000 L 17.000 19.000 C 17.000 20.657 15.657 22.000 14.000 22.000 L 10.000 22.000 C 8.343 22.000 7.000 20.657 7.000 19.000 L 7.000 17.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 2.000 C 8.715 2.000 9.375 2.381 9.732 3.000 L 10.882 3.000 C 11.166 2.681 11.573 2.498 12.000 2.498 C 12.427 2.498 12.834 2.681 13.118 3.000 L 15.000 3.000 C 15.552 3.000 16.000 3.448 16.000 4.000 C 16.000 4.552 15.552 5.000 15.000 5.000 L 13.117 5.001 C 13.080 5.041 13.042 5.080 13.002 5.117 L 13.002 6.100 C 15.330 6.576 17.001 8.624 17.000 11.000 L 17.000 15.000 L 7.000 15.000 L 7.000 11.000 C 7.000 8.624 8.672 6.575 11.000 6.100 L 11.000 5.117 C 10.959 5.080 10.920 5.041 10.883 5.001 L 9.732 5.001 C 9.246 5.841 8.228 6.211 7.316 5.879 C 6.404 5.547 5.862 4.608 6.031 3.653 C 6.199 2.697 7.030 2.000 8.000 2.000"),
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
        return _scubaDivingTank!!
    }

private var _scubaDivingTank: ImageVector? = null
