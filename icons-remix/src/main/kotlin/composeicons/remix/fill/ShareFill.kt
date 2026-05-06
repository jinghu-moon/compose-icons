package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShareFill: ImageVector
    get() {
        if (_shareFill != null) return _shareFill!!
        _shareFill = remixIcon(
            name = "ShareFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.576 17.271 8.466 14.484C7.833 15.112 6.962 15.5 6 15.5 4.067 15.5 2.5 13.933 2.5 12 2.5 10.067 4.067 8.5 6 8.5c.962 0 1.833 .388 2.466 1.016L13.576 6.729C13.526 6.494 13.5 6.25 13.5 6 13.5 4.067 15.067 2.5 17 2.5c1.933 0 3.5 1.567 3.5 3.5 0 1.933-1.567 3.5-3.5 3.5-.962 0-1.833-.388-2.466-1.016L9.424 11.271c.05 .235 .076 .479 .076 .729 0 .25-.026 .493-.076 .729l5.11 2.787c.633-.628 1.504-1.016 2.466-1.016 1.933 0 3.5 1.567 3.5 3.5 0 1.933-1.567 3.5-3.5 3.5-1.933 0-3.5-1.567-3.5-3.5 0-.25 .026-.494 .076-.729Z"),
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
        return _shareFill!!
    }

private var _shareFill: ImageVector? = null
