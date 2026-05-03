package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorThinIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.LineTo(236.0f, 152.0f),
                    PathNode.CurveTo(236.0f, 154.20914f, 234.20914f, 156.0f, 232.0f, 156.0f),
                    PathNode.CurveTo(229.79086f, 156.0f, 228.0f, 154.20914f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 89.66f),
                    PathNode.LineTo(122.83f, 194.83f),
                    PathNode.CurveTo(122.07973f, 195.58112f, 121.06164f, 196.00314f, 120.0f, 196.00314f),
                    PathNode.CurveTo(118.93836f, 196.00314f, 117.92027f, 195.58112f, 117.17f, 194.83f),
                    PathNode.LineTo(21.17f, 98.83f),
                    PathNode.CurveTo(19.607035f, 97.26704f, 19.607035f, 94.73296f, 21.17f, 93.17f),
                    PathNode.CurveTo(22.732965f, 91.60703f, 25.267035f, 91.60703f, 26.83f, 93.17f),
                    PathNode.LineTo(120.0f, 186.34f),
                    PathNode.LineTo(222.34f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(157.79086f, 84.0f, 156.0f, 82.20914f, 156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 77.79086f, 157.79086f, 76.0f, 160.0f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(234.20914f, 76.0f, 236.0f, 77.79086f, 236.0f, 80.0f),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
