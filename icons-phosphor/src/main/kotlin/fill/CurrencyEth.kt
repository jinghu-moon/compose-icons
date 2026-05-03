package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorFillIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.290 123.060 L 134.290 11.060 C 132.773 9.130 130.455 8.003 128.000 8.003 C 125.545 8.003 123.227 9.130 121.710 11.060 L 33.710 123.060 C 31.433 125.960 31.433 130.040 33.710 132.940 L 121.710 244.940 C 123.227 246.870 125.545 247.997 128.000 247.997 C 130.455 247.997 132.773 246.870 134.290 244.940 L 222.290 132.940 C 224.567 130.040 224.567 125.960 222.290 123.060 ZM 136.000 155.580 L 136.000 39.130 L 203.420 124.930 ZM 120.000 155.580 L 52.580 124.930 L 120.000 39.130 ZM 120.000 173.150 L 120.000 216.870 L 66.570 148.870 Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
