package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorThinIcon(
            name = "XSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 98.83f),
                    PathNode.LineTo(133.66f, 128.0f),
                    PathNode.LineTo(162.83f, 157.17f),
                    PathNode.CurveTo(164.39296f, 158.73297f, 164.39296f, 161.26703f, 162.83f, 162.83f),
                    PathNode.CurveTo(161.26703f, 164.39296f, 158.73297f, 164.39296f, 157.17f, 162.83f),
                    PathNode.LineTo(128.0f, 133.66f),
                    PathNode.LineTo(98.83f, 162.83f),
                    PathNode.CurveTo(97.26704f, 164.39296f, 94.73296f, 164.39296f, 93.17f, 162.83f),
                    PathNode.CurveTo(91.60703f, 161.26703f, 91.60703f, 158.73297f, 93.17f, 157.17f),
                    PathNode.LineTo(122.34f, 128.0f),
                    PathNode.LineTo(93.17f, 98.83f),
                    PathNode.CurveTo(91.60703f, 97.26704f, 91.60703f, 94.73296f, 93.17f, 93.17f),
                    PathNode.CurveTo(94.73296f, 91.60703f, 97.26704f, 91.60703f, 98.83f, 93.17f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(157.17f, 93.17f),
                    PathNode.CurveTo(158.73297f, 91.60703f, 161.26703f, 91.60703f, 162.83f, 93.17f),
                    PathNode.CurveTo(164.39296f, 94.73296f, 164.39296f, 97.26704f, 162.83f, 98.83f),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null
