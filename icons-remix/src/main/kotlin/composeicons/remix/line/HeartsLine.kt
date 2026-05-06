package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartsLine: ImageVector
    get() {
        if (_heartsLine != null) return _heartsLine!!
        _heartsLine = remixIcon(
            name = "HeartsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.243 4.757c1.462 1.465 2.012 3.493 1.65 5.379 .569 .16 1.106 .463 1.555 .908 1.404 1.394 1.404 3.653 0 5.047L17 21.5l-3.022-3-2.978 2.985L2.521 12.993C.417 10.637 .496 7.019 2.757 4.757 5.022 2.493 8.645 2.417 11.001 4.529c2.349-2.109 5.979-2.039 8.242 .229ZM12.962 12.465c-.616 .612-.616 1.597 0 2.208L17 18.682l4.038-4.009c.616-.612 .616-1.597 0-2.208-.624-.619-1.642-.619-2.268 .002l-1.772 1.754L15.591 12.825l-.363-.36c-.624-.619-1.642-.619-2.266 0ZM4.172 6.172C2.682 7.661 2.607 10.047 3.98 11.623l7.02 7.031 1.559-1.562-1.006-1c-1.404-1.394-1.404-3.653 0-5.047 1.404-1.394 3.68-1.394 5.084 0l.363 .36 .364-.36c.425-.421 .929-.716 1.465-.882 .416-1.367 .078-2.912-1.001-3.993C16.328 4.668 13.908 4.607 12.337 6.017L11.002 7.215 9.666 6.018C8.091 4.606 5.675 4.668 4.172 6.172Z"),
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
        return _heartsLine!!
    }

private var _heartsLine: ImageVector? = null
