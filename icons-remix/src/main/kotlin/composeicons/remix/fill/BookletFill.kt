package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookletFill: ImageVector
    get() {
        if (_bookletFill != null) return _bookletFill!!
        _bookletFill = remixIcon(
            name = "BookletFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 2v20h-4v-4h-2v-2h2v-3h-2v-2h2v-3h-2v-2h2v-4h4ZM20.005 2C21.107 2 22 2.898 22 3.991v16.018C22 21.109 21.107 22 20.005 22h-10.005v-20h10.005Z"),
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
        return _bookletFill!!
    }

private var _bookletFill: ImageVector? = null
