package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorThinIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 81.37258f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(184.0f, 212.0f),
                    PathNode.CurveTo(190.62741f, 212.0f, 196.0f, 206.62741f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 81.37258f, 190.62741f, 76.0f, 184.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 202.20914f, 186.20914f, 204.0f, 184.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.0f, 85.79086f, 37.79086f, 84.0f, 40.0f, 84.0f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(186.20914f, 84.0f, 188.0f, 85.79086f, 188.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 178.20914f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.CurveTo(221.79086f, 180.0f, 220.0f, 178.20914f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(61.79086f, 52.0f, 60.0f, 50.20914f, 60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
