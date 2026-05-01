package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorRegularIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.CurveTo(187.58173f, 24.0f, 184.0f, 27.581722f, 184.0f, 32.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(72.0f, 27.581722f, 68.41828f, 24.0f, 64.0f, 24.0f),
                    PathNode.CurveTo(59.581722f, 24.0f, 56.0f, 27.581722f, 56.0f, 32.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(56.0f, 228.41827f, 59.581722f, 232.0f, 64.0f, 232.0f),
                    PathNode.CurveTo(68.41828f, 232.0f, 72.0f, 228.41827f, 72.0f, 224.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(196.41827f, 232.0f, 200.0f, 228.41827f, 200.0f, 224.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(200.0f, 27.581722f, 196.41827f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.LineTo(184.0f, 176.0f),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
