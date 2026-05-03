package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorBoldIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 128.000 C 48.000 121.373 53.373 116.000 60.000 116.000 L 76.000 116.000 C 82.627 116.000 88.000 121.373 88.000 128.000 C 88.000 134.627 82.627 140.000 76.000 140.000 L 60.000 140.000 C 53.373 140.000 48.000 134.627 48.000 128.000 ZM 216.880 207.930 C 219.825 211.093 220.841 215.595 219.541 219.716 C 218.241 223.838 214.825 226.942 210.599 227.843 C 206.372 228.744 201.988 227.303 199.120 224.070 L 188.120 212.000 L 32.000 212.000 C 20.954 212.000 12.000 203.046 12.000 192.000 L 12.000 64.000 C 12.000 52.954 20.954 44.000 32.000 44.000 L 36.680 44.000 C 34.770 38.611 36.927 32.622 41.835 29.690 C 46.743 26.757 53.039 27.694 56.880 31.930 ZM 166.330 188.000 L 155.420 176.000 L 60.000 176.000 C 53.373 176.000 48.000 170.627 48.000 164.000 C 48.000 157.373 53.373 152.000 60.000 152.000 L 133.600 152.000 L 122.690 140.000 L 116.000 140.000 C 111.616 139.998 107.581 137.604 105.478 133.757 C 103.374 129.911 103.536 125.223 105.900 121.530 L 57.240 68.000 L 36.000 68.000 L 36.000 188.000 ZM 224.000 44.000 L 116.600 44.000 C 109.973 44.000 104.600 49.373 104.600 56.000 C 104.600 62.627 109.973 68.000 116.600 68.000 L 220.000 68.000 L 220.000 182.940 C 220.000 189.567 225.373 194.940 232.000 194.940 C 238.627 194.940 244.000 189.567 244.000 182.940 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 196.000 140.000 C 202.627 140.000 208.000 134.627 208.000 128.000 C 208.000 121.373 202.627 116.000 196.000 116.000 L 182.060 116.000 C 175.433 116.000 170.060 121.373 170.060 128.000 C 170.060 134.627 175.433 140.000 182.060 140.000 Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
