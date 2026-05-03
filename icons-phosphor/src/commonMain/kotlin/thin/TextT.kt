package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorThinIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 90.20914f, 202.20914f, 92.0f, 200.0f, 92.0f),
                    PathNode.CurveTo(197.79086f, 92.0f, 196.0f, 90.20914f, 196.0f, 88.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(162.20914f, 196.0f, 164.0f, 197.79086f, 164.0f, 200.0f),
                    PathNode.CurveTo(164.0f, 202.20914f, 162.20914f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(93.79086f, 204.0f, 92.0f, 202.20914f, 92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 197.79086f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 60.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 90.20914f, 58.20914f, 92.0f, 56.0f, 92.0f),
                    PathNode.CurveTo(53.79086f, 92.0f, 52.0f, 90.20914f, 52.0f, 88.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
