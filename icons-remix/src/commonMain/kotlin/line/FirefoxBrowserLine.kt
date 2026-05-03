package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirefoxBrowserLine: ImageVector
    get() {
        if (_firefoxBrowserLine != null) return _firefoxBrowserLine!!
        _firefoxBrowserLine = remixIcon(
            name = "FirefoxBrowserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 8.844 3.249 6.305 5.500 4.688 C 5.909 4.394 6.342 4.180 6.815 3.947 C 7.034 3.839 7.262 3.727 7.500 3.600 L 7.500 5.500 C 7.500 5.500 10.098 4.219 10.450 4.150 C 10.427 4.248 10.377 4.418 10.315 4.632 C 10.119 5.301 9.800 6.394 9.800 7.000 C 9.800 7.210 9.816 7.400 9.845 7.564 C 10.132 7.790 10.377 8.078 10.620 8.364 C 10.675 8.429 10.730 8.493 10.785 8.557 C 11.228 9.067 12.042 9.597 12.549 9.927 C 12.813 10.100 12.994 10.218 12.995 10.250 C 12.995 10.527 12.350 11.518 11.500 11.518 C 9.330 11.518 8.434 11.518 9.000 13.149 C 9.475 14.517 10.750 15.250 12.000 15.250 C 13.500 15.250 14.900 14.005 14.900 12.500 C 14.900 10.724 14.025 9.927 13.163 9.141 C 12.325 8.378 11.500 7.626 11.500 6.000 C 11.500 3.600 13.500 1.900 15.300 0.850 C 15.781 2.513 16.952 3.510 18.183 4.557 C 20.025 6.124 22.000 7.805 22.000 12.000 ZM 5.500 7.400 C 4.456 8.668 4.000 10.343 4.000 11.986 C 4.000 16.413 7.578 20.000 12.003 20.000 C 15.961 20.000 19.260 17.130 19.912 13.361 C 20.098 11.936 20.034 10.532 19.550 9.250 L 18.500 9.476 C 18.500 7.529 17.331 6.495 16.182 5.478 C 15.574 4.940 14.971 4.407 14.550 3.746 C 13.640 4.622 13.263 5.250 13.263 6.000 C 13.263 6.895 13.894 7.272 15.012 7.940 C 15.491 8.227 16.059 8.567 16.706 9.023 L 15.711 9.297 C 16.456 10.259 16.898 11.333 16.898 12.500 C 16.898 15.000 14.661 17.216 12.003 17.250 C 9.350 17.283 6.840 15.074 6.840 12.438 C 6.840 11.800 7.000 10.200 9.100 9.680 C 8.879 9.350 8.313 8.850 8.000 8.650 C 7.917 8.360 7.800 7.600 7.800 7.600 L 5.500 8.700 L 5.500 7.400 Z"),
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
        return _firefoxBrowserLine!!
    }

private var _firefoxBrowserLine: ImageVector? = null
