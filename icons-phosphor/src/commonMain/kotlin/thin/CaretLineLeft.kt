package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorThinIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(194.83f, 205.17f),
                    PathNode.CurveTo(196.39296f, 206.73297f, 196.39296f, 209.26703f, 194.83f, 210.83f),
                    PathNode.CurveTo(193.26703f, 212.39296f, 190.73297f, 212.39296f, 189.17f, 210.83f),
                    PathNode.LineTo(109.17f, 130.83f),
                    PathNode.CurveTo(108.418884f, 130.07973f, 107.99686f, 129.06163f, 107.99686f, 128.0f),
                    PathNode.CurveTo(107.99686f, 126.93836f, 108.418884f, 125.92027f, 109.17f, 125.17f),
                    PathNode.LineTo(189.17f, 45.17f),
                    PathNode.CurveTo(190.73297f, 43.607033f, 193.26703f, 43.607033f, 194.83f, 45.17f),
                    PathNode.CurveTo(196.39296f, 46.732967f, 196.39296f, 49.267033f, 194.83f, 50.83f),
                    PathNode.LineTo(117.66f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 44.0f),
                    PathNode.CurveTo(69.79086f, 44.0f, 68.0f, 45.79086f, 68.0f, 48.0f),
                    PathNode.LineTo(68.0f, 208.0f),
                    PathNode.CurveTo(68.0f, 210.20914f, 69.79086f, 212.0f, 72.0f, 212.0f),
                    PathNode.CurveTo(74.20914f, 212.0f, 76.0f, 210.20914f, 76.0f, 208.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 45.79086f, 74.20914f, 44.0f, 72.0f, 44.0f),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
