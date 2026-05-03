package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorRegularIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 63.163445f, 200.83656f, 56.0f, 192.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.CurveTo(143.16344f, 56.0f, 136.0f, 63.163445f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 39.163445f, 112.836555f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(55.163445f, 32.0f, 48.0f, 39.163445f, 48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(112.836555f, 224.0f, 120.0f, 216.83656f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 192.83656f, 143.16344f, 200.0f, 152.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(200.83656f, 200.0f, 208.0f, 192.83656f, 208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 184.0f),
                    PathNode.LineTo(152.0f, 184.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
