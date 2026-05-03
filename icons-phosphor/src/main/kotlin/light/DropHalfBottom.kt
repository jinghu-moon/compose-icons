package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorLightIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.530 49.060 C 160.290 34.904 146.508 22.158 131.440 11.060 C 129.374 9.615 126.626 9.615 124.560 11.060 C 109.492 22.158 95.710 34.904 83.470 49.060 C 56.340 80.260 42.000 113.090 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 113.090 199.660 80.260 172.530 49.060 ZM 188.880 186.000 L 67.120 186.000 C 62.871 179.864 59.573 173.121 57.340 166.000 L 198.660 166.000 C 196.427 173.121 193.129 179.864 188.880 186.000 ZM 54.690 154.000 C 54.237 150.686 54.007 147.345 54.000 144.000 C 54.005 140.659 54.192 137.321 54.560 134.000 L 201.440 134.000 C 201.808 137.321 201.995 140.659 202.000 144.000 C 201.993 147.345 201.763 150.686 201.310 154.000 ZM 128.000 23.490 C 141.130 33.610 187.830 72.550 199.390 122.000 L 56.610 122.000 C 68.170 72.550 114.870 33.610 128.000 23.490 ZM 77.480 198.000 L 178.480 198.000 C 150.083 224.640 105.877 224.640 77.480 198.000 Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
