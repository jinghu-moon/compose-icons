package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorThinIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 92.0f),
                    PathNode.CurveTo(214.62741f, 92.0f, 220.0f, 86.62742f, 220.0f, 80.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(169.37259f, 36.0f, 164.0f, 41.37258f, 164.0f, 48.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 41.37258f, 86.62742f, 36.0f, 80.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 86.62742f, 41.37258f, 92.0f, 48.0f, 92.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(48.0f, 164.0f),
                    PathNode.CurveTo(41.37258f, 164.0f, 36.0f, 169.37259f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(86.62742f, 220.0f, 92.0f, 214.62741f, 92.0f, 208.0f),
                    PathNode.LineTo(92.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 214.62741f, 169.37259f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 169.37259f, 214.62741f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(196.0f, 164.0f),
                    PathNode.LineTo(196.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 45.79086f, 173.79086f, 44.0f, 176.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 82.20914f, 210.20914f, 84.0f, 208.0f, 84.0f),
                    PathNode.LineTo(176.0f, 84.0f),
                    PathNode.CurveTo(173.79086f, 84.0f, 172.0f, 82.20914f, 172.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(80.0f, 44.0f),
                    PathNode.CurveTo(82.20914f, 44.0f, 84.0f, 45.79086f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 80.0f),
                    PathNode.CurveTo(84.0f, 82.20914f, 82.20914f, 84.0f, 80.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(45.79086f, 84.0f, 44.0f, 82.20914f, 44.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 210.20914f, 82.20914f, 212.0f, 80.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 173.79086f, 45.79086f, 172.0f, 48.0f, 172.0f),
                    PathNode.LineTo(80.0f, 172.0f),
                    PathNode.CurveTo(82.20914f, 172.0f, 84.0f, 173.79086f, 84.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(176.0f, 212.0f),
                    PathNode.CurveTo(173.79086f, 212.0f, 172.0f, 210.20914f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 176.0f),
                    PathNode.CurveTo(172.0f, 173.79086f, 173.79086f, 172.0f, 176.0f, 172.0f),
                    PathNode.LineTo(208.0f, 172.0f),
                    PathNode.CurveTo(210.20914f, 172.0f, 212.0f, 173.79086f, 212.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(169.37259f, 164.0f, 164.0f, 169.37259f, 164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 188.0f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(92.0f, 169.37259f, 86.62742f, 164.0f, 80.0f, 164.0f),
                    PathNode.LineTo(68.0f, 164.0f),
                    PathNode.LineTo(68.0f, 92.0f),
                    PathNode.LineTo(80.0f, 92.0f),
                    PathNode.CurveTo(86.62742f, 92.0f, 92.0f, 86.62742f, 92.0f, 80.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 86.62742f, 169.37259f, 92.0f, 176.0f, 92.0f),
                    PathNode.LineTo(188.0f, 92.0f),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
