package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorRegularIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(63.163445f, 40.0f, 56.0f, 47.163445f, 56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(31.163445f, 72.0f, 24.0f, 79.163445f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(192.83656f, 216.0f, 200.0f, 208.83656f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(224.83656f, 184.0f, 232.0f, 176.83656f, 232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 118.75f),
                    PathNode.LineTo(205.93f, 108.69f),
                    PathNode.CurveTo(202.9293f, 105.68863f, 198.8591f, 104.00242f, 194.615f, 104.00242f),
                    PathNode.CurveTo(190.37091f, 104.00242f, 186.30069f, 105.68863f, 183.3f, 108.69f),
                    PathNode.LineTo(163.3f, 128.69f),
                    PathNode.LineTo(119.3f, 84.69f),
                    PathNode.CurveTo(113.05246f, 78.44656f, 102.927536f, 78.44656f, 96.68f, 84.69f),
                    PathNode.LineTo(72.0f, 109.37f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 176.83656f, 63.163445f, 184.0f, 72.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.LineTo(108.0f, 96.0f),
                    PathNode.LineTo(157.66f, 145.66f),
                    PathNode.CurveTo(160.78375f, 148.78172f, 165.84624f, 148.78172f, 168.97f, 145.66f),
                    PathNode.LineTo(194.63f, 120.0f),
                    PathNode.LineTo(216.0f, 141.38f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 84.0f),
                    PathNode.CurveTo(160.0f, 77.37258f, 165.37259f, 72.0f, 172.0f, 72.0f),
                    PathNode.CurveTo(178.62741f, 72.0f, 184.0f, 77.37258f, 184.0f, 84.0f),
                    PathNode.CurveTo(184.0f, 90.62742f, 178.62741f, 96.0f, 172.0f, 96.0f),
                    PathNode.CurveTo(165.37259f, 96.0f, 160.0f, 90.62742f, 160.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _images!!
    }

private var _images: ImageVector? = null
