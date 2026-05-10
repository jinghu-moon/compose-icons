package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClosedCaptioningAiFill: ImageVector
    get() {
        if (_closedCaptioningAiFill != null) return _closedCaptioningAiFill!!
        _closedCaptioningAiFill = remixIcon(
            name = "ClosedCaptioningAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM22 20v-9.341c-.626 .221-1.299 .341-2 .341-.88 0-1.715-.189-2.468-.53l-.116 .116C17.053 10.224 16.553 10 16 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C18.104 15.552 17.104 16 16 16c-2.208 0-4-1.792-4-4 0-1.825 1.224-3.366 2.895-3.845C14.328 7.238 14 6.157 14 5c0-.701 .12-1.374 .341-2h-11.341C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1ZM9 8c1.104 0 2.105 .448 2.829 1.173l-1.414 1.414C10.048 10.22 9.55 10 9 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .552 0 1.052-.224 1.414-.586l1.414 1.414C11.1 15.55 10.1 16 9 16 6.792 16 5 14.208 5 12 5 9.792 6.792 8 9 8Z"),
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
        return _closedCaptioningAiFill!!
    }

private var _closedCaptioningAiFill: ImageVector? = null
