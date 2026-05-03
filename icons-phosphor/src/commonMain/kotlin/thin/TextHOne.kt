package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorThinIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 112.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.CurveTo(221.79086f, 212.0f, 220.0f, 210.20914f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 119.47f),
                    PathNode.LineTo(202.22f, 131.33f),
                    PathNode.CurveTo(200.38089f, 132.55608f, 197.89607f, 132.05911f, 196.67f, 130.22f),
                    PathNode.CurveTo(195.44392f, 128.38089f, 195.94089f, 125.89607f, 197.78f, 124.67f),
                    PathNode.LineTo(221.78f, 108.67f),
                    PathNode.CurveTo(223.00775f, 107.85087f, 224.58678f, 107.77437f, 225.88794f, 108.47098f),
                    PathNode.CurveTo(227.18912f, 109.16758f, 228.00096f, 110.52409f, 228.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 52.0f),
                    PathNode.CurveTo(141.79086f, 52.0f, 140.0f, 53.79086f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 42.20914f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(42.20914f, 180.0f, 44.0f, 178.20914f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 53.79086f, 146.20914f, 52.0f, 144.0f, 52.0f),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
