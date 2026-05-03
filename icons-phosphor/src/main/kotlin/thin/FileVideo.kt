package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorThinIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 C 50.209 116.000 52.000 114.209 52.000 112.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 192.000 220.000 C 189.791 220.000 188.000 221.791 188.000 224.000 C 188.000 226.209 189.791 228.000 192.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 153.940 148.500 C 152.667 147.796 151.113 147.838 149.880 148.610 L 124.000 164.780 L 124.000 160.000 C 124.000 153.373 118.627 148.000 112.000 148.000 L 48.000 148.000 C 41.373 148.000 36.000 153.373 36.000 160.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 112.000 220.000 C 118.627 220.000 124.000 214.627 124.000 208.000 L 124.000 203.220 L 149.880 219.390 C 150.516 219.788 151.250 219.999 152.000 220.000 C 152.678 219.998 153.345 219.826 153.940 219.500 C 155.212 218.795 156.001 217.454 156.000 216.000 L 156.000 152.000 C 156.001 150.546 155.212 149.205 153.940 148.500 ZM 116.000 208.000 C 116.000 210.209 114.209 212.000 112.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 160.000 C 44.000 157.791 45.791 156.000 48.000 156.000 L 112.000 156.000 C 114.209 156.000 116.000 157.791 116.000 160.000 ZM 148.000 208.780 L 124.000 193.780 L 124.000 174.220 L 148.000 159.220 Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
