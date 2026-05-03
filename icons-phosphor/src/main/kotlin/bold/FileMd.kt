package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorBoldIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 152.000 L 100.000 208.000 C 100.000 214.627 94.627 220.000 88.000 220.000 C 81.373 220.000 76.000 214.627 76.000 208.000 L 76.000 190.070 L 69.830 198.880 C 67.584 202.087 63.915 203.997 60.000 203.997 C 56.085 203.997 52.416 202.087 50.170 198.880 L 44.000 190.070 L 44.000 208.000 C 44.000 214.627 38.627 220.000 32.000 220.000 C 25.373 220.000 20.000 214.627 20.000 208.000 L 20.000 152.000 C 20.001 146.763 23.398 142.132 28.393 140.558 C 33.388 138.983 38.826 140.830 41.830 145.120 L 60.000 171.070 L 78.170 145.120 C 81.174 140.830 86.612 138.983 91.607 140.558 C 96.602 142.132 99.999 146.763 100.000 152.000 ZM 184.000 180.000 C 184.000 202.091 166.091 220.000 144.000 220.000 L 128.000 220.000 C 121.373 220.000 116.000 214.627 116.000 208.000 L 116.000 152.000 C 116.000 145.373 121.373 140.000 128.000 140.000 L 144.000 140.000 C 166.091 140.000 184.000 157.909 184.000 180.000 ZM 160.000 180.000 C 160.000 171.163 152.837 164.000 144.000 164.000 L 140.000 164.000 L 140.000 196.000 L 144.000 196.000 C 152.837 196.000 160.000 188.837 160.000 180.000 ZM 220.000 88.000 L 220.000 224.000 C 220.000 230.627 214.627 236.000 208.000 236.000 C 201.373 236.000 196.000 230.627 196.000 224.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 60.000 44.000 L 60.000 108.000 C 60.000 114.627 54.627 120.000 48.000 120.000 C 41.373 120.000 36.000 114.627 36.000 108.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 152.000 20.000 C 155.185 20.000 158.239 21.266 160.490 23.520 L 216.490 79.520 C 218.737 81.770 220.000 84.820 220.000 88.000 ZM 160.000 80.000 L 183.000 80.000 L 160.000 57.000 Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
