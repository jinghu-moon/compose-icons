package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorBoldIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 79.52f),
                    PathNode.LineTo(160.49f, 23.52f),
                    PathNode.CurveTo(158.23927f, 21.26647f, 155.185f, 20.000149f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(219.99985f, 84.819916f, 218.73741f, 81.76991f, 216.49f, 79.52f),
                    PathNode.Close,
                    PathNode.MoveTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.49f, 136.49f),
                    PathNode.LineTo(145.0f, 152.0f),
                    PathNode.LineTo(160.52f, 167.51f),
                    PathNode.CurveTo(165.21442f, 172.20442f, 165.21442f, 179.81558f, 160.52f, 184.51f),
                    PathNode.CurveTo(155.82558f, 189.20442f, 148.21442f, 189.20442f, 143.52f, 184.51f),
                    PathNode.LineTo(128.0f, 169.0f),
                    PathNode.LineTo(112.49f, 184.52f),
                    PathNode.CurveTo(107.79558f, 189.21442f, 100.18442f, 189.21442f, 95.49f, 184.52f),
                    PathNode.CurveTo(90.79558f, 179.82558f, 90.79558f, 172.21442f, 95.49f, 167.52f),
                    PathNode.LineTo(111.0f, 152.0f),
                    PathNode.LineTo(95.51f, 136.49f),
                    PathNode.CurveTo(90.81558f, 131.79558f, 90.81558f, 124.18442f, 95.51f, 119.49f),
                    PathNode.CurveTo(100.20442f, 114.79558f, 107.81558f, 114.79558f, 112.51f, 119.49f),
                    PathNode.LineTo(128.0f, 135.0f),
                    PathNode.LineTo(143.51f, 119.48f),
                    PathNode.CurveTo(148.20442f, 114.785576f, 155.81558f, 114.785576f, 160.51f, 119.48f),
                    PathNode.CurveTo(165.20442f, 124.17442f, 165.20442f, 131.78558f, 160.51f, 136.48f),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
