package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorRegularIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 192c0 4.418-3.582 8-8 8h-63.06c-6.064 .019-11.613-3.408-14.31-8.84L95.06 88h-63.06c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h63.06c6.064-.019 11.613 3.408 14.31 8.84L160.94 184h63.06c4.418 0 8 3.582 8 8ZM152 88h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
