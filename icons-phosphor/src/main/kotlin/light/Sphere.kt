package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorLightIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 134.59f, 205.06f, 141.24f, 194.0f, 144.94f),
                    PathNode.CurveTo(184.57138f, 147.96504f, 174.89366f, 150.15022f, 165.08f, 151.47f),
                    PathNode.CurveTo(165.7f, 143.87f, 166.02f, 136.01f, 166.02f, 128.0f),
                    PathNode.CurveTo(166.02f, 101.73f, 162.58f, 77.0f, 156.34f, 58.22f),
                    PathNode.CurveTo(154.36867f, 51.96308f, 151.68437f, 45.95361f, 148.34f, 40.31f),
                    PathNode.CurveTo(189.0997f, 49.82692f, 217.94963f, 86.14403f, 218.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(134.59f, 38.0f, 141.24f, 50.94f, 144.94f, 62.0f),
                    PathNode.CurveTo(150.78f, 79.53f, 154.0f, 103.0f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 136.83f, 153.6f, 145.15f, 152.89f, 152.89f),
                    PathNode.CurveTo(144.89f, 153.62f, 136.54f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(73.06f, 154.0f, 38.0f, 138.6f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.05511f, 78.317215f, 78.317215f, 38.05511f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.31f, 148.3f),
                    PathNode.CurveTo(45.95361f, 151.64438f, 51.96308f, 154.32867f, 58.22f, 156.3f),
                    PathNode.CurveTo(77.0f, 162.56f, 101.73f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(136.0f, 166.0f, 143.86f, 165.68f, 151.45f, 165.06f),
                    PathNode.CurveTo(146.64f, 198.2f, 136.0f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(86.13217f, 217.94528f, 49.811035f, 189.0756f, 40.31f, 148.3f),
                    PathNode.Close,
                    PathNode.MoveTo(148.31f, 215.69f),
                    PathNode.CurveTo(151.65437f, 210.04639f, 154.33867f, 204.03691f, 156.31f, 197.78f),
                    PathNode.CurveTo(159.85532f, 186.70686f, 162.34311f, 175.32262f, 163.74f, 163.78f),
                    PathNode.CurveTo(175.28262f, 162.38312f, 186.66687f, 159.89532f, 197.74f, 156.35f),
                    PathNode.CurveTo(203.99692f, 154.37868f, 210.0064f, 151.69438f, 215.65f, 148.35f),
                    PathNode.CurveTo(207.82451f, 181.7735f, 181.72467f, 207.86948f, 148.3f, 215.69f),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
