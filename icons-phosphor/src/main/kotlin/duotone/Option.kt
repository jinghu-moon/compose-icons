package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorDuotoneIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(39.163445f, 192.0f, 32.0f, 184.83656f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 80.0f),
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
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 196.41827f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.LineTo(160.94f, 200.0f),
                    PathNode.CurveTo(154.87563f, 200.0194f, 149.32695f, 196.5917f, 146.63f, 191.16f),
                    PathNode.LineTo(95.06f, 88.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(27.581722f, 88.0f, 24.0f, 84.41828f, 24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 75.58172f, 27.581722f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(95.06f, 72.0f),
                    PathNode.CurveTo(101.12437f, 71.9806f, 106.67305f, 75.408295f, 109.37f, 80.84f),
                    PathNode.LineTo(160.94f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(228.41827f, 184.0f, 232.0f, 187.58173f, 232.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
                    PathNode.CurveTo(228.41827f, 88.0f, 232.0f, 84.41828f, 232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 75.58172f, 228.41827f, 72.0f, 224.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(147.58173f, 72.0f, 144.0f, 75.58172f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 84.41828f, 147.58173f, 88.0f, 152.0f, 88.0f),
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
        return _option!!
    }

private var _option: ImageVector? = null
