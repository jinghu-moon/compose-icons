package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorThinIcon(
            name = "Elevator",
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
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 101.79086f, 186.20914f, 100.0f, 184.0f, 100.0f),
                    PathNode.LineTo(72.0f, 100.0f),
                    PathNode.CurveTo(69.79086f, 100.0f, 68.0f, 101.79086f, 68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 74.20914f, 146.20914f, 76.0f, 144.0f, 76.0f),
                    PathNode.LineTo(112.0f, 76.0f),
                    PathNode.CurveTo(109.79086f, 76.0f, 108.0f, 74.20914f, 108.0f, 72.0f),
                    PathNode.CurveTo(108.0f, 69.79086f, 109.79086f, 68.0f, 112.0f, 68.0f),
                    PathNode.LineTo(144.0f, 68.0f),
                    PathNode.CurveTo(146.20914f, 68.0f, 148.0f, 69.79086f, 148.0f, 72.0f),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
