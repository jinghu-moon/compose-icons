package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorLightIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0f, 139.3137f, 131.3137f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 91.55f),
                    PathNode.LineTo(230.0f, 164.45f),
                    PathNode.CurveTo(230.00911f, 168.16489f, 228.53294f, 171.7293f, 225.9f, 174.35f),
                    PathNode.LineTo(174.35f, 225.9f),
                    PathNode.CurveTo(171.7293f, 228.53294f, 168.16489f, 230.00911f, 164.45f, 230.0f),
                    PathNode.LineTo(91.55f, 230.0f),
                    PathNode.CurveTo(87.83511f, 230.00911f, 84.2707f, 228.53294f, 81.65f, 225.9f),
                    PathNode.LineTo(30.1f, 174.35f),
                    PathNode.CurveTo(27.467054f, 171.7293f, 25.990885f, 168.16489f, 26.0f, 164.45f),
                    PathNode.LineTo(26.0f, 91.55f),
                    PathNode.CurveTo(25.990885f, 87.83511f, 27.467054f, 84.2707f, 30.1f, 81.65f),
                    PathNode.LineTo(81.65f, 30.1f),
                    PathNode.CurveTo(84.2707f, 27.467054f, 87.83511f, 25.990885f, 91.55f, 26.0f),
                    PathNode.LineTo(164.45f, 26.0f),
                    PathNode.CurveTo(168.16489f, 25.990885f, 171.7293f, 27.467054f, 174.35f, 30.1f),
                    PathNode.LineTo(225.9f, 81.65f),
                    PathNode.CurveTo(228.53294f, 84.2707f, 230.00911f, 87.83511f, 230.0f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 91.55f),
                    PathNode.CurveTo(218.00043f, 91.01695f, 217.78806f, 90.5058f, 217.41f, 90.13f),
                    PathNode.LineTo(165.87f, 38.59f),
                    PathNode.CurveTo(165.4942f, 38.21196f, 164.98305f, 37.999577f, 164.45f, 38.0f),
                    PathNode.LineTo(91.55f, 38.0f),
                    PathNode.CurveTo(91.020424f, 38.00223f, 90.51335f, 38.214413f, 90.14f, 38.59f),
                    PathNode.LineTo(38.58f, 90.13f),
                    PathNode.CurveTo(38.205627f, 90.50744f, 37.996925f, 91.018394f, 38.0f, 91.55f),
                    PathNode.LineTo(38.0f, 164.45f),
                    PathNode.CurveTo(37.999577f, 164.98305f, 38.21196f, 165.4942f, 38.59f, 165.87f),
                    PathNode.LineTo(90.13f, 217.41f),
                    PathNode.CurveTo(90.5058f, 217.78806f, 91.01695f, 218.00043f, 91.55f, 218.0f),
                    PathNode.LineTo(164.45f, 218.0f),
                    PathNode.CurveTo(164.97958f, 217.99777f, 165.48665f, 217.78558f, 165.86f, 217.41f),
                    PathNode.LineTo(217.42f, 165.87f),
                    PathNode.CurveTo(217.79437f, 165.49257f, 218.00307f, 164.98161f, 218.0f, 164.45f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 162.0f),
                    PathNode.CurveTo(122.47715f, 162.0f, 118.0f, 166.47716f, 118.0f, 172.0f),
                    PathNode.CurveTo(118.0f, 177.52284f, 122.47715f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(133.52284f, 182.0f, 138.0f, 177.52284f, 138.0f, 172.0f),
                    PathNode.CurveTo(138.0f, 166.47716f, 133.52284f, 162.0f, 128.0f, 162.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
