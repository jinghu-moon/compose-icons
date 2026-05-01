package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorBoldIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 52.0f),
                    PathNode.LineTo(80.0f, 52.0f),
                    PathNode.CurveTo(38.02636f, 52.0f, 4.0f, 86.02636f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 169.97365f, 38.02636f, 204.0f, 80.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(217.97365f, 204.0f, 252.0f, 169.97365f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 86.02636f, 217.97365f, 52.0f, 176.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 180.0f),
                    PathNode.LineTo(80.0f, 180.0f),
                    PathNode.CurveTo(51.281193f, 180.0f, 28.0f, 156.71881f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 99.2812f, 51.281193f, 76.0f, 80.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(204.71881f, 76.0f, 228.0f, 99.2812f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 156.71881f, 204.71881f, 180.0f, 176.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 88.0f),
                    PathNode.CurveTo(57.90861f, 88.0f, 40.0f, 105.90861f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 150.09138f, 57.90861f, 168.0f, 80.0f, 168.0f),
                    PathNode.CurveTo(102.09139f, 168.0f, 120.0f, 150.09138f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 105.90861f, 102.09139f, 88.0f, 80.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 144.0f),
                    PathNode.CurveTo(71.163445f, 144.0f, 64.0f, 136.83656f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 119.163445f, 71.163445f, 112.0f, 80.0f, 112.0f),
                    PathNode.CurveTo(88.836555f, 112.0f, 96.0f, 119.163445f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 136.83656f, 88.836555f, 144.0f, 80.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
