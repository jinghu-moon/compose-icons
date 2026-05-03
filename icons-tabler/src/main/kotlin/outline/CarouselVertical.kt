package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerOutlineIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 8.000 L 19.000 16.000 C 19.000 16.552 18.552 17.000 18.000 17.000 L 6.000 17.000 C 5.448 17.000 5.000 16.552 5.000 16.000 L 5.000 8.000 C 5.000 7.448 5.448 7.000 6.000 7.000 L 18.000 7.000 C 18.552 7.000 19.000 7.448 19.000 8.000"),
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
                pathData = parseSvgPathData("M 7.000 22.000 L 7.000 21.000 C 7.000 20.448 7.448 20.000 8.000 20.000 L 16.000 20.000 C 16.552 20.000 17.000 20.448 17.000 21.000 L 17.000 22.000"),
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
                pathData = parseSvgPathData("M 17.000 2.000 L 17.000 3.000 C 17.000 3.552 16.552 4.000 16.000 4.000 L 8.000 4.000 C 7.448 4.000 7.000 3.552 7.000 3.000 L 7.000 2.000"),
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
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
