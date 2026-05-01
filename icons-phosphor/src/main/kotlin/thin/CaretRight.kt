package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorThinIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.83f, 130.83f),
                    PathNode.LineTo(98.83f, 210.83f),
                    PathNode.CurveTo(97.26704f, 212.39296f, 94.73296f, 212.39296f, 93.17f, 210.83f),
                    PathNode.CurveTo(91.60703f, 209.26703f, 91.60703f, 206.73297f, 93.17f, 205.17f),
                    PathNode.LineTo(170.34f, 128.0f),
                    PathNode.LineTo(93.17f, 50.83f),
                    PathNode.CurveTo(91.60703f, 49.267033f, 91.60703f, 46.732967f, 93.17f, 45.17f),
                    PathNode.CurveTo(94.73296f, 43.607033f, 97.26704f, 43.607033f, 98.83f, 45.17f),
                    PathNode.LineTo(178.83f, 125.17f),
                    PathNode.CurveTo(179.58112f, 125.92027f, 180.00314f, 126.93836f, 180.00314f, 128.0f),
                    PathNode.CurveTo(180.00314f, 129.06163f, 179.58112f, 130.07973f, 178.83f, 130.83f),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
