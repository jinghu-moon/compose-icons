package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorLightIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 154.000 L 48.000 154.000 C 40.268 154.000 34.000 160.268 34.000 168.000 L 34.000 192.000 C 34.000 199.732 40.268 206.000 48.000 206.000 L 208.000 206.000 C 215.732 206.000 222.000 199.732 222.000 192.000 L 222.000 168.000 C 222.000 160.268 215.732 154.000 208.000 154.000 ZM 210.000 192.000 C 210.000 193.105 209.105 194.000 208.000 194.000 L 48.000 194.000 C 46.895 194.000 46.000 193.105 46.000 192.000 L 46.000 168.000 C 46.000 166.895 46.895 166.000 48.000 166.000 L 208.000 166.000 C 209.105 166.000 210.000 166.895 210.000 168.000 ZM 48.240 134.000 L 207.760 134.000 C 213.445 134.032 218.600 130.667 220.860 125.450 C 223.101 120.364 222.025 114.425 218.140 110.450 L 144.410 33.000 C 140.119 28.535 134.193 26.011 128.000 26.011 C 121.807 26.011 115.881 28.535 111.590 33.000 L 37.860 110.500 C 33.975 114.475 32.899 120.414 35.140 125.500 C 37.415 130.697 42.567 134.040 48.240 134.000 ZM 46.550 118.770 L 120.280 41.260 C 122.308 39.176 125.092 38.000 128.000 38.000 C 130.908 38.000 133.692 39.176 135.720 41.260 L 209.450 118.770 C 210.015 119.273 210.171 120.094 209.830 120.770 C 209.477 121.588 208.649 122.096 207.760 122.040 L 48.240 122.040 C 47.351 122.096 46.523 121.588 46.170 120.770 C 45.829 120.094 45.985 119.273 46.550 118.770 Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
