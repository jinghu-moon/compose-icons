package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorBoldIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.23f, 112.31f),
                    PathNode.CurveTo(244.47083f, 107.09156f, 238.43144f, 103.99931f, 232.0f, 104.0f),
                    PathNode.LineTo(220.0f, 104.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 76.95431f, 211.0457f, 68.0f, 200.0f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(105.34f, 48.0f),
                    PathNode.CurveTo(101.87404f, 45.41127f, 97.66601f, 44.0086f, 93.34f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 214.62741f, 25.372583f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(211.1f, 220.0f),
                    PathNode.CurveTo(216.19138f, 220.00691f, 220.73288f, 216.8002f, 222.43f, 212.0f),
                    PathNode.LineTo(250.92f, 130.53f),
                    PathNode.LineTo(250.98f, 130.36f),
                    PathNode.CurveTo(253.02339f, 124.25153f, 251.99977f, 117.5328f, 248.23f, 112.31f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 68.0f),
                    PathNode.LineTo(120.8f, 89.6f),
                    PathNode.CurveTo(122.87715f, 91.15787f, 125.40356f, 92.0f, 128.0f, 92.0f),
                    PathNode.LineTo(196.0f, 92.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(69.77f, 104.0f),
                    PathNode.CurveTo(61.19902f, 104.00068f, 53.581284f, 109.4626f, 50.83f, 117.58f),
                    PathNode.LineTo(44.0f, 137.15f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.59f, 196.0f),
                    PathNode.LineTo(48.89f, 196.0f),
                    PathNode.LineTo(72.61f, 128.0f),
                    PathNode.LineTo(226.37f, 128.0f),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
