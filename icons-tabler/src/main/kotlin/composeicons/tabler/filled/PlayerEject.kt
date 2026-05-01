package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerEject: ImageVector
    get() {
        if (_playerEject != null) return _playerEject!!
        _playerEject = tablerFilledIcon(
            name = "PlayerEject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.247f, 3.341f),
                    PathNode.LineTo(4.247f, 11.341f),
                    PathNode.CurveTo(3.682f, 11.988f, 4.141f, 13.0f, 5.0f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.86f, 13.0f, 20.318f, 11.988f, 19.753f, 11.341f),
                    PathNode.LineTo(12.753f, 3.341f),
                    PathNode.CurveTo(12.563104f, 3.123694f, 12.288587f, 2.999021f, 12.0f, 2.999021f),
                    PathNode.CurveTo(11.711413f, 2.999021f, 11.436896f, 3.123694f, 11.247f, 3.341f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(4.895431f, 15.0f, 4.0f, 15.895431f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(4.0f, 20.10457f, 4.895431f, 21.0f, 6.0f, 21.0f),
                    PathNode.LineTo(18.0f, 21.0f),
                    PathNode.CurveTo(19.10457f, 21.0f, 20.0f, 20.10457f, 20.0f, 19.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 15.895431f, 19.10457f, 15.0f, 18.0f, 15.0f),
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
        return _playerEject!!
    }

private var _playerEject: ImageVector? = null
