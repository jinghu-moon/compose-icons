package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorThinIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 192c0 2.209-1.791 4-4 4h-63.06c-4.547 .014-8.708-2.557-10.73-6.63L98.63 86.21C97.953 84.858 96.572 84.003 95.06 84h-63.06c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h63.06c4.547-.014 8.708 2.557 10.73 6.63l51.58 103.16c.677 1.352 2.058 2.207 3.57 2.21h63.06c2.209 0 4 1.791 4 4ZM152 84h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
