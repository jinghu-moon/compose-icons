package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorLightIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.720 67.910 L 134.720 19.730 C 130.538 17.420 125.462 17.420 121.280 19.730 L 33.280 67.900 C 28.792 70.356 26.001 75.064 26.000 80.180 L 26.000 175.820 C 26.001 180.936 28.792 185.644 33.280 188.100 L 121.280 236.270 C 125.463 238.576 130.537 238.576 134.720 236.270 L 222.720 188.100 C 227.208 185.644 229.999 180.936 230.000 175.820 L 230.000 80.180 C 229.996 75.068 227.205 70.364 222.720 67.910 ZM 128.000 121.160 L 44.490 75.440 L 83.140 54.290 L 125.140 77.290 C 126.934 78.272 129.106 78.272 130.900 77.290 L 172.900 54.290 L 211.550 75.440 ZM 127.000 30.250 C 127.598 29.923 128.322 29.923 128.920 30.250 L 160.320 47.450 L 128.000 65.160 L 95.630 47.450 ZM 38.000 175.820 L 38.000 135.820 L 74.000 155.520 L 74.000 196.680 L 39.000 177.570 C 38.376 177.210 37.994 176.541 38.000 175.820 ZM 86.000 203.280 L 86.000 152.000 C 85.999 149.808 84.803 147.792 82.880 146.740 L 38.000 122.170 L 38.000 85.570 L 122.000 131.570 L 122.000 223.000 ZM 134.000 223.000 L 134.000 131.560 L 218.000 85.560 L 218.000 122.160 L 173.120 146.730 C 171.194 147.784 169.998 149.805 170.000 152.000 L 170.000 203.280 ZM 217.000 177.580 L 182.000 196.720 L 182.000 155.550 L 218.000 135.850 L 218.000 175.850 C 217.996 176.560 217.615 177.215 217.000 177.570 Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
