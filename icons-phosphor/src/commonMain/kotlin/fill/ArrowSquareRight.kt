package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) return _arrowSquareRight!!
        _arrowSquareRight = phosphorFillIcon(
            name = "ArrowSquareRight",
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
                    PathNode.MoveTo(173.66f, 133.66f),
                    PathNode.LineTo(141.66f, 165.66f),
                    PathNode.CurveTo(138.53407f, 168.78593f, 133.46593f, 168.78593f, 130.34f, 165.66f),
                    PathNode.CurveTo(127.214066f, 162.53407f, 127.214066f, 157.46593f, 130.34f, 154.34f),
                    PathNode.LineTo(148.69f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(83.58172f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 83.58172f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(148.69f, 120.0f),
                    PathNode.LineTo(130.34f, 101.66f),
                    PathNode.CurveTo(127.214066f, 98.534065f, 127.214066f, 93.465935f, 130.34f, 90.34f),
                    PathNode.CurveTo(133.46593f, 87.214066f, 138.53407f, 87.214066f, 141.66f, 90.34f),
                    PathNode.LineTo(173.66f, 122.34f),
                    PathNode.CurveTo(175.16223f, 123.840546f, 176.00629f, 125.876724f, 176.00629f, 128.0f),
                    PathNode.CurveTo(176.00629f, 130.12328f, 175.16223f, 132.15945f, 173.66f, 133.66f),
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
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
