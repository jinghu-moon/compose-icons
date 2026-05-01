package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerOutlineIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.CurveTo(10.0f, 19.447716f, 10.447715f, 19.0f, 11.0f, 19.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.552285f, 19.0f, 14.0f, 19.447716f, 14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(14.0f, 21.552284f, 13.552285f, 22.0f, 13.0f, 22.0f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.CurveTo(10.447715f, 22.0f, 10.0f, 21.552284f, 10.0f, 21.0f),
                    PathNode.LineTo(10.0f, 20.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.CurveTo(15.314f, 16.0f, 18.0f, 11.314f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 4.686292f, 15.313708f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(8.686292f, 2.0f, 6.0f, 4.686292f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 11.314f, 8.686f, 16.0f, 12.0f, 16.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 12.865993f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 12.865993f, 14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 5.134007f, 13.104569f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.895431f, 2.0f, 10.0f, 5.134007f, 10.0f, 9.0f)
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
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
