package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterX: ImageVector
    get() {
        if (_squareLetterX != null) return _squareLetterX!!
        _squareLetterX = tablerFilledIcon(
            name = "SquareLetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 14.447 7.106 C 13.953 6.859 13.353 7.059 13.106 7.553 L 12.000 9.763 L 10.894 7.553 C 10.667 7.099 10.137 6.887 9.660 7.059 L 9.553 7.106 C 9.059 7.353 8.859 7.953 9.106 8.447 L 10.880 12.000 L 9.105 15.553 C 8.878 16.006 9.026 16.558 9.450 16.836 L 9.552 16.894 C 10.046 17.141 10.646 16.941 10.893 16.447 L 12.000 14.236 L 13.106 16.447 C 13.333 16.901 13.863 17.113 14.340 16.941 L 14.447 16.894 C 14.941 16.647 15.141 16.047 14.894 15.553 L 13.118 12.000 L 14.894 8.447 C 15.121 7.994 14.973 7.442 14.549 7.164 Z"),
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
        return _squareLetterX!!
    }

private var _squareLetterX: ImageVector? = null
