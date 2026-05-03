package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorBoldIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 79.520 L 160.490 23.520 C 158.239 21.266 155.185 20.000 152.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 108.000 C 36.000 114.627 41.373 120.000 48.000 120.000 C 54.627 120.000 60.000 114.627 60.000 108.000 L 60.000 44.000 L 136.000 44.000 L 136.000 92.000 C 136.000 98.627 141.373 104.000 148.000 104.000 L 196.000 104.000 L 196.000 212.000 L 172.000 212.000 C 165.373 212.000 160.000 217.373 160.000 224.000 C 160.000 230.627 165.373 236.000 172.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 88.000 C 220.000 84.820 218.737 81.770 216.490 79.520 ZM 160.000 57.000 L 183.000 80.000 L 160.000 80.000 ZM 64.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 145.373 36.000 152.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 C 54.627 220.000 60.000 214.627 60.000 208.000 L 60.000 204.000 L 64.000 204.000 C 81.673 204.000 96.000 189.673 96.000 172.000 C 96.000 154.327 81.673 140.000 64.000 140.000 ZM 64.000 180.000 L 60.000 180.000 L 60.000 164.000 L 64.000 164.000 C 68.418 164.000 72.000 167.582 72.000 172.000 C 72.000 176.418 68.418 180.000 64.000 180.000 ZM 144.000 187.440 L 144.000 208.000 C 144.000 214.627 138.627 220.000 132.000 220.000 C 125.373 220.000 120.000 214.627 120.000 208.000 L 120.000 187.440 L 101.820 158.360 C 98.307 152.738 100.018 145.333 105.640 141.820 C 111.262 138.307 118.667 140.018 122.180 145.640 L 132.000 161.360 L 141.820 145.640 C 145.333 140.018 152.738 138.307 158.360 141.820 C 163.982 145.333 165.693 152.738 162.180 158.360 Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
