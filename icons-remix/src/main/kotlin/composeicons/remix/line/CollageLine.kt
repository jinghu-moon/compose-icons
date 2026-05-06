package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CollageLine: ImageVector
    get() {
        if (_collageLine != null) return _collageLine!!
        _collageLine = remixIcon(
            name = "CollageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3.107c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h16ZM11.189 13.265 5 14.356v4.751h7.218L11.189 13.265ZM19 5.107h-7.219l2.468 14h4.751v-14ZM9.75 5.107h-4.75v7.218l5.842-1.029L9.75 5.107Z"),
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
        return _collageLine!!
    }

private var _collageLine: ImageVector? = null
