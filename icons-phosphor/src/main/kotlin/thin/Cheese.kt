package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorThinIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 36.000 C 183.610 36.001 183.223 36.058 182.850 36.170 L 22.850 84.170 L 22.850 84.170 C 21.159 84.678 20.000 86.234 20.000 88.000 L 20.000 112.000 C 20.000 114.209 21.791 116.000 24.000 116.000 L 32.000 116.000 C 42.871 116.056 51.730 124.742 52.000 135.610 C 52.082 140.903 50.019 146.003 46.280 149.750 C 42.370 153.725 37.035 155.975 31.460 156.000 L 24.000 156.000 C 21.791 156.000 20.000 157.791 20.000 160.000 L 20.000 192.000 C 20.000 194.209 21.791 196.000 24.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 190.627 236.000 184.000 L 236.000 88.000 C 235.967 59.295 212.705 36.033 184.000 36.000 ZM 184.570 44.000 C 207.088 44.324 225.737 61.576 227.810 84.000 L 51.250 84.000 ZM 196.000 104.000 C 196.007 115.500 188.982 125.835 178.285 130.060 C 167.589 134.284 155.398 131.539 147.545 123.137 C 139.692 114.736 137.774 102.387 142.710 92.000 L 193.290 92.000 C 195.072 95.750 195.997 99.849 196.000 104.000 ZM 140.000 188.000 L 84.000 188.000 L 84.000 184.000 C 84.000 168.536 96.536 156.000 112.000 156.000 C 127.464 156.000 140.000 168.536 140.000 184.000 ZM 228.000 184.000 C 228.000 186.209 226.209 188.000 224.000 188.000 L 148.000 188.000 L 148.000 184.000 C 148.000 164.118 131.882 148.000 112.000 148.000 C 92.118 148.000 76.000 164.118 76.000 184.000 L 76.000 188.000 L 28.000 188.000 L 28.000 164.000 L 31.460 164.000 C 39.186 163.968 46.579 160.854 52.000 155.350 C 57.246 150.074 60.132 142.899 60.000 135.460 C 59.632 120.239 47.225 108.071 32.000 108.000 L 28.000 108.000 L 28.000 92.000 L 134.070 92.000 C 128.779 106.921 133.857 123.548 146.582 132.967 C 159.307 142.386 176.693 142.386 189.418 132.967 C 202.143 123.548 207.221 106.921 201.930 92.000 L 228.000 92.000 Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
