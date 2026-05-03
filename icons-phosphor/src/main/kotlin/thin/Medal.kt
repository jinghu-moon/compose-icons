package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorThinIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 96.000 C 212.033 56.741 184.868 22.696 146.582 14.011 C 108.296 5.327 69.101 24.319 52.191 59.749 C 35.282 95.180 45.168 137.597 76.000 161.900 L 76.000 240.000 C 76.000 242.209 77.791 244.000 80.000 244.000 C 80.621 243.999 81.233 243.855 81.790 243.580 L 128.000 220.470 L 174.220 243.580 C 175.460 244.196 176.929 244.127 178.106 243.398 C 179.283 242.670 179.999 241.384 180.000 240.000 L 180.000 161.900 C 200.201 145.997 211.995 121.710 212.000 96.000 ZM 172.000 233.530 L 129.780 212.420 C 128.653 211.856 127.327 211.856 126.200 212.420 L 84.000 233.530 L 84.000 167.530 C 110.973 184.171 145.027 184.171 172.000 167.530 ZM 128.000 172.000 C 86.026 172.000 52.000 137.974 52.000 96.000 C 52.000 54.026 86.026 20.000 128.000 20.000 C 169.974 20.000 204.000 54.026 204.000 96.000 C 203.956 137.955 169.955 171.956 128.000 172.000 ZM 128.000 44.000 C 99.281 44.000 76.000 67.281 76.000 96.000 C 76.000 124.719 99.281 148.000 128.000 148.000 C 156.719 148.000 180.000 124.719 180.000 96.000 C 179.967 67.295 156.705 44.033 128.000 44.000 ZM 128.000 140.000 C 103.699 140.000 84.000 120.301 84.000 96.000 C 84.000 71.699 103.699 52.000 128.000 52.000 C 152.301 52.000 172.000 71.699 172.000 96.000 C 171.972 120.289 152.289 139.972 128.000 140.000 Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
