package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorThinIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 44.000 C 162.611 43.961 147.846 50.083 137.000 61.000 L 128.000 70.000 L 119.000 61.000 C 102.413 44.422 77.474 39.465 55.808 48.438 C 34.141 57.411 20.010 78.549 20.000 102.000 C 20.000 130.590 38.000 160.470 73.400 190.790 C 89.745 204.699 107.393 216.999 126.100 227.520 C 127.286 228.160 128.714 228.160 129.900 227.520 C 148.607 216.999 166.255 204.699 182.600 190.790 C 218.000 160.470 236.000 130.590 236.000 102.000 C 235.961 69.983 210.017 44.039 178.000 44.000 ZM 128.000 219.420 C 114.000 211.420 28.000 160.070 28.000 102.000 C 27.996 81.774 40.178 63.538 58.865 55.797 C 77.551 48.057 99.060 52.336 113.360 66.640 L 122.360 75.640 L 109.170 88.800 C 108.419 89.550 107.997 90.568 107.997 91.630 C 107.997 92.692 108.419 93.710 109.170 94.460 L 136.530 121.820 L 117.170 141.170 C 115.607 142.733 115.607 145.267 117.170 146.830 C 118.733 148.393 121.267 148.393 122.830 146.830 L 145.000 124.640 C 146.558 123.079 146.558 120.551 145.000 118.990 L 117.660 91.630 L 130.820 78.470 L 130.820 78.470 L 142.620 66.660 C 156.916 52.344 178.429 48.054 197.122 55.792 C 215.816 63.529 228.004 81.769 228.000 102.000 C 228.000 160.000 142.000 211.460 128.000 219.420 Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
