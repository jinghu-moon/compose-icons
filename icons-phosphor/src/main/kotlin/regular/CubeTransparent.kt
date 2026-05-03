package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorRegularIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 90.340 L 221.660 90.340 L 165.660 34.340 C 164.158 32.840 162.122 31.998 160.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 160.000 C 32.001 162.099 32.827 164.114 34.300 165.610 L 90.300 221.610 L 90.300 221.610 C 91.803 223.138 93.857 223.999 96.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 96.000 C 224.002 93.878 223.160 91.842 221.660 90.340 ZM 168.000 59.310 L 196.690 88.000 L 168.000 88.000 ZM 88.000 196.690 L 59.310 168.000 L 88.000 168.000 ZM 88.000 152.000 L 48.000 152.000 L 48.000 59.310 L 88.000 99.310 ZM 59.310 48.000 L 152.000 48.000 L 152.000 88.000 L 99.310 88.000 ZM 152.000 104.000 L 152.000 152.000 L 104.000 152.000 L 104.000 104.000 ZM 104.000 208.000 L 104.000 168.000 L 156.690 168.000 L 196.690 208.000 ZM 208.000 196.690 L 168.000 156.690 L 168.000 104.000 L 208.000 104.000 Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
