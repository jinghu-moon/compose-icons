package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorLightIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 130.000 L 214.910 130.000 L 237.560 74.260 C 238.808 71.189 237.331 67.688 234.260 66.440 C 231.189 65.192 227.688 66.669 226.440 69.740 L 202.000 130.000 L 158.000 130.000 L 133.560 69.740 C 132.642 67.476 130.443 65.995 128.000 65.995 C 125.557 65.995 123.358 67.476 122.440 69.740 L 98.000 130.000 L 54.000 130.000 L 29.560 69.740 C 28.312 66.669 24.811 65.192 21.740 66.440 C 18.669 67.688 17.192 71.189 18.440 74.260 L 41.090 130.000 L 16.000 130.000 C 12.686 130.000 10.000 132.686 10.000 136.000 C 10.000 139.314 12.686 142.000 16.000 142.000 L 46.000 142.000 L 70.480 202.260 C 71.398 204.524 73.597 206.005 76.040 206.005 C 78.483 206.005 80.682 204.524 81.600 202.260 L 106.000 142.000 L 150.000 142.000 L 174.480 202.260 C 175.398 204.524 177.597 206.005 180.040 206.005 C 182.483 206.005 184.682 204.524 185.600 202.260 L 210.000 142.000 L 240.000 142.000 C 243.314 142.000 246.000 139.314 246.000 136.000 C 246.000 132.686 243.314 130.000 240.000 130.000 ZM 76.000 184.060 L 58.910 142.000 L 93.090 142.000 ZM 110.910 130.000 L 128.000 87.940 L 145.090 130.000 ZM 180.000 184.060 L 162.910 142.000 L 197.090 142.000 Z"),
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
