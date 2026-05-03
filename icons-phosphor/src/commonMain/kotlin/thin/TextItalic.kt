package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorThinIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 58.20914f, 194.20914f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(154.88f, 60.0f),
                    PathNode.LineTo(109.55f, 196.0f),
                    PathNode.LineTo(144.0f, 196.0f),
                    PathNode.CurveTo(146.20914f, 196.0f, 148.0f, 197.79086f, 148.0f, 200.0f),
                    PathNode.CurveTo(148.0f, 202.20914f, 146.20914f, 204.0f, 144.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(61.79086f, 204.0f, 60.0f, 202.20914f, 60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 197.79086f, 61.79086f, 196.0f, 64.0f, 196.0f),
                    PathNode.LineTo(101.12f, 196.0f),
                    PathNode.LineTo(146.45f, 60.0f),
                    PathNode.LineTo(112.0f, 60.0f),
                    PathNode.CurveTo(109.79086f, 60.0f, 108.0f, 58.20914f, 108.0f, 56.0f),
                    PathNode.CurveTo(108.0f, 53.79086f, 109.79086f, 52.0f, 112.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(194.20914f, 52.0f, 196.0f, 53.79086f, 196.0f, 56.0f),
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
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
