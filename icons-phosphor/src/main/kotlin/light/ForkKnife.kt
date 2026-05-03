package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorLightIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 74.000 88.000 L 74.000 40.000 C 74.000 36.686 76.686 34.000 80.000 34.000 C 83.314 34.000 86.000 36.686 86.000 40.000 L 86.000 88.000 C 86.000 91.314 83.314 94.000 80.000 94.000 C 76.686 94.000 74.000 91.314 74.000 88.000 ZM 214.000 40.000 L 214.000 224.000 C 214.000 227.314 211.314 230.000 208.000 230.000 C 204.686 230.000 202.000 227.314 202.000 224.000 L 202.000 174.000 L 152.000 174.000 C 148.686 174.000 146.000 171.314 146.000 168.000 C 146.000 163.590 146.680 59.750 205.640 34.490 C 207.493 33.697 209.619 33.888 211.302 34.997 C 212.984 36.106 213.998 37.985 214.000 40.000 ZM 202.000 50.000 C 165.210 74.290 159.180 141.480 158.190 162.000 L 202.000 162.000 ZM 117.920 39.000 C 117.368 35.730 114.270 33.528 111.000 34.080 C 107.730 34.632 105.528 37.730 106.080 41.000 L 114.000 88.480 C 114.000 107.258 98.778 122.480 80.000 122.480 C 61.222 122.480 46.000 107.258 46.000 88.480 L 53.920 41.000 C 54.472 37.730 52.270 34.632 49.000 34.080 C 45.730 33.528 42.632 35.730 42.080 39.000 L 34.080 87.000 C 34.028 87.331 34.001 87.665 34.000 88.000 C 34.030 111.073 51.127 130.564 74.000 133.600 L 74.000 224.000 C 74.000 227.314 76.686 230.000 80.000 230.000 C 83.314 230.000 86.000 227.314 86.000 224.000 L 86.000 133.600 C 108.873 130.564 125.970 111.073 126.000 88.000 C 125.999 87.665 125.972 87.331 125.920 87.000 Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
