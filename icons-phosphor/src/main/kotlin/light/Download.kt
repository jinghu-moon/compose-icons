package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorLightIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 136.0f),
                    PathNode.LineTo(238.0f, 200.0f),
                    PathNode.CurveTo(238.0f, 207.73198f, 231.73198f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(24.268015f, 214.0f, 18.0f, 207.73198f, 18.0f, 200.0f),
                    PathNode.LineTo(18.0f, 136.0f),
                    PathNode.CurveTo(18.0f, 128.26802f, 24.268015f, 122.0f, 32.0f, 122.0f),
                    PathNode.LineTo(72.0f, 122.0f),
                    PathNode.CurveTo(75.313705f, 122.0f, 78.0f, 124.686295f, 78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 131.3137f, 75.313705f, 134.0f, 72.0f, 134.0f),
                    PathNode.LineTo(32.0f, 134.0f),
                    PathNode.CurveTo(30.89543f, 134.0f, 30.0f, 134.89543f, 30.0f, 136.0f),
                    PathNode.LineTo(30.0f, 200.0f),
                    PathNode.CurveTo(30.0f, 201.10457f, 30.89543f, 202.0f, 32.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(225.10457f, 202.0f, 226.0f, 201.10457f, 226.0f, 200.0f),
                    PathNode.LineTo(226.0f, 136.0f),
                    PathNode.CurveTo(226.0f, 134.89543f, 225.10457f, 134.0f, 224.0f, 134.0f),
                    PathNode.LineTo(184.0f, 134.0f),
                    PathNode.CurveTo(180.6863f, 134.0f, 178.0f, 131.3137f, 178.0f, 128.0f),
                    PathNode.CurveTo(178.0f, 124.686295f, 180.6863f, 122.0f, 184.0f, 122.0f),
                    PathNode.LineTo(224.0f, 122.0f),
                    PathNode.CurveTo(231.73198f, 122.0f, 238.0f, 128.26802f, 238.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(123.76f, 132.24f),
                    PathNode.CurveTo(126.10254f, 134.57962f, 129.89746f, 134.57962f, 132.24f, 132.24f),
                    PathNode.LineTo(180.24f, 84.24f),
                    PathNode.CurveTo(182.44287f, 81.87592f, 182.37787f, 78.191925f, 180.09297f, 75.90703f),
                    PathNode.CurveTo(177.80807f, 73.62213f, 174.12408f, 73.55713f, 171.76f, 75.76f),
                    PathNode.LineTo(134.0f, 113.51f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 113.51f),
                    PathNode.LineTo(84.24f, 75.76f),
                    PathNode.CurveTo(81.87592f, 73.55713f, 78.191925f, 73.62213f, 75.90703f, 75.90703f),
                    PathNode.CurveTo(73.62213f, 78.191925f, 73.55713f, 81.87592f, 75.76f, 84.24f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 168.0f),
                    PathNode.CurveTo(198.0f, 162.47716f, 193.52284f, 158.0f, 188.0f, 158.0f),
                    PathNode.CurveTo(182.47716f, 158.0f, 178.0f, 162.47716f, 178.0f, 168.0f),
                    PathNode.CurveTo(178.0f, 173.52284f, 182.47716f, 178.0f, 188.0f, 178.0f),
                    PathNode.CurveTo(193.52284f, 178.0f, 198.0f, 173.52284f, 198.0f, 168.0f),
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
        return _download!!
    }

private var _download: ImageVector? = null
