package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorThinIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.83f, 130.83f),
                    PathNode.LineTo(58.83f, 210.83f),
                    PathNode.CurveTo(57.267033f, 212.39296f, 54.732967f, 212.39296f, 53.17f, 210.83f),
                    PathNode.CurveTo(51.607033f, 209.26703f, 51.607033f, 206.73297f, 53.17f, 205.17f),
                    PathNode.LineTo(130.34f, 128.0f),
                    PathNode.LineTo(53.17f, 50.83f),
                    PathNode.CurveTo(51.607033f, 49.267033f, 51.607033f, 46.732967f, 53.17f, 45.17f),
                    PathNode.CurveTo(54.732967f, 43.607033f, 57.267033f, 43.607033f, 58.83f, 45.17f),
                    PathNode.LineTo(138.83f, 125.17f),
                    PathNode.CurveTo(139.58112f, 125.92027f, 140.00314f, 126.93836f, 140.00314f, 128.0f),
                    PathNode.CurveTo(140.00314f, 129.06163f, 139.58112f, 130.07973f, 138.83f, 130.83f),
                    PathNode.Close,
                    PathNode.MoveTo(218.83f, 125.17f),
                    PathNode.LineTo(138.83f, 45.17f),
                    PathNode.CurveTo(137.26703f, 43.607033f, 134.73297f, 43.607033f, 133.17f, 45.17f),
                    PathNode.CurveTo(131.60704f, 46.732967f, 131.60704f, 49.267033f, 133.17f, 50.83f),
                    PathNode.LineTo(210.34f, 128.0f),
                    PathNode.LineTo(133.17f, 205.17f),
                    PathNode.CurveTo(131.60704f, 206.73297f, 131.60704f, 209.26703f, 133.17f, 210.83f),
                    PathNode.CurveTo(134.73297f, 212.39296f, 137.26703f, 212.39296f, 138.83f, 210.83f),
                    PathNode.LineTo(218.83f, 130.83f),
                    PathNode.CurveTo(219.58112f, 130.07973f, 220.00314f, 129.06163f, 220.00314f, 128.0f),
                    PathNode.CurveTo(220.00314f, 126.93836f, 219.58112f, 125.92027f, 218.83f, 125.17f),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
