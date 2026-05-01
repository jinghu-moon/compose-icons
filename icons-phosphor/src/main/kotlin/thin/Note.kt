package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorThinIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(92.0f, 93.79086f, 93.79086f, 92.0f, 96.0f, 92.0f),
                    PathNode.LineTo(160.0f, 92.0f),
                    PathNode.CurveTo(162.20914f, 92.0f, 164.0f, 93.79086f, 164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 98.20914f, 162.20914f, 100.0f, 160.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(93.79086f, 100.0f, 92.0f, 98.20914f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(162.20914f, 132.0f, 164.0f, 130.20914f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 125.79086f, 162.20914f, 124.0f, 160.0f, 124.0f),
                    PathNode.LineTo(96.0f, 124.0f),
                    PathNode.CurveTo(93.79086f, 124.0f, 92.0f, 125.79086f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 130.20914f, 93.79086f, 132.0f, 96.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.CurveTo(93.79086f, 156.0f, 92.0f, 157.79086f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 162.20914f, 93.79086f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.CurveTo(130.20914f, 164.0f, 132.0f, 162.20914f, 132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 157.79086f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 156.69f),
                    PathNode.CurveTo(220.00829f, 159.87373f, 218.74046f, 162.92801f, 216.48f, 165.17f),
                    PathNode.LineTo(165.17f, 216.49f),
                    PathNode.CurveTo(162.92447f, 218.74396f, 159.87163f, 220.00758f, 156.69f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 41.37258f, 41.37258f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 212.0f),
                    PathNode.LineTo(156.0f, 212.0f),
                    PathNode.LineTo(156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 157.79086f, 157.79086f, 156.0f, 160.0f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(45.79086f, 44.0f, 44.0f, 45.79086f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.35f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 206.35f),
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
        return _note!!
    }

private var _note: ImageVector? = null
