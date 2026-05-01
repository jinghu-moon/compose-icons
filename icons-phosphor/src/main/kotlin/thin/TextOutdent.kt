package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorThinIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(112.0f, 132.0f),
                    PathNode.CurveTo(109.79086f, 132.0f, 108.0f, 130.20914f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 125.79086f, 109.79086f, 124.0f, 112.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(218.20914f, 68.0f, 220.0f, 66.20914f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 61.79086f, 218.20914f, 60.0f, 216.0f, 60.0f),
                    PathNode.LineTo(112.0f, 60.0f),
                    PathNode.CurveTo(109.79086f, 60.0f, 108.0f, 61.79086f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 66.20914f, 109.79086f, 68.0f, 112.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 189.79086f, 218.20914f, 188.0f, 216.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 140.0f),
                    PathNode.CurveTo(73.61882f, 140.00127f, 75.07882f, 139.02669f, 75.69849f, 137.53116f),
                    PathNode.CurveTo(76.31816f, 136.03563f, 75.97532f, 134.31404f, 74.83f, 133.17f),
                    PathNode.LineTo(37.66f, 96.0f),
                    PathNode.LineTo(74.83f, 58.83f),
                    PathNode.CurveTo(76.39297f, 57.267033f, 76.39297f, 54.732967f, 74.83f, 53.17f),
                    PathNode.CurveTo(73.26704f, 51.607033f, 70.73296f, 51.607033f, 69.17f, 53.17f),
                    PathNode.LineTo(29.17f, 93.17f),
                    PathNode.CurveTo(28.418892f, 93.92027f, 27.996853f, 94.93836f, 27.996853f, 96.0f),
                    PathNode.CurveTo(27.996853f, 97.06164f, 28.418892f, 98.07973f, 29.17f, 98.83f),
                    PathNode.LineTo(69.17f, 138.83f),
                    PathNode.CurveTo(69.92079f, 139.57996f, 70.93881f, 140.00084f, 72.0f, 140.0f),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
