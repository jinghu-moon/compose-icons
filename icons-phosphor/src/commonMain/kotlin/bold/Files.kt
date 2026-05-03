package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorBoldIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.49f, 59.51f),
                    PathNode.LineTo(180.49f, 19.51f),
                    PathNode.CurveTo(178.23764f, 17.260138f, 175.18355f, 15.997497f, 172.0f, 16.0f),
                    PathNode.LineTo(92.0f, 16.0f),
                    PathNode.CurveTo(80.95431f, 16.0f, 72.0f, 24.954306f, 72.0f, 36.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(44.954304f, 56.0f, 36.0f, 64.95431f, 36.0f, 76.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(164.0f, 236.0f),
                    PathNode.CurveTo(175.0457f, 236.0f, 184.0f, 227.0457f, 184.0f, 216.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.CurveTo(215.0457f, 196.0f, 224.0f, 187.0457f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 68.0f),
                    PathNode.CurveTo(224.0025f, 64.816444f, 222.73987f, 61.762363f, 220.49f, 59.51f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.LineTo(127.0f, 80.0f),
                    PathNode.LineTo(160.0f, 113.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.LineTo(184.0f, 108.0f),
                    PathNode.CurveTo(184.0025f, 104.816444f, 182.73987f, 101.76237f, 180.49f, 99.51f),
                    PathNode.LineTo(140.49f, 59.51f),
                    PathNode.CurveTo(138.23764f, 57.260136f, 135.18355f, 55.997498f, 132.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(167.0f, 40.0f),
                    PathNode.LineTo(200.0f, 73.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 144.0f),
                    PathNode.CurveTo(144.0f, 150.62741f, 138.62741f, 156.0f, 132.0f, 156.0f),
                    PathNode.LineTo(88.0f, 156.0f),
                    PathNode.CurveTo(81.37258f, 156.0f, 76.0f, 150.62741f, 76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 137.37259f, 81.37258f, 132.0f, 88.0f, 132.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.CurveTo(138.62741f, 132.0f, 144.0f, 137.37259f, 144.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 190.62741f, 138.62741f, 196.0f, 132.0f, 196.0f),
                    PathNode.LineTo(88.0f, 196.0f),
                    PathNode.CurveTo(81.37258f, 196.0f, 76.0f, 190.62741f, 76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 177.37259f, 81.37258f, 172.0f, 88.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.CurveTo(138.62741f, 172.0f, 144.0f, 177.37259f, 144.0f, 184.0f),
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
        return _files!!
    }

private var _files: ImageVector? = null
