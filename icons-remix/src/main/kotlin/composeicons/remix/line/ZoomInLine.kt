package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZoomInLine: ImageVector
    get() {
        if (_zoomInLine != null) return _zoomInLine!!
        _zoomInLine = remixIcon(
            name = "ZoomInLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.031 16.617l4.283 4.283-1.414 1.414L16.617 18.031C15.077 19.263 13.124 20 11 20 6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2c4.968 0 9 4.032 9 9 0 2.124-.737 4.077-1.969 5.617ZM16.025 15.875C17.247 14.615 18 12.896 18 11 18 7.133 14.868 4 11 4 7.133 4 4 7.133 4 11c0 3.868 3.133 7 7 7 1.896 0 3.615-.753 4.875-1.975l.15-.15ZM10 10v-3h2v3h3v2h-3v3h-2v-3h-3v-2h3Z"),
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
        return _zoomInLine!!
    }

private var _zoomInLine: ImageVector? = null
