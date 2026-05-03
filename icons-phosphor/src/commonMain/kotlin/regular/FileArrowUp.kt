package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorRegularIcon(
            name = "FileArrowUp",
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
                    PathNode.MoveTo(157.66f, 138.34f),
                    PathNode.CurveTo(160.78593f, 141.46593f, 160.78593f, 146.53407f, 157.66f, 149.66f),
                    PathNode.CurveTo(154.53407f, 152.78593f, 149.46593f, 152.78593f, 146.34f, 149.66f),
                    PathNode.LineTo(136.0f, 139.31f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 132.41827f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 139.31f),
                    PathNode.LineTo(109.66f, 149.66f),
                    PathNode.CurveTo(106.534065f, 152.78593f, 101.465935f, 152.78593f, 98.34f, 149.66f),
                    PathNode.CurveTo(95.214066f, 146.53407f, 95.214066f, 141.46593f, 98.34f, 138.34f),
                    PathNode.LineTo(122.34f, 114.34f),
                    PathNode.CurveTo(123.840546f, 112.83778f, 125.876724f, 111.993706f, 128.0f, 111.993706f),
                    PathNode.CurveTo(130.12328f, 111.993706f, 132.15945f, 112.83778f, 133.66f, 114.34f),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
