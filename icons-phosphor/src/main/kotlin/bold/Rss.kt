package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = phosphorBoldIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 109.740 146.260 C 124.037 160.483 132.052 179.833 132.000 200.000 C 132.000 206.627 126.627 212.000 120.000 212.000 C 113.373 212.000 108.000 206.627 108.000 200.000 C 108.000 171.281 84.719 148.000 56.000 148.000 C 49.373 148.000 44.000 142.627 44.000 136.000 C 44.000 129.373 49.373 124.000 56.000 124.000 C 76.167 123.946 95.518 131.961 109.740 146.260 ZM 56.000 76.000 C 49.373 76.000 44.000 81.373 44.000 88.000 C 44.000 94.627 49.373 100.000 56.000 100.000 C 111.228 100.000 156.000 144.772 156.000 200.000 C 156.000 206.627 161.373 212.000 168.000 212.000 C 174.627 212.000 180.000 206.627 180.000 200.000 C 180.000 131.517 124.483 76.000 56.000 76.000 ZM 177.620 78.380 C 145.437 46.016 101.642 27.874 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 C 44.000 46.627 49.373 52.000 56.000 52.000 C 95.274 51.890 132.958 67.501 160.650 95.350 C 188.499 123.042 204.110 160.726 204.000 200.000 C 204.000 206.627 209.373 212.000 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 C 228.126 154.358 209.984 110.563 177.620 78.380 ZM 60.000 180.000 C 51.163 180.000 44.000 187.163 44.000 196.000 C 44.000 204.837 51.163 212.000 60.000 212.000 C 68.837 212.000 76.000 204.837 76.000 196.000 C 76.000 187.163 68.837 180.000 60.000 180.000 Z"),
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
        return _rss!!
    }

private var _rss: ImageVector? = null
