package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorThinIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(94.62742f, 220.0f, 100.0f, 214.62741f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 182.62741f, 161.37259f, 188.0f, 168.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(214.62741f, 188.0f, 220.0f, 182.62741f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 210.20914f, 90.20914f, 212.0f, 88.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(92.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 116.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 148.0f),
                    PathNode.LineTo(100.0f, 148.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 178.20914f, 210.20914f, 180.0f, 208.0f, 180.0f),
                    PathNode.LineTo(168.0f, 180.0f),
                    PathNode.CurveTo(165.79086f, 180.0f, 164.0f, 178.20914f, 164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
