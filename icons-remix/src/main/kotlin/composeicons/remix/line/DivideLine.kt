package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DivideLine: ImageVector
    get() {
        if (_divideLine != null) return _divideLine!!
        _divideLine = remixIcon(
            name = "DivideLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 11h14v2h-14v-2ZM12 8C11.172 8 10.5 7.328 10.5 6.5 10.5 5.672 11.172 5 12 5c.828 0 1.5 .672 1.5 1.5C13.5 7.328 12.828 8 12 8ZM12 19c-.828 0-1.5-.672-1.5-1.5C10.5 16.672 11.172 16 12 16c.828 0 1.5 .672 1.5 1.5C13.5 18.328 12.828 19 12 19Z"),
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
        return _divideLine!!
    }

private var _divideLine: ImageVector? = null
