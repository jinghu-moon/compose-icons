package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneFindLine: ImageVector
    get() {
        if (_phoneFindLine != null) return _phoneFindLine!!
        _phoneFindLine = remixIcon(
            name = "PhoneFindLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v8h-2v-7h-10v16h4v2h-5C5.448 22 5 21.552 5 21v-18C5 2.448 5.448 2 6 2h12ZM15 12c2.209 0 4 1.791 4 4 0 .742-.202 1.437-.554 2.032l2.211 2.21-1.414 1.414L17.031 19.447C16.436 19.798 15.741 20 15 20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4ZM15 14c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2Z"),
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
        return _phoneFindLine!!
    }

private var _phoneFindLine: ImageVector? = null
