package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonOff: ImageVector
    get() {
        if (_hexagonOff != null) return _hexagonOff!!
        _hexagonOff = tablerOutlineIcon(
            name = "HexagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.693f, 4.69f),
                    PathNode.LineTo(11.029f, 3.3f),
                    PathNode.CurveTo(11.650746f, 2.953898f, 12.407253f, 2.953898f, 13.029f, 3.3f),
                    PathNode.LineTo(19.029f, 6.873f),
                    PathNode.LineTo(19.0f, 6.873f),
                    PathNode.CurveTo(19.623451f, 7.232923f, 20.00537f, 7.900134f, 20.0f, 8.62f),
                    PathNode.LineTo(20.0f, 15.156f),
                    PathNode.CurveTo(20.0f, 15.402f, 19.955f, 15.641f, 19.87f, 15.863f),
                    PathNode.MoveTo(17.71f, 17.71f),
                    PathNode.LineTo(12.971f, 20.737f),
                    PathNode.CurveTo(12.367104f, 21.072369f, 11.632896f, 21.072369f, 11.029f, 20.737f),
                    PathNode.LineTo(5.029f, 16.904f),
                    PathNode.CurveTo(4.394371f, 16.551563f, 4.000535f, 15.882924f, 4.0f, 15.157f),
                    PathNode.LineTo(4.0f, 8.62f),
                    PathNode.CurveTo(4.000172f, 7.893718f, 4.394058f, 7.22461f, 5.029f, 6.872f),
                    PathNode.LineTo(6.183f, 6.185f)
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
        return _hexagonOff!!
    }

private var _hexagonOff: ImageVector? = null
