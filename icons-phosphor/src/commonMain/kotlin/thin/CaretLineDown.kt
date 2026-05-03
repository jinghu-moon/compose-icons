package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorThinIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(45.17f, 74.83f),
                    PathNode.CurveTo(43.607033f, 73.26704f, 43.607033f, 70.73296f, 45.17f, 69.17f),
                    PathNode.CurveTo(46.732967f, 67.60703f, 49.267033f, 67.60703f, 50.83f, 69.17f),
                    PathNode.LineTo(128.0f, 146.34f),
                    PathNode.LineTo(205.17f, 69.17f),
                    PathNode.CurveTo(206.73297f, 67.60703f, 209.26703f, 67.60703f, 210.83f, 69.17f),
                    PathNode.CurveTo(212.39296f, 70.73296f, 212.39296f, 73.26704f, 210.83f, 74.83f),
                    PathNode.LineTo(130.83f, 154.83f),
                    PathNode.CurveTo(130.07973f, 155.58112f, 129.06163f, 156.00314f, 128.0f, 156.00314f),
                    PathNode.CurveTo(126.93836f, 156.00314f, 125.92027f, 155.58112f, 125.17f, 154.83f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(45.79086f, 188.0f, 44.0f, 189.79086f, 44.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 194.20914f, 45.79086f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(210.20914f, 196.0f, 212.0f, 194.20914f, 212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 189.79086f, 210.20914f, 188.0f, 208.0f, 188.0f),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
