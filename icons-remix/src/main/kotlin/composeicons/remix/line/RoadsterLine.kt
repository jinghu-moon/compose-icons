package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RoadsterLine: ImageVector
    get() {
        if (_roadsterLine != null) return _roadsterLine!!
        _roadsterLine = remixIcon(
            name = "RoadsterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 20h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-7.5L.757 13.189C.312 13.078 0 12.678 0 12.219v-.719C0 11.224 .224 11 .5 11h1.5L4.481 5.212C4.796 4.477 5.519 4 6.319 4h11.362c.8 0 1.523 .477 1.838 1.212L22 11h1.5c.276 0 .5 .224 .5 .5v.719c0 .459-.312 .859-.757 .97L22 13.5v7.5c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1ZM20 18v-5h-16v5h16ZM5.477 11h13.046c.127 0 .253-.024 .371-.071 .513-.205 .762-.787 .557-1.3L18 6h-12L4.549 9.629c-.047 .118-.072 .244-.072 .371 0 .552 .448 1 1 1ZM5 14c2.317 0 3.879 .755 4.686 2.264h-0c.13 .243 .038 .546-.205 .677C9.408 16.98 9.327 17 9.245 17h-3.245C5.448 17 5 16.552 5 16v-2ZM19 14v2c0 .552-.448 1-1 1h-3.245c-.082 0-.163-.02-.236-.059-.244-.13-.335-.433-.205-.677h-0C15.121 14.755 16.683 14 19 14Z"),
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
        return _roadsterLine!!
    }

private var _roadsterLine: ImageVector? = null
