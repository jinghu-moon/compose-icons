package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorThinIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 133.17f),
                    PathNode.CurveTo(211.58112f, 133.92027f, 212.00314f, 134.93837f, 212.00314f, 136.0f),
                    PathNode.CurveTo(212.00314f, 137.06163f, 211.58112f, 138.07973f, 210.83f, 138.83f),
                    PathNode.LineTo(130.83f, 218.83f),
                    PathNode.CurveTo(130.07973f, 219.58112f, 129.06163f, 220.00314f, 128.0f, 220.00314f),
                    PathNode.CurveTo(126.93836f, 220.00314f, 125.92027f, 219.58112f, 125.17f, 218.83f),
                    PathNode.LineTo(45.17f, 138.83f),
                    PathNode.CurveTo(43.607033f, 137.26703f, 43.607033f, 134.73297f, 45.17f, 133.17f),
                    PathNode.CurveTo(46.732967f, 131.60704f, 49.267033f, 131.60704f, 50.83f, 133.17f),
                    PathNode.LineTo(128.0f, 210.34f),
                    PathNode.LineTo(205.17f, 133.17f),
                    PathNode.CurveTo(205.92027f, 132.41888f, 206.93837f, 131.99686f, 208.0f, 131.99686f),
                    PathNode.CurveTo(209.06163f, 131.99686f, 210.07973f, 132.41888f, 210.83f, 133.17f),
                    PathNode.Close,
                    PathNode.MoveTo(125.17f, 138.83f),
                    PathNode.CurveTo(125.92027f, 139.58112f, 126.93836f, 140.00314f, 128.0f, 140.00314f),
                    PathNode.CurveTo(129.06163f, 140.00314f, 130.07973f, 139.58112f, 130.83f, 138.83f),
                    PathNode.LineTo(210.83f, 58.83f),
                    PathNode.CurveTo(212.39296f, 57.267033f, 212.39296f, 54.732967f, 210.83f, 53.17f),
                    PathNode.CurveTo(209.26703f, 51.607033f, 206.73297f, 51.607033f, 205.17f, 53.17f),
                    PathNode.LineTo(128.0f, 130.34f),
                    PathNode.LineTo(50.83f, 53.17f),
                    PathNode.CurveTo(49.267033f, 51.607033f, 46.732967f, 51.607033f, 45.17f, 53.17f),
                    PathNode.CurveTo(43.607033f, 54.732967f, 43.607033f, 57.267033f, 45.17f, 58.83f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
