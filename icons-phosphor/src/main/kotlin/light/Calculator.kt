package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorLightIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 58.0f),
                    PathNode.LineTo(80.0f, 58.0f),
                    PathNode.CurveTo(76.686295f, 58.0f, 74.0f, 60.68629f, 74.0f, 64.0f),
                    PathNode.LineTo(74.0f, 112.0f),
                    PathNode.CurveTo(74.0f, 115.313705f, 76.686295f, 118.0f, 80.0f, 118.0f),
                    PathNode.LineTo(176.0f, 118.0f),
                    PathNode.CurveTo(179.3137f, 118.0f, 182.0f, 115.313705f, 182.0f, 112.0f),
                    PathNode.LineTo(182.0f, 64.0f),
                    PathNode.CurveTo(182.0f, 60.68629f, 179.3137f, 58.0f, 176.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 106.0f),
                    PathNode.LineTo(86.0f, 106.0f),
                    PathNode.LineTo(86.0f, 70.0f),
                    PathNode.LineTo(170.0f, 70.0f),
                    PathNode.Close,
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
                    PathNode.MoveTo(98.0f, 148.0f),
                    PathNode.CurveTo(98.0f, 153.52284f, 93.52285f, 158.0f, 88.0f, 158.0f),
                    PathNode.CurveTo(82.47715f, 158.0f, 78.0f, 153.52284f, 78.0f, 148.0f),
                    PathNode.CurveTo(78.0f, 142.47716f, 82.47715f, 138.0f, 88.0f, 138.0f),
                    PathNode.CurveTo(93.52285f, 138.0f, 98.0f, 142.47716f, 98.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 148.0f),
                    PathNode.CurveTo(138.0f, 153.52284f, 133.52284f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(122.47715f, 158.0f, 118.0f, 153.52284f, 118.0f, 148.0f),
                    PathNode.CurveTo(118.0f, 142.47716f, 122.47715f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(133.52284f, 138.0f, 138.0f, 142.47716f, 138.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 148.0f),
                    PathNode.CurveTo(178.0f, 153.52284f, 173.52284f, 158.0f, 168.0f, 158.0f),
                    PathNode.CurveTo(162.47716f, 158.0f, 158.0f, 153.52284f, 158.0f, 148.0f),
                    PathNode.CurveTo(158.0f, 142.47716f, 162.47716f, 138.0f, 168.0f, 138.0f),
                    PathNode.CurveTo(173.52284f, 138.0f, 178.0f, 142.47716f, 178.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 188.0f),
                    PathNode.CurveTo(98.0f, 193.52284f, 93.52285f, 198.0f, 88.0f, 198.0f),
                    PathNode.CurveTo(82.47715f, 198.0f, 78.0f, 193.52284f, 78.0f, 188.0f),
                    PathNode.CurveTo(78.0f, 182.47716f, 82.47715f, 178.0f, 88.0f, 178.0f),
                    PathNode.CurveTo(93.52285f, 178.0f, 98.0f, 182.47716f, 98.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 188.0f),
                    PathNode.CurveTo(138.0f, 193.52284f, 133.52284f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(122.47715f, 198.0f, 118.0f, 193.52284f, 118.0f, 188.0f),
                    PathNode.CurveTo(118.0f, 182.47716f, 122.47715f, 178.0f, 128.0f, 178.0f),
                    PathNode.CurveTo(133.52284f, 178.0f, 138.0f, 182.47716f, 138.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 188.0f),
                    PathNode.CurveTo(178.0f, 193.52284f, 173.52284f, 198.0f, 168.0f, 198.0f),
                    PathNode.CurveTo(162.47716f, 198.0f, 158.0f, 193.52284f, 158.0f, 188.0f),
                    PathNode.CurveTo(158.0f, 182.47716f, 162.47716f, 178.0f, 168.0f, 178.0f),
                    PathNode.CurveTo(173.52284f, 178.0f, 178.0f, 182.47716f, 178.0f, 188.0f),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
