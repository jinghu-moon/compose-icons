package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorybook: ImageVector
    get() {
        if (_brandStorybook != null) return _brandStorybook!!
        _brandStorybook = tablerOutlineIcon(
            name = "BrandStorybook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 4.0f),
                    PathNode.LineTo(5.5f, 20.5f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.LineTo(5.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.6f, 16.5f, 10.639f, 17.0f, 12.283f, 17.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(13.8f, 17.0f, 15.0f, 16.026f, 15.0f, 14.565f),
                    PathNode.CurveTo(15.0f, 13.371f, 14.169f, 12.766f, 12.853f, 12.232f),
                    PathNode.LineTo(10.878f, 11.43f),
                    PathNode.CurveTo(9.728f, 10.963f, 9.0f, 10.008f, 9.0f, 8.963f),
                    PathNode.CurveTo(9.0f, 7.993f, 9.899f, 7.177f, 11.087f, 7.07f),
                    PathNode.LineTo(11.7f, 7.015f),
                    PathNode.CurveTo(13.228f, 6.877f, 14.7f, 7.777f, 15.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.5f),
                    PathNode.LineTo(16.0f, 4.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandStorybook!!
    }

private var _brandStorybook: ImageVector? = null
