package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorFillIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.490 190.830 C 222.749 193.082 224.019 196.140 224.019 199.330 C 224.019 202.520 222.749 205.578 220.490 207.830 L 207.800 220.490 C 205.548 222.749 202.490 224.019 199.300 224.019 C 196.110 224.019 193.052 222.749 190.800 220.490 L 134.240 163.920 L 115.000 214.090 C 115.000 214.190 114.920 214.300 114.870 214.410 C 112.367 220.245 106.620 224.021 100.270 224.000 L 99.480 224.000 C 92.845 223.719 87.090 219.326 85.070 213.000 L 32.800 52.920 C 30.971 47.212 32.485 40.961 36.723 36.723 C 40.961 32.485 47.212 30.971 52.920 32.800 L 213.000 85.070 C 219.262 87.165 223.594 92.891 223.906 99.487 C 224.218 106.083 220.446 112.193 214.410 114.870 L 214.090 115.000 L 163.920 134.270 ZM 96.000 32.000 C 100.418 32.000 104.000 28.418 104.000 24.000 L 104.000 16.000 C 104.000 11.582 100.418 8.000 96.000 8.000 C 91.582 8.000 88.000 11.582 88.000 16.000 L 88.000 24.000 C 88.000 28.418 91.582 32.000 96.000 32.000 ZM 16.000 104.000 L 24.000 104.000 C 28.418 104.000 32.000 100.418 32.000 96.000 C 32.000 91.582 28.418 88.000 24.000 88.000 L 16.000 88.000 C 11.582 88.000 8.000 91.582 8.000 96.000 C 8.000 100.418 11.582 104.000 16.000 104.000 ZM 124.420 39.160 C 126.319 40.111 128.518 40.268 130.532 39.596 C 132.547 38.925 134.212 37.480 135.160 35.580 L 143.160 19.580 C 145.137 15.628 143.537 10.822 139.585 8.845 C 135.633 6.868 130.827 8.468 128.850 12.420 L 120.850 28.420 C 119.898 30.317 119.740 32.515 120.410 34.530 C 121.079 36.544 122.522 38.210 124.420 39.160 ZM 28.420 120.850 L 12.420 128.850 C 8.468 130.827 6.868 135.633 8.845 139.585 C 10.822 143.537 15.628 145.137 19.580 143.160 L 35.580 135.160 C 39.532 133.183 41.132 128.377 39.155 124.425 C 37.178 120.473 32.372 118.873 28.420 120.850 Z"),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
