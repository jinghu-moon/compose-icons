package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorThinIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.83f, 82.83f),
                    PathNode.LineTo(170.83f, 130.83f),
                    PathNode.CurveTo(169.26703f, 132.39296f, 166.73297f, 132.39296f, 165.17f, 130.83f),
                    PathNode.CurveTo(163.60704f, 129.26703f, 163.60704f, 126.73296f, 165.17f, 125.17f),
                    PathNode.LineTo(206.34f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 226.20914f, 74.20914f, 228.0f, 72.0f, 228.0f),
                    PathNode.CurveTo(69.79086f, 228.0f, 68.0f, 226.20914f, 68.0f, 224.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 77.79086f, 69.79086f, 76.0f, 72.0f, 76.0f),
                    PathNode.LineTo(206.34f, 76.0f),
                    PathNode.LineTo(165.17f, 34.83f),
                    PathNode.CurveTo(163.60704f, 33.267033f, 163.60704f, 30.732965f, 165.17f, 29.17f),
                    PathNode.CurveTo(166.73297f, 27.607035f, 169.26703f, 27.607035f, 170.83f, 29.17f),
                    PathNode.LineTo(218.83f, 77.17f),
                    PathNode.CurveTo(219.58112f, 77.92027f, 220.00314f, 78.93836f, 220.00314f, 80.0f),
                    PathNode.CurveTo(220.00314f, 81.06164f, 219.58112f, 82.07973f, 218.83f, 82.83f),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
