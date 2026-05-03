package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorThinIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 150.350 36.000 L 204.000 89.660 ZM 76.000 120.000 L 76.000 192.000 C 76.000 194.209 77.791 196.000 80.000 196.000 L 176.000 196.000 C 178.209 196.000 180.000 194.209 180.000 192.000 L 180.000 120.000 C 180.000 117.791 178.209 116.000 176.000 116.000 L 80.000 116.000 C 77.791 116.000 76.000 117.791 76.000 120.000 ZM 84.000 124.000 L 172.000 124.000 L 172.000 188.000 L 148.000 188.000 L 148.000 152.000 C 148.000 149.791 146.209 148.000 144.000 148.000 C 141.791 148.000 140.000 149.791 140.000 152.000 L 140.000 188.000 L 116.000 188.000 L 116.000 152.000 C 116.000 149.791 114.209 148.000 112.000 148.000 C 109.791 148.000 108.000 149.791 108.000 152.000 L 108.000 188.000 L 84.000 188.000 Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
