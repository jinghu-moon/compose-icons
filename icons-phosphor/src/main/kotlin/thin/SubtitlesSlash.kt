package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorThinIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.000 136.000 C 52.000 133.791 53.791 132.000 56.000 132.000 L 72.000 132.000 C 74.209 132.000 76.000 133.791 76.000 136.000 C 76.000 138.209 74.209 140.000 72.000 140.000 L 56.000 140.000 C 53.791 140.000 52.000 138.209 52.000 136.000 ZM 211.000 213.310 C 211.982 214.364 212.320 215.865 211.887 217.239 C 211.454 218.613 210.315 219.647 208.906 219.948 C 207.497 220.248 206.036 219.768 205.080 218.690 L 191.690 204.000 L 32.000 204.000 C 25.373 204.000 20.000 198.627 20.000 192.000 L 20.000 64.000 C 20.000 57.373 25.373 52.000 32.000 52.000 L 53.500 52.000 L 45.000 42.690 C 43.514 41.033 43.653 38.486 45.310 37.000 C 46.967 35.514 49.514 35.653 51.000 37.310 ZM 184.410 196.000 L 162.590 172.000 L 56.000 172.000 C 53.791 172.000 52.000 170.209 52.000 168.000 C 52.000 165.791 53.791 164.000 56.000 164.000 L 155.320 164.000 L 133.500 140.000 L 104.000 140.000 C 101.791 140.000 100.000 138.209 100.000 136.000 C 100.000 133.791 101.791 132.000 104.000 132.000 L 126.230 132.000 L 60.780 60.000 L 32.000 60.000 C 29.791 60.000 28.000 61.791 28.000 64.000 L 28.000 192.000 C 28.000 194.209 29.791 196.000 32.000 196.000 ZM 200.000 140.000 C 202.209 140.000 204.000 138.209 204.000 136.000 C 204.000 133.791 202.209 132.000 200.000 132.000 L 178.520 132.000 C 176.311 132.000 174.520 133.791 174.520 136.000 C 174.520 138.209 176.311 140.000 178.520 140.000 ZM 224.000 52.000 L 105.790 52.000 C 103.581 52.000 101.790 53.791 101.790 56.000 C 101.790 58.209 103.581 60.000 105.790 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 L 228.000 194.830 C 228.000 197.039 229.791 198.830 232.000 198.830 C 234.209 198.830 236.000 197.039 236.000 194.830 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 Z"),
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
