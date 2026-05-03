package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorThinIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(153.37259f, 36.0f, 148.0f, 41.37258f, 148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(206.62741f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 41.37258f, 206.62741f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(157.79086f, 212.0f, 156.0f, 210.20914f, 156.0f, 208.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 214.62741f, 49.37258f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(96.0f, 220.0f),
                    PathNode.CurveTo(102.62742f, 220.0f, 108.0f, 214.62741f, 108.0f, 208.0f),
                    PathNode.LineTo(108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 41.37258f, 102.62742f, 36.0f, 96.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 210.20914f, 98.20914f, 212.0f, 96.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 45.79086f, 53.79086f, 44.0f, 56.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(98.20914f, 44.0f, 100.0f, 45.79086f, 100.0f, 48.0f),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
