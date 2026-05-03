package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorFillIcon(
            name = "Crop",
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
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.CurveTo(172.41827f, 80.0f, 176.0f, 83.58172f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 140.41827f, 172.41827f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(163.58173f, 144.0f, 160.0f, 140.41827f, 160.0f, 136.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(115.58172f, 96.0f, 112.0f, 92.41828f, 112.0f, 88.0f),
                    PathNode.CurveTo(112.0f, 83.58172f, 115.58172f, 80.0f, 120.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.CurveTo(163.58173f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(83.58172f, 176.0f, 80.0f, 172.41827f, 80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 92.41828f, 56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 83.58172f, 59.581722f, 80.0f, 64.0f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.CurveTo(80.0f, 59.581722f, 83.58172f, 56.0f, 88.0f, 56.0f),
                    PathNode.CurveTo(92.41828f, 56.0f, 96.0f, 59.581722f, 96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 172.41827f, 196.41827f, 176.0f, 192.0f, 176.0f),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
