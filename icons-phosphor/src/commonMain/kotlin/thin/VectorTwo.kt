package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorThinIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 194.83f),
                    PathNode.LineTo(194.83f, 226.83f),
                    PathNode.CurveTo(193.26703f, 228.39296f, 190.73297f, 228.39296f, 189.17f, 226.83f),
                    PathNode.CurveTo(187.60704f, 225.26703f, 187.60704f, 222.73297f, 189.17f, 221.17f),
                    PathNode.LineTo(214.34f, 196.0f),
                    PathNode.LineTo(80.0f, 196.0f),
                    PathNode.CurveTo(77.79086f, 196.0f, 76.0f, 194.20914f, 76.0f, 192.0f),
                    PathNode.LineTo(76.0f, 49.66f),
                    PathNode.LineTo(50.83f, 74.83f),
                    PathNode.CurveTo(49.267033f, 76.39297f, 46.732967f, 76.39297f, 45.17f, 74.83f),
                    PathNode.CurveTo(43.607033f, 73.26704f, 43.607033f, 70.73296f, 45.17f, 69.17f),
                    PathNode.LineTo(77.17f, 37.17f),
                    PathNode.CurveTo(77.92027f, 36.41889f, 78.93836f, 35.996853f, 80.0f, 35.996853f),
                    PathNode.CurveTo(81.06164f, 35.996853f, 82.07973f, 36.41889f, 82.83f, 37.17f),
                    PathNode.LineTo(114.83f, 69.17f),
                    PathNode.CurveTo(116.39297f, 70.73296f, 116.39297f, 73.26704f, 114.83f, 74.83f),
                    PathNode.CurveTo(113.26704f, 76.39297f, 110.73296f, 76.39297f, 109.17f, 74.83f),
                    PathNode.LineTo(84.0f, 49.66f),
                    PathNode.LineTo(84.0f, 188.0f),
                    PathNode.LineTo(214.34f, 188.0f),
                    PathNode.LineTo(189.17f, 162.83f),
                    PathNode.CurveTo(187.60704f, 161.26703f, 187.60704f, 158.73297f, 189.17f, 157.17f),
                    PathNode.CurveTo(190.73297f, 155.60704f, 193.26703f, 155.60704f, 194.83f, 157.17f),
                    PathNode.LineTo(226.83f, 189.17f),
                    PathNode.CurveTo(227.58112f, 189.92027f, 228.00314f, 190.93837f, 228.00314f, 192.0f),
                    PathNode.CurveTo(228.00314f, 193.06163f, 227.58112f, 194.07973f, 226.83f, 194.83f),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
