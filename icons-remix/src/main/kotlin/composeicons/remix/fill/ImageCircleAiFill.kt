package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageCircleAiFill: ImageVector
    get() {
        if (_imageCircleAiFill != null) return _imageCircleAiFill!!
        _imageCircleAiFill = remixIcon(
            name = "ImageCircleAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-.403-.024-.8-.07-1.191l-1.986 .236c.037 .313 .056 .631 .056 .955 0 .901-.149 1.768-.424 2.576L15.707 10.707c-.391-.391-1.024-.391-1.414 0L6.865 18.135C5.114 16.667 4 14.464 4 12 4 7.582 7.582 4 12 4c.692 0 1.362 .088 2 .252l.498-1.937C13.699 2.109 12.861 2 12 2ZM9 12c1.105 0 2-.895 2-2C11 8.895 10.105 8 9 8 7.895 8 7 8.895 7 10c0 1.105 .895 2 2 2Z"),
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
        return _imageCircleAiFill!!
    }

private var _imageCircleAiFill: ImageVector? = null
