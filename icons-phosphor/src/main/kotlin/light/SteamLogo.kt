package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) return _steamLogo!!
        _steamLogo = phosphorLightIcon(
            name = "SteamLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 116.380 184.170 L 177.590 134.240 C 187.663 126.049 192.192 112.838 189.263 100.190 C 186.334 87.542 176.458 77.666 163.810 74.737 C 151.162 71.808 137.951 76.337 129.760 86.410 L 85.330 140.850 L 43.000 98.490 C 58.811 53.010 107.729 28.148 153.788 42.184 C 199.846 56.220 226.586 104.138 214.346 150.706 C 202.106 197.274 155.260 225.851 108.252 215.425 C 61.245 204.999 30.874 159.296 39.470 111.920 L 77.910 150.360 C 71.307 161.148 73.425 175.123 82.929 183.470 C 92.433 191.816 106.565 192.112 116.410 184.170 ZM 122.570 114.170 C 125.158 128.007 135.983 138.832 149.820 141.420 L 125.820 161.000 C 124.426 149.022 114.978 139.574 103.000 138.180 ZM 156.000 130.000 C 143.850 130.000 134.000 120.150 134.000 108.000 C 134.000 95.850 143.850 86.000 156.000 86.000 C 168.150 86.000 178.000 95.850 178.000 108.000 C 178.000 120.150 168.150 130.000 156.000 130.000 ZM 100.000 150.000 C 107.732 150.000 114.000 156.268 114.000 164.000 C 114.000 171.732 107.732 178.000 100.000 178.000 C 92.268 178.000 86.000 171.732 86.000 164.000 C 86.000 156.268 92.268 150.000 100.000 150.000 Z"),
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
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
