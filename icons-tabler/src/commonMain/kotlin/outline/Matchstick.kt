package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Matchstick: ImageVector
    get() {
        if (_matchstick != null) return _matchstick!!
        _matchstick = tablerOutlineIcon(
            name = "Matchstick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(17.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 12.552285f, 16.447716f, 13.0f, 17.0f, 13.0f),
                    PathNode.CurveTo(17.552284f, 13.0f, 18.0f, 12.552285f, 18.0f, 12.0f),
                    PathNode.CurveTo(18.0f, 11.447715f, 17.552284f, 11.0f, 17.0f, 11.0f),
                    PathNode.CurveTo(16.447716f, 11.0f, 16.0f, 11.447715f, 16.0f, 12.0f)
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
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.LineTo(20.62f, 10.29f),
                    PathNode.CurveTo(21.332722f, 11.80529f, 21.02802f, 13.603988f, 19.856f, 14.8f),
                    PathNode.CurveTo(18.49544f, 16.186138f, 16.335745f, 16.394562f, 14.735221f, 15.294187f),
                    PathNode.CurveTo(13.134697f, 14.193811f, 12.555961f, 12.102689f, 13.363f, 10.336f),
                    PathNode.LineTo(17.0f, 3.0f)
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
        return _matchstick!!
    }

private var _matchstick: ImageVector? = null
