package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PercentLine: ImageVector
    get() {
        if (_percentLine != null) return _percentLine!!
        _percentLine = remixIcon(
            name = "PercentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.505 21.003c-1.933 0-3.5-1.567-3.5-3.5 0-1.933 1.567-3.5 3.5-3.5 1.933 0 3.5 1.567 3.5 3.5 0 1.933-1.567 3.5-3.5 3.5ZM17.505 19.003c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM6.505 10.003C4.572 10.003 3.005 8.436 3.005 6.503 3.005 4.57 4.572 3.003 6.505 3.003c1.933 0 3.5 1.567 3.5 3.5 0 1.933-1.567 3.5-3.5 3.5ZM6.505 8.003c.828 0 1.5-.672 1.5-1.5C8.005 5.674 7.333 5.003 6.505 5.003c-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM19.076 3.517l1.414 1.414L4.934 20.488 3.52 19.074 19.076 3.517Z"),
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
        return _percentLine!!
    }

private var _percentLine: ImageVector? = null
