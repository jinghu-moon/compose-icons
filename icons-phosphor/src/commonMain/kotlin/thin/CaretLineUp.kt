package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorThinIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 194.83f),
                    PathNode.CurveTo(210.07973f, 195.58112f, 209.06163f, 196.00314f, 208.0f, 196.00314f),
                    PathNode.CurveTo(206.93837f, 196.00314f, 205.92027f, 195.58112f, 205.17f, 194.83f),
                    PathNode.LineTo(128.0f, 117.66f),
                    PathNode.LineTo(50.83f, 194.83f),
                    PathNode.CurveTo(49.267033f, 196.39296f, 46.732967f, 196.39296f, 45.17f, 194.83f),
                    PathNode.CurveTo(43.607033f, 193.26703f, 43.607033f, 190.73297f, 45.17f, 189.17f),
                    PathNode.LineTo(125.17f, 109.17f),
                    PathNode.CurveTo(125.92027f, 108.418884f, 126.93836f, 107.99686f, 128.0f, 107.99686f),
                    PathNode.CurveTo(129.06163f, 107.99686f, 130.07973f, 108.418884f, 130.83f, 109.17f),
                    PathNode.LineTo(210.83f, 189.17f),
                    PathNode.CurveTo(211.58112f, 189.92027f, 212.00314f, 190.93837f, 212.00314f, 192.0f),
                    PathNode.CurveTo(212.00314f, 193.06163f, 211.58112f, 194.07973f, 210.83f, 194.83f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 76.0f),
                    PathNode.LineTo(208.0f, 76.0f),
                    PathNode.CurveTo(210.20914f, 76.0f, 212.0f, 74.20914f, 212.0f, 72.0f),
                    PathNode.CurveTo(212.0f, 69.79086f, 210.20914f, 68.0f, 208.0f, 68.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.CurveTo(45.79086f, 68.0f, 44.0f, 69.79086f, 44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 74.20914f, 45.79086f, 76.0f, 48.0f, 76.0f),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
