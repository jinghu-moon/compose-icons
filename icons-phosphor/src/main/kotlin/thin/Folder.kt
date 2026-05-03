package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = phosphorThinIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 76.000 L 129.660 76.000 L 101.170 47.520 C 98.928 45.260 95.874 43.992 92.690 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.620 C 28.011 206.900 33.100 211.989 39.380 212.000 L 216.890 212.000 C 223.024 211.994 227.994 207.024 228.000 200.890 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 ZM 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 92.690 52.000 C 93.748 52.002 94.762 52.422 95.510 53.170 L 118.340 76.000 L 36.000 76.000 ZM 220.000 200.890 C 219.995 202.605 218.605 203.995 216.890 204.000 L 39.380 204.000 C 37.516 203.995 36.005 202.484 36.000 200.620 L 36.000 84.000 L 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 Z"),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
