package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerFilledIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.883 2.207 C 10.870 2.091 11.779 2.754 11.970 3.729 L 11.995 3.896 L 12.000 4.000 L 12.000 11.000 C 12.000 11.507 12.380 11.934 12.883 11.993 L 13.000 12.000 L 19.800 12.000 C 20.905 12.000 21.800 12.895 21.800 14.000 C 21.800 14.076 21.791 14.152 21.774 14.226 C 20.667 19.003 16.259 22.272 11.366 21.946 C 6.474 21.619 2.539 17.793 2.077 12.912 C 1.614 8.030 4.760 3.533 9.504 2.293 L 9.774 2.226 L 9.884 2.206 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 3.500 L 14.000 9.000 C 14.000 9.552 14.448 10.000 15.000 10.000 L 20.500 10.000 C 20.824 10.000 21.128 9.843 21.316 9.578 C 21.503 9.313 21.551 8.974 21.443 8.668 C 20.437 5.811 18.190 3.563 15.333 2.557 C 15.027 2.449 14.687 2.496 14.422 2.684 C 14.157 2.871 14.000 3.175 14.000 3.500 Z"),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
