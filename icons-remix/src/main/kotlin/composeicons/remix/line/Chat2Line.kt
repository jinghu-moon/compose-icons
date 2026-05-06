package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Chat2Line: ImageVector
    get() {
        if (_chat2Line != null) return _chat2Line!!
        _chat2Line = remixIcon(
            name = "Chat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.45 19 12 22.5 9.55 19h-6.55c-.265 0-.52-.105-.707-.293C2.105 18.52 2 18.265 2 18v-14c0-.265 .105-.52 .293-.707C2.48 3.105 2.735 3 3 3h18c.265 0 .52 .105 .707 .293C21.895 3.48 22 3.735 22 4v14c0 .265-.105 .52-.293 .707C21.52 18.895 21.265 19 21 19h-6.55ZM13.409 17h6.591v-12h-16v12h6.591L12 19.012 13.409 17Z"),
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
        return _chat2Line!!
    }

private var _chat2Line: ImageVector? = null
