package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorThinIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(78.87891f, 20.038574f, 52.038574f, 46.878906f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.038574f, 209.1211f, 78.87891f, 235.96143f, 112.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(177.1211f, 235.96143f, 203.96143f, 209.1211f, 204.0f, 176.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(203.96143f, 46.878906f, 177.1211f, 20.038574f, 144.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 80.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.LineTo(144.0f, 28.0f),
                    PathNode.CurveTo(172.7051f, 28.033064f, 195.96693f, 51.2949f, 196.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 28.0f),
                    PathNode.LineTo(124.0f, 70.34f),
                    PathNode.LineTo(87.7f, 34.05f),
                    PathNode.CurveTo(95.1805f, 30.069004f, 103.52615f, 27.991177f, 112.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.78f, 38.44f),
                    PathNode.LineTo(124.0f, 81.66f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.LineTo(113.66f, 108.0f),
                    PathNode.LineTo(64.51f, 58.85f),
                    PathNode.CurveTo(68.128685f, 50.785496f, 73.724976f, 43.7652f, 80.78f, 38.44f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 80.0f),
                    PathNode.CurveTo(59.9962f, 75.700325f, 60.53035f, 71.41706f, 61.59f, 67.25f),
                    PathNode.LineTo(102.34f, 108.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 228.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(83.2949f, 227.96693f, 60.033066f, 204.7051f, 60.0f, 176.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(196.0f, 176.0f),
                    PathNode.CurveTo(195.96693f, 204.7051f, 172.7051f, 227.96693f, 144.0f, 228.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
