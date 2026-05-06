package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MegaphoneLine: ImageVector
    get() {
        if (_megaphoneLine != null) return _megaphoneLine!!
        _megaphoneLine = remixIcon(
            name = "MegaphoneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 17c0 0 7 1 10 4h1c.552 0 1-.448 1-1v-6.063c.863-.222 1.5-1.005 1.5-1.937 0-.932-.637-1.715-1.5-1.937v-6.063C21 3.448 20.552 3 20 3h-1C16 6 9 7 9 7h-4C3.895 7 3 7.895 3 9v6c0 1.105 .895 2 2 2h1l1 5h2v-5ZM11 8.661c.683-.147 1.528-.349 2.439-.617C15.118 7.55 17.25 6.773 19 5.575v12.851C17.25 17.227 15.118 16.45 13.439 15.956c-.912-.268-1.756-.471-2.439-.617v-6.678ZM5 9h4v6h-4v-6Z"),
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
        return _megaphoneLine!!
    }

private var _megaphoneLine: ImageVector? = null
