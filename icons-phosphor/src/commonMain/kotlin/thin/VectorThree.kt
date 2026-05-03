package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorThinIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 138.83f),
                    PathNode.LineTo(202.83f, 170.83f),
                    PathNode.CurveTo(201.26703f, 172.39296f, 198.73297f, 172.39296f, 197.17f, 170.83f),
                    PathNode.CurveTo(195.60704f, 169.26703f, 195.60704f, 166.73297f, 197.17f, 165.17f),
                    PathNode.LineTo(222.34f, 140.0f),
                    PathNode.LineTo(121.66f, 140.0f),
                    PathNode.LineTo(57.66f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(98.20914f, 204.0f, 100.0f, 205.79086f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 210.20914f, 98.20914f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.CurveTo(44.0f, 157.79086f, 45.79086f, 156.0f, 48.0f, 156.0f),
                    PathNode.CurveTo(50.20914f, 156.0f, 52.0f, 157.79086f, 52.0f, 160.0f),
                    PathNode.LineTo(52.0f, 198.34f),
                    PathNode.LineTo(116.0f, 134.34f),
                    PathNode.LineTo(116.0f, 33.66f),
                    PathNode.LineTo(90.83f, 58.83f),
                    PathNode.CurveTo(89.26704f, 60.392967f, 86.73296f, 60.392967f, 85.17f, 58.83f),
                    PathNode.CurveTo(83.60703f, 57.267033f, 83.60703f, 54.732967f, 85.17f, 53.17f),
                    PathNode.LineTo(117.17f, 21.17f),
                    PathNode.CurveTo(117.92027f, 20.418892f, 118.93836f, 19.996853f, 120.0f, 19.996853f),
                    PathNode.CurveTo(121.06164f, 19.996853f, 122.07973f, 20.418892f, 122.83f, 21.17f),
                    PathNode.LineTo(154.83f, 53.17f),
                    PathNode.CurveTo(156.39296f, 54.732967f, 156.39296f, 57.267033f, 154.83f, 58.83f),
                    PathNode.CurveTo(153.26703f, 60.392967f, 150.73297f, 60.392967f, 149.17f, 58.83f),
                    PathNode.LineTo(124.0f, 33.66f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(222.34f, 132.0f),
                    PathNode.LineTo(197.17f, 106.83f),
                    PathNode.CurveTo(195.60704f, 105.26704f, 195.60704f, 102.73296f, 197.17f, 101.17f),
                    PathNode.CurveTo(198.73297f, 99.60703f, 201.26703f, 99.60703f, 202.83f, 101.17f),
                    PathNode.LineTo(234.83f, 133.17f),
                    PathNode.CurveTo(235.58112f, 133.92027f, 236.00314f, 134.93837f, 236.00314f, 136.0f),
                    PathNode.CurveTo(236.00314f, 137.06163f, 235.58112f, 138.07973f, 234.83f, 138.83f),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
