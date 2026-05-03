package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorThinIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 200.000 220.000 L 108.000 220.000 L 108.000 196.000 L 120.000 196.000 C 122.209 196.000 124.000 194.209 124.000 192.000 C 124.000 189.791 122.209 188.000 120.000 188.000 L 108.000 188.000 L 108.000 164.000 L 120.000 164.000 C 122.209 164.000 124.000 162.209 124.000 160.000 C 124.000 157.791 122.209 156.000 120.000 156.000 L 108.000 156.000 L 108.000 132.000 L 120.000 132.000 C 122.209 132.000 124.000 130.209 124.000 128.000 C 124.000 125.791 122.209 124.000 120.000 124.000 L 108.000 124.000 L 108.000 112.000 C 108.000 109.791 106.209 108.000 104.000 108.000 C 101.791 108.000 100.000 109.791 100.000 112.000 L 100.000 124.000 L 88.000 124.000 C 85.791 124.000 84.000 125.791 84.000 128.000 C 84.000 130.209 85.791 132.000 88.000 132.000 L 100.000 132.000 L 100.000 156.000 L 88.000 156.000 C 85.791 156.000 84.000 157.791 84.000 160.000 C 84.000 162.209 85.791 164.000 88.000 164.000 L 100.000 164.000 L 100.000 188.000 L 88.000 188.000 C 85.791 188.000 84.000 189.791 84.000 192.000 C 84.000 194.209 85.791 196.000 88.000 196.000 L 100.000 196.000 L 100.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
