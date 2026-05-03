package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorLightIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 35.560 C 210.823 34.488 209.268 33.927 207.677 34.003 C 206.087 34.078 204.591 34.782 203.520 35.960 L 198.030 41.960 L 128.000 41.960 C 93.543 41.915 62.391 62.457 48.860 94.147 C 35.330 125.836 42.037 162.543 65.900 187.400 L 43.560 212.000 C 41.695 214.484 42.034 217.981 44.342 220.060 C 46.650 222.139 50.163 222.113 52.440 220.000 L 74.770 195.430 C 89.904 207.459 108.668 214.004 128.000 214.000 L 200.000 214.000 C 203.314 214.000 206.000 211.314 206.000 208.000 C 206.000 204.686 203.314 202.000 200.000 202.000 L 128.000 202.000 C 111.659 202.010 95.779 196.585 82.860 186.580 L 212.440 44.000 C 214.636 41.543 214.439 37.775 212.000 35.560 ZM 54.000 128.000 C 54.050 87.151 87.151 54.050 128.000 54.000 L 187.160 54.000 L 74.000 178.500 C 61.147 164.827 53.994 146.766 54.000 128.000 Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
