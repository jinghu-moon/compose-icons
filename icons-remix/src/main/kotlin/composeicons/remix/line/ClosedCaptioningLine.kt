package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClosedCaptioningLine: ImageVector
    get() {
        if (_closedCaptioningLine != null) return _closedCaptioningLine!!
        _closedCaptioningLine = remixIcon(
            name = "ClosedCaptioningLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM20 5h-16v14h16v-14ZM9 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C10.053 10.224 9.553 10 9 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C11.104 15.552 10.104 16 9 16 6.792 16 5 14.208 5 12 5 9.792 6.792 8 9 8ZM16 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C17.053 10.224 16.553 10 16 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C18.104 15.552 17.104 16 16 16c-2.208 0-4-1.792-4-4C12 9.792 13.792 8 16 8Z"),
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
        return _closedCaptioningLine!!
    }

private var _closedCaptioningLine: ImageVector? = null
