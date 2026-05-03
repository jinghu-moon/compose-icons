package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorLightIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 208.000 C 174.000 211.314 171.314 214.000 168.000 214.000 L 88.000 214.000 C 85.727 214.000 83.650 212.716 82.633 210.683 C 81.617 208.651 81.836 206.218 83.200 204.400 L 155.200 108.480 C 163.481 97.498 164.330 82.609 157.351 70.757 C 150.372 58.905 136.940 52.425 123.320 54.340 C 111.607 55.983 101.582 63.579 96.830 74.410 C 95.502 77.448 91.963 78.833 88.925 77.505 C 85.887 76.177 84.502 72.638 85.830 69.600 C 87.275 66.307 89.097 63.193 91.260 60.320 C 106.550 40.029 135.394 35.975 155.685 51.265 C 175.976 66.555 180.030 95.399 164.740 115.690 L 100.000 202.000 L 168.000 202.000 C 171.314 202.000 174.000 204.686 174.000 208.000 Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
