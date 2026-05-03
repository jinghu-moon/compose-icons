package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorFillIcon(
            name = "DiceFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 32.000 L 64.000 32.000 C 46.327 32.000 32.000 46.327 32.000 64.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 64.000 C 224.000 46.327 209.673 32.000 192.000 32.000 ZM 100.000 168.000 C 93.373 168.000 88.000 162.627 88.000 156.000 C 88.000 149.373 93.373 144.000 100.000 144.000 C 106.627 144.000 112.000 149.373 112.000 156.000 C 112.000 162.627 106.627 168.000 100.000 168.000 ZM 100.000 112.000 C 93.373 112.000 88.000 106.627 88.000 100.000 C 88.000 93.373 93.373 88.000 100.000 88.000 C 106.627 88.000 112.000 93.373 112.000 100.000 C 112.000 106.627 106.627 112.000 100.000 112.000 ZM 156.000 168.000 C 149.373 168.000 144.000 162.627 144.000 156.000 C 144.000 149.373 149.373 144.000 156.000 144.000 C 162.627 144.000 168.000 149.373 168.000 156.000 C 168.000 162.627 162.627 168.000 156.000 168.000 ZM 156.000 112.000 C 149.373 112.000 144.000 106.627 144.000 100.000 C 144.000 93.373 149.373 88.000 156.000 88.000 C 162.627 88.000 168.000 93.373 168.000 100.000 C 168.000 106.627 162.627 112.000 156.000 112.000 Z"),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
