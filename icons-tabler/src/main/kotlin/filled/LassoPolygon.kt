package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LassoPolygon: ImageVector
    get() {
        if (_lassoPolygon != null) return _lassoPolygon!!
        _lassoPolygon = tablerFilledIcon(
            name = "LassoPolygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.581 2.186 L 12.147 6.876 L 19.649 4.064 C 19.919 3.963 20.220 3.983 20.474 4.120 C 20.728 4.257 20.911 4.497 20.975 4.778 L 20.994 4.890 L 21.994 13.890 C 22.046 14.359 21.763 14.800 21.316 14.949 L 12.316 17.949 C 12.138 18.009 11.946 18.017 11.763 17.972 L 7.329 16.890 C 6.990 17.307 6.546 17.626 6.042 17.813 C 6.137 18.799 6.416 19.713 6.868 20.503 C 7.137 20.982 6.969 21.588 6.493 21.861 C 6.016 22.133 5.408 21.971 5.132 21.496 C 4.508 20.406 4.142 19.161 4.034 17.840 C 2.818 17.426 2.000 16.284 2.000 15.000 L 2.005 14.824 C 2.048 14.097 2.353 13.410 2.865 12.892 L 2.047 10.302 C 1.987 10.115 1.984 9.914 2.038 9.725 L 4.038 2.725 C 4.127 2.412 4.363 2.163 4.670 2.056 C 4.977 1.948 5.317 1.997 5.581 2.186M 5.572 4.637 L 4.044 9.985 L 4.686 12.016 Q 4.841 12.000 5.000 12.000 C 6.655 12.000 7.997 13.340 8.000 14.995 L 11.957 15.960 L 19.917 13.306 L 19.148 6.387 L 12.351 8.937 C 12.080 9.038 11.778 9.017 11.524 8.879 L 11.419 8.814 Z"),
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
        return _lassoPolygon!!
    }

private var _lassoPolygon: ImageVector? = null
