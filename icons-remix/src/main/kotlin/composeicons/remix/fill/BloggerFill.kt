package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BloggerFill: ImageVector
    get() {
        if (_bloggerFill != null) return _bloggerFill!!
        _bloggerFill = remixIcon(
            name = "BloggerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.822 9.729h-1.093c-.589 0-1.094-.505-1.094-1.093C17.635 5.523 15.112 3 12 3h-3.364C5.523 3 3 5.523 3 8.635v6.729c0 3.112 2.523 5.636 5.636 5.636h6.729c3.112 0 5.635-2.523 5.635-5.636v-4.458c0-.673-.505-1.178-1.178-1.178ZM8.551 7.542h4.037c.589 0 1.093 .505 1.093 1.093 0 .589-.505 1.093-1.093 1.093h-4.037C7.963 9.729 7.458 9.224 7.458 8.635c0-.589 .505-1.093 1.093-1.093ZM15.449 16.458h-6.813c-.589 0-1.093-.505-1.093-1.093 0-.589 .505-1.093 1.093-1.093h6.813c.589 0 1.094 .505 1.094 1.093 0 .589-.505 1.093-1.094 1.093Z"),
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
        return _bloggerFill!!
    }

private var _bloggerFill: ImageVector? = null
