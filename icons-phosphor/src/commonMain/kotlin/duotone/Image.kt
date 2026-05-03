package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorDuotoneIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 178.06f),
                    PathNode.LineTo(184.28f, 138.34f),
                    PathNode.CurveTo(181.15623f, 135.21828f, 176.09377f, 135.21828f, 172.97f, 138.34f),
                    PathNode.LineTo(147.31f, 164.0f),
                    PathNode.LineTo(97.66f, 114.34f),
                    PathNode.CurveTo(96.159454f, 112.83778f, 94.123276f, 111.993706f, 92.0f, 111.993706f),
                    PathNode.CurveTo(89.876724f, 111.993706f, 87.840546f, 112.83778f, 86.34f, 114.34f),
                    PathNode.LineTo(32.0f, 168.69f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 158.75f),
                    PathNode.LineTo(189.93f, 132.69f),
                    PathNode.CurveTo(186.9293f, 129.68863f, 182.8591f, 128.00241f, 178.615f, 128.00241f),
                    PathNode.CurveTo(174.37091f, 128.00241f, 170.30069f, 129.68863f, 167.3f, 132.69f),
                    PathNode.LineTo(147.3f, 152.69f),
                    PathNode.LineTo(103.3f, 108.69f),
                    PathNode.CurveTo(97.05246f, 102.44656f, 86.927536f, 102.44656f, 80.68f, 108.69f),
                    PathNode.LineTo(40.0f, 149.37f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 172.0f),
                    PathNode.LineTo(92.0f, 120.0f),
                    PathNode.LineTo(172.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(194.63f, 200.0f),
                    PathNode.LineTo(158.63f, 164.0f),
                    PathNode.LineTo(178.63f, 144.0f),
                    PathNode.LineTo(216.0f, 181.38f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 93.37258f, 149.37259f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(162.62741f, 88.0f, 168.0f, 93.37258f, 168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 106.62742f, 162.62741f, 112.0f, 156.0f, 112.0f),
                    PathNode.CurveTo(149.37259f, 112.0f, 144.0f, 106.62742f, 144.0f, 100.0f),
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
        return _image!!
    }

private var _image: ImageVector? = null
