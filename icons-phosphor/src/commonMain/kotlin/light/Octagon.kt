package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorLightIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.9f, 81.65f),
                    PathNode.LineTo(174.35f, 30.1f),
                    PathNode.CurveTo(171.7293f, 27.467054f, 168.16489f, 25.990885f, 164.45f, 26.0f),
                    PathNode.LineTo(91.55f, 26.0f),
                    PathNode.CurveTo(87.83511f, 25.990885f, 84.2707f, 27.467054f, 81.65f, 30.1f),
                    PathNode.LineTo(30.1f, 81.65f),
                    PathNode.CurveTo(27.467054f, 84.2707f, 25.990885f, 87.83511f, 26.0f, 91.55f),
                    PathNode.LineTo(26.0f, 164.45f),
                    PathNode.CurveTo(25.990885f, 168.16489f, 27.467054f, 171.7293f, 30.1f, 174.35f),
                    PathNode.LineTo(81.65f, 225.9f),
                    PathNode.CurveTo(84.2707f, 228.53294f, 87.83511f, 230.00911f, 91.55f, 230.0f),
                    PathNode.LineTo(164.45f, 230.0f),
                    PathNode.CurveTo(168.16489f, 230.00911f, 171.7293f, 228.53294f, 174.35f, 225.9f),
                    PathNode.LineTo(225.9f, 174.35f),
                    PathNode.CurveTo(228.53294f, 171.7293f, 230.00911f, 168.16489f, 230.0f, 164.45f),
                    PathNode.LineTo(230.0f, 91.55f),
                    PathNode.CurveTo(230.00911f, 87.83511f, 228.53294f, 84.2707f, 225.9f, 81.65f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 164.45f),
                    PathNode.CurveTo(218.00043f, 164.98305f, 217.78806f, 165.4942f, 217.41f, 165.87f),
                    PathNode.LineTo(165.86f, 217.41f),
                    PathNode.CurveTo(165.48665f, 217.78558f, 164.97958f, 217.99777f, 164.45f, 218.0f),
                    PathNode.LineTo(91.55f, 218.0f),
                    PathNode.CurveTo(91.01695f, 218.00043f, 90.5058f, 217.78806f, 90.13f, 217.41f),
                    PathNode.LineTo(38.59f, 165.87f),
                    PathNode.CurveTo(38.21196f, 165.4942f, 37.999577f, 164.98305f, 38.0f, 164.45f),
                    PathNode.LineTo(38.0f, 91.55f),
                    PathNode.CurveTo(37.999577f, 91.01695f, 38.21196f, 90.5058f, 38.59f, 90.13f),
                    PathNode.LineTo(90.14f, 38.59f),
                    PathNode.CurveTo(90.51335f, 38.214413f, 91.020424f, 38.00223f, 91.55f, 38.0f),
                    PathNode.LineTo(164.45f, 38.0f),
                    PathNode.CurveTo(164.98305f, 37.999577f, 165.4942f, 38.21196f, 165.87f, 38.59f),
                    PathNode.LineTo(217.41f, 90.14f),
                    PathNode.CurveTo(217.78558f, 90.51335f, 217.99777f, 91.020424f, 218.0f, 91.55f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _octagon!!
    }

private var _octagon: ImageVector? = null
