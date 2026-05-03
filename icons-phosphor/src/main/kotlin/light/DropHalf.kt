package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorLightIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.530 49.060 C 160.290 34.904 146.508 22.158 131.440 11.060 C 129.374 9.615 126.626 9.615 124.560 11.060 C 109.492 22.158 95.710 34.904 83.470 49.060 C 56.340 80.260 42.000 113.090 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 113.090 199.660 80.260 172.530 49.060 ZM 202.000 144.000 C 201.993 147.345 201.763 150.686 201.310 154.000 L 134.000 154.000 L 134.000 134.000 L 201.440 134.000 C 201.808 137.321 201.995 140.659 202.000 144.000 ZM 186.800 90.000 L 134.000 90.000 L 134.000 70.000 L 173.890 70.000 C 178.640 76.368 182.953 83.050 186.800 90.000 ZM 134.000 198.000 L 178.520 198.000 C 166.343 209.431 150.647 216.390 134.000 217.740 ZM 134.000 186.000 L 134.000 166.000 L 198.660 166.000 C 196.427 173.121 193.129 179.864 188.880 186.000 ZM 134.000 122.000 L 134.000 102.000 L 192.700 102.000 C 195.525 108.453 197.764 115.146 199.390 122.000 ZM 164.290 58.000 L 134.000 58.000 L 134.000 28.300 C 144.898 37.349 155.029 47.282 164.290 58.000 ZM 54.000 144.000 C 54.000 90.580 101.350 45.440 122.000 28.300 L 122.000 217.740 C 83.611 214.574 54.052 182.519 54.000 144.000 Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
