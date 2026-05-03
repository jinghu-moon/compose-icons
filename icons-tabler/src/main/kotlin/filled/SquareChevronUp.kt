package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronUp: ImageVector
    get() {
        if (_squareChevronUp != null) return _squareChevronUp!!
        _squareChevronUp = tablerFilledIcon(
            name = "SquareChevronUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.613 9.210 C 12.215 8.901 11.649 8.937 11.293 9.293 L 8.293 12.293 L 8.210 12.387 C 7.901 12.785 7.937 13.351 8.293 13.707 L 8.387 13.790 C 8.785 14.099 9.351 14.063 9.707 13.707 L 12.000 11.415 L 14.293 13.707 L 14.387 13.790 C 14.804 14.113 15.400 14.056 15.749 13.660 C 16.097 13.265 16.079 12.666 15.707 12.293 L 12.707 9.293 Z"),
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
        return _squareChevronUp!!
    }

private var _squareChevronUp: ImageVector? = null
