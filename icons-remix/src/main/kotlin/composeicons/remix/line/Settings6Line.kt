package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings6Line: ImageVector
    get() {
        if (_settings6Line != null) return _settings6Line!!
        _settings6Line = remixIcon(
            name = "Settings6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.5 2.474 23 12l-5.5 9.526h-11L1 12 6.5 2.474h11ZM16.345 4.474h-8.691L3.309 12l4.345 7.526h8.691l4.345-7.526L16.345 4.474ZM8.634 8.17 10.366 7.17l5 8.66-1.732 1L8.634 8.17Z"),
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
        return _settings6Line!!
    }

private var _settings6Line: ImageVector? = null
