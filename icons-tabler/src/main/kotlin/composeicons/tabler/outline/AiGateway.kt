package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AiGateway: ImageVector
    get() {
        if (_aiGateway != null) return _aiGateway!!
        _aiGateway = tablerOutlineIcon(
            name = "AiGateway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.5f),
                    PathNode.CurveTo(4.0f, 7.880712f, 5.119288f, 9.0f, 6.5f, 9.0f),
                    PathNode.CurveTo(7.880712f, 9.0f, 9.0f, 7.880712f, 9.0f, 6.5f),
                    PathNode.CurveTo(9.0f, 5.119288f, 7.880712f, 4.0f, 6.5f, 4.0f),
                    PathNode.CurveTo(5.119288f, 4.0f, 4.0f, 5.119288f, 4.0f, 6.5f)
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
                    PathNode.MoveTo(15.0f, 6.5f),
                    PathNode.CurveTo(15.0f, 7.880712f, 16.119287f, 9.0f, 17.5f, 9.0f),
                    PathNode.CurveTo(18.880713f, 9.0f, 20.0f, 7.880712f, 20.0f, 6.5f),
                    PathNode.CurveTo(20.0f, 5.119288f, 18.880713f, 4.0f, 17.5f, 4.0f),
                    PathNode.CurveTo(16.119287f, 4.0f, 15.0f, 5.119288f, 15.0f, 6.5f)
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
                    PathNode.MoveTo(15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 18.880713f, 16.119287f, 20.0f, 17.5f, 20.0f),
                    PathNode.CurveTo(18.880713f, 20.0f, 20.0f, 18.880713f, 20.0f, 17.5f),
                    PathNode.CurveTo(20.0f, 16.119287f, 18.880713f, 15.0f, 17.5f, 15.0f),
                    PathNode.CurveTo(16.119287f, 15.0f, 15.0f, 16.119287f, 15.0f, 17.5f)
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
                    PathNode.MoveTo(4.0f, 17.5f),
                    PathNode.CurveTo(4.0f, 18.880713f, 5.119288f, 20.0f, 6.5f, 20.0f),
                    PathNode.CurveTo(7.880712f, 20.0f, 9.0f, 18.880713f, 9.0f, 17.5f),
                    PathNode.CurveTo(9.0f, 16.119287f, 7.880712f, 15.0f, 6.5f, 15.0f),
                    PathNode.CurveTo(5.119288f, 15.0f, 4.0f, 16.119287f, 4.0f, 17.5f)
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
                    PathNode.MoveTo(8.5f, 15.5f),
                    PathNode.LineTo(15.5f, 8.5f)
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
        return _aiGateway!!
    }

private var _aiGateway: ImageVector? = null
