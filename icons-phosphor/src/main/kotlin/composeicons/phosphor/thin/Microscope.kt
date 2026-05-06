package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorThinIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 212h-29.2C210.998 196.251 220.095 174.592 220 152 219.947 107.185 184.761 70.285 140 68.1v-36.1c0-6.627-5.373-12-12-12h-48C73.373 20 68 25.373 68 32v104c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-59.89c31.689 1.675 59.001 22.863 68.501 53.14 9.501 30.277-.811 63.27-25.861 82.75h-150.64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM132 136c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4v-104c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM72 180c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
