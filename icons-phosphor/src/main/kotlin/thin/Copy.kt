package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorThinIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(85.79086f, 36.0f, 84.0f, 37.79086f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(40.0f, 84.0f),
                    PathNode.CurveTo(37.79086f, 84.0f, 36.0f, 85.79086f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(170.20914f, 220.0f, 172.0f, 218.20914f, 172.0f, 216.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(218.20914f, 172.0f, 220.0f, 170.20914f, 220.0f, 168.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 37.79086f, 218.20914f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 164.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 85.79086f, 170.20914f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(92.0f, 44.0f),
                    PathNode.LineTo(212.0f, 44.0f),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
