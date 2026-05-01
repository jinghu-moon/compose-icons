package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorThinIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 96.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.CurveTo(162.20914f, 44.0f, 164.0f, 45.79086f, 164.0f, 48.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.CurveTo(210.20914f, 92.0f, 212.0f, 93.79086f, 212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 98.20914f, 210.20914f, 100.0f, 208.0f, 100.0f),
                    PathNode.LineTo(160.0f, 100.0f),
                    PathNode.CurveTo(157.79086f, 100.0f, 156.0f, 98.20914f, 156.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 156.0f),
                    PathNode.LineTo(48.0f, 156.0f),
                    PathNode.CurveTo(45.79086f, 156.0f, 44.0f, 157.79086f, 44.0f, 160.0f),
                    PathNode.CurveTo(44.0f, 162.20914f, 45.79086f, 164.0f, 48.0f, 164.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 210.20914f, 93.79086f, 212.0f, 96.0f, 212.0f),
                    PathNode.CurveTo(98.20914f, 212.0f, 100.0f, 210.20914f, 100.0f, 208.0f),
                    PathNode.LineTo(100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 157.79086f, 98.20914f, 156.0f, 96.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(157.79086f, 156.0f, 156.0f, 157.79086f, 156.0f, 160.0f),
                    PathNode.LineTo(156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 210.20914f, 157.79086f, 212.0f, 160.0f, 212.0f),
                    PathNode.CurveTo(162.20914f, 212.0f, 164.0f, 210.20914f, 164.0f, 208.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.CurveTo(210.20914f, 164.0f, 212.0f, 162.20914f, 212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 157.79086f, 210.20914f, 156.0f, 208.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 44.0f),
                    PathNode.CurveTo(93.79086f, 44.0f, 92.0f, 45.79086f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(45.79086f, 92.0f, 44.0f, 93.79086f, 44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 98.20914f, 45.79086f, 100.0f, 48.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(98.20914f, 100.0f, 100.0f, 98.20914f, 100.0f, 96.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 45.79086f, 98.20914f, 44.0f, 96.0f, 44.0f),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
