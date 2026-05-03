package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerOutlineIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 6.000 C 7.000 5.448 7.448 5.000 8.000 5.000 L 16.000 5.000 C 16.552 5.000 17.000 5.448 17.000 6.000 L 17.000 18.000 C 17.000 18.552 16.552 19.000 16.000 19.000 L 8.000 19.000 C 7.448 19.000 7.000 18.552 7.000 18.000 L 7.000 6.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 22.000 17.000 L 21.000 17.000 C 20.448 17.000 20.000 16.552 20.000 16.000 L 20.000 8.000 C 20.000 7.448 20.448 7.000 21.000 7.000 L 22.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 17.000 L 3.000 17.000 C 3.552 17.000 4.000 16.552 4.000 16.000 L 4.000 8.000 C 4.000 7.448 3.552 7.000 3.000 7.000 L 2.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
