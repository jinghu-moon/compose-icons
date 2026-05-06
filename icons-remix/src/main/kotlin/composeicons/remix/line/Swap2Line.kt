package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Swap2Line: ImageVector
    get() {
        if (_swap2Line != null) return _swap2Line!!
        _swap2Line = remixIcon(
            name = "Swap2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.207 2.293 15.793 3.707l2.293 2.293h-5.086v2h5.086l-2.293 2.293 1.414 1.414L21.914 7 17.207 2.293ZM9.5 7C9.5 5.619 8.381 4.5 7 4.5 5.619 4.5 4.5 5.619 4.5 7c0 1.381 1.119 2.5 2.5 2.5 1.381 0 2.5-1.119 2.5-2.5ZM11.5 7c0 2.485-2.015 4.5-4.5 4.5C4.515 11.5 2.5 9.485 2.5 7 2.5 4.515 4.515 2.5 7 2.5c2.485 0 4.5 2.015 4.5 4.5ZM5.914 18l2.293 2.293L6.793 21.707 2.086 17 6.793 12.293l1.414 1.414L5.914 16h5.086v2h-5.086ZM15 19h4v-4h-4v4ZM13 14c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6Z"),
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
        return _swap2Line!!
    }

private var _swap2Line: ImageVector? = null
