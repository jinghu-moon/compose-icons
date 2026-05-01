package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorThinIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 98.83f),
                    PathNode.LineTo(130.83f, 178.83f),
                    PathNode.CurveTo(130.07973f, 179.58112f, 129.06163f, 180.00314f, 128.0f, 180.00314f),
                    PathNode.CurveTo(126.93836f, 180.00314f, 125.92027f, 179.58112f, 125.17f, 178.83f),
                    PathNode.LineTo(45.17f, 98.83f),
                    PathNode.CurveTo(43.607033f, 97.26704f, 43.607033f, 94.73296f, 45.17f, 93.17f),
                    PathNode.CurveTo(46.732967f, 91.60703f, 49.267033f, 91.60703f, 50.83f, 93.17f),
                    PathNode.LineTo(128.0f, 170.34f),
                    PathNode.LineTo(205.17f, 93.17f),
                    PathNode.CurveTo(206.73297f, 91.60703f, 209.26703f, 91.60703f, 210.83f, 93.17f),
                    PathNode.CurveTo(212.39296f, 94.73296f, 212.39296f, 97.26704f, 210.83f, 98.83f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
