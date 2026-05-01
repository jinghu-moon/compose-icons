package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorFillIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.85f, 96.0f),
                    PathNode.LineTo(161.39f, 128.0f),
                    PathNode.LineTo(94.61f, 128.0f),
                    PathNode.LineTo(109.15f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.CurveTo(208.0f, 131.58173f, 204.41827f, 128.0f, 200.0f, 128.0f),
                    PathNode.LineTo(179.0f, 128.0f),
                    PathNode.LineTo(164.42f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 92.41828f, 184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 83.58172f, 180.41827f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(75.58172f, 80.0f, 72.0f, 83.58172f, 72.0f, 88.0f),
                    PathNode.CurveTo(72.0f, 92.41828f, 75.58172f, 96.0f, 80.0f, 96.0f),
                    PathNode.LineTo(91.58f, 96.0f),
                    PathNode.LineTo(77.0f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.CurveTo(51.581722f, 128.0f, 48.0f, 131.58173f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 140.41827f, 51.581722f, 144.0f, 56.0f, 144.0f),
                    PathNode.LineTo(69.76f, 144.0f),
                    PathNode.LineTo(56.76f, 172.69f),
                    PathNode.CurveTo(55.485798f, 175.30508f, 55.731537f, 178.40573f, 57.401768f, 180.78746f),
                    PathNode.CurveTo(59.071995f, 183.16917f, 61.903446f, 184.45656f, 64.79619f, 184.14948f),
                    PathNode.CurveTo(67.688934f, 183.8424f, 70.18701f, 181.9893f, 71.32f, 179.31f),
                    PathNode.LineTo(87.32f, 144.0f),
                    PathNode.LineTo(168.66f, 144.0f),
                    PathNode.LineTo(184.71f, 179.31f),
                    PathNode.CurveTo(186.60892f, 183.20718f, 191.26646f, 184.88274f, 195.21289f, 183.08841f),
                    PathNode.CurveTo(199.15932f, 181.29408f, 200.95847f, 176.68288f, 199.27f, 172.69f),
                    PathNode.LineTo(186.27f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.CurveTo(204.41827f, 144.0f, 208.0f, 140.41827f, 208.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
