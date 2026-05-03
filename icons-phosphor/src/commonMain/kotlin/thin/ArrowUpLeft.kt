package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorThinIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(194.83f, 194.83f),
                    PathNode.CurveTo(194.07973f, 195.58112f, 193.06163f, 196.00314f, 192.0f, 196.00314f),
                    PathNode.CurveTo(190.93837f, 196.00314f, 189.92027f, 195.58112f, 189.17f, 194.83f),
                    PathNode.LineTo(68.0f, 73.66f),
                    PathNode.LineTo(68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 170.20914f, 66.20914f, 172.0f, 64.0f, 172.0f),
                    PathNode.CurveTo(61.79086f, 172.0f, 60.0f, 170.20914f, 60.0f, 168.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 61.79086f, 61.79086f, 60.0f, 64.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(170.20914f, 60.0f, 172.0f, 61.79086f, 172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 66.20914f, 170.20914f, 68.0f, 168.0f, 68.0f),
                    PathNode.LineTo(73.66f, 68.0f),
                    PathNode.LineTo(194.83f, 189.17f),
                    PathNode.CurveTo(195.58112f, 189.92027f, 196.00314f, 190.93837f, 196.00314f, 192.0f),
                    PathNode.CurveTo(196.00314f, 193.06163f, 195.58112f, 194.07973f, 194.83f, 194.83f),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
