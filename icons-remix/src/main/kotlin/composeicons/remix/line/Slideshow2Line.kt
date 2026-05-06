package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Slideshow2Line: ImageVector
    get() {
        if (_slideshow2Line != null) return _slideshow2Line!!
        _slideshow2Line = remixIcon(
            name = "Slideshow2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 17v3h5v2h-12v-2h5v-3h-7C3.448 17 3 16.552 3 16v-12h-1v-2h20v2h-1v12c0 .552-.448 1-1 1h-7ZM5 15h14v-11h-14v11ZM10 6l5 3.5L10 13v-7Z"),
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
        return _slideshow2Line!!
    }

private var _slideshow2Line: ImageVector? = null
