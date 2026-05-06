package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Compass2Line: ImageVector
    get() {
        if (_compass2Line != null) return _compass2Line!!
        _compass2Line = remixIcon(
            name = "Compass2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.625 3.133 15.125 4.633C14.165 4.225 13.109 4 12 4 7.58 4 4 7.58 4 12c0 4.42 3.58 8 8 8 4.42 0 8-3.58 8-8 0-1.109-.225-2.165-.633-3.125L20.867 7.375C21.591 8.759 22 10.332 22 12c0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2c1.668 0 3.241 .409 4.625 1.133ZM18.364 4.222l1.414 1.414L12 13.414 10.586 12 18.364 4.222Z"),
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
        return _compass2Line!!
    }

private var _compass2Line: ImageVector? = null
