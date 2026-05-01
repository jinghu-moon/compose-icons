package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorBoldIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(227.0457f, 156.0f, 236.0f, 147.0457f, 236.0f, 136.0f),
                    PathNode.LineTo(236.0f, 76.0f),
                    PathNode.CurveTo(236.0f, 64.95431f, 227.0457f, 56.0f, 216.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.CurveTo(192.0f, 28.954306f, 183.0457f, 20.0f, 172.0f, 20.0f),
                    PathNode.LineTo(140.0f, 20.0f),
                    PathNode.CurveTo(128.9543f, 20.0f, 120.0f, 28.954306f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(84.95431f, 56.0f, 76.0f, 64.95431f, 76.0f, 76.0f),
                    PathNode.LineTo(76.0f, 136.0f),
                    PathNode.CurveTo(76.0f, 147.0457f, 84.95431f, 156.0f, 96.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.LineTo(144.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 80.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.LineTo(212.0f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 235.0457f, 83.04569f, 244.0f, 72.0f, 244.0f),
                    PathNode.CurveTo(60.954304f, 244.0f, 52.0f, 235.0457f, 52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 212.9543f, 60.954304f, 204.0f, 72.0f, 204.0f),
                    PathNode.CurveTo(83.04569f, 204.0f, 92.0f, 212.9543f, 92.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 224.0f),
                    PathNode.CurveTo(236.0f, 235.0457f, 227.0457f, 244.0f, 216.0f, 244.0f),
                    PathNode.CurveTo(204.9543f, 244.0f, 196.0f, 235.0457f, 196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 212.9543f, 204.9543f, 204.0f, 216.0f, 204.0f),
                    PathNode.CurveTo(227.0457f, 204.0f, 236.0f, 212.9543f, 236.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 180.0f),
                    PathNode.CurveTo(252.0f, 186.62741f, 246.62741f, 192.0f, 240.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(25.372583f, 192.0f, 20.0f, 186.62741f, 20.0f, 180.0f),
                    PathNode.CurveTo(20.0f, 173.37259f, 25.372583f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(36.0f, 168.0f),
                    PathNode.LineTo(36.0f, 77.0f),
                    PathNode.LineTo(15.51f, 56.49f),
                    PathNode.CurveTo(10.815579f, 51.79558f, 10.815579f, 44.18442f, 15.51f, 39.49f),
                    PathNode.CurveTo(20.20442f, 34.79558f, 27.81558f, 34.79558f, 32.51f, 39.49f),
                    PathNode.LineTo(54.14f, 61.17f),
                    PathNode.CurveTo(57.90412f, 64.911064f, 60.014366f, 70.00303f, 60.0f, 75.31f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(246.62741f, 168.0f, 252.0f, 173.37259f, 252.0f, 180.0f),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
