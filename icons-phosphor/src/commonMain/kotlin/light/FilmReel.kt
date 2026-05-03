package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorLightIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 218.0f),
                    PathNode.LineTo(176.0f, 218.0f),
                    PathNode.CurveTo(221.45308f, 193.75836f, 241.69688f, 139.43059f, 223.19048f, 91.35613f),
                    PathNode.CurveTo(204.68407f, 43.28168f, 153.2368f, 16.551607f, 103.26137f, 29.045465f),
                    PathNode.CurveTo(53.28594f, 41.53932f, 20.470142f, 89.33516f, 26.764229f, 140.46269f),
                    PathNode.CurveTo(33.058315f, 191.59023f, 76.4865f, 230.0f, 128.0f, 230.0f),
                    PathNode.LineTo(232.0f, 230.0f),
                    PathNode.CurveTo(235.3137f, 230.0f, 238.0f, 227.3137f, 238.0f, 224.0f),
                    PathNode.CurveTo(238.0f, 220.6863f, 235.3137f, 218.0f, 232.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 177.70563f, 177.70563f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(78.317215f, 217.94489f, 38.05511f, 177.68279f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 102.0f),
                    PathNode.CurveTo(140.15027f, 102.0f, 150.0f, 92.15026f, 150.0f, 80.0f),
                    PathNode.CurveTo(150.0f, 67.84974f, 140.15027f, 58.0f, 128.0f, 58.0f),
                    PathNode.CurveTo(115.84974f, 58.0f, 106.0f, 67.84974f, 106.0f, 80.0f),
                    PathNode.CurveTo(106.0f, 92.15026f, 115.84974f, 102.0f, 128.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 70.0f),
                    PathNode.CurveTo(133.52284f, 70.0f, 138.0f, 74.47715f, 138.0f, 80.0f),
                    PathNode.CurveTo(138.0f, 85.52285f, 133.52284f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(122.47715f, 90.0f, 118.0f, 85.52285f, 118.0f, 80.0f),
                    PathNode.CurveTo(118.0f, 74.47715f, 122.47715f, 70.0f, 128.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 163.84973f, 140.15027f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(115.84974f, 154.0f, 106.0f, 163.84973f, 106.0f, 176.0f),
                    PathNode.CurveTo(106.0f, 188.15027f, 115.84974f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(140.15027f, 198.0f, 150.0f, 188.15027f, 150.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 176.0f),
                    PathNode.CurveTo(118.0f, 170.47716f, 122.47715f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(133.52284f, 166.0f, 138.0f, 170.47716f, 138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 181.52284f, 133.52284f, 186.0f, 128.0f, 186.0f),
                    PathNode.CurveTo(122.47715f, 186.0f, 118.0f, 181.52284f, 118.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 150.0f),
                    PathNode.CurveTo(188.15027f, 150.0f, 198.0f, 140.15027f, 198.0f, 128.0f),
                    PathNode.CurveTo(198.0f, 115.84974f, 188.15027f, 106.0f, 176.0f, 106.0f),
                    PathNode.CurveTo(163.84973f, 106.0f, 154.0f, 115.84974f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 140.15027f, 163.84973f, 150.0f, 176.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 118.0f),
                    PathNode.CurveTo(181.52284f, 118.0f, 186.0f, 122.47715f, 186.0f, 128.0f),
                    PathNode.CurveTo(186.0f, 133.52284f, 181.52284f, 138.0f, 176.0f, 138.0f),
                    PathNode.CurveTo(170.47716f, 138.0f, 166.0f, 133.52284f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 122.47715f, 170.47716f, 118.0f, 176.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 106.0f),
                    PathNode.CurveTo(67.84974f, 106.0f, 58.0f, 115.84974f, 58.0f, 128.0f),
                    PathNode.CurveTo(58.0f, 140.15027f, 67.84974f, 150.0f, 80.0f, 150.0f),
                    PathNode.CurveTo(92.15026f, 150.0f, 102.0f, 140.15027f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 115.84974f, 92.15026f, 106.0f, 80.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 138.0f),
                    PathNode.CurveTo(74.47715f, 138.0f, 70.0f, 133.52284f, 70.0f, 128.0f),
                    PathNode.CurveTo(70.0f, 122.47715f, 74.47715f, 118.0f, 80.0f, 118.0f),
                    PathNode.CurveTo(85.52285f, 118.0f, 90.0f, 122.47715f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 133.52284f, 85.52285f, 138.0f, 80.0f, 138.0f),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
