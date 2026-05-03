package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorBoldIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 176.490 L 209.000 192.000 L 224.520 207.510 C 229.214 212.204 229.214 219.816 224.520 224.510 C 219.826 229.204 212.214 229.204 207.520 224.510 L 192.000 209.000 L 176.490 224.520 C 171.796 229.214 164.184 229.214 159.490 224.520 C 154.796 219.826 154.796 212.214 159.490 207.520 L 175.000 192.000 L 159.480 176.490 C 154.786 171.796 154.786 164.184 159.480 159.490 C 164.174 154.796 171.786 154.796 176.480 159.490 L 192.000 175.000 L 207.510 159.480 C 212.204 154.786 219.816 154.786 224.510 159.480 C 229.204 164.174 229.204 171.786 224.510 176.480 ZM 236.000 128.000 C 236.000 134.627 230.627 140.000 224.000 140.000 L 100.540 140.000 C 104.910 189.560 135.170 214.370 135.540 214.630 L 135.540 214.630 C 139.525 217.819 141.058 223.180 139.359 227.993 C 137.661 232.806 133.104 236.018 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.647 20.000 236.000 68.353 236.000 128.000 ZM 158.210 49.640 C 170.643 69.683 177.974 92.468 179.560 116.000 L 211.130 116.000 C 206.741 85.958 186.522 60.604 158.210 49.640 ZM 117.640 63.230 C 107.884 79.238 102.024 97.313 100.530 116.000 L 155.470 116.000 C 152.470 82.100 137.380 59.780 128.020 49.000 C 124.177 53.452 120.706 58.211 117.640 63.230 ZM 44.870 116.000 L 76.440 116.000 C 78.026 92.468 85.357 69.683 97.790 49.640 C 69.478 60.604 49.259 85.958 44.870 116.000 ZM 76.440 140.000 L 44.870 140.000 C 49.259 170.042 69.478 195.396 97.790 206.360 C 85.357 186.317 78.026 163.532 76.440 140.000 Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
