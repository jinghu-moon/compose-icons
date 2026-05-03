package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ImageGeneration: ImageVector
    get() {
        if (_imageGeneration != null) return _imageGeneration!!
        _imageGeneration = tablerOutlineIcon(
            name = "ImageGeneration",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 14.790861f, 4.790861f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(9.209139f, 13.0f, 11.0f, 14.790861f, 11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 19.209139f, 9.209139f, 21.0f, 7.0f, 21.0f),
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
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(15.185612f, 3.795301f, 10.273202f, 7.709877f, 8.2f, 13.2f)
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
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(20.204699f, 8.814388f, 16.290123f, 13.726798f, 10.8f, 15.8f)
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
                    PathNode.MoveTo(10.6f, 9.0f),
                    PathNode.CurveTo(12.543164f, 9.896867f, 14.103133f, 11.456836f, 15.0f, 13.4f)
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
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.CurveTo(18.10457f, 19.0f, 19.0f, 19.89543f, 19.0f, 21.0f),
                    PathNode.CurveTo(19.0f, 19.89543f, 19.89543f, 19.0f, 21.0f, 19.0f),
                    PathNode.CurveTo(19.89543f, 19.0f, 19.0f, 18.10457f, 19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 18.10457f, 18.10457f, 19.0f, 17.0f, 19.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(4.10457f, 5.0f, 5.0f, 5.895431f, 5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 5.895431f, 5.895431f, 5.0f, 7.0f, 5.0f),
                    PathNode.CurveTo(5.895431f, 5.0f, 5.0f, 4.10457f, 5.0f, 3.0f),
                    PathNode.CurveTo(5.0f, 4.10457f, 4.10457f, 5.0f, 3.0f, 5.0f)
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
        return _imageGeneration!!
    }

private var _imageGeneration: ImageVector? = null
