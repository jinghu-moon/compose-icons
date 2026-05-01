package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorRegularIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 180.41827f, 196.41827f, 184.0f, 192.0f, 184.0f),
                    PathNode.LineTo(67.31f, 184.0f),
                    PathNode.LineTo(101.66f, 218.34f),
                    PathNode.CurveTo(104.785934f, 221.46593f, 104.785934f, 226.53407f, 101.66f, 229.66f),
                    PathNode.CurveTo(98.534065f, 232.78593f, 93.465935f, 232.78593f, 90.34f, 229.66f),
                    PathNode.LineTo(42.34f, 181.66f),
                    PathNode.CurveTo(40.837784f, 180.15945f, 39.993706f, 178.12328f, 39.993706f, 176.0f),
                    PathNode.CurveTo(39.993706f, 173.87672f, 40.837784f, 171.84055f, 42.34f, 170.34f),
                    PathNode.LineTo(90.34f, 122.34f),
                    PathNode.CurveTo(93.465935f, 119.214066f, 98.534065f, 119.214066f, 101.66f, 122.34f),
                    PathNode.CurveTo(104.785934f, 125.465935f, 104.785934f, 130.53407f, 101.66f, 133.66f),
                    PathNode.LineTo(67.31f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.CurveTo(184.0f, 27.581722f, 187.58173f, 24.0f, 192.0f, 24.0f),
                    PathNode.CurveTo(196.41827f, 24.0f, 200.0f, 27.581722f, 200.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
