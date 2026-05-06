package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KnifeFill: ImageVector
    get() {
        if (_knifeFill != null) return _knifeFill!!
        _knifeFill = remixIcon(
            name = "KnifeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.374 19.439c.586 .586 .586 1.536 0 2.121-.586 .586-1.536 .586-2.121 0L15.657 16.965l-3.536 3.535L4.343 12.722C1.278 9.657 1.22 4.723 4.17 1.587l.174-.179L22.374 19.439Z"),
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
        return _knifeFill!!
    }

private var _knifeFill: ImageVector? = null
