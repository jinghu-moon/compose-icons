package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BarricadeLine: ImageVector
    get() {
        if (_barricadeLine != null) return _barricadeLine!!
        _barricadeLine = remixIcon(
            name = "BarricadeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.493 19h11.014l-.667-3h-9.68l-.667 3ZM19.556 19h1.444v2h-18v-2h1.444L7.826 3.783C7.928 3.326 8.333 3 8.802 3h6.396c.469 0 .875 .326 .976 .783L19.556 19ZM7.604 14h8.791l-.889-4h-7.014l-.889 4ZM8.938 8h6.125L14.396 5h-4.791L8.938 8Z"),
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
        return _barricadeLine!!
    }

private var _barricadeLine: ImageVector? = null
