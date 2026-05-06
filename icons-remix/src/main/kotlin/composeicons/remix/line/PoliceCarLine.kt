package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PoliceCarLine: ImageVector
    get() {
        if (_policeCarLine != null) return _policeCarLine!!
        _policeCarLine = remixIcon(
            name = "PoliceCarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 13v5h16v-5h-16ZM5.618 11h12.764c.155 0 .308-.036 .447-.106 .494-.247 .694-.848 .447-1.342L18 7h-12L4.724 9.553c-.069 .139-.106 .292-.106 .447 0 .552 .448 1 1 1ZM22 13.5v7.5c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-7.5L.757 13.189C.312 13.078 0 12.678 0 12.219v-.719C0 11.224 .224 11 .5 11h1.5L4.447 6.106C4.786 5.428 5.479 5 6.236 5h1.764v-2h3v2h2v-2h3v2h1.764c.758 0 1.45 .428 1.789 1.106L22 11h1.5c.276 0 .5 .224 .5 .5v.719c0 .459-.312 .859-.757 .97L22 13.5ZM5 14c2.317 0 3.879 .755 4.686 2.264h-0c.13 .243 .038 .546-.205 .677C9.408 16.98 9.327 17 9.245 17h-3.245C5.448 17 5 16.552 5 16v-2ZM19 14v2c0 .552-.448 1-1 1h-3.245c-.082 0-.163-.02-.236-.059-.244-.13-.335-.433-.205-.677h-0C15.121 14.755 16.683 14 19 14Z"),
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
        return _policeCarLine!!
    }

private var _policeCarLine: ImageVector? = null
