package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorLightIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 86.000 C 183.994 85.932 191.841 88.156 198.610 92.410 C 201.686 94.378 205.591 94.513 208.795 92.762 C 212.000 91.011 213.995 87.652 214.000 84.000 L 214.000 48.000 C 214.000 40.268 207.732 34.000 200.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 200.000 222.000 C 207.732 222.000 214.000 215.732 214.000 208.000 L 214.000 172.000 C 213.996 168.354 212.007 165.000 208.811 163.246 C 205.615 161.492 201.718 161.616 198.640 163.570 C 191.010 168.460 184.530 170.330 176.240 169.990 L 176.000 169.990 C 152.804 169.990 134.000 151.186 134.000 127.990 C 134.000 104.794 152.804 85.990 176.000 85.990 ZM 122.000 128.000 C 122.033 157.763 146.117 181.901 175.880 182.000 C 185.031 182.485 194.120 180.248 202.000 175.570 L 202.000 208.000 C 202.000 209.105 201.105 210.000 200.000 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 200.000 46.000 C 201.105 46.000 202.000 46.895 202.000 48.000 L 202.000 80.480 C 185.222 71.452 164.939 71.881 148.559 81.611 C 132.178 91.342 122.098 108.948 122.000 128.000 Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
