package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorBoldIcon(
            name = "ToggleRight",
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
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.CurveTo(153.90862f, 88.0f, 136.0f, 105.90861f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 150.09138f, 153.90862f, 168.0f, 176.0f, 168.0f),
                    PathNode.CurveTo(198.09138f, 168.0f, 216.0f, 150.09138f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 105.90861f, 198.09138f, 88.0f, 176.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 144.0f),
                    PathNode.CurveTo(167.16344f, 144.0f, 160.0f, 136.83656f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 119.163445f, 167.16344f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(184.83656f, 112.0f, 192.0f, 119.163445f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 136.83656f, 184.83656f, 144.0f, 176.0f, 144.0f),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
