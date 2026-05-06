package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Shining2Line: ImageVector
    get() {
        if (_shining2Line != null) return _shining2Line!!
        _shining2Line = remixIcon(
            name = "Shining2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 8l7.5 4L16 16l-4 7.5L8 16 .5 12 8 8 12 .5 16 8ZM19.25 12 14.522 9.478 12 4.75 9.478 9.478 4.75 12l4.728 2.522L12 19.25l2.522-4.728L19.25 12Z"),
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
        return _shining2Line!!
    }

private var _shining2Line: ImageVector? = null
