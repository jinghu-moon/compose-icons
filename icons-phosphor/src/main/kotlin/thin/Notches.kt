package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorThinIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 130.83f),
                    PathNode.LineTo(130.83f, 210.83f),
                    PathNode.CurveTo(129.26703f, 212.39296f, 126.73296f, 212.39296f, 125.17f, 210.83f),
                    PathNode.CurveTo(123.60703f, 209.26703f, 123.60703f, 206.73297f, 125.17f, 205.17f),
                    PathNode.LineTo(205.17f, 125.17f),
                    PathNode.CurveTo(206.73297f, 123.60703f, 209.26703f, 123.60703f, 210.83f, 125.17f),
                    PathNode.CurveTo(212.39296f, 126.73296f, 212.39296f, 129.26703f, 210.83f, 130.83f),
                    PathNode.Close,
                    PathNode.MoveTo(194.83f, 37.17f),
                    PathNode.CurveTo(194.07973f, 36.41889f, 193.06163f, 35.996853f, 192.0f, 35.996853f),
                    PathNode.CurveTo(190.93837f, 35.996853f, 189.92027f, 36.41889f, 189.17f, 37.17f),
                    PathNode.LineTo(37.17f, 189.17f),
                    PathNode.CurveTo(35.607033f, 190.73297f, 35.607033f, 193.26703f, 37.17f, 194.83f),
                    PathNode.CurveTo(38.732967f, 196.39296f, 41.267033f, 196.39296f, 42.83f, 194.83f),
                    PathNode.LineTo(194.83f, 42.83f),
                    PathNode.CurveTo(195.58112f, 42.079727f, 196.00314f, 41.061638f, 196.00314f, 40.0f),
                    PathNode.CurveTo(196.00314f, 38.938362f, 195.58112f, 37.920273f, 194.83f, 37.17f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
