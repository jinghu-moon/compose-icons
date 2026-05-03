package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings4Line: ImageVector
    get() {
        if (_settings4Line != null) return _settings4Line!!
        _settings4Line = remixIcon(
            name = "Settings4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.000 11.135 2.110 10.296 2.316 9.496 C 3.406 9.553 4.488 9.010 5.072 8.000 C 5.655 6.990 5.584 5.783 4.991 4.867 C 6.184 3.695 7.668 2.820 9.326 2.361 C 9.822 3.334 10.833 4.000 12.000 4.000 C 13.167 4.000 14.178 3.334 14.674 2.361 C 16.332 2.820 17.816 3.695 19.009 4.867 C 18.416 5.783 18.345 6.990 18.928 8.000 C 19.511 9.010 20.594 9.553 21.684 9.496 C 21.890 10.296 22.000 11.135 22.000 12.000 C 22.000 12.864 21.890 13.703 21.684 14.503 C 20.594 14.447 19.511 14.990 18.928 16.000 C 18.345 17.009 18.416 18.217 19.009 19.133 C 17.816 20.304 16.332 21.179 14.674 21.638 C 14.178 20.666 13.167 20.000 12.000 20.000 C 10.833 20.000 9.822 20.666 9.326 21.638 C 7.668 21.179 6.184 20.304 4.991 19.133 C 5.584 18.217 5.655 17.009 5.072 16.000 C 4.488 14.990 3.406 14.447 2.316 14.503 C 2.110 13.703 2.000 12.864 2.000 12.000 ZM 6.804 15.000 C 7.434 16.091 7.615 17.346 7.368 18.524 C 7.776 18.814 8.210 19.065 8.665 19.274 C 9.562 18.471 10.739 18.000 12.000 18.000 C 13.261 18.000 14.438 18.471 15.335 19.274 C 15.790 19.065 16.224 18.814 16.632 18.524 C 16.385 17.346 16.566 16.091 17.196 15.000 C 17.826 13.908 18.823 13.125 19.965 12.749 C 19.988 12.502 20.000 12.252 20.000 12.000 C 20.000 11.748 19.988 11.498 19.965 11.250 C 18.823 10.875 17.826 10.091 17.196 9.000 C 16.566 7.908 16.385 6.654 16.632 5.476 C 16.224 5.186 15.790 4.934 15.335 4.726 C 14.438 5.528 13.261 6.000 12.000 6.000 C 10.739 6.000 9.562 5.528 8.665 4.726 C 8.210 4.934 7.776 5.186 7.368 5.476 C 7.615 6.654 7.434 7.908 6.804 9.000 C 6.174 10.091 5.178 10.875 4.035 11.250 C 4.012 11.498 4.000 11.748 4.000 12.000 C 4.000 12.252 4.012 12.502 4.035 12.749 C 5.178 13.125 6.174 13.908 6.804 15.000 ZM 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 ZM 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000 C 11.448 11.000 11.000 11.448 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 Z"),
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
        return _settings4Line!!
    }

private var _settings4Line: ImageVector? = null
