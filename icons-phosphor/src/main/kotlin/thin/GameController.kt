package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorThinIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 108.000 L 152.000 108.000 C 149.791 108.000 148.000 106.209 148.000 104.000 C 148.000 101.791 149.791 100.000 152.000 100.000 L 176.000 100.000 C 178.209 100.000 180.000 101.791 180.000 104.000 C 180.000 106.209 178.209 108.000 176.000 108.000 ZM 104.000 100.000 L 92.000 100.000 L 92.000 88.000 C 92.000 85.791 90.209 84.000 88.000 84.000 C 85.791 84.000 84.000 85.791 84.000 88.000 L 84.000 100.000 L 72.000 100.000 C 69.791 100.000 68.000 101.791 68.000 104.000 C 68.000 106.209 69.791 108.000 72.000 108.000 L 84.000 108.000 L 84.000 120.000 C 84.000 122.209 85.791 124.000 88.000 124.000 C 90.209 124.000 92.000 122.209 92.000 120.000 L 92.000 108.000 L 104.000 108.000 C 106.209 108.000 108.000 106.209 108.000 104.000 C 108.000 101.791 106.209 100.000 104.000 100.000 ZM 238.210 198.360 C 232.784 206.108 224.208 211.058 214.786 211.882 C 205.363 212.706 196.058 209.319 189.370 202.630 L 189.200 202.450 L 148.290 156.000 L 107.720 156.000 L 66.810 202.440 L 66.630 202.630 C 60.623 208.623 52.486 211.993 44.000 212.000 C 34.543 211.996 25.572 207.809 19.495 200.563 C 13.417 193.317 10.857 183.753 12.500 174.440 L 28.870 90.210 C 33.560 63.492 56.764 44.004 83.890 44.000 L 172.000 44.000 C 199.092 44.037 222.283 63.440 227.100 90.100 C 227.106 90.133 227.106 90.167 227.100 90.200 L 243.470 174.360 C 244.996 182.742 243.102 191.385 238.210 198.360 ZM 172.000 148.000 C 198.510 148.000 220.000 126.510 220.000 100.000 C 220.000 73.490 198.510 52.000 172.000 52.000 L 83.900 52.000 C 60.631 52.013 40.738 68.747 36.740 91.670 L 20.360 175.900 C 18.104 188.932 26.815 201.333 39.840 203.630 C 47.492 204.964 55.317 202.513 60.840 197.050 L 102.840 149.360 C 103.598 148.497 104.691 148.001 105.840 148.000 ZM 235.630 175.830 L 224.630 119.170 C 216.550 141.271 195.532 155.979 172.000 156.000 L 159.000 156.000 L 195.160 197.060 C 202.589 204.415 213.924 206.116 223.184 201.264 C 232.444 196.412 237.499 186.125 235.680 175.830 Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
