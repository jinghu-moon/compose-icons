package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorRegularIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(192.83656f, 120.0f, 200.0f, 112.836555f, 200.0f, 104.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(200.0f, 55.163445f, 192.83656f, 48.0f, 184.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(136.0f, 27.581722f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(63.163445f, 48.0f, 56.0f, 55.163445f, 56.0f, 64.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 112.836555f, 63.163445f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(39.163445f, 136.0f, 32.0f, 143.16344f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 228.41827f, 123.58172f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(216.83656f, 208.0f, 224.0f, 200.83656f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 143.16344f, 216.83656f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 64.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 192.0f),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
