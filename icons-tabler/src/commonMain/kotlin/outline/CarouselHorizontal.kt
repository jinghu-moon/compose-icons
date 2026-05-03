package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerOutlineIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.0f, 5.447716f, 7.447716f, 5.0f, 8.0f, 5.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.552284f, 5.0f, 17.0f, 5.447716f, 17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(17.0f, 18.552284f, 16.552284f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(7.447716f, 19.0f, 7.0f, 18.552284f, 7.0f, 18.0f),
                    PathNode.LineTo(7.0f, 6.0f)
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
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(20.447716f, 17.0f, 20.0f, 16.552284f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.0f, 7.447716f, 20.447716f, 7.0f, 21.0f, 7.0f),
                    PathNode.LineTo(22.0f, 7.0f)
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
                    PathNode.MoveTo(2.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.552285f, 17.0f, 4.0f, 16.552284f, 4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 7.447716f, 3.552285f, 7.0f, 3.0f, 7.0f),
                    PathNode.LineTo(2.0f, 7.0f)
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
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
