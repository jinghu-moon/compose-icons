package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorThinIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(93.17f, 58.83f),
                    PathNode.CurveTo(92.418884f, 58.079727f, 91.99686f, 57.061638f, 91.99686f, 56.0f),
                    PathNode.CurveTo(91.99686f, 54.938362f, 92.418884f, 53.920273f, 93.17f, 53.17f),
                    PathNode.LineTo(125.17f, 21.17f),
                    PathNode.CurveTo(125.92027f, 20.418892f, 126.93836f, 19.996853f, 128.0f, 19.996853f),
                    PathNode.CurveTo(129.06163f, 19.996853f, 130.07973f, 20.418892f, 130.83f, 21.17f),
                    PathNode.LineTo(162.83f, 53.17f),
                    PathNode.CurveTo(164.39296f, 54.732967f, 164.39296f, 57.267033f, 162.83f, 58.83f),
                    PathNode.CurveTo(161.26703f, 60.392967f, 158.73297f, 60.392967f, 157.17f, 58.83f),
                    PathNode.LineTo(132.0f, 33.66f),
                    PathNode.LineTo(132.0f, 96.0f),
                    PathNode.CurveTo(132.0f, 98.20914f, 130.20914f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(125.79086f, 100.0f, 124.0f, 98.20914f, 124.0f, 96.0f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(98.83f, 58.83f),
                    PathNode.CurveTo(98.07973f, 59.58111f, 97.06164f, 60.003147f, 96.0f, 60.003147f),
                    PathNode.CurveTo(94.93836f, 60.003147f, 93.92027f, 59.58111f, 93.17f, 58.83f),
                    PathNode.Close,
                    PathNode.MoveTo(157.17f, 197.17f),
                    PathNode.LineTo(132.0f, 222.34f),
                    PathNode.LineTo(132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 157.79086f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 157.79086f, 124.0f, 160.0f),
                    PathNode.LineTo(124.0f, 222.34f),
                    PathNode.LineTo(98.83f, 197.17f),
                    PathNode.CurveTo(97.26704f, 195.60704f, 94.73296f, 195.60704f, 93.17f, 197.17f),
                    PathNode.CurveTo(91.60703f, 198.73297f, 91.60703f, 201.26703f, 93.17f, 202.83f),
                    PathNode.LineTo(125.17f, 234.83f),
                    PathNode.CurveTo(125.92027f, 235.58112f, 126.93836f, 236.00314f, 128.0f, 236.00314f),
                    PathNode.CurveTo(129.06163f, 236.00314f, 130.07973f, 235.58112f, 130.83f, 234.83f),
                    PathNode.LineTo(162.83f, 202.83f),
                    PathNode.CurveTo(164.39296f, 201.26703f, 164.39296f, 198.73297f, 162.83f, 197.17f),
                    PathNode.CurveTo(161.26703f, 195.60704f, 158.73297f, 195.60704f, 157.17f, 197.17f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 125.17f),
                    PathNode.LineTo(202.83f, 93.17f),
                    PathNode.CurveTo(201.26703f, 91.60703f, 198.73297f, 91.60703f, 197.17f, 93.17f),
                    PathNode.CurveTo(195.60704f, 94.73296f, 195.60704f, 97.26704f, 197.17f, 98.83f),
                    PathNode.LineTo(222.34f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(157.79086f, 124.0f, 156.0f, 125.79086f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 130.20914f, 157.79086f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(222.34f, 132.0f),
                    PathNode.LineTo(197.17f, 157.17f),
                    PathNode.CurveTo(195.60704f, 158.73297f, 195.60704f, 161.26703f, 197.17f, 162.83f),
                    PathNode.CurveTo(198.73297f, 164.39296f, 201.26703f, 164.39296f, 202.83f, 162.83f),
                    PathNode.LineTo(234.83f, 130.83f),
                    PathNode.CurveTo(235.58112f, 130.07973f, 236.00314f, 129.06163f, 236.00314f, 128.0f),
                    PathNode.CurveTo(236.00314f, 126.93836f, 235.58112f, 125.92027f, 234.83f, 125.17f),
                    PathNode.Close,
                    PathNode.MoveTo(33.66f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(98.20914f, 132.0f, 100.0f, 130.20914f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 125.79086f, 98.20914f, 124.0f, 96.0f, 124.0f),
                    PathNode.LineTo(33.66f, 124.0f),
                    PathNode.LineTo(58.83f, 98.83f),
                    PathNode.CurveTo(60.392967f, 97.26704f, 60.392967f, 94.73296f, 58.83f, 93.17f),
                    PathNode.CurveTo(57.267033f, 91.60703f, 54.732967f, 91.60703f, 53.17f, 93.17f),
                    PathNode.LineTo(21.17f, 125.17f),
                    PathNode.CurveTo(20.418892f, 125.92027f, 19.996853f, 126.93836f, 19.996853f, 128.0f),
                    PathNode.CurveTo(19.996853f, 129.06163f, 20.418892f, 130.07973f, 21.17f, 130.83f),
                    PathNode.LineTo(53.17f, 162.83f),
                    PathNode.CurveTo(54.732967f, 164.39296f, 57.267033f, 164.39296f, 58.83f, 162.83f),
                    PathNode.CurveTo(60.392967f, 161.26703f, 60.392967f, 158.73297f, 58.83f, 157.17f),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
