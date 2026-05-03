package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Carambola: ImageVector
    get() {
        if (_carambola != null) return _carambola!!
        _carambola = tablerFilledIcon(
            name = "Carambola",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.108 22.085 C 15.842 22.017 14.184 21.226 12.037 19.730 L 11.997 19.703 L 11.960 19.730 C 9.813 21.227 8.156 22.018 6.888 22.086 L 6.710 22.091 C 3.963 22.091 3.613 19.451 4.992 14.847 L 5.046 14.669 L 4.946 14.594 C -1.110 9.956 -0.100 6.746 7.500 6.528 L 7.702 6.523 L 7.817 6.197 C 9.001 2.867 10.243 1.112 11.844 1.005 L 12.000 1.000 C 13.674 1.000 14.957 2.760 16.182 6.197 L 16.296 6.523 L 16.500 6.528 C 24.100 6.746 25.110 9.956 19.053 14.593 L 18.951 14.668 L 19.006 14.846 C 20.356 19.358 20.046 21.983 17.450 22.086 L 17.287 22.089 Z"),
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
        return _carambola!!
    }

private var _carambola: ImageVector? = null
