package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorRegularIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 204.41827f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.CurveTo(219.58173f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 51.581722f, 219.58173f, 48.0f, 224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 168.83656f, 192.83656f, 176.0f, 184.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(23.163445f, 176.0f, 16.0f, 168.83656f, 16.0f, 160.0f),
                    PathNode.LineTo(16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 87.163445f, 23.163445f, 80.0f, 32.0f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.CurveTo(192.83656f, 80.0f, 200.0f, 87.163445f, 200.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 96.0f),
                    PathNode.LineTo(32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.LineTo(184.0f, 160.0f),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
