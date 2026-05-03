package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = phosphorFillIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 66.34f),
                    PathNode.LineTo(173.66f, 26.34f),
                    PathNode.CurveTo(172.15842f, 24.840092f, 170.12238f, 23.998331f, 168.0f, 24.0f),
                    PathNode.LineTo(88.0f, 24.0f),
                    PathNode.CurveTo(79.163445f, 24.0f, 72.0f, 31.163445f, 72.0f, 40.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(47.163445f, 56.0f, 40.0f, 63.163445f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(168.0f, 232.0f),
                    PathNode.CurveTo(176.83656f, 232.0f, 184.0f, 224.83656f, 184.0f, 216.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(208.83656f, 200.0f, 216.0f, 192.83656f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.00166f, 69.87763f, 215.15993f, 67.841576f, 213.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(83.58172f, 192.0f, 80.0f, 188.41827f, 80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 179.58173f, 83.58172f, 176.0f, 88.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(140.41827f, 176.0f, 144.0f, 179.58173f, 144.0f, 184.0f),
                    PathNode.CurveTo(144.0f, 188.41827f, 140.41827f, 192.0f, 136.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(83.58172f, 160.0f, 80.0f, 156.41827f, 80.0f, 152.0f),
                    PathNode.CurveTo(80.0f, 147.58173f, 83.58172f, 144.0f, 88.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(140.41827f, 144.0f, 144.0f, 147.58173f, 144.0f, 152.0f),
                    PathNode.CurveTo(144.0f, 156.41827f, 140.41827f, 160.0f, 136.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.00166f, 101.87763f, 183.15993f, 99.841576f, 181.66f, 98.34f),
                    PathNode.LineTo(141.66f, 58.34f),
                    PathNode.CurveTo(140.15842f, 56.84009f, 138.12238f, 55.998333f, 136.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.LineTo(164.69f, 40.0f),
                    PathNode.LineTo(200.0f, 75.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _files!!
    }

private var _files: ImageVector? = null
