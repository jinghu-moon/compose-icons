package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SurroundSoundLine: ImageVector
    get() {
        if (_surroundSoundLine != null) return _surroundSoundLine!!
        _surroundSoundLine = remixIcon(
            name = "SurroundSoundLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5v14h16v-14h-16ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM7.05 7.121 8.464 8.536C7.56 9.44 7 10.69 7 12.071c0 1.381 .56 2.631 1.464 3.535L7.05 17.021C5.784 15.754 5 14.004 5 12.071 5 10.138 5.784 8.388 7.05 7.121ZM16.95 7.121C18.216 8.388 19 10.138 19 12.071c0 1.933-.784 3.683-2.05 4.95L15.535 15.607C16.44 14.702 17 13.452 17 12.071 17 10.69 16.44 9.44 15.535 8.536L16.95 7.121ZM12 13.071c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1ZM12 15.071c-1.657 0-3-1.343-3-3C9 10.414 10.343 9.071 12 9.071c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z"),
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
        return _surroundSoundLine!!
    }

private var _surroundSoundLine: ImageVector? = null
