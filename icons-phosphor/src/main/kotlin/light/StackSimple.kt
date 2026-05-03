package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorLightIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 109.210 L 125.000 173.210 C 126.856 174.282 129.144 174.282 131.000 173.210 L 243.000 109.210 C 244.870 108.142 246.024 106.154 246.024 104.000 C 246.024 101.846 244.870 99.858 243.000 98.790 L 131.000 34.790 C 129.144 33.718 126.856 33.718 125.000 34.790 L 13.000 98.790 C 11.130 99.858 9.976 101.846 9.976 104.000 C 9.976 106.154 11.130 108.142 13.000 109.210 ZM 128.000 46.910 L 227.910 104.000 L 128.000 161.090 L 28.090 104.000 ZM 245.210 141.000 C 246.001 142.382 246.210 144.021 245.792 145.557 C 245.374 147.093 244.362 148.400 242.980 149.190 L 130.980 213.190 C 129.124 214.262 126.836 214.262 124.980 213.190 L 12.980 149.190 C 10.103 147.533 9.113 143.857 10.770 140.980 C 12.427 138.103 16.103 137.113 18.980 138.770 L 127.980 201.070 L 236.980 138.770 C 238.365 137.966 240.014 137.750 241.560 138.169 C 243.106 138.588 244.420 139.607 245.210 141.000 Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
