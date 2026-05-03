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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.822 9.729 L 18.729 9.729 C 18.140 9.729 17.635 9.224 17.635 8.635 C 17.635 5.523 15.112 3.000 12.000 3.000 L 8.636 3.000 C 5.523 3.000 3.000 5.523 3.000 8.635 L 3.000 15.364 C 3.000 18.476 5.523 21.000 8.636 21.000 L 15.365 21.000 C 18.477 21.000 21.000 18.476 21.000 15.364 L 21.000 10.906 C 21.000 10.233 20.495 9.729 19.822 9.729 ZM 8.551 7.542 L 12.589 7.542 C 13.178 7.542 13.682 8.046 13.682 8.635 C 13.682 9.224 13.178 9.729 12.589 9.729 L 8.551 9.729 C 7.963 9.729 7.458 9.224 7.458 8.635 C 7.458 8.046 7.963 7.542 8.551 7.542 ZM 15.449 16.458 L 8.636 16.458 C 8.047 16.458 7.542 15.953 7.542 15.364 C 7.542 14.775 8.047 14.271 8.636 14.271 L 15.449 14.271 C 16.037 14.271 16.542 14.775 16.542 15.364 C 16.542 15.953 16.037 16.458 15.449 16.458 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bloggerFill!!
    }

private var _bloggerFill: ImageVector? = null
