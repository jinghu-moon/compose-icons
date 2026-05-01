package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Telescope: ImageVector
    get() {
        if (_telescope != null) return _telescope!!
        _telescope = tablerOutlineIcon(
            name = "Telescope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(3.294f, 13.678f),
                    PathNode.LineTo(3.46f, 13.959f),
                    PathNode.CurveTo(3.98f, 14.839f, 5.084f, 15.224f, 6.065f, 14.869f),
                    PathNode.LineTo(20.307f, 9.704f),
                    PathNode.CurveTo(20.591438f, 9.605881f, 20.818258f, 9.387517f, 20.92711f, 9.107009f),
                    PathNode.CurveTo(21.035961f, 8.826502f, 21.015802f, 8.512299f, 20.872f, 8.248f),
                    PathNode.LineTo(18.252f, 3.543f),
                    PathNode.CurveTo(17.960667f, 3.037199f, 17.321865f, 2.851783f, 16.805f, 3.123f),
                    PathNode.LineTo(16.749f, 3.155f),
                    PathNode.LineTo(4.055f, 10.773f),
                    PathNode.CurveTo(3.035f, 11.386f, 2.698f, 12.67f, 3.295f, 13.678f),
                    PathNode.LineTo(3.294f, 13.678f)
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
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.LineTo(17.0f, 10.5f)
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
        return _telescope!!
    }

private var _telescope: ImageVector? = null
