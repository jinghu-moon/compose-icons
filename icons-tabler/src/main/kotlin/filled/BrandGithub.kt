package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandGithub: ImageVector
    get() {
        if (_brandGithub != null) return _brandGithub!!
        _brandGithub = tablerFilledIcon(
            name = "BrandGithub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.315 2.100 C 6.106 1.987 7.215 2.245 8.648 3.066 L 8.920 3.227 L 9.080 3.327 L 9.477 3.244 C 10.991 2.951 12.544 2.924 14.067 3.164 L 14.523 3.244 L 14.919 3.327 L 15.080 3.227 C 16.465 2.387 17.567 2.057 18.402 2.079 L 18.566 2.087 L 18.713 2.104 L 18.789 2.118 L 18.839 2.129 L 18.983 2.176 C 19.219 2.273 19.408 2.457 19.513 2.690 C 19.922 3.602 20.060 4.612 19.910 5.600 L 19.863 5.867 L 19.817 6.063 L 19.940 6.226 C 20.514 7.021 20.870 7.954 20.970 8.933 L 20.993 9.228 L 21.000 9.500 C 21.000 13.355 19.341 15.383 16.356 16.180 L 16.111 16.241 L 15.979 16.270 L 15.993 16.431 L 16.001 16.588 L 16.005 16.953 L 16.003 17.166 L 16.000 21.000 C 16.000 21.507 15.620 21.934 15.117 21.993 L 15.000 22.000 L 9.000 22.000 C 8.493 22.000 8.066 21.620 8.007 21.117 L 8.000 21.000 L 8.000 20.266 C 6.182 20.526 4.970 19.842 3.890 18.388 L 3.355 17.622 C 3.075 17.226 2.900 17.043 2.766 16.978 L 2.718 16.959 C 2.203 16.792 1.915 16.245 2.068 15.726 C 2.220 15.207 2.759 14.903 3.282 15.041 C 3.924 15.229 4.356 15.609 4.852 16.280 L 5.390 17.049 C 6.150 18.128 6.750 18.508 7.999 18.240 L 8.000 17.562 L 7.982 17.394 C 7.952 17.120 7.945 16.845 7.961 16.570 L 7.978 16.385 L 7.997 16.265 L 7.889 16.241 C 4.913 15.531 3.186 13.668 3.014 10.102 L 3.004 9.792 L 3.000 9.500 C 3.001 8.417 3.317 7.357 3.908 6.449 L 4.060 6.227 L 4.182 6.064 L 4.137 5.868 C 3.957 4.990 4.007 4.079 4.282 3.226 L 4.382 2.944 L 4.488 2.691 C 4.592 2.459 4.782 2.275 5.017 2.177 L 5.161 2.130 L 5.315 2.100 Z"),
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
        return _brandGithub!!
    }

private var _brandGithub: ImageVector? = null
