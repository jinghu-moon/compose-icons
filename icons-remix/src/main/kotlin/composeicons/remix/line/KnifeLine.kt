package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KnifeLine: ImageVector
    get() {
        if (_knifeLine != null) return _knifeLine!!
        _knifeLine = remixIcon(
            name = "KnifeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.343 1.408 22.374 19.439c.586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0L15.657 16.965l-3.536 3.535L4.343 12.722C1.278 9.657 1.22 4.723 4.17 1.587l.174-.179ZM4.584 4.478l-.051 .11c-.969 2.139-.615 4.727 1.048 6.535l.177 .184 6.363 6.364 2.828-2.829L4.584 4.478Z"),
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
        return _knifeLine!!
    }

private var _knifeLine: ImageVector? = null
