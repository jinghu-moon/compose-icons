package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookletLine: ImageVector
    get() {
        if (_bookletLine != null) return _bookletLine!!
        _bookletLine = remixIcon(
            name = "BookletLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.005 2C21.107 2 22 2.898 22 3.991v16.018C22 21.109 21.107 22 20.005 22h-16.005v-4h-2v-2h2v-3h-2v-2h2v-3h-2v-2h2v-4h16.005ZM8 4h-2v16h2v-16ZM20 4h-10v16h10v-16Z"),
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
        return _bookletLine!!
    }

private var _bookletLine: ImageVector? = null
