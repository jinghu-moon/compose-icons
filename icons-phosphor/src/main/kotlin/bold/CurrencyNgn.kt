package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorBoldIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 116.000 L 204.000 116.000 L 204.000 46.000 C 204.000 39.373 198.627 34.000 192.000 34.000 C 185.373 34.000 180.000 39.373 180.000 46.000 L 180.000 116.000 L 133.860 116.000 L 73.460 38.620 C 70.309 34.582 64.941 32.989 60.098 34.655 C 55.254 36.321 52.001 40.878 52.000 46.000 L 52.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 L 52.000 140.000 L 52.000 210.000 C 52.000 216.627 57.373 222.000 64.000 222.000 C 70.627 222.000 76.000 216.627 76.000 210.000 L 76.000 140.000 L 122.140 140.000 L 182.540 217.380 C 185.691 221.418 191.059 223.011 195.902 221.345 C 200.746 219.679 203.999 215.122 204.000 210.000 L 204.000 140.000 L 216.000 140.000 C 222.627 140.000 228.000 134.627 228.000 128.000 C 228.000 121.373 222.627 116.000 216.000 116.000 ZM 76.000 116.000 L 76.000 80.880 L 103.410 116.000 ZM 180.000 175.120 L 152.590 140.000 L 180.000 140.000 Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
