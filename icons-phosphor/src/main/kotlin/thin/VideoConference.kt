package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorThinIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 56.000 L 220.000 124.000 L 164.000 124.000 L 164.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 156.000 52.000 L 156.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 ZM 216.000 204.000 L 164.000 204.000 L 164.000 132.000 L 220.000 132.000 L 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 ZM 184.000 88.000 C 184.000 83.582 187.582 80.000 192.000 80.000 C 196.418 80.000 200.000 83.582 200.000 88.000 C 200.000 92.418 196.418 96.000 192.000 96.000 C 187.582 96.000 184.000 92.418 184.000 88.000 ZM 200.000 168.000 C 200.000 172.418 196.418 176.000 192.000 176.000 C 187.582 176.000 184.000 172.418 184.000 168.000 C 184.000 163.582 187.582 160.000 192.000 160.000 C 196.418 160.000 200.000 163.582 200.000 168.000 ZM 131.870 167.000 C 128.994 156.424 121.482 147.721 111.440 143.330 C 121.750 136.515 126.373 123.746 122.814 111.910 C 119.256 100.075 108.359 91.972 96.000 91.972 C 83.641 91.972 72.744 100.075 69.186 111.910 C 65.627 123.746 70.250 136.515 80.560 143.330 C 70.525 147.730 63.016 156.430 60.130 167.000 C 59.579 169.137 60.864 171.316 63.000 171.870 C 63.326 171.957 63.662 172.000 64.000 172.000 C 65.823 171.999 67.414 170.765 67.870 169.000 C 71.000 157.000 83.050 148.000 96.000 148.000 C 108.950 148.000 121.060 157.000 124.130 169.000 C 124.442 170.432 125.513 171.578 126.920 171.988 C 128.326 172.397 129.845 172.005 130.877 170.965 C 131.909 169.925 132.290 168.404 131.870 167.000 ZM 76.000 120.000 C 76.000 108.954 84.954 100.000 96.000 100.000 C 107.046 100.000 116.000 108.954 116.000 120.000 C 116.000 131.046 107.046 140.000 96.000 140.000 C 84.954 140.000 76.000 131.046 76.000 120.000 Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
