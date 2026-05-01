package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorThinIcon(
            name = "TextIndent",
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
                    PathNode.MoveTo(37.17f, 138.83f),
                    PathNode.CurveTo(37.920273f, 139.58112f, 38.938362f, 140.00314f, 40.0f, 140.00314f),
                    PathNode.CurveTo(41.061638f, 140.00314f, 42.079727f, 139.58112f, 42.83f, 138.83f),
                    PathNode.LineTo(82.83f, 98.83f),
                    PathNode.CurveTo(83.581116f, 98.07973f, 84.00314f, 97.06164f, 84.00314f, 96.0f),
                    PathNode.CurveTo(84.00314f, 94.93836f, 83.581116f, 93.92027f, 82.83f, 93.17f),
                    PathNode.LineTo(42.83f, 53.17f),
                    PathNode.CurveTo(41.267033f, 51.607033f, 38.732967f, 51.607033f, 37.17f, 53.17f),
                    PathNode.CurveTo(35.607033f, 54.732967f, 35.607033f, 57.267033f, 37.17f, 58.83f),
                    PathNode.LineTo(74.34f, 96.0f),
                    PathNode.LineTo(37.17f, 133.17f),
                    PathNode.CurveTo(36.41889f, 133.92027f, 35.996853f, 134.93837f, 35.996853f, 136.0f),
                    PathNode.CurveTo(35.996853f, 137.06163f, 36.41889f, 138.07973f, 37.17f, 138.83f),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
