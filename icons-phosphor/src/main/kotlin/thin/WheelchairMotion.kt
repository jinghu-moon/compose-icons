package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorThinIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 76.000 C 191.464 76.000 204.000 63.464 204.000 48.000 C 204.000 32.536 191.464 20.000 176.000 20.000 C 160.536 20.000 148.000 32.536 148.000 48.000 C 148.000 63.464 160.536 76.000 176.000 76.000 ZM 176.000 28.000 C 187.046 28.000 196.000 36.954 196.000 48.000 C 196.000 59.046 187.046 68.000 176.000 68.000 C 164.954 68.000 156.000 59.046 156.000 48.000 C 156.000 36.954 164.954 28.000 176.000 28.000 ZM 164.000 168.000 C 164.000 201.137 137.137 228.000 104.000 228.000 C 70.863 228.000 44.000 201.137 44.000 168.000 C 44.000 134.863 70.863 108.000 104.000 108.000 C 106.209 108.000 108.000 109.791 108.000 112.000 C 108.000 114.209 106.209 116.000 104.000 116.000 C 75.281 116.000 52.000 139.281 52.000 168.000 C 52.000 196.719 75.281 220.000 104.000 220.000 C 132.719 220.000 156.000 196.719 156.000 168.000 C 156.000 165.791 157.791 164.000 160.000 164.000 C 162.209 164.000 164.000 165.791 164.000 168.000 ZM 203.090 133.460 C 203.850 134.386 204.155 135.605 203.920 136.780 L 187.920 216.780 C 187.548 218.651 185.907 219.998 184.000 220.000 C 183.738 220.003 183.476 219.976 183.220 219.920 C 181.056 219.488 179.651 217.385 180.080 215.220 L 195.080 140.000 L 128.000 140.000 C 126.570 140.002 125.247 139.241 124.531 138.003 C 123.815 136.765 123.815 135.239 124.530 134.000 L 146.610 95.580 C 116.170 77.688 77.793 80.728 50.550 103.190 C 48.841 104.598 46.313 104.354 44.905 102.645 C 43.497 100.936 43.741 98.408 45.450 97.000 C 76.457 71.415 120.486 68.925 154.180 90.850 C 155.958 92.007 156.524 94.349 155.470 96.190 L 134.910 132.000 L 200.000 132.000 C 201.197 132.000 202.330 132.536 203.090 133.460 Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
