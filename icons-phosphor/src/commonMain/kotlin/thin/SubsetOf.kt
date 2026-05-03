package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorThinIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 205.79086f, 45.79086f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(200.0f, 204.0f),
                    PathNode.CurveTo(202.20914f, 204.0f, 204.0f, 205.79086f, 204.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 164.0f),
                    PathNode.LineTo(104.0f, 164.0f),
                    PathNode.CurveTo(75.2812f, 164.0f, 52.0f, 140.71881f, 52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 83.2812f, 75.2812f, 60.0f, 104.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(202.20914f, 60.0f, 204.0f, 58.20914f, 204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 53.79086f, 202.20914f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(104.0f, 52.0f),
                    PathNode.CurveTo(70.862915f, 52.0f, 44.0f, 78.862915f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 145.13708f, 70.862915f, 172.0f, 104.0f, 172.0f),
                    PathNode.LineTo(200.0f, 172.0f),
                    PathNode.CurveTo(202.20914f, 172.0f, 204.0f, 170.20914f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 165.79086f, 202.20914f, 164.0f, 200.0f, 164.0f),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
