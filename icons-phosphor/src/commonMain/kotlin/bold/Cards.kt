package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorBoldIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 72.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(24.954306f, 72.0f, 16.0f, 80.95431f, 16.0f, 92.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(16.0f, 215.0457f, 24.954306f, 224.0f, 36.0f, 224.0f),
                    PathNode.LineTo(180.0f, 224.0f),
                    PathNode.CurveTo(191.0457f, 224.0f, 200.0f, 215.0457f, 200.0f, 204.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(200.0f, 80.95431f, 191.0457f, 72.0f, 180.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 52.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 182.62741f, 234.62741f, 188.0f, 228.0f, 188.0f),
                    PathNode.CurveTo(221.37259f, 188.0f, 216.0f, 182.62741f, 216.0f, 176.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(57.37258f, 56.0f, 52.0f, 50.62742f, 52.0f, 44.0f),
                    PathNode.CurveTo(52.0f, 37.37258f, 57.37258f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(220.0f, 32.0f),
                    PathNode.CurveTo(231.0457f, 32.0f, 240.0f, 40.954304f, 240.0f, 52.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
