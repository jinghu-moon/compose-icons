package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorThinIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 140.000 L 196.000 140.000 L 196.000 116.000 L 216.000 116.000 C 218.209 116.000 220.000 114.209 220.000 112.000 C 220.000 109.791 218.209 108.000 216.000 108.000 L 196.000 108.000 L 196.000 46.000 C 196.000 43.791 194.209 42.000 192.000 42.000 C 189.791 42.000 188.000 43.791 188.000 46.000 L 188.000 108.000 L 117.460 108.000 L 67.150 43.540 C 66.099 42.197 64.311 41.668 62.699 42.223 C 61.086 42.778 60.002 44.294 60.000 46.000 L 60.000 108.000 L 40.000 108.000 C 37.791 108.000 36.000 109.791 36.000 112.000 C 36.000 114.209 37.791 116.000 40.000 116.000 L 60.000 116.000 L 60.000 140.000 L 40.000 140.000 C 37.791 140.000 36.000 141.791 36.000 144.000 C 36.000 146.209 37.791 148.000 40.000 148.000 L 60.000 148.000 L 60.000 210.000 C 60.000 212.209 61.791 214.000 64.000 214.000 C 66.209 214.000 68.000 212.209 68.000 210.000 L 68.000 148.000 L 138.540 148.000 L 188.850 212.460 C 189.607 213.431 190.769 213.999 192.000 214.000 C 192.443 214.001 192.882 213.927 193.300 213.780 C 194.914 213.225 195.999 211.707 196.000 210.000 L 196.000 148.000 L 216.000 148.000 C 218.209 148.000 220.000 146.209 220.000 144.000 C 220.000 141.791 218.209 140.000 216.000 140.000 ZM 188.000 116.000 L 188.000 140.000 L 142.440 140.000 L 123.710 116.000 ZM 68.000 57.630 L 107.320 108.000 L 68.000 108.000 ZM 68.000 140.000 L 68.000 116.000 L 113.560 116.000 L 132.290 140.000 ZM 188.000 198.370 L 148.680 148.000 L 188.000 148.000 Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
