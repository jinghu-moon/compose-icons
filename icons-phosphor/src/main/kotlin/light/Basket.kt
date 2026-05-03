package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorLightIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 120.000 L 134.000 176.000 C 134.000 179.314 131.314 182.000 128.000 182.000 C 124.686 182.000 122.000 179.314 122.000 176.000 L 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 ZM 174.830 119.400 L 169.230 175.400 C 169.062 176.988 169.535 178.578 170.543 179.816 C 171.551 181.055 173.011 181.841 174.600 182.000 L 175.210 182.000 C 178.303 182.016 180.901 179.677 181.210 176.600 L 186.810 120.600 C 187.141 117.303 184.737 114.361 181.440 114.030 C 178.143 113.699 175.201 116.103 174.870 119.400 ZM 81.170 119.400 C 80.839 116.103 77.897 113.699 74.600 114.030 C 71.303 114.361 68.899 117.303 69.230 120.600 L 74.830 176.600 C 75.139 179.677 77.737 182.016 80.830 182.000 L 81.440 182.000 C 83.023 181.841 84.479 181.059 85.486 179.827 C 86.493 178.595 86.969 177.013 86.810 175.430 ZM 238.000 88.790 L 222.870 201.850 C 221.943 208.803 216.014 213.996 209.000 214.000 L 47.000 214.000 C 39.986 213.996 34.057 208.803 33.130 201.850 L 18.050 88.790 C 17.822 87.076 18.345 85.346 19.485 84.046 C 20.625 82.745 22.271 81.999 24.000 82.000 L 69.280 82.000 L 123.480 20.050 C 124.619 18.758 126.258 18.019 127.980 18.019 C 129.702 18.019 131.341 18.758 132.480 20.050 L 186.680 82.050 L 232.000 82.050 C 233.728 82.037 235.378 82.769 236.527 84.060 C 237.676 85.351 238.213 87.075 238.000 88.790 ZM 85.220 82.000 L 170.780 82.000 L 128.000 33.110 ZM 225.150 94.000 L 30.850 94.000 L 45.000 200.260 C 45.131 201.262 45.989 202.009 47.000 202.000 L 209.000 202.000 C 210.011 202.009 210.869 201.262 211.000 200.260 Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
