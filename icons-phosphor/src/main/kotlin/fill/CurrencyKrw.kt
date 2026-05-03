package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorFillIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 200.000 144.000 L 181.420 144.000 L 167.420 179.000 C 166.207 182.040 163.263 184.034 159.990 184.034 C 156.717 184.034 153.773 182.040 152.560 179.000 L 128.000 117.540 L 103.430 179.000 C 102.217 182.040 99.273 184.034 96.000 184.034 C 92.727 184.034 89.783 182.040 88.570 179.000 L 74.570 144.000 L 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 C 48.000 131.582 51.582 128.000 56.000 128.000 L 68.180 128.000 L 56.570 99.000 C 54.913 94.897 56.897 90.227 61.000 88.570 C 65.103 86.913 69.773 88.897 71.430 93.000 L 96.000 154.460 L 120.570 93.000 C 121.783 89.960 124.727 87.966 128.000 87.966 C 131.273 87.966 134.217 89.960 135.430 93.000 L 160.000 154.460 L 184.570 93.000 C 186.227 88.897 190.897 86.913 195.000 88.570 C 199.103 90.227 201.087 94.897 199.430 99.000 L 187.820 128.000 L 200.000 128.000 C 204.418 128.000 208.000 131.582 208.000 136.000 C 208.000 140.418 204.418 144.000 200.000 144.000 Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
