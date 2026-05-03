package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BinocularsLine: ImageVector
    get() {
        if (_binocularsLine != null) return _binocularsLine!!
        _binocularsLine = remixIcon(
            name = "BinocularsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.488 3.330 C 17.622 2.759 19.815 4.026 20.387 6.159 L 22.846 15.335 C 23.489 17.736 22.065 20.204 19.664 20.847 C 17.264 21.490 14.796 20.065 14.153 17.664 C 14.067 17.345 14.019 17.025 14.004 16.707 C 13.368 16.897 12.696 17.000 11.999 17.000 C 11.303 17.000 10.629 16.897 9.993 16.707 C 9.978 17.025 9.931 17.345 9.846 17.664 C 9.203 20.065 6.735 21.490 4.334 20.847 C 1.934 20.204 0.509 17.736 1.153 15.335 L 3.611 6.159 C 4.183 4.026 6.376 2.759 8.510 3.330 C 10.242 3.794 11.402 5.327 11.472 7.029 C 11.645 7.010 11.821 7.000 11.999 7.000 C 12.177 7.000 12.352 7.010 12.526 7.029 C 12.596 5.327 13.757 3.794 15.488 3.330 ZM 6.146 14.085 C 4.812 13.728 3.442 14.519 3.084 15.853 C 2.727 17.186 3.518 18.558 4.852 18.915 C 6.185 19.273 7.557 18.480 7.914 17.147 C 8.076 16.544 8.003 15.936 7.751 15.415 C 7.445 14.781 6.877 14.281 6.146 14.085 ZM 20.835 15.610 C 20.385 14.425 19.102 13.750 17.852 14.085 C 17.121 14.281 16.552 14.781 16.246 15.415 C 15.995 15.936 15.923 16.544 16.084 17.147 C 16.441 18.480 17.812 19.272 19.146 18.915 C 20.396 18.580 21.171 17.354 20.968 16.103 L 20.914 15.853 L 20.835 15.610 ZM 18.455 6.677 C 18.169 5.610 17.073 4.977 16.006 5.263 C 15.006 5.531 14.386 6.511 14.548 7.512 L 14.591 7.712 L 14.613 7.815 L 14.934 9.844 L 12.959 10.156 L 12.792 9.106 C 12.540 9.037 12.274 9.000 11.999 9.000 C 11.724 9.000 11.457 9.037 11.205 9.106 L 11.039 10.156 L 9.064 9.844 L 9.321 8.218 L 9.385 7.815 L 9.406 7.712 C 9.692 6.645 9.059 5.549 7.992 5.263 C 6.925 4.977 5.829 5.610 5.543 6.677 L 4.052 12.238 C 4.867 11.961 5.770 11.914 6.664 12.153 C 7.873 12.478 8.834 13.266 9.407 14.273 C 10.163 14.732 11.048 15.000 11.999 15.000 C 12.950 15.000 13.835 14.732 14.590 14.273 C 15.164 13.266 16.125 12.478 17.334 12.153 C 18.228 11.914 19.131 11.961 19.945 12.238 L 18.455 6.677 Z"),
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
        return _binocularsLine!!
    }

private var _binocularsLine: ImageVector? = null
