package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorRegularIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.66f, 133.66f),
                    PathNode.LineTo(139.31f, 152.0f),
                    PathNode.LineTo(157.66f, 170.34f),
                    PathNode.CurveTo(160.78593f, 173.46593f, 160.78593f, 178.53407f, 157.66f, 181.66f),
                    PathNode.CurveTo(154.53407f, 184.78593f, 149.46593f, 184.78593f, 146.34f, 181.66f),
                    PathNode.LineTo(128.0f, 163.31f),
                    PathNode.LineTo(109.66f, 181.66f),
                    PathNode.CurveTo(106.534065f, 184.78593f, 101.465935f, 184.78593f, 98.34f, 181.66f),
                    PathNode.CurveTo(95.214066f, 178.53407f, 95.214066f, 173.46593f, 98.34f, 170.34f),
                    PathNode.LineTo(116.69f, 152.0f),
                    PathNode.LineTo(98.34f, 133.66f),
                    PathNode.CurveTo(95.214066f, 130.53407f, 95.214066f, 125.465935f, 98.34f, 122.34f),
                    PathNode.CurveTo(101.465935f, 119.214066f, 106.534065f, 119.214066f, 109.66f, 122.34f),
                    PathNode.LineTo(128.0f, 140.69f),
                    PathNode.LineTo(146.34f, 122.34f),
                    PathNode.CurveTo(149.46593f, 119.214066f, 154.53407f, 119.214066f, 157.66f, 122.34f),
                    PathNode.CurveTo(160.78593f, 125.465935f, 160.78593f, 130.53407f, 157.66f, 133.66f),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
