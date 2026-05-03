package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorDuotoneIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 48.000 L 200.000 208.000 L 128.000 208.000 C 83.817 208.000 48.000 172.183 48.000 128.000 L 48.000 128.000 C 48.000 83.817 83.817 48.000 128.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 213.380 34.080 C 210.110 31.109 205.051 31.351 202.080 34.620 L 197.190 40.000 L 128.000 40.000 C 93.121 40.024 61.549 60.645 47.507 92.572 C 33.465 124.500 39.605 161.707 63.160 187.430 L 42.080 210.620 C 40.117 212.729 39.439 215.730 40.306 218.478 C 41.173 221.225 43.450 223.294 46.267 223.895 C 49.085 224.496 52.008 223.535 53.920 221.380 L 75.000 198.200 C 90.245 209.770 108.862 216.022 128.000 216.000 L 200.000 216.000 C 204.418 216.000 208.000 212.418 208.000 208.000 C 208.000 203.582 204.418 200.000 200.000 200.000 L 128.000 200.000 C 112.845 200.010 98.077 195.214 85.820 186.300 L 213.920 45.380 C 216.891 42.110 216.649 37.051 213.380 34.080 ZM 56.000 128.000 C 56.044 88.254 88.254 56.044 128.000 56.000 L 182.640 56.000 L 74.000 175.530 C 62.397 162.417 55.994 145.510 56.000 128.000 Z"),
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
