package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShapesLine: ImageVector
    get() {
        if (_shapesLine != null) return _shapesLine!!
        _shapesLine = remixIcon(
            name = "ShapesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1 6 11h12L12 1ZM12 4.887 14.468 9h-4.935L12 4.887ZM6.75 20C5.231 20 4 18.769 4 17.25 4 15.731 5.231 14.5 6.75 14.5c1.519 0 2.75 1.231 2.75 2.75C9.5 18.769 8.269 20 6.75 20ZM6.75 22c2.623 0 4.75-2.127 4.75-4.75 0-2.623-2.127-4.75-4.75-4.75C4.127 12.5 2 14.627 2 17.25 2 19.873 4.127 22 6.75 22ZM15 15.5v4h4v-4h-4ZM13 21.5v-8h8v8h-8Z"),
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
        return _shapesLine!!
    }

private var _shapesLine: ImageVector? = null
