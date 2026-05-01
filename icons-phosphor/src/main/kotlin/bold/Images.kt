package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorBoldIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 79.163445f, 167.16344f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(184.83656f, 72.0f, 192.0f, 79.163445f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 96.836555f, 184.83656f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(167.16344f, 104.0f, 160.0f, 96.836555f, 160.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 171.0457f, 227.0457f, 180.0f, 216.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 211.0457f, 195.0457f, 220.0f, 184.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 76.95431f, 28.954306f, 68.0f, 40.0f, 68.0f),
                    PathNode.LineTo(60.0f, 68.0f),
                    PathNode.LineTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 44.954304f, 68.95431f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 180.0f),
                    PathNode.LineTo(80.0f, 180.0f),
                    PathNode.CurveTo(68.95431f, 180.0f, 60.0f, 171.0457f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.34f, 156.0f),
                    PathNode.LineTo(124.0f, 121.66f),
                    PathNode.LineTo(89.66f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(84.0f, 127.72f),
                    PathNode.LineTo(109.86f, 101.86f),
                    PathNode.CurveTo(117.67f, 94.05236f, 130.33f, 94.05236f, 138.14f, 101.86f),
                    PathNode.LineTo(192.28f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
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
        return _images!!
    }

private var _images: ImageVector? = null
