package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronLeft: ImageVector
    get() {
        if (_squareChevronLeft != null) return _squareChevronLeft!!
        _squareChevronLeft = tablerFilledIcon(
            name = "SquareChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 13.707 8.293 C 13.316 7.903 12.684 7.903 12.293 8.293 L 9.293 11.293 L 9.210 11.387 C 8.901 11.785 8.937 12.351 9.293 12.707 L 12.293 15.707 L 12.387 15.790 C 12.785 16.099 13.351 16.063 13.707 15.707 L 13.790 15.613 C 14.099 15.215 14.063 14.649 13.707 14.293 L 11.415 12.000 L 13.707 9.707 L 13.790 9.613 C 14.099 9.215 14.063 8.649 13.707 8.293 Z"),
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
        return _squareChevronLeft!!
    }

private var _squareChevronLeft: ImageVector? = null
