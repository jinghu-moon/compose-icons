package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Heart3Line: ImageVector
    get() {
        if (_heart3Line != null) return _heart3Line!!
        _heart3Line = remixIcon(
            name = "Heart3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 3C19.538 3 22 5.5 22 9c0 7-7.5 11-10 12.5C9.5 20 2 16 2 9 2 5.5 4.5 3 7.5 3 9.36 3 11 4 12 5 13 4 14.64 3 16.5 3ZM12.934 18.604c.882-.555 1.676-1.108 2.421-1.701C18.334 14.533 20 11.943 20 9 20 6.641 18.463 5 16.5 5c-1.076 0-2.241 .569-3.086 1.414L12 7.828 10.586 6.414C9.741 5.569 8.576 5 7.5 5 5.559 5 4 6.656 4 9c0 2.943 1.666 5.533 4.645 7.903 .745 .593 1.539 1.146 2.421 1.701 .299 .188 .595 .369 .934 .571 .339-.202 .635-.383 .934-.571Z"),
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
        return _heart3Line!!
    }

private var _heart3Line: ImageVector? = null
