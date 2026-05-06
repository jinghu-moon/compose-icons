package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountBox2Line: ImageVector
    get() {
        if (_accountBox2Line != null) return _accountBox2Line!!
        _accountBox2Line = remixIcon(
            name = "AccountBox2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.995 3C3.893 3 3 3.893 3 4.995v14.01C3 20.107 3.893 21 4.995 21h14.01C20.107 21 21 20.107 21 19.005v-14.01C21 3.893 20.107 3 19.005 3h-14.01ZM5 19v-14h14v14h-14ZM12 8c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM12 12c1.657 0 3-1.343 3-3C15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9c0 1.657 1.343 3 3 3ZM12 15c-1.105 0-2 .895-2 2h-2c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4h-2c0-1.105-.895-2-2-2Z"),
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
        return _accountBox2Line!!
    }

private var _accountBox2Line: ImageVector? = null
