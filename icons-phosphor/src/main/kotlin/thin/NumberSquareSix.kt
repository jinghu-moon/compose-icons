package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorThinIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 128.000 116.000 C 124.691 116.001 121.402 116.514 118.250 117.520 L 139.430 82.050 C 140.443 80.166 139.795 77.819 137.959 76.721 C 136.123 75.624 133.749 76.165 132.570 77.950 L 100.330 131.950 C 93.062 144.486 95.125 160.340 105.358 170.599 C 115.592 180.858 131.441 182.960 143.995 175.724 C 156.549 168.487 162.673 153.718 158.925 139.722 C 155.176 125.725 142.490 115.994 128.000 116.000 ZM 128.000 172.000 C 114.745 172.000 104.000 161.255 104.000 148.000 C 104.000 134.745 114.745 124.000 128.000 124.000 C 141.255 124.000 152.000 134.745 152.000 148.000 C 152.000 161.255 141.255 172.000 128.000 172.000 Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
