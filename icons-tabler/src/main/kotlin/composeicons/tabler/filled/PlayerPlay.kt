package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerPlay: ImageVector
    get() {
        if (_playerPlay != null) return _playerPlay!!
        _playerPlay = tablerFilledIcon(
            name = "PlayerPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 4.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(5.999898f, 20.362312f, 6.195778f, 20.69634f, 6.512025f, 20.873138f),
                    PathNode.CurveTo(6.828272f, 21.049938f, 7.215412f, 21.041853f, 7.524f, 20.852f),
                    PathNode.LineTo(20.524f, 12.852f),
                    PathNode.CurveTo(20.820065f, 12.670073f, 21.000458f, 12.347493f, 21.000458f, 12.0f),
                    PathNode.CurveTo(21.000458f, 11.652507f, 20.820065f, 11.329927f, 20.524f, 11.148f),
                    PathNode.LineTo(7.524f, 3.148f),
                    PathNode.CurveTo(7.215412f, 2.958149f, 6.828272f, 2.950062f, 6.512025f, 3.126861f),
                    PathNode.CurveTo(6.195778f, 3.30366f, 5.999898f, 3.637688f, 6.0f, 4.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _playerPlay!!
    }

private var _playerPlay: ImageVector? = null
