package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Swap2Fill: ImageVector
    get() {
        if (_swap2Fill != null) return _swap2Fill!!
        _swap2Fill = remixIcon(
            name = "Swap2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.207 2.293 15.793 3.707l2.293 2.293h-5.086v2h5.086l-2.293 2.293 1.414 1.414L21.914 7 17.207 2.293ZM7 11.5c2.485 0 4.5-2.015 4.5-4.5C11.5 4.515 9.485 2.5 7 2.5 4.515 2.5 2.5 4.515 2.5 7c0 2.485 2.015 4.5 4.5 4.5ZM5.914 18l2.293 2.293L6.793 21.707 2.086 17 6.793 12.293l1.414 1.414L5.914 16h5.086v2h-5.086ZM14 13c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6c0-.552-.448-1-1-1h-6Z"),
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
        return _swap2Fill!!
    }

private var _swap2Fill: ImageVector? = null
