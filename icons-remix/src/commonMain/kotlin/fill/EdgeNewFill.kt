package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EdgeNewFill: ImageVector
    get() {
        if (_edgeNewFill != null) return _edgeNewFill!!
        _edgeNewFill = remixIcon(
            name = "EdgeNewFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.817 21.835 C 13.711 21.838 13.605 21.840 13.500 21.840 C 12.427 21.840 11.126 21.219 10.081 20.082 C 9.045 18.955 8.300 17.363 8.300 15.500 C 8.300 14.082 8.818 12.935 9.501 12.094 C 9.558 14.580 11.859 17.700 16.500 17.700 C 18.178 17.700 19.217 17.248 19.779 17.003 C 19.988 16.912 20.131 16.850 20.216 16.850 C 20.400 16.850 20.500 16.950 20.500 17.150 C 20.500 17.337 20.399 17.471 20.074 17.902 L 20.001 18.000 C 18.522 19.968 16.334 21.373 13.817 21.835 ZM 10.702 21.917 C 5.792 21.280 2.000 17.083 2.000 12.000 C 2.000 10.720 2.741 9.671 3.897 8.919 C 5.058 8.165 6.587 7.750 8.000 7.750 C 10.276 7.750 11.635 8.515 12.428 9.397 C 12.479 9.453 12.526 9.509 12.573 9.566 C 12.389 9.523 12.197 9.500 12.000 9.500 L 11.996 9.500 C 11.561 9.501 11.152 9.613 10.796 9.809 C 10.717 9.845 10.639 9.884 10.560 9.926 C 10.057 10.194 9.529 10.587 9.049 11.094 C 8.088 12.110 7.300 13.603 7.300 15.500 C 7.300 17.637 8.155 19.465 9.344 20.758 C 9.758 21.208 10.218 21.599 10.702 21.917 ZM 13.851 13.596 C 14.118 13.315 14.500 12.912 14.500 12.000 C 14.500 11.139 14.163 9.829 13.172 8.728 C 12.165 7.610 10.524 6.750 8.000 6.750 C 6.413 6.750 4.692 7.210 3.353 8.081 C 3.073 8.263 2.807 8.464 2.563 8.685 C 3.930 4.791 7.639 2.000 12.000 2.000 C 17.523 2.000 22.000 6.000 22.000 10.500 C 22.000 13.300 19.800 15.350 17.000 15.350 C 15.000 15.350 13.600 14.700 13.600 14.000 C 13.600 13.861 13.709 13.746 13.851 13.596 Z"),
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
        return _edgeNewFill!!
    }

private var _edgeNewFill: ImageVector? = null
