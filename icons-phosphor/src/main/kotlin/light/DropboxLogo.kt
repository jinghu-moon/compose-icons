package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorLightIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.420 151.070 L 190.540 120.000 L 235.420 88.930 C 237.036 87.809 238.000 85.967 238.000 84.000 C 238.000 82.033 237.036 80.191 235.420 79.070 L 183.420 43.070 C 181.363 41.643 178.637 41.643 176.580 43.070 L 128.000 76.700 L 79.420 43.070 C 77.363 41.643 74.637 41.643 72.580 43.070 L 20.580 79.070 C 18.964 80.191 18.000 82.033 18.000 84.000 C 18.000 85.967 18.964 87.809 20.580 88.930 L 65.460 120.000 L 20.580 151.070 C 18.964 152.191 18.000 154.033 18.000 156.000 C 18.000 157.967 18.964 159.809 20.580 160.930 L 72.580 196.930 C 74.637 198.357 77.363 198.357 79.420 196.930 L 128.000 163.300 L 176.580 196.930 C 178.637 198.357 181.363 198.357 183.420 196.930 L 235.420 160.930 C 237.036 159.809 238.000 157.967 238.000 156.000 C 238.000 154.033 237.036 152.191 235.420 151.070 ZM 128.000 148.700 L 86.540 120.000 L 128.000 91.300 L 169.460 120.000 ZM 180.000 55.300 L 221.460 84.000 L 180.000 112.700 L 138.540 84.000 ZM 76.000 55.300 L 117.460 84.000 L 76.000 112.700 L 34.540 84.000 ZM 76.000 184.700 L 34.540 156.000 L 76.000 127.300 L 117.460 156.000 ZM 180.000 184.700 L 138.540 156.000 L 180.000 127.300 L 221.460 156.000 ZM 156.820 208.000 C 157.727 209.308 158.078 210.922 157.794 212.488 C 157.511 214.054 156.618 215.443 155.310 216.350 L 131.420 232.890 C 129.363 234.317 126.637 234.317 124.580 232.890 L 100.690 216.350 C 98.081 214.424 97.475 210.773 99.322 208.107 C 101.169 205.441 104.799 204.725 107.520 206.490 L 128.000 220.700 L 148.480 206.530 C 151.190 204.640 154.919 205.297 156.820 208.000 Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
