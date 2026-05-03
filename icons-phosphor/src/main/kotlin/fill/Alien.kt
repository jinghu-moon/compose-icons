package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorFillIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 75.006 16.061 32.061 59.006 32.000 112.000 C 32.000 136.000 44.560 167.060 65.610 195.000 C 86.790 223.150 110.110 240.000 128.000 240.000 C 145.890 240.000 169.210 223.190 190.390 195.000 C 211.440 167.000 224.000 136.000 224.000 112.000 C 223.939 59.006 180.994 16.061 128.000 16.000 ZM 64.000 116.000 C 64.000 109.373 69.373 104.000 76.000 104.000 C 95.882 104.000 112.000 120.118 112.000 140.000 C 112.000 146.627 106.627 152.000 100.000 152.000 C 80.118 152.000 64.000 135.882 64.000 116.000 ZM 144.000 200.000 L 112.000 200.000 C 107.582 200.000 104.000 196.418 104.000 192.000 C 104.000 187.582 107.582 184.000 112.000 184.000 L 144.000 184.000 C 148.418 184.000 152.000 187.582 152.000 192.000 C 152.000 196.418 148.418 200.000 144.000 200.000 ZM 156.000 152.000 C 149.373 152.000 144.000 146.627 144.000 140.000 C 144.000 120.118 160.118 104.000 180.000 104.000 C 186.627 104.000 192.000 109.373 192.000 116.000 C 192.000 135.882 175.882 152.000 156.000 152.000 Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
