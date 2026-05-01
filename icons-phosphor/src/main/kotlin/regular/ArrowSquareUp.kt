package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorRegularIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.34f, 125.66f),
                    PathNode.CurveTo(88.83778f, 124.159454f, 87.993706f, 122.123276f, 87.993706f, 120.0f),
                    PathNode.CurveTo(87.993706f, 117.876724f, 88.83778f, 115.840546f, 90.34f, 114.34f),
                    PathNode.LineTo(122.34f, 82.34f),
                    PathNode.CurveTo(123.840546f, 80.83778f, 125.876724f, 79.993706f, 128.0f, 79.993706f),
                    PathNode.CurveTo(130.12328f, 79.993706f, 132.15945f, 80.83778f, 133.66f, 82.34f),
                    PathNode.LineTo(165.66f, 114.34f),
                    PathNode.CurveTo(168.78593f, 117.465935f, 168.78593f, 122.534065f, 165.66f, 125.66f),
                    PathNode.CurveTo(162.53407f, 128.78593f, 157.46593f, 128.78593f, 154.34f, 125.66f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 107.31f),
                    PathNode.LineTo(101.66f, 125.66f),
                    PathNode.CurveTo(100.159454f, 127.16222f, 98.123276f, 128.00629f, 96.0f, 128.00629f),
                    PathNode.CurveTo(93.876724f, 128.00629f, 91.840546f, 127.16222f, 90.34f, 125.66f),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
