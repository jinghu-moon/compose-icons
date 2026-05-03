package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PokeballOff: ImageVector
    get() {
        if (_pokeballOff != null) return _pokeballOff!!
        _pokeballOff = tablerOutlineIcon(
            name = "PokeballOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.04f, 16.048f),
                    PathNode.CurveTo(21.787956f, 12.58003f, 21.114258f, 8.381977f, 18.368952f, 5.63508f),
                    PathNode.CurveTo(15.623644f, 2.888182f, 11.425981f, 2.212053f, 7.957f, 3.958f),
                    PathNode.MoveTo(5.637f, 5.636f),
                    PathNode.CurveTo(2.124745f, 9.153225f, 2.128775f, 14.851746f, 5.646f, 18.364f),
                    PathNode.CurveTo(9.163225f, 21.876257f, 14.861745f, 21.872225f, 18.374f, 18.355f)
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
                    PathNode.MoveTo(9.884f, 9.874f),
                    PathNode.CurveTo(8.711499f, 11.044844f, 8.710156f, 12.9445f, 9.881f, 14.117f),
                    PathNode.CurveTo(11.051844f, 15.2895f, 12.9515f, 15.290844f, 14.124f, 14.12f),
                    PathNode.MoveTo(14.694f, 10.679f),
                    PathNode.CurveTo(14.394067f, 10.070013f, 13.897209f, 9.580203f, 13.284f, 9.289f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _pokeballOff!!
    }

private var _pokeballOff: ImageVector? = null
