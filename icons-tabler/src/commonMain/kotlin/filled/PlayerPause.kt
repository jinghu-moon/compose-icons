package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerPause: ImageVector
    get() {
        if (_playerPause != null) return _playerPause!!
        _playerPause = tablerFilledIcon(
            name = "PlayerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.CurveTo(5.895431f, 4.0f, 5.0f, 4.895431f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 19.10457f, 5.895431f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.CurveTo(10.104569f, 20.0f, 11.0f, 19.10457f, 11.0f, 18.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 4.895431f, 10.104569f, 4.0f, 9.0f, 4.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(13.895431f, 4.0f, 13.0f, 4.895431f, 13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.0f, 19.10457f, 13.895431f, 20.0f, 15.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(18.10457f, 20.0f, 19.0f, 19.10457f, 19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(19.0f, 4.895431f, 18.10457f, 4.0f, 17.0f, 4.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _playerPause!!
    }

private var _playerPause: ImageVector? = null
