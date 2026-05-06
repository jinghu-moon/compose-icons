package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorBoldIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 192c0 6.627-5.373 12-12 12h-63.06c-7.581 .022-14.515-4.267-17.88-11.06L92.58 92h-60.58C25.373 92 20 86.627 20 80 20 73.373 25.373 68 32 68h63.06c7.581-.022 14.515 4.267 17.88 11.06L163.42 180h60.58c6.627 0 12 5.373 12 12ZM152 92h72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-72c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
