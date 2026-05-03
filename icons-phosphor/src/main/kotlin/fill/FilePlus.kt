package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePlus: ImageVector
    get() {
        if (_filePlus != null) return _filePlus!!
        _filePlus = phosphorFillIcon(
            name = "FilePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 152.000 160.000 L 136.000 160.000 L 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 160.000 L 104.000 160.000 C 99.582 160.000 96.000 156.418 96.000 152.000 C 96.000 147.582 99.582 144.000 104.000 144.000 L 120.000 144.000 L 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 L 136.000 144.000 L 152.000 144.000 C 156.418 144.000 160.000 147.582 160.000 152.000 C 160.000 156.418 156.418 160.000 152.000 160.000 ZM 152.000 88.000 L 152.000 43.310 L 196.690 88.000 Z"),
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
        return _filePlus!!
    }

private var _filePlus: ImageVector? = null
