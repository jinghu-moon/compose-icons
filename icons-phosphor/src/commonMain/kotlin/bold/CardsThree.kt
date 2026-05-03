package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorBoldIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(36.954304f, 96.0f, 28.0f, 104.95431f, 28.0f, 116.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 211.0457f, 36.954304f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(219.0457f, 220.0f, 228.0f, 211.0457f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.CurveTo(228.0f, 104.95431f, 219.0457f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 196.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(52.0f, 120.0f),
                    PathNode.LineTo(204.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 68.0f),
                    PathNode.CurveTo(44.0f, 61.37258f, 49.37258f, 56.0f, 56.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(206.62741f, 56.0f, 212.0f, 61.37258f, 212.0f, 68.0f),
                    PathNode.CurveTo(212.0f, 74.62742f, 206.62741f, 80.0f, 200.0f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(49.37258f, 80.0f, 44.0f, 74.62742f, 44.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 28.0f),
                    PathNode.CurveTo(60.0f, 21.372583f, 65.37258f, 16.0f, 72.0f, 16.0f),
                    PathNode.LineTo(184.0f, 16.0f),
                    PathNode.CurveTo(190.62741f, 16.0f, 196.0f, 21.372583f, 196.0f, 28.0f),
                    PathNode.CurveTo(196.0f, 34.62742f, 190.62741f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(65.37258f, 40.0f, 60.0f, 34.62742f, 60.0f, 28.0f),
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
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
