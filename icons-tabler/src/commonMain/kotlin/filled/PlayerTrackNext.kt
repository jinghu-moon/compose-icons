package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackNext: ImageVector
    get() {
        if (_playerTrackNext != null) return _playerTrackNext!!
        _playerTrackNext = tablerFilledIcon(
            name = "PlayerTrackNext",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 19.86f, 3.012f, 20.318f, 3.659f, 19.753f),
                    PathNode.LineTo(11.659f, 12.753f),
                    PathNode.CurveTo(11.876306f, 12.563104f, 12.000979f, 12.288587f, 12.000979f, 12.0f),
                    PathNode.CurveTo(12.000979f, 11.711413f, 11.876306f, 11.436896f, 11.659f, 11.247f),
                    PathNode.LineTo(3.659f, 4.247f),
                    PathNode.CurveTo(3.012f, 3.682f, 2.0f, 4.141f, 2.0f, 5.0f),
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
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 19.86f, 14.012f, 20.318f, 14.659f, 19.753f),
                    PathNode.LineTo(22.659f, 12.753f),
                    PathNode.CurveTo(22.876307f, 12.563104f, 23.00098f, 12.288587f, 23.00098f, 12.0f),
                    PathNode.CurveTo(23.00098f, 11.711413f, 22.876307f, 11.436896f, 22.659f, 11.247f),
                    PathNode.LineTo(14.659f, 4.247f),
                    PathNode.CurveTo(14.012f, 3.682f, 13.0f, 4.141f, 13.0f, 5.0f),
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
        return _playerTrackNext!!
    }

private var _playerTrackNext: ImageVector? = null
