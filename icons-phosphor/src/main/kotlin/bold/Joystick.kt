package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorBoldIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.LineTo(140.0f, 98.32f),
                    PathNode.CurveTo(161.1274f, 92.33094f, 174.60432f, 71.681046f, 171.58101f, 49.930298f),
                    PathNode.CurveTo(168.5577f, 28.179543f, 149.95987f, 11.987979f, 128.0f, 11.987979f),
                    PathNode.CurveTo(106.04014f, 11.987979f, 87.44231f, 28.179543f, 84.41899f, 49.930298f),
                    PathNode.CurveTo(81.395676f, 71.681046f, 94.872604f, 92.33094f, 116.0f, 98.32f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(36.954304f, 144.0f, 28.0f, 152.9543f, 28.0f, 164.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 164.0f),
                    PathNode.CurveTo(228.0f, 152.9543f, 219.0457f, 144.0f, 208.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 56.0f),
                    PathNode.CurveTo(108.0f, 44.954304f, 116.95431f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(139.0457f, 36.0f, 148.0f, 44.954304f, 148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 67.04569f, 139.0457f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(116.95431f, 76.0f, 108.0f, 67.04569f, 108.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 104.0f),
                    PathNode.LineTo(204.0f, 104.0f),
                    PathNode.CurveTo(210.62741f, 104.0f, 216.0f, 109.37258f, 216.0f, 116.0f),
                    PathNode.CurveTo(216.0f, 122.62742f, 210.62741f, 128.0f, 204.0f, 128.0f),
                    PathNode.LineTo(172.0f, 128.0f),
                    PathNode.CurveTo(165.37259f, 128.0f, 160.0f, 122.62742f, 160.0f, 116.0f),
                    PathNode.CurveTo(160.0f, 109.37258f, 165.37259f, 104.0f, 172.0f, 104.0f),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
