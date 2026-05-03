package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorBoldIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 152.000 C 232.000 158.627 226.627 164.000 220.000 164.000 L 212.000 164.000 L 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 C 193.373 220.000 188.000 214.627 188.000 208.000 L 188.000 164.000 L 180.000 164.000 C 173.373 164.000 168.000 158.627 168.000 152.000 C 168.000 145.373 173.373 140.000 180.000 140.000 L 220.000 140.000 C 226.627 140.000 232.000 145.373 232.000 152.000 ZM 92.000 172.000 C 92.000 189.673 77.673 204.000 60.000 204.000 L 56.000 204.000 L 56.000 208.000 C 56.000 214.627 50.627 220.000 44.000 220.000 C 37.373 220.000 32.000 214.627 32.000 208.000 L 32.000 152.000 C 32.000 145.373 37.373 140.000 44.000 140.000 L 60.000 140.000 C 77.673 140.000 92.000 154.327 92.000 172.000 ZM 68.000 172.000 C 68.000 167.582 64.418 164.000 60.000 164.000 L 56.000 164.000 L 56.000 180.000 L 60.000 180.000 C 64.418 180.000 68.000 176.418 68.000 172.000 ZM 164.000 172.000 C 164.000 189.673 149.673 204.000 132.000 204.000 L 128.000 204.000 L 128.000 208.000 C 128.000 214.627 122.627 220.000 116.000 220.000 C 109.373 220.000 104.000 214.627 104.000 208.000 L 104.000 152.000 C 104.000 145.373 109.373 140.000 116.000 140.000 L 132.000 140.000 C 149.673 140.000 164.000 154.327 164.000 172.000 ZM 140.000 172.000 C 140.000 167.582 136.418 164.000 132.000 164.000 L 128.000 164.000 L 128.000 180.000 L 132.000 180.000 C 136.418 180.000 140.000 176.418 140.000 172.000 ZM 36.000 108.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 152.000 20.000 C 155.185 20.000 158.239 21.266 160.490 23.520 L 216.490 79.520 C 218.737 81.770 220.000 84.820 220.000 88.000 L 220.000 108.000 C 220.000 114.627 214.627 120.000 208.000 120.000 C 201.373 120.000 196.000 114.627 196.000 108.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 60.000 44.000 L 60.000 108.000 C 60.000 114.627 54.627 120.000 48.000 120.000 C 41.373 120.000 36.000 114.627 36.000 108.000 ZM 160.000 80.000 L 183.000 80.000 L 160.000 57.000 Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
