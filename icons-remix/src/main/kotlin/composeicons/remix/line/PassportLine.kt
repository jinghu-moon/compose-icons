package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PassportLine: ImageVector
    get() {
        if (_passportLine != null) return _passportLine!!
        _passportLine = remixIcon(
            name = "PassportLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16ZM19 4h-14v16h14v-16ZM16 16v2h-8v-2h8ZM12 6c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 14 8 12.209 8 10 8 7.791 9.791 6 12 6ZM12 8c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8Z"),
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
        return _passportLine!!
    }

private var _passportLine: ImageVector? = null
