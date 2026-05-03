package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorFillIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 67.3f),
                    PathNode.CurveTo(223.89027f, 57.57177f, 219.82492f, 48.307407f, 212.74f, 41.64f),
                    PathNode.CurveTo(198.74f, 28.36f, 176.02f, 28.86f, 162.12f, 42.77f),
                    PathNode.LineTo(138.8f, 66.2f),
                    PathNode.CurveTo(129.3218f, 57.56132f, 114.72675f, 57.900436f, 105.66f, 66.97f),
                    PathNode.LineTo(100.66f, 71.97f),
                    PathNode.CurveTo(97.65557f, 74.97109f, 95.967415f, 79.04345f, 95.967415f, 83.29f),
                    PathNode.CurveTo(95.967415f, 87.536545f, 97.65557f, 91.60891f, 100.66f, 94.61f),
                    PathNode.LineTo(102.66f, 96.67f),
                    PathNode.LineTo(51.66f, 147.67f),
                    PathNode.CurveTo(41.67192f, 157.58028f, 37.66716f, 172.03241f, 41.13f, 185.67f),
                    PathNode.LineTo(33.13f, 204.08f),
                    PathNode.CurveTo(30.841816f, 209.2548f, 31.983408f, 215.30486f, 36.0f, 219.29f),
                    PathNode.CurveTo(40.636868f, 223.97139f, 47.680725f, 225.30777f, 53.71f, 222.65f),
                    PathNode.LineTo(71.24f, 215.0f),
                    PathNode.CurveTo(84.61676f, 218.02193f, 98.60808f, 213.96237f, 108.29f, 204.25f),
                    PathNode.LineTo(159.29f, 153.25f),
                    PathNode.LineTo(161.35f, 155.31f),
                    PathNode.CurveTo(167.59753f, 161.55345f, 177.72246f, 161.55345f, 183.97f, 155.31f),
                    PathNode.LineTo(188.97f, 150.31f),
                    PathNode.CurveTo(198.05627f, 141.2302f, 198.38243f, 126.605865f, 189.71f, 117.13f),
                    PathNode.LineTo(213.46f, 93.26f),
                    PathNode.CurveTo(220.35915f, 86.40119f, 224.16516f, 77.02698f, 224.0f, 67.3f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 152.0f),
                    PathNode.LineTo(70.07f, 152.0f),
                    PathNode.LineTo(114.07f, 108.0f),
                    PathNode.LineTo(148.01f, 142.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
