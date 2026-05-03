package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorBoldIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 79.51f),
                    PathNode.LineTo(160.49f, 23.51f),
                    PathNode.CurveTo(158.23764f, 21.260138f, 155.18355f, 19.997498f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0025f, 84.816444f, 218.73987f, 81.76237f, 216.49f, 79.51f),
                    PathNode.Close,
                    PathNode.MoveTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 212.0f),
                    PathNode.LineTo(116.0f, 192.0f),
                    PathNode.LineTo(124.0f, 192.0f),
                    PathNode.CurveTo(130.62741f, 192.0f, 136.0f, 186.62741f, 136.0f, 180.0f),
                    PathNode.CurveTo(136.0f, 173.37259f, 130.62741f, 168.0f, 124.0f, 168.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.LineTo(124.0f, 152.0f),
                    PathNode.CurveTo(130.62741f, 152.0f, 136.0f, 146.62741f, 136.0f, 140.0f),
                    PathNode.CurveTo(136.0f, 133.37259f, 130.62741f, 128.0f, 124.0f, 128.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 109.37258f, 110.62742f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(97.37258f, 104.0f, 92.0f, 109.37258f, 92.0f, 116.0f),
                    PathNode.LineTo(92.0f, 128.0f),
                    PathNode.LineTo(84.0f, 128.0f),
                    PathNode.CurveTo(77.37258f, 128.0f, 72.0f, 133.37259f, 72.0f, 140.0f),
                    PathNode.CurveTo(72.0f, 146.62741f, 77.37258f, 152.0f, 84.0f, 152.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.LineTo(84.0f, 168.0f),
                    PathNode.CurveTo(77.37258f, 168.0f, 72.0f, 173.37259f, 72.0f, 180.0f),
                    PathNode.CurveTo(72.0f, 186.62741f, 77.37258f, 192.0f, 84.0f, 192.0f),
                    PathNode.LineTo(92.0f, 192.0f),
                    PathNode.LineTo(92.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
