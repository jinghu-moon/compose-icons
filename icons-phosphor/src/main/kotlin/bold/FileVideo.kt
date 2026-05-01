package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorBoldIcon(
            name = "FileVideo",
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
                    PathNode.LineTo(36.0f, 108.0f),
                    PathNode.CurveTo(36.0f, 114.62742f, 41.37258f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(54.62742f, 120.0f, 60.0f, 114.62742f, 60.0f, 108.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.CurveTo(189.37259f, 212.0f, 184.0f, 217.37259f, 184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 230.62741f, 189.37259f, 236.0f, 196.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0025f, 84.816444f, 218.73987f, 81.76237f, 216.49f, 79.51f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.09f, 141.69f),
                    PathNode.CurveTo(154.42421f, 139.53041f, 149.88896f, 139.47333f, 146.17f, 141.54f),
                    PathNode.LineTo(126.5f, 152.44f),
                    PathNode.CurveTo(123.43054f, 144.92221f, 116.120255f, 140.00655f, 108.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(36.954304f, 140.0f, 28.0f, 148.9543f, 28.0f, 160.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(108.0f, 228.0f),
                    PathNode.CurveTo(116.120255f, 227.99345f, 123.43054f, 223.07779f, 126.5f, 215.56f),
                    PathNode.LineTo(146.17f, 226.49f),
                    PathNode.CurveTo(149.88695f, 228.55603f, 154.41974f, 228.50055f, 158.085f, 226.34415f),
                    PathNode.CurveTo(161.75026f, 224.18774f, 164.0005f, 220.25255f, 164.0f, 216.0f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.00006f, 147.74995f, 161.75206f, 143.8169f, 158.09f, 141.66f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(104.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 195.61f),
                    PathNode.LineTo(128.0f, 188.94f),
                    PathNode.LineTo(128.0f, 179.06f),
                    PathNode.LineTo(140.0f, 172.39f),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
