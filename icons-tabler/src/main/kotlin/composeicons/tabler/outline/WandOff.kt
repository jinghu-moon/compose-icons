package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WandOff: ImageVector
    get() {
        if (_wandOff != null) return _wandOff!!
        _wandOff = tablerOutlineIcon(
            name = "WandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.5f, 10.5f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(13.5f, 13.5f),
                    PathNode.MoveTo(15.5f, 11.5f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.LineTo(12.5f, 8.5f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(18.0f, 9.0f)
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
                    PathNode.MoveTo(8.433f, 4.395f),
                    PathNode.CurveTo(8.783f, 4.035f, 9.0f, 3.543f, 9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 4.10457f, 9.895431f, 5.0f, 11.0f, 5.0f),
                    PathNode.CurveTo(10.446f, 5.0f, 9.945f, 5.225f, 9.583f, 5.589f)
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
                    PathNode.MoveTo(18.418f, 14.41f),
                    PathNode.CurveTo(18.778f, 14.05f, 19.0f, 13.55f, 19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 14.104569f, 19.89543f, 15.0f, 21.0f, 15.0f),
                    PathNode.CurveTo(20.445f, 15.0f, 19.944f, 15.226f, 19.581f, 15.59f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _wandOff!!
    }

private var _wandOff: ImageVector? = null
