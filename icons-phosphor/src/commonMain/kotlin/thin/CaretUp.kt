package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorThinIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 162.83f),
                    PathNode.CurveTo(210.07973f, 163.58112f, 209.06163f, 164.00314f, 208.0f, 164.00314f),
                    PathNode.CurveTo(206.93837f, 164.00314f, 205.92027f, 163.58112f, 205.17f, 162.83f),
                    PathNode.LineTo(128.0f, 85.66f),
                    PathNode.LineTo(50.83f, 162.83f),
                    PathNode.CurveTo(49.267033f, 164.39296f, 46.732967f, 164.39296f, 45.17f, 162.83f),
                    PathNode.CurveTo(43.607033f, 161.26703f, 43.607033f, 158.73297f, 45.17f, 157.17f),
                    PathNode.LineTo(125.17f, 77.17f),
                    PathNode.CurveTo(125.92027f, 76.418884f, 126.93836f, 75.99686f, 128.0f, 75.99686f),
                    PathNode.CurveTo(129.06163f, 75.99686f, 130.07973f, 76.418884f, 130.83f, 77.17f),
                    PathNode.LineTo(210.83f, 157.17f),
                    PathNode.CurveTo(211.58112f, 157.92027f, 212.00314f, 158.93837f, 212.00314f, 160.0f),
                    PathNode.CurveTo(212.00314f, 161.06163f, 211.58112f, 162.07973f, 210.83f, 162.83f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
