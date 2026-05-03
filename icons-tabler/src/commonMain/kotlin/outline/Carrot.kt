package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = tablerOutlineIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.CurveTo(3.0f, 21.0f, 12.834f, 17.511f, 15.684f, 14.66f),
                    PathNode.CurveTo(17.435232f, 12.907898f, 17.435232f, 10.068102f, 15.684f, 8.316f),
                    PathNode.CurveTo(14.84319f, 7.474638f, 13.702476f, 7.00192f, 12.513f, 7.00192f),
                    PathNode.CurveTo(11.323524f, 7.00192f, 10.18281f, 7.474638f, 9.342f, 8.316f),
                    PathNode.CurveTo(6.482f, 11.177f, 2.995f, 21.005f, 2.995f, 21.005f),
                    PathNode.LineTo(3.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.LineTo(7.5f, 11.5f)
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
                    PathNode.MoveTo(16.0f, 14.0f),
                    PathNode.LineTo(14.0f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 8.0f, 20.86f, 6.0f, 19.0f, 6.0f),
                    PathNode.CurveTo(17.594f, 6.0f, 16.0f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 8.0f, 17.14f, 10.0f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.86f, 10.0f, 22.0f, 8.0f, 22.0f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.CurveTo(16.0f, 2.0f, 14.0f, 3.14f, 14.0f, 5.0f),
                    PathNode.CurveTo(14.0f, 6.86f, 16.0f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 8.0f, 18.0f, 6.423f, 18.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 3.14f, 16.0f, 2.0f, 16.0f, 2.0f)
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
