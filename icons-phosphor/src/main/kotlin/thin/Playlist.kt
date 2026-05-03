package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorThinIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 40.000 132.000 L 160.000 132.000 C 162.209 132.000 164.000 130.209 164.000 128.000 C 164.000 125.791 162.209 124.000 160.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 ZM 112.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 112.000 196.000 C 114.209 196.000 116.000 194.209 116.000 192.000 C 116.000 189.791 114.209 188.000 112.000 188.000 ZM 243.830 125.150 C 243.525 126.170 242.826 127.027 241.887 127.530 C 240.949 128.033 239.848 128.141 238.830 127.830 L 204.000 117.380 L 204.000 192.000 C 204.012 205.387 194.547 216.911 181.412 219.498 C 168.277 222.085 155.148 215.013 150.082 202.621 C 145.016 190.229 149.431 175.985 160.617 168.630 C 171.803 161.275 186.631 162.868 196.000 172.430 L 196.000 112.000 C 196.000 110.736 196.598 109.546 197.613 108.791 C 198.628 108.037 199.939 107.807 201.150 108.170 L 241.150 120.170 C 243.265 120.806 244.464 123.035 243.830 125.150 ZM 196.000 192.000 C 196.000 180.954 187.046 172.000 176.000 172.000 C 164.954 172.000 156.000 180.954 156.000 192.000 C 156.000 203.046 164.954 212.000 176.000 212.000 C 187.046 212.000 196.000 203.046 196.000 192.000 Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
