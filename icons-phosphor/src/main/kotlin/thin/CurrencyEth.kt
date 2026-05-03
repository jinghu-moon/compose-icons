package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorThinIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.150 125.530 L 131.150 13.530 C 130.392 12.561 129.230 11.995 128.000 11.995 C 126.770 11.995 125.608 12.561 124.850 13.530 L 36.850 125.530 C 35.712 126.980 35.712 129.020 36.850 130.470 L 124.850 242.470 C 125.608 243.439 126.770 244.005 128.000 244.005 C 129.230 244.005 130.392 243.439 131.150 242.470 L 219.150 130.470 C 220.288 129.020 220.288 126.980 219.150 125.530 ZM 132.000 27.570 L 209.710 126.470 L 132.000 161.790 ZM 124.000 161.790 L 46.290 126.470 L 124.000 27.570 ZM 124.000 170.580 L 124.000 228.430 L 53.280 138.430 ZM 132.000 170.580 L 202.720 138.430 L 132.000 228.430 Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
