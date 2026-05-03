package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorThinIcon(
            name = "Checkerboard",
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
                    PathNode.MoveTo(193.66f, 124.0f),
                    PathNode.LineTo(132.0f, 62.34f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(150.34f, 44.0f),
                    PathNode.LineTo(212.0f, 105.66f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 73.66f),
                    PathNode.LineTo(182.34f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 94.34f),
                    PathNode.LineTo(161.66f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 44.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.66f, 212.0f),
                    PathNode.LineTo(44.0f, 150.34f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.LineTo(62.34f, 132.0f),
                    PathNode.LineTo(124.0f, 193.66f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 182.34f),
                    PathNode.LineTo(73.66f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 161.66f),
                    PathNode.LineTo(94.34f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(212.0f, 132.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
