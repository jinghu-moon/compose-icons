package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorThinIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 88.0f),
                    PathNode.LineTo(196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 194.20914f, 194.20914f, 196.0f, 192.0f, 196.0f),
                    PathNode.LineTo(88.0f, 196.0f),
                    PathNode.CurveTo(85.79086f, 196.0f, 84.0f, 194.20914f, 84.0f, 192.0f),
                    PathNode.CurveTo(84.0f, 189.79086f, 85.79086f, 188.0f, 88.0f, 188.0f),
                    PathNode.LineTo(182.34f, 188.0f),
                    PathNode.LineTo(61.17f, 66.83f),
                    PathNode.CurveTo(59.607033f, 65.26704f, 59.607033f, 62.732967f, 61.17f, 61.17f),
                    PathNode.CurveTo(62.732967f, 59.607033f, 65.26704f, 59.607033f, 66.83f, 61.17f),
                    PathNode.LineTo(188.0f, 182.34f),
                    PathNode.LineTo(188.0f, 88.0f),
                    PathNode.CurveTo(188.0f, 85.79086f, 189.79086f, 84.0f, 192.0f, 84.0f),
                    PathNode.CurveTo(194.20914f, 84.0f, 196.0f, 85.79086f, 196.0f, 88.0f),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
