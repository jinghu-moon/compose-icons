package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorBoldIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 116.000 L 156.000 116.000 L 156.000 60.000 L 212.000 60.000 ZM 52.000 120.000 C 52.000 113.373 57.373 108.000 64.000 108.000 C 70.627 108.000 76.000 113.373 76.000 120.000 C 76.000 126.627 70.627 132.000 64.000 132.000 C 57.373 132.000 52.000 126.627 52.000 120.000 ZM 44.000 169.770 C 46.690 161.840 55.000 156.000 64.000 156.000 C 73.430 156.000 82.190 162.440 84.380 171.000 C 86.037 177.418 92.582 181.277 99.000 179.620 C 105.418 177.963 109.277 171.418 107.620 165.000 C 105.211 155.885 99.887 147.808 92.460 142.000 C 103.178 128.041 102.232 108.378 90.224 95.512 C 78.215 82.646 58.664 80.348 44.000 90.080 L 44.000 60.000 L 132.000 60.000 L 132.000 196.000 L 44.000 196.000 ZM 156.000 196.000 L 156.000 140.000 L 212.000 140.000 L 212.000 196.000 ZM 168.000 88.000 C 168.000 79.163 175.163 72.000 184.000 72.000 C 192.837 72.000 200.000 79.163 200.000 88.000 C 200.000 96.837 192.837 104.000 184.000 104.000 C 175.163 104.000 168.000 96.837 168.000 88.000 ZM 200.000 168.000 C 200.000 176.837 192.837 184.000 184.000 184.000 C 175.163 184.000 168.000 176.837 168.000 168.000 C 168.000 159.163 175.163 152.000 184.000 152.000 C 192.837 152.000 200.000 159.163 200.000 168.000 Z"),
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
