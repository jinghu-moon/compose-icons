package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) return _terminalWindow!!
        _terminalWindow = phosphorBoldIcon(
            name = "TerminalWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.5f, 150.63f),
                    PathNode.LineTo(100.79f, 128.0f),
                    PathNode.LineTo(72.5f, 105.37f),
                    PathNode.CurveTo(67.32509f, 101.22787f, 66.48786f, 93.67491f, 70.63f, 88.5f),
                    PathNode.CurveTo(74.77213f, 83.32509f, 82.32509f, 82.48786f, 87.5f, 86.63f),
                    PathNode.LineTo(127.5f, 118.63f),
                    PathNode.CurveTo(130.34627f, 120.90728f, 132.00313f, 124.354836f, 132.00313f, 128.0f),
                    PathNode.CurveTo(132.00313f, 131.64517f, 130.34627f, 135.09271f, 127.5f, 137.37f),
                    PathNode.LineTo(87.5f, 169.37f),
                    PathNode.CurveTo(82.32509f, 173.51213f, 74.77213f, 172.67491f, 70.63f, 167.5f),
                    PathNode.CurveTo(66.48786f, 162.32509f, 67.32509f, 154.77214f, 72.5f, 150.63f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 172.0f),
                    PathNode.LineTo(176.0f, 172.0f),
                    PathNode.CurveTo(182.62741f, 172.0f, 188.0f, 166.62741f, 188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 153.37259f, 182.62741f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(144.0f, 148.0f),
                    PathNode.CurveTo(137.37259f, 148.0f, 132.0f, 153.37259f, 132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 166.62741f, 137.37259f, 172.0f, 144.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 211.0457f, 227.0457f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
