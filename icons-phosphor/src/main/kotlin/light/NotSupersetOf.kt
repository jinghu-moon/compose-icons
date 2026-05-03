package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorLightIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 194.000 L 76.110 194.000 L 101.560 166.000 L 152.000 166.000 C 176.795 165.974 199.190 151.177 208.940 128.379 C 218.689 105.581 213.919 79.167 196.810 61.220 L 212.440 44.000 C 214.105 42.455 214.754 40.101 214.118 37.921 C 213.481 35.740 211.667 34.106 209.432 33.699 C 207.197 33.293 204.924 34.183 203.560 36.000 L 187.730 53.380 C 177.292 45.966 164.803 41.989 152.000 42.000 L 56.000 42.000 C 52.686 42.000 50.000 44.686 50.000 48.000 C 50.000 51.314 52.686 54.000 56.000 54.000 L 152.000 54.000 C 161.818 53.989 171.419 56.888 179.590 62.330 L 96.250 154.000 L 56.000 154.000 C 52.686 154.000 50.000 156.686 50.000 160.000 C 50.000 163.314 52.686 166.000 56.000 166.000 L 85.350 166.000 L 43.560 212.000 C 41.695 214.484 42.034 217.981 44.342 220.060 C 46.650 222.139 50.163 222.113 52.440 220.000 L 65.200 206.000 L 208.000 206.000 C 211.314 206.000 214.000 203.314 214.000 200.000 C 214.000 196.686 211.314 194.000 208.000 194.000 ZM 188.730 70.120 C 202.176 84.714 205.720 105.878 197.760 124.056 C 189.800 142.233 171.844 153.984 152.000 154.000 L 112.470 154.000 Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
