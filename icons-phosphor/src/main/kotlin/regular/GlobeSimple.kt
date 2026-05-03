package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorRegularIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 L 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.934 70.590 185.410 24.066 128.000 24.000 ZM 215.620 120.000 L 175.790 120.000 C 174.000 83.490 159.940 57.670 148.410 42.400 C 185.115 51.214 212.141 82.413 215.630 120.000 ZM 96.230 136.000 L 159.770 136.000 C 157.460 177.610 137.540 203.110 128.000 213.000 C 118.450 203.100 98.540 177.600 96.230 136.000 ZM 96.230 120.000 C 98.540 78.390 118.460 52.890 128.000 43.000 C 137.550 52.930 157.460 78.430 159.770 120.000 ZM 107.590 42.400 C 96.060 57.670 82.000 83.490 80.210 120.000 L 40.370 120.000 C 43.859 82.413 70.885 51.214 107.590 42.400 ZM 40.370 136.000 L 80.210 136.000 C 82.030 172.510 96.060 198.330 107.590 213.600 C 70.885 204.786 43.859 173.587 40.370 136.000 ZM 148.370 213.600 C 159.900 198.330 173.930 172.510 175.750 136.000 L 215.590 136.000 C 212.106 173.576 185.100 204.771 148.410 213.600 Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
