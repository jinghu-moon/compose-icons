package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorFillIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 165.780 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 170.350 C 223.986 167.686 222.647 165.203 220.428 163.729 C 218.209 162.254 215.402 161.981 212.940 163.000 C 210.105 164.171 207.067 164.772 204.000 164.770 C 190.770 164.770 180.000 153.670 180.000 140.040 C 180.000 126.410 190.770 115.310 204.000 115.310 C 207.067 115.308 210.105 115.909 212.940 117.080 C 215.415 118.105 218.238 117.823 220.461 116.329 C 222.685 114.835 224.013 112.328 224.000 109.650 L 224.000 72.000 C 224.000 63.163 216.837 56.000 208.000 56.000 L 171.780 56.000 C 171.929 54.672 172.002 53.336 172.000 52.000 C 172.000 32.118 155.882 16.000 136.000 16.000 C 116.118 16.000 100.000 32.118 100.000 52.000 C 99.998 53.336 100.071 54.672 100.220 56.000 L 64.000 56.000 C 55.163 56.000 48.000 63.163 48.000 72.000 L 48.000 104.220 C 46.672 104.071 45.336 103.998 44.000 104.000 C 24.118 104.000 8.000 120.118 8.000 140.000 C 8.000 159.882 24.118 176.000 44.000 176.000 C 45.336 176.002 46.672 175.929 48.000 175.780 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 106.220 224.000"),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
