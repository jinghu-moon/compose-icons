package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorThinIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 98.83f),
                    PathNode.LineTo(138.83f, 194.83f),
                    PathNode.CurveTo(138.07973f, 195.58112f, 137.06163f, 196.00314f, 136.0f, 196.00314f),
                    PathNode.CurveTo(134.93837f, 196.00314f, 133.92027f, 195.58112f, 133.17f, 194.83f),
                    PathNode.LineTo(28.0f, 89.66f),
                    PathNode.LineTo(28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 154.20914f, 26.209139f, 156.0f, 24.0f, 156.0f),
                    PathNode.CurveTo(21.790861f, 156.0f, 20.0f, 154.20914f, 20.0f, 152.0f),
                    PathNode.LineTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 77.79086f, 21.790861f, 76.0f, 24.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(98.20914f, 76.0f, 100.0f, 77.79086f, 100.0f, 80.0f),
                    PathNode.CurveTo(100.0f, 82.20914f, 98.20914f, 84.0f, 96.0f, 84.0f),
                    PathNode.LineTo(33.66f, 84.0f),
                    PathNode.LineTo(136.0f, 186.34f),
                    PathNode.LineTo(229.17f, 93.17f),
                    PathNode.CurveTo(230.73297f, 91.60703f, 233.26703f, 91.60703f, 234.83f, 93.17f),
                    PathNode.CurveTo(236.39296f, 94.73296f, 236.39296f, 97.26704f, 234.83f, 98.83f),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
