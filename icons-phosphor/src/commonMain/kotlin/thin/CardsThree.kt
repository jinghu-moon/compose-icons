package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorThinIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(41.37258f, 92.0f, 36.0f, 97.37258f, 36.0f, 104.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 41.37258f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(214.62741f, 212.0f, 220.0f, 206.62741f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 97.37258f, 214.62741f, 92.0f, 208.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 202.20914f, 210.20914f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(45.79086f, 204.0f, 44.0f, 202.20914f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 101.79086f, 45.79086f, 100.0f, 48.0f, 100.0f),
                    PathNode.LineTo(208.0f, 100.0f),
                    PathNode.CurveTo(210.20914f, 100.0f, 212.0f, 101.79086f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 61.79086f, 53.79086f, 60.0f, 56.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(202.20914f, 60.0f, 204.0f, 61.79086f, 204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 66.20914f, 202.20914f, 68.0f, 200.0f, 68.0f),
                    PathNode.LineTo(56.0f, 68.0f),
                    PathNode.CurveTo(53.79086f, 68.0f, 52.0f, 66.20914f, 52.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 32.0f),
                    PathNode.CurveTo(68.0f, 29.790861f, 69.79086f, 28.0f, 72.0f, 28.0f),
                    PathNode.LineTo(184.0f, 28.0f),
                    PathNode.CurveTo(186.20914f, 28.0f, 188.0f, 29.790861f, 188.0f, 32.0f),
                    PathNode.CurveTo(188.0f, 34.20914f, 186.20914f, 36.0f, 184.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(69.79086f, 36.0f, 68.0f, 34.20914f, 68.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
