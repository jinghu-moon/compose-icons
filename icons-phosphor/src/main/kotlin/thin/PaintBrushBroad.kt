package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorThinIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 28.000 L 72.000 28.000 C 52.118 28.000 36.000 44.118 36.000 64.000 L 36.000 136.000 C 36.000 147.046 44.954 156.000 56.000 156.000 L 104.000 156.000 C 105.157 155.990 106.262 156.482 107.029 157.349 C 107.797 158.216 108.151 159.372 108.000 160.520 L 100.100 207.330 C 100.060 207.551 100.040 207.775 100.040 208.000 C 100.040 223.464 112.576 236.000 128.040 236.000 C 143.504 236.000 156.040 223.464 156.040 208.000 C 156.040 207.775 156.020 207.551 155.980 207.330 L 148.000 160.520 C 147.849 159.372 148.203 158.216 148.971 157.349 C 149.738 156.482 150.843 155.990 152.000 156.000 L 200.000 156.000 C 211.046 156.000 220.000 147.046 220.000 136.000 L 220.000 32.000 C 220.000 29.791 218.209 28.000 216.000 28.000 ZM 72.000 36.000 L 180.000 36.000 L 180.000 80.000 C 180.000 82.209 181.791 84.000 184.000 84.000 C 186.209 84.000 188.000 82.209 188.000 80.000 L 188.000 36.000 L 212.000 36.000 L 212.000 108.000 L 44.000 108.000 L 44.000 64.000 C 44.000 48.536 56.536 36.000 72.000 36.000 ZM 200.000 148.000 L 152.000 148.000 C 148.521 148.000 145.212 149.510 142.933 152.138 C 140.653 154.767 139.627 158.256 140.120 161.700 C 140.120 161.700 140.120 161.760 140.120 161.800 L 148.000 208.320 C 148.000 219.366 139.046 228.320 128.000 228.320 C 116.954 228.320 108.000 219.366 108.000 208.320 L 115.860 161.800 C 115.860 161.800 115.860 161.730 115.860 161.700 C 116.352 158.259 115.329 154.774 113.054 152.146 C 110.779 149.518 107.476 148.005 104.000 148.000 L 56.000 148.000 C 49.373 148.000 44.000 142.627 44.000 136.000 L 44.000 116.000 L 212.000 116.000 L 212.000 136.000 C 212.000 142.627 206.627 148.000 200.000 148.000 Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
