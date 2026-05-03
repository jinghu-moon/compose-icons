package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorLightIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 82.000 L 182.000 82.000 L 182.000 64.000 C 182.000 51.087 173.737 39.623 161.487 35.540 C 149.237 31.456 135.748 35.670 128.000 46.000 C 120.252 35.670 106.763 31.456 94.513 35.540 C 82.263 39.623 74.000 51.087 74.000 64.000 L 74.000 64.000 C 64.909 57.182 52.747 56.085 42.584 61.167 C 32.420 66.249 26.000 76.637 26.000 88.000 L 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 L 230.000 112.000 C 230.000 95.431 216.569 82.000 200.000 82.000 ZM 152.000 46.000 C 161.941 46.000 170.000 54.059 170.000 64.000 L 170.000 82.000 L 136.000 82.000 C 135.330 82.008 134.662 82.061 134.000 82.160 L 134.000 64.000 C 134.000 54.059 142.059 46.000 152.000 46.000 ZM 86.000 64.000 C 86.000 54.059 94.059 46.000 104.000 46.000 C 113.941 46.000 122.000 54.059 122.000 64.000 L 122.000 104.000 C 122.000 113.941 113.941 122.000 104.000 122.000 C 94.059 122.000 86.000 113.941 86.000 104.000 ZM 38.000 88.000 C 38.000 78.059 46.059 70.000 56.000 70.000 C 65.941 70.000 74.000 78.059 74.000 88.000 L 74.000 104.000 C 74.000 113.941 65.941 122.000 56.000 122.000 C 46.059 122.000 38.000 113.941 38.000 104.000 ZM 218.000 128.000 C 218.000 177.706 177.706 218.000 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 L 38.000 128.000 C 51.255 137.941 70.059 135.255 80.000 122.000 C 85.205 128.938 93.159 133.284 101.809 133.917 C 110.460 134.549 118.961 131.407 125.120 125.300 C 128.262 131.633 133.529 136.662 140.000 139.510 C 128.645 148.206 121.990 161.697 122.000 176.000 C 122.000 179.314 124.686 182.000 128.000 182.000 C 131.314 182.000 134.000 179.314 134.000 176.000 C 134.000 157.222 149.222 142.000 168.000 142.000 C 171.314 142.000 174.000 139.314 174.000 136.000 C 174.000 132.686 171.314 130.000 168.000 130.000 L 152.000 130.000 C 142.059 130.000 134.000 121.941 134.000 112.000 L 134.000 96.000 C 134.000 94.895 134.895 94.000 136.000 94.000 L 200.000 94.000 C 209.941 94.000 218.000 102.059 218.000 112.000 Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
