package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorRegularIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.0f, 110.64f),
                    PathNode.CurveTo(241.98763f, 106.46369f, 237.14935f, 103.992455f, 232.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 79.163445f, 208.83656f, 72.0f, 200.0f, 72.0f),
                    PathNode.LineTo(130.67f, 72.0f),
                    PathNode.LineTo(102.94f, 51.2f),
                    PathNode.CurveTo(100.16576f, 49.131824f, 96.80029f, 48.01f, 93.34f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(211.1f, 216.0f),
                    PathNode.CurveTo(214.5436f, 216.00026f, 217.60097f, 213.79686f, 218.69f, 210.53f),
                    PathNode.LineTo(247.18f, 125.06f),
                    PathNode.CurveTo(248.80516f, 120.18163f, 247.99458f, 114.81996f, 245.0f, 110.64f),
                    PathNode.Close,
                    PathNode.MoveTo(93.34f, 64.0f),
                    PathNode.LineTo(123.2f, 86.4f),
                    PathNode.CurveTo(124.58477f, 87.438576f, 126.269035f, 88.0f, 128.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(69.77f, 104.0f),
                    PathNode.CurveTo(62.882816f, 103.99949f, 56.768078f, 108.406296f, 54.59f, 114.94f),
                    PathNode.LineTo(40.0f, 158.7f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.34f, 200.0f),
                    PathNode.LineTo(43.1f, 200.0f),
                    PathNode.LineTo(69.77f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
