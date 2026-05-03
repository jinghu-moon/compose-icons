package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipBack: ImageVector
    get() {
        if (_playerSkipBack != null) return _playerSkipBack!!
        _playerSkipBack = tablerFilledIcon(
            name = "PlayerSkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.496f, 4.136f),
                    PathNode.LineTo(7.496f, 11.136f),
                    PathNode.CurveTo(7.188568f, 11.315154f, 6.999492f, 11.644176f, 6.999492f, 12.0f),
                    PathNode.CurveTo(6.999492f, 12.355824f, 7.188568f, 12.684846f, 7.496f, 12.864f),
                    PathNode.LineTo(19.496f, 19.864f),
                    PathNode.CurveTo(19.80533f, 20.044504f, 20.187574f, 20.045803f, 20.498125f, 19.867401f),
                    PathNode.CurveTo(20.808674f, 19.689001f, 21.000107f, 19.358145f, 21.0f, 19.0f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.CurveTo(21.000107f, 4.641855f, 20.808674f, 4.310999f, 20.498125f, 4.132598f),
                    PathNode.CurveTo(20.187574f, 3.954198f, 19.80533f, 3.955495f, 19.496f, 4.136f),
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
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.506975f, 4.000067f, 4.933684f, 4.379507f, 4.993f, 4.883f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(4.999413f, 19.529093f, 4.58679f, 19.966166f, 4.058605f, 19.997171f),
                    PathNode.CurveTo(3.530421f, 20.02818f, 3.069491f, 19.642391f, 3.007f, 19.117f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 4.447716f, 3.447715f, 4.0f, 4.0f, 4.0f),
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
        return _playerSkipBack!!
    }

private var _playerSkipBack: ImageVector? = null
