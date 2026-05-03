package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandMessenger: ImageVector
    get() {
        if (_brandMessenger != null) return _brandMessenger!!
        _brandMessenger = tablerFilledIcon(
            name = "BrandMessenger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.894 5.446 C 22.561 8.573 23.062 13.684 20.046 17.343 C 17.204 20.790 12.081 21.926 7.815 20.148 L 7.582 20.047 L 3.208 20.978 L 3.175 20.983 L 3.133 20.991 L 3.102 20.993 L 3.092 20.996 L 3.074 20.996 L 3.022 21.000 L 2.998 20.999 L 2.978 21.000 L 2.945 20.997 L 2.910 20.997 L 2.888 20.993 L 2.866 20.991 L 2.831 20.984 L 2.797 20.979 L 2.781 20.975 L 2.757 20.970 L 2.708 20.954 L 2.684 20.949 L 2.673 20.944 L 2.651 20.937 L 2.606 20.917 L 2.576 20.905 L 2.565 20.899 L 2.551 20.893 L 2.520 20.875 L 2.475 20.851 L 2.459 20.840 L 2.422 20.814 L 2.382 20.787 L 2.367 20.774 L 2.324 20.734 L 2.299 20.714 L 2.237 20.644 L 2.224 20.631 L 2.213 20.617 L 2.186 20.577 L 2.160 20.542 C 2.140 20.511 2.122 20.480 2.106 20.447 L 2.100 20.434 L 2.081 20.389 L 2.061 20.347 L 2.057 20.331 L 2.053 20.321 L 2.042 20.281 L 2.029 20.241 L 2.027 20.227 L 2.022 20.208 L 2.017 20.175 L 2.009 20.133 L 2.007 20.102 L 2.004 20.076 L 2.000 20.022 L 2.001 19.986 L 2.002 19.963 L 2.004 19.910 L 2.008 19.885 L 2.008 19.866 L 2.016 19.830 L 2.021 19.797 L 2.025 19.780 L 2.030 19.757 L 2.048 19.697 L 2.051 19.684 L 3.201 16.234 L 3.179 16.197 C 0.969 12.450 1.970 7.805 5.590 5.079 L 5.820 4.911 C 9.718 2.145 15.289 2.371 18.893 5.446M 16.831 10.446 C 16.684 10.225 16.455 10.072 16.195 10.020 C 15.935 9.967 15.665 10.021 15.444 10.168 L 13.126 11.712 L 11.706 10.292 C 11.369 9.955 10.840 9.903 10.444 10.168 L 7.444 12.168 C 7.223 12.315 7.070 12.544 7.018 12.804 C 6.966 13.064 7.020 13.334 7.167 13.555 L 7.237 13.648 C 7.566 14.035 8.132 14.114 8.554 13.832 L 10.871 12.287 L 12.291 13.707 C 12.628 14.045 13.157 14.097 13.554 13.832 L 16.554 11.832 C 16.775 11.685 16.928 11.456 16.980 11.196 C 17.032 10.936 16.978 10.666 16.831 10.445"),
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
        return _brandMessenger!!
    }

private var _brandMessenger: ImageVector? = null
