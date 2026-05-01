package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorFillIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.39f, 99.06f),
                    PathNode.CurveTo(222.15236f, 102.04962f, 219.23566f, 103.99934f, 216.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(19.581722f, 200.0f, 16.0f, 196.41827f, 16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 187.58173f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(116.762344f, 104.00255f, 113.84236f, 102.05338f, 112.60302f, 99.062325f),
                    PathNode.CurveTo(111.36368f, 96.07126f, 112.04936f, 92.62809f, 114.34f, 90.34f),
                    PathNode.LineTo(162.34f, 42.34f),
                    PathNode.CurveTo(163.84055f, 40.837784f, 165.87672f, 39.993706f, 168.0f, 39.993706f),
                    PathNode.CurveTo(170.12328f, 39.993706f, 172.15945f, 40.837784f, 173.66f, 42.34f),
                    PathNode.LineTo(221.66f, 90.34f),
                    PathNode.CurveTo(223.94725f, 92.62924f, 224.63007f, 96.07096f, 223.39f, 99.06f),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
