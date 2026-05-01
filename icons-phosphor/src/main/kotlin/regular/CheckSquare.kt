package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) return _checkSquare!!
        _checkSquare = phosphorRegularIcon(
            name = "CheckSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.66f, 98.34f),
                    PathNode.CurveTo(175.16223f, 99.840546f, 176.00629f, 101.876724f, 176.00629f, 104.0f),
                    PathNode.CurveTo(176.00629f, 106.123276f, 175.16223f, 108.159454f, 173.66f, 109.66f),
                    PathNode.LineTo(117.66f, 165.66f),
                    PathNode.CurveTo(116.159454f, 167.16223f, 114.123276f, 168.00629f, 112.0f, 168.00629f),
                    PathNode.CurveTo(109.876724f, 168.00629f, 107.840546f, 167.16223f, 106.34f, 165.66f),
                    PathNode.LineTo(82.34f, 141.66f),
                    PathNode.CurveTo(79.214066f, 138.53407f, 79.214066f, 133.46593f, 82.34f, 130.34f),
                    PathNode.CurveTo(85.465935f, 127.214066f, 90.534065f, 127.214066f, 93.66f, 130.34f),
                    PathNode.LineTo(112.0f, 148.69f),
                    PathNode.LineTo(162.34f, 98.34f),
                    PathNode.CurveTo(163.84055f, 96.83778f, 165.87672f, 95.993706f, 168.0f, 95.993706f),
                    PathNode.CurveTo(170.12328f, 95.993706f, 172.15945f, 96.83778f, 173.66f, 98.34f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
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
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
