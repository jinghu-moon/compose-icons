package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatQuoteLine: ImageVector
    get() {
        if (_chatQuoteLine != null) return _chatQuoteLine!!
        _chatQuoteLine = remixIcon(
            name = "ChatQuoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545L2 22.5v-18.5C2 3.448 2.448 3 3 3h18ZM20 5h-16v13.385L5.763 17h14.237v-12ZM10.515 7.412l.446 .689C9.294 9.003 9.323 10.452 9.323 10.764c.155-.021 .318-.024 .479-.009 .902 .084 1.613 .824 1.613 1.745 0 .967-.783 1.75-1.75 1.75-.537 0-1.05-.245-1.374-.59-.515-.547-.792-1.16-.792-2.155 0-1.75 1.228-3.318 3.015-4.094ZM15.515 7.412l.446 .689c-1.668 .902-1.638 2.351-1.638 2.664 .155-.021 .318-.024 .479-.009 .902 .084 1.613 .824 1.613 1.745 0 .967-.783 1.75-1.75 1.75-.536 0-1.05-.245-1.374-.59-.515-.547-.792-1.16-.792-2.155 0-1.75 1.228-3.318 3.015-4.094Z"),
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
        return _chatQuoteLine!!
    }

private var _chatQuoteLine: ImageVector? = null
