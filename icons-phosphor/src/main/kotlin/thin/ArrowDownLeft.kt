package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorThinIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(194.83f, 66.83f),
                    PathNode.LineTo(73.66f, 188.0f),
                    PathNode.LineTo(168.0f, 188.0f),
                    PathNode.CurveTo(170.20914f, 188.0f, 172.0f, 189.79086f, 172.0f, 192.0f),
                    PathNode.CurveTo(172.0f, 194.20914f, 170.20914f, 196.0f, 168.0f, 196.0f),
                    PathNode.LineTo(64.0f, 196.0f),
                    PathNode.CurveTo(61.79086f, 196.0f, 60.0f, 194.20914f, 60.0f, 192.0f),
                    PathNode.LineTo(60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 85.79086f, 61.79086f, 84.0f, 64.0f, 84.0f),
                    PathNode.CurveTo(66.20914f, 84.0f, 68.0f, 85.79086f, 68.0f, 88.0f),
                    PathNode.LineTo(68.0f, 182.34f),
                    PathNode.LineTo(189.17f, 61.17f),
                    PathNode.CurveTo(190.73297f, 59.607033f, 193.26703f, 59.607033f, 194.83f, 61.17f),
                    PathNode.CurveTo(196.39296f, 62.732967f, 196.39296f, 65.26704f, 194.83f, 66.83f),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
