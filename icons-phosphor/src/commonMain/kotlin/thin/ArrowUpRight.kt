package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorThinIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 64.0f),
                    PathNode.LineTo(196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 170.20914f, 194.20914f, 172.0f, 192.0f, 172.0f),
                    PathNode.CurveTo(189.79086f, 172.0f, 188.0f, 170.20914f, 188.0f, 168.0f),
                    PathNode.LineTo(188.0f, 73.66f),
                    PathNode.LineTo(66.83f, 194.83f),
                    PathNode.CurveTo(65.26704f, 196.39296f, 62.732967f, 196.39296f, 61.17f, 194.83f),
                    PathNode.CurveTo(59.607033f, 193.26703f, 59.607033f, 190.73297f, 61.17f, 189.17f),
                    PathNode.LineTo(182.34f, 68.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.CurveTo(85.79086f, 68.0f, 84.0f, 66.20914f, 84.0f, 64.0f),
                    PathNode.CurveTo(84.0f, 61.79086f, 85.79086f, 60.0f, 88.0f, 60.0f),
                    PathNode.LineTo(192.0f, 60.0f),
                    PathNode.CurveTo(194.20914f, 60.0f, 196.0f, 61.79086f, 196.0f, 64.0f),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
