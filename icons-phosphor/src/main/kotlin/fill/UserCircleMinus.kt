package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorFillIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 76.000 C 152.301 76.000 172.000 95.699 172.000 120.000 C 172.000 144.301 152.301 164.000 128.000 164.000 C 103.699 164.000 84.000 144.301 84.000 120.000 C 84.000 95.699 103.699 76.000 128.000 76.000 ZM 176.000 64.000 L 224.000 64.000 C 228.418 64.000 232.000 60.418 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 L 176.000 48.000 C 171.582 48.000 168.000 51.582 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 ZM 215.870 88.460 C 211.706 89.935 209.526 94.506 211.000 98.670 C 221.650 128.873 215.051 162.477 193.770 186.410 C 187.948 177.976 180.557 170.741 172.000 165.100 C 170.499 164.105 168.517 164.236 167.160 165.420 C 144.692 184.861 111.358 184.861 88.890 165.420 C 87.524 164.210 85.512 164.079 84.000 165.100 C 75.434 170.736 68.035 177.971 62.210 186.410 C 39.221 160.504 33.565 123.523 47.762 91.931 C 61.958 60.339 93.365 40.012 128.000 40.000 C 132.919 39.999 137.829 40.407 142.680 41.220 C 147.016 41.904 151.093 38.967 151.817 34.638 C 152.541 30.309 149.642 26.204 145.320 25.440 C 99.115 17.675 53.429 41.796 33.779 84.329 C 14.130 126.863 25.379 177.286 61.243 207.435 C 97.108 237.584 148.714 239.999 187.237 213.332 C 225.761 186.665 241.671 137.513 226.080 93.330 C 224.605 89.166 220.034 86.986 215.870 88.460 Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
