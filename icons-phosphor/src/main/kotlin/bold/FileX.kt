package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorBoldIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 183.000 80.000 L 160.000 80.000 L 160.000 57.000 ZM 60.000 212.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 ZM 160.490 136.490 L 145.000 152.000 L 160.520 167.510 C 165.214 172.204 165.214 179.816 160.520 184.510 C 155.826 189.204 148.214 189.204 143.520 184.510 L 128.000 169.000 L 112.490 184.520 C 107.796 189.214 100.184 189.214 95.490 184.520 C 90.796 179.826 90.796 172.214 95.490 167.520 L 111.000 152.000 L 95.510 136.490 C 90.816 131.796 90.816 124.184 95.510 119.490 C 100.204 114.796 107.816 114.796 112.510 119.490 L 128.000 135.000 L 143.510 119.480 C 148.204 114.786 155.816 114.786 160.510 119.480 C 165.204 124.174 165.204 131.786 160.510 136.480 Z"),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
