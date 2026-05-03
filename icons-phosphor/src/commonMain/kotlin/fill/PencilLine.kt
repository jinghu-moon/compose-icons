package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = phosphorFillIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.32f, 73.37f),
                    PathNode.LineTo(182.63f, 28.69f),
                    PathNode.CurveTo(179.62932f, 25.688627f, 175.5591f, 24.002417f, 171.315f, 24.002417f),
                    PathNode.CurveTo(167.0709f, 24.002417f, 163.00069f, 25.688627f, 160.0f, 28.69f),
                    PathNode.LineTo(36.69f, 152.0f),
                    PathNode.CurveTo(33.67581f, 154.99025f, 31.986435f, 159.06421f, 32.0f, 163.31f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 211.58173f, 220.41827f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(115.32f, 208.0f),
                    PathNode.LineTo(227.32f, 96.0f),
                    PathNode.CurveTo(230.32137f, 92.99931f, 232.00758f, 88.92911f, 232.00758f, 84.685f),
                    PathNode.CurveTo(232.00758f, 80.4409f, 230.32137f, 76.37069f, 227.32f, 73.37f),
                    PathNode.Close,
                    PathNode.MoveTo(79.32f, 188.0f),
                    PathNode.LineTo(169.66f, 97.66f),
                    PathNode.LineTo(186.35f, 114.34f),
                    PathNode.LineTo(96.0f, 204.69f),
                    PathNode.Close,
                    PathNode.MoveTo(158.32f, 86.34f),
                    PathNode.LineTo(158.32f, 86.34f),
                    PathNode.LineTo(68.0f, 176.69f),
                    PathNode.LineTo(51.31f, 160.0f),
                    PathNode.LineTo(141.66f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 179.31f),
                    PathNode.LineTo(76.69f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
