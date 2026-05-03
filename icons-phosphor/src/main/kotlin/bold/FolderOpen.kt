package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorBoldIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.230 112.310 C 244.471 107.092 238.431 103.999 232.000 104.000 L 220.000 104.000 L 220.000 88.000 C 220.000 76.954 211.046 68.000 200.000 68.000 L 132.000 68.000 L 105.340 48.000 C 101.874 45.411 97.666 44.009 93.340 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 208.000 C 20.000 214.627 25.373 220.000 32.000 220.000 L 211.100 220.000 C 216.191 220.007 220.733 216.800 222.430 212.000 L 250.920 130.530 L 250.980 130.360 C 253.023 124.252 252.000 117.533 248.230 112.310 ZM 92.000 68.000 L 120.800 89.600 C 122.877 91.158 125.404 92.000 128.000 92.000 L 196.000 92.000 L 196.000 104.000 L 69.770 104.000 C 61.199 104.001 53.581 109.463 50.830 117.580 L 44.000 137.150 L 44.000 68.000 ZM 202.590 196.000 L 48.890 196.000 L 72.610 128.000 L 226.370 128.000 Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
