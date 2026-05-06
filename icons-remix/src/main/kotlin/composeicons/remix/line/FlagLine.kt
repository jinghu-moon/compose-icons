package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlagLine: ImageVector
    get() {
        if (_flagLine != null) return _flagLine!!
        _flagLine = remixIcon(
            name = "FlagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.382 3c.379 0 .725 .214 .894 .553L14 5h6c.552 0 1 .448 1 1v11c0 .552-.448 1-1 1h-6.382c-.379 0-.725-.214-.894-.553L12 16h-7v6h-2v-19h9.382ZM11.764 5h-6.764v9h8.236l1 2h4.764v-9h-6.236l-1-2Z"),
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
        return _flagLine!!
    }

private var _flagLine: ImageVector? = null
