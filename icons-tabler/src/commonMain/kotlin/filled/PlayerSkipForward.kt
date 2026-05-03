package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerSkipForward: ImageVector
    get() {
        if (_playerSkipForward != null) return _playerSkipForward!!
        _playerSkipForward = tablerFilledIcon(
            name = "PlayerSkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(2.999894f, 19.358145f, 3.191326f, 19.689001f, 3.501876f, 19.867401f),
                    PathNode.CurveTo(3.812425f, 20.045803f, 4.194669f, 20.044504f, 4.504f, 19.864f),
                    PathNode.LineTo(16.504f, 12.864f),
                    PathNode.CurveTo(16.811432f, 12.684846f, 17.000507f, 12.355824f, 17.000507f, 12.0f),
                    PathNode.CurveTo(17.000507f, 11.644176f, 16.811432f, 11.315154f, 16.504f, 11.136f),
                    PathNode.LineTo(4.504f, 4.136f),
                    PathNode.CurveTo(4.194669f, 3.955495f, 3.812425f, 3.954198f, 3.501876f, 4.132598f),
                    PathNode.CurveTo(3.191326f, 4.310999f, 2.999894f, 4.641855f, 3.0f, 5.0f),
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
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.506975f, 4.000067f, 20.933683f, 4.379507f, 20.993f, 4.883f),
                    PathNode.LineTo(21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(20.999413f, 19.529093f, 20.58679f, 19.966166f, 20.058605f, 19.997171f),
                    PathNode.CurveTo(19.53042f, 20.02818f, 19.06949f, 19.642391f, 19.007f, 19.117f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 4.447716f, 19.447716f, 4.0f, 20.0f, 4.0f),
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
        return _playerSkipForward!!
    }

private var _playerSkipForward: ImageVector? = null
