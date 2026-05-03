package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorBoldIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 164.000 L 200.000 172.000 L 212.000 172.000 C 218.627 172.000 224.000 177.373 224.000 184.000 C 224.000 190.627 218.627 196.000 212.000 196.000 L 200.000 196.000 L 200.000 208.000 C 200.000 214.627 194.627 220.000 188.000 220.000 C 181.373 220.000 176.000 214.627 176.000 208.000 L 176.000 152.000 C 176.000 145.373 181.373 140.000 188.000 140.000 L 220.000 140.000 C 226.627 140.000 232.000 145.373 232.000 152.000 C 232.000 158.627 226.627 164.000 220.000 164.000 ZM 92.000 172.000 C 92.000 189.673 77.673 204.000 60.000 204.000 L 56.000 204.000 L 56.000 208.000 C 56.000 214.627 50.627 220.000 44.000 220.000 C 37.373 220.000 32.000 214.627 32.000 208.000 L 32.000 152.000 C 32.000 145.373 37.373 140.000 44.000 140.000 L 60.000 140.000 C 77.673 140.000 92.000 154.327 92.000 172.000 ZM 68.000 172.000 C 68.000 167.582 64.418 164.000 60.000 164.000 L 56.000 164.000 L 56.000 180.000 L 60.000 180.000 C 64.418 180.000 68.000 176.418 68.000 172.000 ZM 168.000 180.000 C 168.000 202.091 150.091 220.000 128.000 220.000 L 112.000 220.000 C 105.373 220.000 100.000 214.627 100.000 208.000 L 100.000 152.000 C 100.000 145.373 105.373 140.000 112.000 140.000 L 128.000 140.000 C 150.091 140.000 168.000 157.909 168.000 180.000 ZM 144.000 180.000 C 144.000 171.163 136.837 164.000 128.000 164.000 L 124.000 164.000 L 124.000 196.000 L 128.000 196.000 C 136.837 196.000 144.000 188.837 144.000 180.000 ZM 36.000 108.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 152.000 20.000 C 155.185 20.000 158.239 21.266 160.490 23.520 L 216.490 79.520 C 218.737 81.770 220.000 84.820 220.000 88.000 L 220.000 108.000 C 220.000 114.627 214.627 120.000 208.000 120.000 C 201.373 120.000 196.000 114.627 196.000 108.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 60.000 44.000 L 60.000 108.000 C 60.000 114.627 54.627 120.000 48.000 120.000 C 41.373 120.000 36.000 114.627 36.000 108.000 ZM 160.000 57.000 L 160.000 80.000 L 183.000 80.000 Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
