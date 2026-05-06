package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaletteLine: ImageVector
    get() {
        if (_paletteLine != null) return _paletteLine!!
        _paletteLine = remixIcon(
            name = "PaletteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.522 0 10 3.978 10 8.889 0 3.067-2.489 5.556-5.556 5.556h-1.967c-.922 0-1.667 .744-1.667 1.667 0 .422 .167 .811 .422 1.1 .267 .3 .433 .689 .433 1.122C13.667 21.256 12.9 22 12 22 6.478 22 2 17.522 2 12 2 6.478 6.478 2 12 2ZM10.811 18.111c0-2.027 1.64-3.667 3.667-3.667h1.967c1.962 0 3.556-1.593 3.556-3.556C20 7.139 16.468 4 12 4 7.582 4 4 7.582 4 12c0 4.19 3.223 7.628 7.324 7.972-.329-.555-.513-1.196-.513-1.861ZM7.5 12C6.672 12 6 11.328 6 10.5 6 9.672 6.672 9 7.5 9 8.328 9 9 9.672 9 10.5 9 11.328 8.328 12 7.5 12ZM16.5 12C15.672 12 15 11.328 15 10.5 15 9.672 15.672 9 16.5 9 17.328 9 18 9.672 18 10.5 18 11.328 17.328 12 16.5 12ZM12 9C11.172 9 10.5 8.328 10.5 7.5 10.5 6.672 11.172 6 12 6c.828 0 1.5 .672 1.5 1.5C13.5 8.328 12.828 9 12 9Z"),
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
        return _paletteLine!!
    }

private var _paletteLine: ImageVector? = null
