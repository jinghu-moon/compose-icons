package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorDuotoneIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 128.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.CurveTo(187.58173f, 24.0f, 184.0f, 27.581722f, 184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.00255f, 124.762344f, 102.05338f, 121.84236f, 99.062325f, 120.60302f),
                    PathNode.CurveTo(96.07126f, 119.36368f, 92.62809f, 120.04936f, 90.34f, 122.34f),
                    PathNode.LineTo(42.34f, 170.34f),
                    PathNode.CurveTo(40.837784f, 171.84055f, 39.993706f, 173.87672f, 39.993706f, 176.0f),
                    PathNode.CurveTo(39.993706f, 178.12328f, 40.837784f, 180.15945f, 42.34f, 181.66f),
                    PathNode.LineTo(90.34f, 229.66f),
                    PathNode.CurveTo(92.62809f, 231.95064f, 96.07126f, 232.63632f, 99.062325f, 231.39697f),
                    PathNode.CurveTo(102.05338f, 230.15764f, 104.00255f, 227.23764f, 104.0f, 224.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.CurveTo(196.41827f, 184.0f, 200.0f, 180.41827f, 200.0f, 176.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(200.0f, 27.581722f, 196.41827f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 204.69f),
                    PathNode.LineTo(59.31f, 176.0f),
                    PathNode.LineTo(88.0f, 147.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
