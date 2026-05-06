package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PixFill: ImageVector
    get() {
        if (_pixFill != null) return _pixFill!!
        _pixFill = remixIcon(
            name = "PixFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.475 1.768C13.109 .401 10.892 .401 9.526 1.768L5.399 5.894c1.105-.069 2.234 .319 3.079 1.164l2.993 2.993c.293 .293 .768 .293 1.061 0L15.524 7.058c.845-.845 1.973-1.233 3.079-1.164L14.475 1.768ZM20.454 7.746l1.779 1.779c1.361 1.362 1.367 3.566 .016 4.934l-1.774 1.774c-1.172 1.172-3.071 1.172-4.243 0L13.238 13.24c-.683-.684-1.792-.684-2.475 0L7.77 16.234c-1.172 1.172-3.071 1.172-4.243 0L1.748 14.454C.401 13.086 .408 10.885 1.768 9.525L3.543 7.751C4.716 6.594 6.604 6.599 7.771 7.765l2.993 2.993c.683 .683 1.792 .683 2.475 0L16.231 7.765c1.165-1.165 3.05-1.172 4.223-.019ZM5.398 18.104c1.106 .069 2.234-.319 3.079-1.164l2.993-2.993c.293-.293 .768-.293 1.061 0l2.993 2.993c.845 .845 1.974 1.233 3.079 1.164l-4.128 4.128c-1.367 1.367-3.583 1.367-4.95 0L5.398 18.104Z"),
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
        return _pixFill!!
    }

private var _pixFill: ImageVector? = null
