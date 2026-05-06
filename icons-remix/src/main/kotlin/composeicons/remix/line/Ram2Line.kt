package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ram2Line: ImageVector
    get() {
        if (_ram2Line != null) return _ram2Line!!
        _ram2Line = remixIcon(
            name = "Ram2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5C1.448 5 1 5.448 1 6v9c0 .552 .448 1 1 1v2c0 .552 .448 1 1 1h7.414l1-1h1.172l1 1h7.414c.552 0 1-.448 1-1v-2c.552 0 1-.448 1-1v-9C23 5.448 22.552 5 22 5h-20ZM20 16v1h-5.586l-1-1h6.586ZM10.586 16 9.586 17h-5.586v-1h6.586ZM3 14v-7h18v7h-18ZM5 9h2v3h-2v-3ZM11 9h-2v3h2v-3ZM13 9h2v3h-2v-3ZM19 9h-2v3h2v-3Z"),
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
        return _ram2Line!!
    }

private var _ram2Line: ImageVector? = null
