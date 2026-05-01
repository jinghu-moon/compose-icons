package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorThinIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.83f, 205.17f),
                    PathNode.CurveTo(164.39296f, 206.73297f, 164.39296f, 209.26703f, 162.83f, 210.83f),
                    PathNode.CurveTo(161.26703f, 212.39296f, 158.73297f, 212.39296f, 157.17f, 210.83f),
                    PathNode.LineTo(77.17f, 130.83f),
                    PathNode.CurveTo(76.418884f, 130.07973f, 75.99686f, 129.06163f, 75.99686f, 128.0f),
                    PathNode.CurveTo(75.99686f, 126.93836f, 76.418884f, 125.92027f, 77.17f, 125.17f),
                    PathNode.LineTo(157.17f, 45.17f),
                    PathNode.CurveTo(158.73297f, 43.607033f, 161.26703f, 43.607033f, 162.83f, 45.17f),
                    PathNode.CurveTo(164.39296f, 46.732967f, 164.39296f, 49.267033f, 162.83f, 50.83f),
                    PathNode.LineTo(85.66f, 128.0f),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
