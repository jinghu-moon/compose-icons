package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorBoldIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.000 152.000 L 48.000 208.000 C 48.000 214.627 42.627 220.000 36.000 220.000 C 29.373 220.000 24.000 214.627 24.000 208.000 L 24.000 152.000 C 24.000 145.373 29.373 140.000 36.000 140.000 C 42.627 140.000 48.000 145.373 48.000 152.000 ZM 120.000 140.000 C 113.373 140.000 108.000 145.373 108.000 152.000 L 108.000 170.550 L 89.760 145.000 C 86.724 140.756 81.293 138.960 76.325 140.558 C 71.357 142.156 67.992 146.782 68.000 152.000 L 68.000 208.000 C 68.000 214.627 73.373 220.000 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 L 92.000 189.450 L 110.240 215.000 C 112.497 218.143 116.131 220.004 120.000 220.000 C 121.242 219.998 122.476 219.806 123.660 219.430 C 128.629 217.839 132.001 213.218 132.000 208.000 L 132.000 152.000 C 132.000 145.373 126.627 140.000 120.000 140.000 ZM 164.000 140.000 C 157.373 140.000 152.000 145.373 152.000 152.000 L 152.000 208.000 C 152.000 214.627 157.373 220.000 164.000 220.000 C 170.627 220.000 176.000 214.627 176.000 208.000 L 176.000 152.000 C 176.000 145.373 170.627 140.000 164.000 140.000 ZM 220.000 88.000 L 220.000 224.000 C 220.000 230.627 214.627 236.000 208.000 236.000 C 201.373 236.000 196.000 230.627 196.000 224.000 L 196.000 104.000 L 148.000 104.000 C 141.373 104.000 136.000 98.627 136.000 92.000 L 136.000 44.000 L 60.000 44.000 L 60.000 108.000 C 60.000 114.627 54.627 120.000 48.000 120.000 C 41.373 120.000 36.000 114.627 36.000 108.000 L 36.000 40.000 C 36.000 28.954 44.954 20.000 56.000 20.000 L 152.000 20.000 C 155.185 20.000 158.239 21.266 160.490 23.520 L 216.490 79.520 C 218.737 81.770 220.000 84.820 220.000 88.000 ZM 160.000 80.000 L 183.000 80.000 L 160.000 57.000 Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
