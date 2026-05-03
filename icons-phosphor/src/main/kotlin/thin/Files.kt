package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorThinIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 69.170 L 170.830 29.170 C 170.079 28.420 169.061 27.999 168.000 28.000 L 88.000 28.000 C 81.373 28.000 76.000 33.373 76.000 40.000 L 76.000 60.000 L 56.000 60.000 C 49.373 60.000 44.000 65.373 44.000 72.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 168.000 228.000 C 174.627 228.000 180.000 222.627 180.000 216.000 L 180.000 196.000 L 200.000 196.000 C 206.627 196.000 212.000 190.627 212.000 184.000 L 212.000 72.000 C 212.001 70.939 211.580 69.921 210.830 69.170 ZM 172.000 216.000 C 172.000 218.209 170.209 220.000 168.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 72.000 C 52.000 69.791 53.791 68.000 56.000 68.000 L 134.340 68.000 L 172.000 105.660 ZM 204.000 184.000 C 204.000 186.209 202.209 188.000 200.000 188.000 L 180.000 188.000 L 180.000 104.000 C 180.001 102.939 179.580 101.921 178.830 101.170 L 138.830 61.170 C 138.079 60.420 137.061 59.999 136.000 60.000 L 84.000 60.000 L 84.000 40.000 C 84.000 37.791 85.791 36.000 88.000 36.000 L 166.340 36.000 L 204.000 73.660 ZM 140.000 152.000 C 140.000 154.209 138.209 156.000 136.000 156.000 L 88.000 156.000 C 85.791 156.000 84.000 154.209 84.000 152.000 C 84.000 149.791 85.791 148.000 88.000 148.000 L 136.000 148.000 C 138.209 148.000 140.000 149.791 140.000 152.000 ZM 140.000 184.000 C 140.000 186.209 138.209 188.000 136.000 188.000 L 88.000 188.000 C 85.791 188.000 84.000 186.209 84.000 184.000 C 84.000 181.791 85.791 180.000 88.000 180.000 L 136.000 180.000 C 138.209 180.000 140.000 181.791 140.000 184.000 Z"),
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
        return _files!!
    }

private var _files: ImageVector? = null
