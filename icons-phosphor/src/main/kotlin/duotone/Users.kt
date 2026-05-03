package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorDuotoneIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 136.000 108.000 C 136.000 136.719 112.719 160.000 84.000 160.000 C 55.281 160.000 32.000 136.719 32.000 108.000 C 32.000 79.281 55.281 56.000 84.000 56.000 C 112.719 56.000 136.000 79.281 136.000 108.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 117.250 157.920 C 139.265 143.264 149.087 115.922 141.431 90.607 C 133.775 65.292 110.447 47.976 84.000 47.976 C 57.553 47.976 34.225 65.292 26.569 90.607 C 18.913 115.922 28.735 143.264 50.750 157.920 C 31.355 165.068 14.791 178.296 3.530 195.630 C 1.919 198.024 1.722 201.100 3.015 203.680 C 4.308 206.259 6.889 207.943 9.771 208.086 C 12.653 208.229 15.388 206.809 16.930 204.370 C 31.688 181.671 56.926 167.978 84.000 167.978 C 111.074 167.978 136.312 181.671 151.070 204.370 C 153.512 207.999 158.415 208.994 162.078 206.605 C 165.741 204.215 166.807 199.327 164.470 195.630 C 153.209 178.296 136.645 165.068 117.250 157.920 ZM 40.000 108.000 C 40.000 83.699 59.699 64.000 84.000 64.000 C 108.301 64.000 128.000 83.699 128.000 108.000 C 128.000 132.301 108.301 152.000 84.000 152.000 C 59.711 151.972 40.028 132.289 40.000 108.000 ZM 250.140 206.700 C 246.440 209.113 241.484 208.070 239.070 204.370 C 224.329 181.656 199.078 167.964 172.000 168.000 C 167.582 168.000 164.000 164.418 164.000 160.000 C 164.000 155.582 167.582 152.000 172.000 152.000 C 189.721 151.983 205.702 141.338 212.545 124.992 C 219.389 108.646 215.758 89.790 203.335 77.153 C 190.912 64.517 172.120 60.566 155.660 67.130 C 152.988 68.285 149.900 67.898 147.596 66.119 C 145.293 64.340 144.137 61.450 144.578 58.573 C 145.020 55.696 146.989 53.286 149.720 52.280 C 178.250 40.902 210.765 52.907 225.056 80.094 C 239.347 107.282 230.799 140.871 205.250 157.920 C 224.645 165.068 241.209 178.296 252.470 195.630 C 254.883 199.330 253.840 204.286 250.140 206.700 Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
