package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorThinIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 202.20914f, 210.20914f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.CurveTo(52.0f, 197.79086f, 53.79086f, 196.0f, 56.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(210.20914f, 196.0f, 212.0f, 197.79086f, 212.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 156.0f),
                    PathNode.LineTo(56.0f, 156.0f),
                    PathNode.CurveTo(53.79086f, 156.0f, 52.0f, 157.79086f, 52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 162.20914f, 53.79086f, 164.0f, 56.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(185.13708f, 164.0f, 212.0f, 137.13708f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 70.862915f, 185.13708f, 44.0f, 152.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(53.79086f, 44.0f, 52.0f, 45.79086f, 52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 50.20914f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.CurveTo(180.71881f, 52.0f, 204.0f, 75.2812f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 132.71881f, 180.71881f, 156.0f, 152.0f, 156.0f),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
