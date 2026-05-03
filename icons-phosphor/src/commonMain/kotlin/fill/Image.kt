package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorFillIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 88.0f),
                    PathNode.CurveTo(162.62741f, 88.0f, 168.0f, 93.37258f, 168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 106.62742f, 162.62741f, 112.0f, 156.0f, 112.0f),
                    PathNode.CurveTo(149.37259f, 112.0f, 144.0f, 106.62742f, 144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 93.37258f, 149.37259f, 88.0f, 156.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 160.69f),
                    PathNode.LineTo(86.34f, 114.34f),
                    PathNode.CurveTo(87.840546f, 112.83778f, 89.876724f, 111.993706f, 92.0f, 111.993706f),
                    PathNode.CurveTo(94.123276f, 111.993706f, 96.159454f, 112.83778f, 97.66f, 114.34f),
                    PathNode.LineTo(97.66f, 114.34f),
                    PathNode.LineTo(165.0f, 181.66f),
                    PathNode.CurveTo(168.12593f, 184.78593f, 173.19406f, 184.78593f, 176.32f, 181.66f),
                    PathNode.CurveTo(179.44594f, 178.53407f, 179.44594f, 173.46593f, 176.32f, 170.34f),
                    PathNode.LineTo(158.66f, 152.69f),
                    PathNode.LineTo(173.0f, 138.34f),
                    PathNode.CurveTo(176.12376f, 135.21828f, 181.18623f, 135.21828f, 184.31f, 138.34f),
                    PathNode.LineTo(216.0f, 170.07f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _image!!
    }

private var _image: ImageVector? = null
