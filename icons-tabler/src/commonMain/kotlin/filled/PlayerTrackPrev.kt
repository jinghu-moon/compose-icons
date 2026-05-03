package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackPrev: ImageVector
    get() {
        if (_playerTrackPrev != null) return _playerTrackPrev!!
        _playerTrackPrev = tablerFilledIcon(
            name = "PlayerTrackPrev",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.341f, 4.247f),
                    PathNode.LineTo(12.341f, 11.247f),
                    PathNode.CurveTo(12.123694f, 11.436896f, 11.999021f, 11.711413f, 11.999021f, 12.0f),
                    PathNode.CurveTo(11.999021f, 12.288587f, 12.123694f, 12.563104f, 12.341f, 12.753f),
                    PathNode.LineTo(20.341f, 19.753f),
                    PathNode.CurveTo(20.988f, 20.318f, 22.0f, 19.859f, 22.0f, 19.0f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 4.14f, 20.988f, 3.682f, 20.341f, 4.247f),
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
                    PathNode.MoveTo(9.341f, 4.247f),
                    PathNode.LineTo(1.341f, 11.247f),
                    PathNode.CurveTo(1.123694f, 11.436896f, 0.999021f, 11.711413f, 0.999021f, 12.0f),
                    PathNode.CurveTo(0.999021f, 12.288587f, 1.123694f, 12.563104f, 1.341f, 12.753f),
                    PathNode.LineTo(9.341f, 19.753f),
                    PathNode.CurveTo(9.988f, 20.318f, 11.0f, 19.859f, 11.0f, 19.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 4.14f, 9.988f, 3.682f, 9.341f, 4.247f),
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
        return _playerTrackPrev!!
    }

private var _playerTrackPrev: ImageVector? = null
