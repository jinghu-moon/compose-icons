package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = phosphorDuotoneIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 90.34f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(165.66f, 34.34f),
                    PathNode.CurveTo(168.78375f, 31.218275f, 173.84624f, 31.218275f, 176.97f, 34.34f),
                    PathNode.LineTo(221.66f, 79.0f),
                    PathNode.CurveTo(223.16835f, 80.50135f, 224.01633f, 82.54182f, 224.01633f, 84.67f),
                    PathNode.CurveTo(224.01633f, 86.79818f, 223.16835f, 88.83865f, 221.66f, 90.34f),
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
                    PathNode.LineTo(164.0f, 103.31f),
                    PathNode.LineTo(180.69f, 120.0f),
                    PathNode.LineTo(96.0f, 204.69f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 176.69f),
                    PathNode.LineTo(51.31f, 160.0f),
                    PathNode.LineTo(136.0f, 75.31f),
                    PathNode.LineTo(152.69f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 179.31f),
                    PathNode.LineTo(76.69f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 108.69f),
                    PathNode.LineTo(147.32f, 64.0f),
                    PathNode.LineTo(171.32f, 40.0f),
                    PathNode.LineTo(216.0f, 84.69f),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
