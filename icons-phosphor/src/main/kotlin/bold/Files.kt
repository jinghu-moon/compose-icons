package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorBoldIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.490 59.510 L 180.490 19.510 C 178.238 17.260 175.184 15.997 172.000 16.000 L 92.000 16.000 C 80.954 16.000 72.000 24.954 72.000 36.000 L 72.000 56.000 L 56.000 56.000 C 44.954 56.000 36.000 64.954 36.000 76.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 164.000 236.000 C 175.046 236.000 184.000 227.046 184.000 216.000 L 184.000 196.000 L 204.000 196.000 C 215.046 196.000 224.000 187.046 224.000 176.000 L 224.000 68.000 C 224.003 64.816 222.740 61.762 220.490 59.510 ZM 160.000 212.000 L 60.000 212.000 L 60.000 80.000 L 127.000 80.000 L 160.000 113.000 ZM 200.000 172.000 L 184.000 172.000 L 184.000 108.000 C 184.003 104.816 182.740 101.762 180.490 99.510 L 140.490 59.510 C 138.238 57.260 135.184 55.997 132.000 56.000 L 96.000 56.000 L 96.000 40.000 L 167.000 40.000 L 200.000 73.000 ZM 144.000 144.000 C 144.000 150.627 138.627 156.000 132.000 156.000 L 88.000 156.000 C 81.373 156.000 76.000 150.627 76.000 144.000 C 76.000 137.373 81.373 132.000 88.000 132.000 L 132.000 132.000 C 138.627 132.000 144.000 137.373 144.000 144.000 ZM 144.000 184.000 C 144.000 190.627 138.627 196.000 132.000 196.000 L 88.000 196.000 C 81.373 196.000 76.000 190.627 76.000 184.000 C 76.000 177.373 81.373 172.000 88.000 172.000 L 132.000 172.000 C 138.627 172.000 144.000 177.373 144.000 184.000 Z"),
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
