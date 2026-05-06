package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenSourceLine: ImageVector
    get() {
        if (_openSourceLine != null) return _openSourceLine!!
        _openSourceLine = remixIcon(
            name = "OpenSourceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 4.4-2.841 8.135-6.789 9.473l-.226 .074L12.082 13.997c1.069-.047 1.919-.943 1.919-1.997 0-1.105-.896-2-2-2-1.105 0-2 .895-2 2 0 1.077 .851 1.955 1.917 1.998L9.015 21.547l-.225-.073C4.842 20.135 2.001 16.4 2.001 12 2.001 6.477 6.478 2 12.001 2ZM12.001 4C7.583 4 4.001 7.582 4.001 12c0 2.92 1.564 5.475 3.901 6.872L9.381 15.023C8.536 14.29 8.001 13.207 8.001 12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 1.208-.535 2.29-1.381 3.023 .566 1.474 1.06 2.757 1.48 3.849C18.436 17.475 20.001 14.92 20.001 12c0-4.418-3.582-8-8-8Z"),
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
        return _openSourceLine!!
    }

private var _openSourceLine: ImageVector? = null
