package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorThinIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 128.000 116.000 C 124.691 116.001 121.402 116.514 118.250 117.520 L 139.430 82.050 C 140.443 80.166 139.795 77.819 137.959 76.721 C 136.123 75.624 133.749 76.165 132.570 77.950 L 100.330 131.950 C 93.062 144.486 95.125 160.340 105.358 170.599 C 115.592 180.858 131.441 182.960 143.995 175.724 C 156.549 168.487 162.673 153.718 158.925 139.722 C 155.176 125.725 142.490 115.994 128.000 116.000 ZM 128.000 172.000 C 114.745 172.000 104.000 161.255 104.000 148.000 C 104.000 134.745 114.745 124.000 128.000 124.000 C 141.255 124.000 152.000 134.745 152.000 148.000 C 152.000 161.255 141.255 172.000 128.000 172.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
