package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorLightIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(59.849735f, 26.0f, 50.0f, 35.849735f, 50.0f, 48.0f),
                    PathNode.LineTo(50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 223.73198f, 56.268013f, 230.0f, 64.0f, 230.0f),
                    PathNode.LineTo(176.0f, 230.0f),
                    PathNode.CurveTo(183.73198f, 230.0f, 190.0f, 223.73198f, 190.0f, 216.0f),
                    PathNode.LineTo(190.0f, 48.0f),
                    PathNode.CurveTo(190.0f, 42.477154f, 194.47716f, 38.0f, 200.0f, 38.0f),
                    PathNode.CurveTo(205.52284f, 38.0f, 210.0f, 42.477154f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 152.0f),
                    PathNode.CurveTo(210.0f, 155.3137f, 212.6863f, 158.0f, 216.0f, 158.0f),
                    PathNode.CurveTo(219.3137f, 158.0f, 222.0f, 155.3137f, 222.0f, 152.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 35.849735f, 212.15027f, 26.0f, 200.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 38.0f),
                    PathNode.LineTo(180.41f, 38.0f),
                    PathNode.CurveTo(178.82196f, 41.093918f, 177.99571f, 44.52233f, 178.0f, 48.0f),
                    PathNode.LineTo(178.0f, 186.0f),
                    PathNode.LineTo(62.0f, 186.0f),
                    PathNode.LineTo(62.0f, 48.0f),
                    PathNode.CurveTo(62.0f, 42.477154f, 66.47715f, 38.0f, 72.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 218.0f),
                    PathNode.LineTo(64.0f, 218.0f),
                    PathNode.CurveTo(62.89543f, 218.0f, 62.0f, 217.10457f, 62.0f, 216.0f),
                    PathNode.LineTo(62.0f, 198.0f),
                    PathNode.LineTo(178.0f, 198.0f),
                    PathNode.LineTo(178.0f, 216.0f),
                    PathNode.CurveTo(178.0f, 217.10457f, 177.10457f, 218.0f, 176.0f, 218.0f),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
