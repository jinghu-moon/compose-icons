package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorLightIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 166.000 112.000 C 166.001 94.240 153.700 78.848 136.377 74.933 C 119.054 71.017 101.330 79.623 93.693 95.657 C 86.056 111.691 90.543 130.877 104.500 141.860 L 90.500 173.580 C 89.681 175.437 89.857 177.582 90.967 179.281 C 92.077 180.980 93.971 182.003 96.000 182.000 L 160.000 182.000 C 162.028 182.000 163.918 180.976 165.026 179.277 C 166.133 177.578 166.308 175.435 165.490 173.580 L 151.490 141.860 C 160.630 134.642 165.973 123.646 166.000 112.000 ZM 141.000 134.530 C 138.351 136.061 137.279 139.339 138.510 142.140 L 150.800 170.000 L 105.200 170.000 L 117.490 142.140 C 118.721 139.339 117.649 136.061 115.000 134.530 C 104.809 128.646 99.840 116.651 102.886 105.284 C 105.932 93.917 116.232 86.013 128.000 86.013 C 139.768 86.013 150.068 93.917 153.114 105.284 C 156.160 116.651 151.191 128.646 141.000 134.530 Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
