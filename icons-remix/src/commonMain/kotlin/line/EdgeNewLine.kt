package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EdgeNewLine: ImageVector
    get() {
        if (_edgeNewLine != null) return _edgeNewLine!!
        _edgeNewLine = remixIcon(
            name = "EdgeNewLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.949 18.204 C 6.300 16.775 6.000 15.201 6.000 14.000 C 6.000 12.504 6.590 10.907 7.603 9.677 C 8.244 8.899 9.077 8.241 10.068 7.859 C 9.587 7.788 9.065 7.750 8.500 7.750 C 5.991 7.750 4.000 9.612 4.000 12.000 C 4.000 14.503 5.149 16.737 6.949 18.204 ZM 12.000 20.000 C 12.928 20.000 13.820 19.842 14.649 19.551 C 11.285 18.994 9.001 16.938 8.029 14.588 C 8.124 15.614 8.458 16.884 9.058 17.945 C 9.777 19.217 10.753 20.000 12.000 20.000 ZM 16.500 12.000 C 16.500 12.474 16.436 12.912 16.312 13.315 C 16.518 13.337 16.747 13.350 17.000 13.350 C 18.777 13.350 20.000 12.116 20.000 10.500 C 20.000 7.370 16.704 4.000 12.000 4.000 C 9.981 4.000 8.136 4.748 6.728 5.983 C 7.295 5.831 7.890 5.750 8.500 5.750 C 10.907 5.750 12.896 6.351 14.307 7.465 C 15.738 8.595 16.500 10.198 16.500 12.000 ZM 12.000 9.500 C 10.619 9.500 9.500 10.619 9.500 12.000 C 9.500 14.500 11.800 17.700 16.500 17.700 C 16.942 17.700 17.339 17.669 17.696 17.618 C 18.005 17.574 18.282 17.515 18.531 17.450 C 18.723 17.400 18.898 17.346 19.057 17.291 C 19.194 17.243 19.319 17.196 19.432 17.150 C 19.563 17.097 19.679 17.047 19.779 17.003 C 19.988 16.912 20.131 16.850 20.216 16.850 C 20.400 16.850 20.500 16.950 20.500 17.150 C 20.500 17.306 20.429 17.426 20.216 17.713 C 20.174 17.769 20.127 17.832 20.074 17.902 L 20.001 18.000 C 19.829 18.229 19.647 18.450 19.457 18.663 C 19.199 18.951 18.925 19.224 18.636 19.481 C 16.871 21.048 14.547 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.000 22.000 10.500 C 22.000 13.300 19.800 15.350 17.000 15.350 C 15.000 15.350 13.600 14.700 13.600 14.000 C 13.600 13.861 13.709 13.746 13.851 13.596 C 14.118 13.315 14.500 12.912 14.500 12.000 C 14.500 10.619 13.381 9.500 12.000 9.500 Z"),
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
        return _edgeNewLine!!
    }

private var _edgeNewLine: ImageVector? = null
