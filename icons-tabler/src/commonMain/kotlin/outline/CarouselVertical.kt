package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerOutlineIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 16.552284f, 18.552284f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(5.447716f, 17.0f, 5.0f, 16.552284f, 5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 7.447716f, 5.447716f, 7.0f, 6.0f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(18.552284f, 7.0f, 19.0f, 7.447716f, 19.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 22.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 20.447716f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.552284f, 20.0f, 17.0f, 20.447716f, 17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.0f, 3.552285f, 16.552284f, 4.0f, 16.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.CurveTo(7.447716f, 4.0f, 7.0f, 3.552285f, 7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
