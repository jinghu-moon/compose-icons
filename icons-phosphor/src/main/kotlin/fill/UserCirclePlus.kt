package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorFillIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 76.000 C 152.301 76.000 172.000 95.699 172.000 120.000 C 172.000 144.301 152.301 164.000 128.000 164.000 C 103.699 164.000 84.000 144.301 84.000 120.000 C 84.000 95.699 103.699 76.000 128.000 76.000 ZM 176.000 64.000 L 192.000 64.000 L 192.000 80.000 C 192.000 84.418 195.582 88.000 200.000 88.000 C 204.418 88.000 208.000 84.418 208.000 80.000 L 208.000 64.000 L 224.000 64.000 C 228.418 64.000 232.000 60.418 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 L 208.000 48.000 L 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 C 195.582 24.000 192.000 27.582 192.000 32.000 L 192.000 48.000 L 176.000 48.000 C 171.582 48.000 168.000 51.582 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 ZM 221.350 104.110 C 216.993 104.839 214.051 108.963 214.780 113.320 C 215.592 118.171 216.000 123.081 216.000 128.000 C 216.019 149.542 208.102 170.336 193.760 186.410 C 187.941 177.977 180.553 170.742 172.000 165.100 C 170.499 164.105 168.517 164.236 167.160 165.420 C 144.692 184.861 111.358 184.861 88.890 165.420 C 87.524 164.210 85.512 164.079 84.000 165.100 C 75.434 170.736 68.035 177.971 62.210 186.410 C 39.221 160.504 33.565 123.523 47.762 91.931 C 61.958 60.339 93.365 40.012 128.000 40.000 C 132.919 39.999 137.829 40.407 142.680 41.220 C 147.016 41.904 151.093 38.967 151.817 34.638 C 152.541 30.309 149.642 26.204 145.320 25.440 C 100.742 17.941 56.429 40.119 35.714 80.298 C 14.999 120.477 22.633 169.438 54.597 201.403 C 86.562 233.367 135.523 241.001 175.702 220.286 C 215.881 199.571 238.059 155.258 230.560 110.680 C 229.831 106.323 225.707 103.381 221.350 104.110 Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
