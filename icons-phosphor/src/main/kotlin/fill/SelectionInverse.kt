package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorFillIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 216.000 C 152.000 220.418 148.418 224.000 144.000 224.000 L 112.000 224.000 C 107.582 224.000 104.000 220.418 104.000 216.000 C 104.000 211.582 107.582 208.000 112.000 208.000 L 144.000 208.000 C 148.418 208.000 152.000 211.582 152.000 216.000 ZM 40.000 152.000 C 44.418 152.000 48.000 148.418 48.000 144.000 L 48.000 112.000 C 48.000 107.582 44.418 104.000 40.000 104.000 C 35.582 104.000 32.000 107.582 32.000 112.000 L 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 ZM 72.000 208.000 L 48.000 208.000 L 48.000 184.000 C 48.000 179.582 44.418 176.000 40.000 176.000 C 35.582 176.000 32.000 179.582 32.000 184.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 72.000 224.000 C 76.418 224.000 80.000 220.418 80.000 216.000 C 80.000 211.582 76.418 208.000 72.000 208.000 ZM 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 L 48.000 32.000 C 44.060 31.999 40.260 33.464 37.340 36.110 C 36.885 36.472 36.472 36.885 36.110 37.340 C 33.464 40.260 31.999 44.060 32.000 48.000 L 32.000 72.000 C 32.000 76.418 35.582 80.000 40.000 80.000 C 44.418 80.000 48.000 76.418 48.000 72.000 L 48.000 59.310 L 196.690 208.000 L 184.000 208.000 C 179.582 208.000 176.000 211.582 176.000 216.000 C 176.000 220.418 179.582 224.000 184.000 224.000 L 208.000 224.000 C 211.938 224.000 215.737 222.539 218.660 219.900 C 218.888 219.716 219.105 219.519 219.310 219.310 C 219.519 219.108 219.713 218.890 219.890 218.660 C 222.536 215.740 224.001 211.940 224.000 208.000 Z"),
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
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
