package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorDuotoneIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(168.0f, 48.0f),
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
                    PathNode.MoveTo(221.66f, 90.34f),
                    PathNode.LineTo(173.66f, 42.34f),
                    PathNode.CurveTo(172.15945f, 40.837784f, 170.12328f, 39.993706f, 168.0f, 39.993706f),
                    PathNode.CurveTo(165.87672f, 39.993706f, 163.84055f, 40.837784f, 162.34f, 42.34f),
                    PathNode.LineTo(114.34f, 90.34f),
                    PathNode.CurveTo(112.04936f, 92.62809f, 111.36368f, 96.07126f, 112.60302f, 99.062325f),
                    PathNode.CurveTo(113.84236f, 102.05338f, 116.762344f, 104.00255f, 120.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(19.581722f, 184.0f, 16.0f, 187.58173f, 16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 196.41827f, 19.581722f, 200.0f, 24.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(172.41827f, 200.0f, 176.0f, 196.41827f, 176.0f, 192.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(219.23764f, 104.00255f, 222.15764f, 102.05338f, 223.39697f, 99.062325f),
                    PathNode.CurveTo(224.63632f, 96.07126f, 223.95064f, 92.62809f, 221.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(139.31f, 88.0f),
                    PathNode.LineTo(168.0f, 59.31f),
                    PathNode.LineTo(196.69f, 88.0f),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
