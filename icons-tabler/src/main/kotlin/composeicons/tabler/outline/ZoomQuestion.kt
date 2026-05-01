package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) return _zoomQuestion!!
        _zoomQuestion = tablerOutlineIcon(
            name = "ZoomQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 13.865993f, 6.134007f, 17.0f, 10.0f, 17.0f),
                    PathNode.CurveTo(13.865993f, 17.0f, 17.0f, 13.865993f, 17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 6.134007f, 13.865993f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(6.134007f, 3.0f, 3.0f, 6.134007f, 3.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.01f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.693662f, 10.000349f, 11.297086f, 9.525034f, 11.45921f, 8.850585f),
                    PathNode.CurveTo(11.621335f, 8.176135f, 11.299868f, 7.478494f, 10.681831f, 7.163537f),
                    PathNode.CurveTo(10.063796f, 6.848579f, 9.310418f, 6.998468f, 8.86f, 7.526f)
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
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null
