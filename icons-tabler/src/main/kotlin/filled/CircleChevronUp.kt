package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronUp: ImageVector
    get() {
        if (_circleChevronUp != null) return _circleChevronUp!!
        _circleChevronUp = tablerFilledIcon(
            name = "CircleChevronUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 12.707 9.293 C 12.316 8.903 11.684 8.903 11.293 9.293 L 8.293 12.293 C 7.903 12.684 7.903 13.316 8.293 13.707 L 8.387 13.790 C 8.785 14.099 9.351 14.063 9.707 13.707 L 12.000 11.415 L 14.293 13.707 C 14.685 14.086 15.309 14.081 15.695 13.695 C 16.081 13.309 16.086 12.685 15.707 12.293 Z"),
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
        return _circleChevronUp!!
    }

private var _circleChevronUp: ImageVector? = null
