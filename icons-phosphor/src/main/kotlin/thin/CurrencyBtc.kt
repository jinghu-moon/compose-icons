package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorThinIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.270 117.210 C 184.881 107.401 191.364 89.195 186.243 72.359 C 181.121 55.523 165.598 44.011 148.000 44.000 L 148.000 24.000 C 148.000 21.791 146.209 20.000 144.000 20.000 C 141.791 20.000 140.000 21.791 140.000 24.000 L 140.000 44.000 L 116.000 44.000 L 116.000 24.000 C 116.000 21.791 114.209 20.000 112.000 20.000 C 109.791 20.000 108.000 21.791 108.000 24.000 L 108.000 44.000 L 72.000 44.000 C 69.791 44.000 68.000 45.791 68.000 48.000 C 68.000 50.209 69.791 52.000 72.000 52.000 L 84.000 52.000 L 84.000 196.000 L 72.000 196.000 C 69.791 196.000 68.000 197.791 68.000 200.000 C 68.000 202.209 69.791 204.000 72.000 204.000 L 108.000 204.000 L 108.000 224.000 C 108.000 226.209 109.791 228.000 112.000 228.000 C 114.209 228.000 116.000 226.209 116.000 224.000 L 116.000 204.000 L 140.000 204.000 L 140.000 224.000 C 140.000 226.209 141.791 228.000 144.000 228.000 C 146.209 228.000 148.000 226.209 148.000 224.000 L 148.000 204.000 L 160.000 204.000 C 182.309 204.011 201.096 187.325 203.717 165.171 C 206.339 143.016 191.965 122.406 170.270 117.210 ZM 92.000 52.000 L 148.000 52.000 C 165.673 52.000 180.000 66.327 180.000 84.000 C 180.000 101.673 165.673 116.000 148.000 116.000 L 92.000 116.000 ZM 160.000 196.000 L 92.000 196.000 L 92.000 124.000 L 160.000 124.000 C 179.882 124.000 196.000 140.118 196.000 160.000 C 196.000 179.882 179.882 196.000 160.000 196.000 Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
