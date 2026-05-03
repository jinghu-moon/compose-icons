package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorThinIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 74.20914f, 234.20914f, 76.0f, 232.0f, 76.0f),
                    PathNode.LineTo(92.0f, 76.0f),
                    PathNode.LineTo(92.0f, 206.34f),
                    PathNode.LineTo(133.17f, 165.17f),
                    PathNode.CurveTo(134.73297f, 163.60704f, 137.26703f, 163.60704f, 138.83f, 165.17f),
                    PathNode.CurveTo(140.39296f, 166.73297f, 140.39296f, 169.26703f, 138.83f, 170.83f),
                    PathNode.LineTo(90.83f, 218.83f),
                    PathNode.CurveTo(90.07973f, 219.58112f, 89.06164f, 220.00314f, 88.0f, 220.00314f),
                    PathNode.CurveTo(86.93836f, 220.00314f, 85.92027f, 219.58112f, 85.17f, 218.83f),
                    PathNode.LineTo(37.17f, 170.83f),
                    PathNode.CurveTo(35.607033f, 169.26703f, 35.607033f, 166.73297f, 37.17f, 165.17f),
                    PathNode.CurveTo(38.732967f, 163.60704f, 41.267033f, 163.60704f, 42.83f, 165.17f),
                    PathNode.LineTo(84.0f, 206.34f),
                    PathNode.LineTo(84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 69.79086f, 85.79086f, 68.0f, 88.0f, 68.0f),
                    PathNode.LineTo(232.0f, 68.0f),
                    PathNode.CurveTo(234.20914f, 68.0f, 236.0f, 69.79086f, 236.0f, 72.0f),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
