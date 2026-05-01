package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorLightIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 112.0f),
                    PathNode.CurveTo(182.0f, 115.313705f, 179.3137f, 118.0f, 176.0f, 118.0f),
                    PathNode.LineTo(96.0f, 118.0f),
                    PathNode.CurveTo(92.686295f, 118.0f, 90.0f, 115.313705f, 90.0f, 112.0f),
                    PathNode.CurveTo(90.0f, 108.686295f, 92.686295f, 106.0f, 96.0f, 106.0f),
                    PathNode.LineTo(176.0f, 106.0f),
                    PathNode.CurveTo(179.3137f, 106.0f, 182.0f, 108.686295f, 182.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 138.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(92.686295f, 138.0f, 90.0f, 140.6863f, 90.0f, 144.0f),
                    PathNode.CurveTo(90.0f, 147.3137f, 92.686295f, 150.0f, 96.0f, 150.0f),
                    PathNode.LineTo(176.0f, 150.0f),
                    PathNode.CurveTo(179.3137f, 150.0f, 182.0f, 147.3137f, 182.0f, 144.0f),
                    PathNode.CurveTo(182.0f, 140.6863f, 179.3137f, 138.0f, 176.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 64.0f),
                    PathNode.LineTo(230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 196.15027f, 220.15027f, 206.0f, 208.0f, 206.0f),
                    PathNode.LineTo(32.0f, 206.0f),
                    PathNode.CurveTo(19.884796f, 206.0001f, 10.049562f, 196.20511f, 10.0f, 184.09f),
                    PathNode.LineTo(10.0f, 88.0f),
                    PathNode.CurveTo(10.0f, 84.686295f, 12.686292f, 82.0f, 16.0f, 82.0f),
                    PathNode.CurveTo(19.31371f, 82.0f, 22.0f, 84.686295f, 22.0f, 88.0f),
                    PathNode.LineTo(22.0f, 184.0f),
                    PathNode.CurveTo(22.0f, 189.52284f, 26.477152f, 194.0f, 32.0f, 194.0f),
                    PathNode.CurveTo(37.522846f, 194.0f, 42.0f, 189.52284f, 42.0f, 184.0f),
                    PathNode.LineTo(42.0f, 64.0f),
                    PathNode.CurveTo(42.0f, 56.268013f, 48.268013f, 50.0f, 56.0f, 50.0f),
                    PathNode.LineTo(216.0f, 50.0f),
                    PathNode.CurveTo(223.73198f, 50.0f, 230.0f, 56.268013f, 230.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 62.89543f, 217.10457f, 62.0f, 216.0f, 62.0f),
                    PathNode.LineTo(56.0f, 62.0f),
                    PathNode.CurveTo(54.89543f, 62.0f, 54.0f, 62.89543f, 54.0f, 64.0f),
                    PathNode.LineTo(54.0f, 184.0f),
                    PathNode.CurveTo(54.004295f, 187.47768f, 53.178047f, 190.90608f, 51.59f, 194.0f),
                    PathNode.LineTo(208.0f, 194.0f),
                    PathNode.CurveTo(213.52284f, 194.0f, 218.0f, 189.52284f, 218.0f, 184.0f),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
