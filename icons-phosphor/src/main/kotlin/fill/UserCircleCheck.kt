package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorFillIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.560 110.680 C 238.059 155.258 215.881 199.571 175.702 220.286 C 135.523 241.001 86.562 233.367 54.597 201.403 C 22.633 169.438 14.999 120.477 35.714 80.298 C 56.429 40.119 100.742 17.941 145.320 25.440 C 149.642 26.204 152.541 30.309 151.817 34.638 C 151.093 38.967 147.016 41.904 142.680 41.220 C 117.139 36.924 91.002 44.087 71.221 60.805 C 51.440 77.523 40.021 102.101 40.000 128.000 C 39.981 149.542 47.898 170.336 62.240 186.410 C 68.056 177.974 75.444 170.739 84.000 165.100 C 85.501 164.105 87.483 164.236 88.840 165.420 C 111.305 184.859 144.635 184.859 167.100 165.420 C 168.457 164.236 170.439 164.105 171.940 165.100 C 180.504 170.739 187.902 177.974 193.730 186.410 C 208.082 170.340 216.011 149.546 216.000 128.000 C 216.000 123.081 215.592 118.171 214.780 113.320 C 214.279 110.488 215.337 107.605 217.550 105.769 C 219.764 103.933 222.792 103.427 225.483 104.442 C 228.173 105.458 230.112 107.839 230.560 110.680 ZM 84.000 120.000 C 84.000 144.301 103.699 164.000 128.000 164.000 C 152.301 164.000 172.000 144.301 172.000 120.000 C 172.000 95.699 152.301 76.000 128.000 76.000 C 103.699 76.000 84.000 95.699 84.000 120.000 ZM 237.660 34.340 C 236.159 32.838 234.123 31.994 232.000 31.994 C 229.877 31.994 227.841 32.838 226.340 34.340 L 200.000 60.690 L 189.660 50.340 C 186.534 47.214 181.466 47.214 178.340 50.340 C 175.214 53.466 175.214 58.534 178.340 61.660 L 194.340 77.660 C 195.841 79.162 197.877 80.006 200.000 80.006 C 202.123 80.006 204.159 79.162 205.660 77.660 L 237.660 45.660 C 239.162 44.159 240.006 42.123 240.006 40.000 C 240.006 37.877 239.162 35.841 237.660 34.340 Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
