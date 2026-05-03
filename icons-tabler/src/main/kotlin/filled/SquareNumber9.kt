package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber9: ImageVector
    get() {
        if (_squareNumber9 != null) return _squareNumber9!!
        _squareNumber9 = tablerFilledIcon(
            name = "SquareNumber9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 13.000 7.000 L 11.000 7.000 L 10.850 7.005 C 9.866 7.079 9.083 7.859 9.006 8.843 L 9.000 9.000 L 9.000 11.000 L 9.005 11.150 C 9.079 12.134 9.859 12.917 10.843 12.994 L 11.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 10.993 14.883 C 10.931 14.358 10.470 13.972 9.941 14.003 C 9.413 14.034 9.001 14.471 9.000 15.000 C 9.000 16.047 9.806 16.917 10.850 16.995 L 11.000 17.000 L 13.000 17.000 L 13.150 16.995 C 14.134 16.921 14.917 16.141 14.994 15.157 L 15.000 15.000 L 15.000 9.000 L 14.995 8.850 C 14.921 7.866 14.141 7.083 13.157 7.006 L 13.000 7.000 ZM 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 Z"),
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
        return _squareNumber9!!
    }

private var _squareNumber9: ImageVector? = null
