package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorThinIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.060 148.570 L 188.000 125.740 L 188.000 104.000 C 188.002 102.569 187.239 101.246 186.000 100.530 L 132.000 69.680 L 132.000 44.000 L 152.000 44.000 C 154.209 44.000 156.000 42.209 156.000 40.000 C 156.000 37.791 154.209 36.000 152.000 36.000 L 132.000 36.000 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 36.000 L 104.000 36.000 C 101.791 36.000 100.000 37.791 100.000 40.000 C 100.000 42.209 101.791 44.000 104.000 44.000 L 124.000 44.000 L 124.000 69.680 L 70.000 100.530 C 68.761 101.246 67.998 102.569 68.000 104.000 L 68.000 125.740 L 29.940 148.570 C 28.736 149.293 28.000 150.595 28.000 152.000 L 28.000 216.000 C 28.000 218.209 29.791 220.000 32.000 220.000 L 112.000 220.000 C 114.209 220.000 116.000 218.209 116.000 216.000 L 116.000 168.000 C 116.000 161.373 121.373 156.000 128.000 156.000 C 134.627 156.000 140.000 161.373 140.000 168.000 L 140.000 216.000 C 140.000 218.209 141.791 220.000 144.000 220.000 L 224.000 220.000 C 226.209 220.000 228.000 218.209 228.000 216.000 L 228.000 152.000 C 228.000 150.595 227.264 149.293 226.060 148.570 ZM 36.000 154.260 L 68.000 135.060 L 68.000 212.000 L 36.000 212.000 ZM 128.000 148.000 C 116.954 148.000 108.000 156.954 108.000 168.000 L 108.000 212.000 L 76.000 212.000 L 76.000 106.320 L 128.000 76.610 L 180.000 106.320 L 180.000 212.000 L 148.000 212.000 L 148.000 168.000 C 148.000 156.954 139.046 148.000 128.000 148.000 ZM 220.000 212.000 L 188.000 212.000 L 188.000 135.060 L 220.000 154.260 Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
