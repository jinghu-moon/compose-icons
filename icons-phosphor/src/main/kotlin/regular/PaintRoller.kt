package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorRegularIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 88.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(216.0f, 55.163445f, 208.83656f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(39.163445f, 48.0f, 32.0f, 55.163445f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(11.581722f, 88.0f, 8.0f, 91.58172f, 8.0f, 96.0f),
                    PathNode.CurveTo(8.0f, 100.41828f, 11.581722f, 104.0f, 16.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 136.83656f, 39.163445f, 144.0f, 48.0f, 144.0f),
                    PathNode.LineTo(200.0f, 144.0f),
                    PathNode.CurveTo(208.83656f, 144.0f, 216.0f, 136.83656f, 216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 154.0f),
                    PathNode.LineTo(131.6f, 182.65f),
                    PathNode.CurveTo(124.75911f, 184.63092f, 120.038055f, 190.87817f, 120.0f, 198.0f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 198.0f),
                    PathNode.LineTo(236.4f, 169.32f),
                    PathNode.CurveTo(243.2303f, 167.34224f, 247.9487f, 161.11069f, 248.0f, 154.0f),
                    PathNode.LineTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.0f, 95.163445f, 240.83656f, 88.0f, 232.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 128.0f),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
