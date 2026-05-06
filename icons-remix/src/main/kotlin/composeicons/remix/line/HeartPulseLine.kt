package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartPulseLine: ImageVector
    get() {
        if (_heartPulseLine != null) return _heartPulseLine!!
        _heartPulseLine = remixIcon(
            name = "HeartPulseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 3C19.538 3 22 5.5 22 9c0 7-7.5 11-10 12.5C10.023 20.313 4.917 17.563 2.869 13.001L1 13v-2l1.21 .001C2.074 10.363 2 9.697 2 9 2 5.5 4.5 3 7.5 3 9.36 3 11 4 12 5 13 4 14.64 3 16.5 3ZM16.5 5c-1.076 0-2.241 .569-3.086 1.414L12 7.828 10.586 6.414C9.741 5.569 8.576 5 7.5 5 5.559 5 4 6.656 4 9c0 .685 .09 1.352 .267 2L6.434 11 8.5 7.556l3 5L12.434 11h4.566v2h-3.434l-2.066 3.444-3-5L7.566 13l-2.458 .001c.789 1.373 1.985 2.668 3.537 3.902 .745 .593 1.539 1.146 2.421 1.701 .299 .188 .595 .369 .934 .571 .339-.202 .635-.383 .934-.571 .882-.555 1.676-1.108 2.421-1.701C18.334 14.533 20 11.943 20 9 20 6.641 18.463 5 16.5 5Z"),
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
        return _heartPulseLine!!
    }

private var _heartPulseLine: ImageVector? = null
