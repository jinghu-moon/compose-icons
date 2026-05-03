package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorThinIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(62.862915f, 44.0f, 36.0f, 70.862915f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 137.13708f, 62.862915f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 210.20914f, 141.79086f, 212.0f, 144.0f, 212.0f),
                    PathNode.CurveTo(146.20914f, 212.0f, 148.0f, 210.20914f, 148.0f, 208.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 181.79086f, 212.0f, 184.0f, 212.0f),
                    PathNode.CurveTo(186.20914f, 212.0f, 188.0f, 210.20914f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(210.20914f, 52.0f, 212.0f, 50.20914f, 212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 45.79086f, 210.20914f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.CurveTo(67.2812f, 156.0f, 44.0f, 132.71881f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 75.2812f, 67.2812f, 52.0f, 96.0f, 52.0f),
                    PathNode.LineTo(140.0f, 52.0f),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
