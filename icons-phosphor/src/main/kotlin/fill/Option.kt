package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorFillIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.LineTo(152.94f, 176.0f),
                    PathNode.CurveTo(146.87563f, 176.0194f, 141.32695f, 172.5917f, 138.63f, 167.16f),
                    PathNode.LineTo(103.06f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(51.581722f, 96.0f, 48.0f, 92.41828f, 48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 83.58172f, 51.581722f, 80.0f, 56.0f, 80.0f),
                    PathNode.LineTo(103.06f, 80.0f),
                    PathNode.CurveTo(109.12437f, 79.9806f, 114.67305f, 83.408295f, 117.37f, 88.84f),
                    PathNode.LineTo(152.94f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(204.41827f, 160.0f, 208.0f, 163.58173f, 208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 172.41827f, 204.41827f, 176.0f, 200.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 83.58172f, 147.58173f, 80.0f, 152.0f, 80.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.CurveTo(204.41827f, 80.0f, 208.0f, 83.58172f, 208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 92.41828f, 204.41827f, 96.0f, 200.0f, 96.0f),
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
        return _option!!
    }

private var _option: ImageVector? = null
