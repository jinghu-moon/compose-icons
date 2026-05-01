package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorFilter: ImageVector
    get() {
        if (_colorFilter != null) return _colorFilter!!
        _colorFilter = tablerOutlineIcon(
            name = "ColorFilter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.58f, 13.79f),
                    PathNode.CurveTo(13.85f, 14.47f, 14.0f, 15.22f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 17.77f, 13.23f, 19.37f, 12.0f, 20.46f),
                    PathNode.CurveTo(10.90531f, 21.4541f, 9.478705f, 22.003344f, 8.0f, 22.0f),
                    PathNode.CurveTo(4.69f, 22.0f, 2.0f, 19.31f, 2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 13.24f, 3.88f, 10.9f, 6.42f, 10.21f)
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
                    PathNode.MoveTo(17.58f, 10.21f),
                    PathNode.CurveTo(20.12f, 10.9f, 22.0f, 13.24f, 22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 19.31f, 19.31f, 22.0f, 16.0f, 22.0f),
                    PathNode.CurveTo(14.521295f, 22.003344f, 13.09469f, 21.4541f, 12.0f, 20.46f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 11.313708f, 8.686292f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(15.313708f, 14.0f, 18.0f, 11.313708f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 4.686292f, 15.313708f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(8.686292f, 2.0f, 6.0f, 4.686292f, 6.0f, 8.0f)
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
        return _colorFilter!!
    }

private var _colorFilter: ImageVector? = null
