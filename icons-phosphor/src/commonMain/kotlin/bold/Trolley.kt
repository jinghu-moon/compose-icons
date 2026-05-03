package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorBoldIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 235.0457f, 83.04569f, 244.0f, 72.0f, 244.0f),
                    PathNode.CurveTo(60.954304f, 244.0f, 52.0f, 235.0457f, 52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 212.9543f, 60.954304f, 204.0f, 72.0f, 204.0f),
                    PathNode.CurveTo(83.04569f, 204.0f, 92.0f, 212.9543f, 92.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.CurveTo(204.9543f, 204.0f, 196.0f, 212.9543f, 196.0f, 224.0f),
                    PathNode.CurveTo(196.0f, 235.0457f, 204.9543f, 244.0f, 216.0f, 244.0f),
                    PathNode.CurveTo(227.0457f, 244.0f, 236.0f, 235.0457f, 236.0f, 224.0f),
                    PathNode.CurveTo(236.0f, 212.9543f, 227.0457f, 204.0f, 216.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 168.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.LineTo(60.0f, 75.31f),
                    PathNode.CurveTo(60.014366f, 70.00303f, 57.90412f, 64.911064f, 54.14f, 61.17f),
                    PathNode.LineTo(32.49f, 39.51f),
                    PathNode.CurveTo(27.79558f, 34.81558f, 20.18442f, 34.81558f, 15.49f, 39.51f),
                    PathNode.CurveTo(10.79558f, 44.20442f, 10.79558f, 51.81558f, 15.49f, 56.51f),
                    PathNode.LineTo(36.0f, 77.0f),
                    PathNode.LineTo(36.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(25.372583f, 168.0f, 20.0f, 173.37259f, 20.0f, 180.0f),
                    PathNode.CurveTo(20.0f, 186.62741f, 25.372583f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(246.62741f, 192.0f, 252.0f, 186.62741f, 252.0f, 180.0f),
                    PathNode.CurveTo(252.0f, 173.37259f, 246.62741f, 168.0f, 240.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trolley!!
    }

private var _trolley: ImageVector? = null
