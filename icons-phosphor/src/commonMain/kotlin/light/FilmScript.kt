package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorLightIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 40.0f),
                    PathNode.CurveTo(214.0f, 32.268013f, 207.73198f, 26.0f, 200.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(200.0f, 38.0f),
                    PathNode.CurveTo(201.10457f, 38.0f, 202.0f, 38.89543f, 202.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 80.0f),
                    PathNode.CurveTo(94.0f, 85.52285f, 89.52285f, 90.0f, 84.0f, 90.0f),
                    PathNode.CurveTo(78.47715f, 90.0f, 74.0f, 85.52285f, 74.0f, 80.0f),
                    PathNode.CurveTo(74.0f, 74.47715f, 78.47715f, 70.0f, 84.0f, 70.0f),
                    PathNode.CurveTo(89.52285f, 70.0f, 94.0f, 74.47715f, 94.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 176.0f),
                    PathNode.CurveTo(94.0f, 181.52284f, 89.52285f, 186.0f, 84.0f, 186.0f),
                    PathNode.CurveTo(78.47715f, 186.0f, 74.0f, 181.52284f, 74.0f, 176.0f),
                    PathNode.CurveTo(74.0f, 170.47716f, 78.47715f, 166.0f, 84.0f, 166.0f),
                    PathNode.CurveTo(89.52285f, 166.0f, 94.0f, 170.47716f, 94.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 133.52284f, 89.52285f, 138.0f, 84.0f, 138.0f),
                    PathNode.CurveTo(78.47715f, 138.0f, 74.0f, 133.52284f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 122.47715f, 78.47715f, 118.0f, 84.0f, 118.0f),
                    PathNode.CurveTo(89.52285f, 118.0f, 94.0f, 122.47715f, 94.0f, 128.0f),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
