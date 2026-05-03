package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorLightIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 60.23f),
                    PathNode.LineTo(60.24f, 204.23f),
                    PathNode.CurveTo(57.875923f, 206.43288f, 54.19192f, 206.36787f, 51.907024f, 204.08298f),
                    PathNode.CurveTo(49.622128f, 201.79808f, 49.55713f, 198.11407f, 51.76f, 195.75f),
                    PathNode.LineTo(195.76f, 51.75f),
                    PathNode.CurveTo(197.27243f, 50.214603f, 199.49217f, 49.60833f, 201.57512f, 50.161728f),
                    PathNode.CurveTo(203.65807f, 50.71513f, 205.28418f, 52.343166f, 205.83513f, 54.42676f),
                    PathNode.CurveTo(206.38606f, 56.510357f, 205.77716f, 58.72937f, 204.24f, 60.24f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 100.0f),
                    PathNode.CurveTo(40.548653f, 88.50886f, 38.810814f, 70.52817f, 47.849518f, 57.056664f),
                    PathNode.CurveTo(56.888214f, 43.585155f, 74.18531f, 38.375942f, 89.16022f, 44.615486f),
                    PathNode.CurveTo(104.13512f, 50.855034f, 112.61588f, 66.805016f, 109.41484f, 82.708885f),
                    PathNode.CurveTo(106.213806f, 98.61275f, 92.22276f, 110.03974f, 76.0f, 110.0f),
                    PathNode.CurveTo(66.98622f, 110.00223f, 58.3454f, 106.40188f, 52.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 76.0f),
                    PathNode.CurveTo(54.003483f, 86.49543f, 61.420254f, 95.5269f, 71.714645f, 97.5713f),
                    PathNode.CurveTo(82.00904f, 99.615685f, 92.31405f, 94.10363f, 96.327736f, 84.405975f),
                    PathNode.CurveTo(100.341415f, 74.70832f, 96.94595f, 63.525894f, 88.2178f, 57.697205f),
                    PathNode.CurveTo(79.48966f, 51.86851f, 67.85965f, 53.01687f, 60.44f, 60.44f),
                    PathNode.CurveTo(56.30151f, 64.55851f, 53.982563f, 70.16143f, 54.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 180.0f),
                    PathNode.CurveTo(214.03973f, 196.22276f, 202.61275f, 210.2138f, 186.70888f, 213.41484f),
                    PathNode.CurveTo(170.80501f, 216.61588f, 154.85503f, 208.13512f, 148.6155f, 193.16022f),
                    PathNode.CurveTo(142.37595f, 178.1853f, 147.58516f, 160.88821f, 161.05666f, 151.84952f),
                    PathNode.CurveTo(174.52815f, 142.8108f, 192.50887f, 144.54865f, 204.0f, 156.0f),
                    PathNode.CurveTo(210.40189f, 162.3454f, 214.00223f, 170.98622f, 214.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 180.0f),
                    PathNode.CurveTo(202.01633f, 174.16165f, 199.69754f, 168.55914f, 195.56f, 164.44f),
                    PathNode.LineTo(195.56f, 164.44f),
                    PathNode.CurveTo(188.14035f, 157.01686f, 176.51033f, 155.86852f, 167.7822f, 161.6972f),
                    PathNode.CurveTo(159.05405f, 167.5259f, 155.65858f, 178.70834f, 159.67227f, 188.40598f),
                    PathNode.CurveTo(163.68594f, 198.10362f, 173.99095f, 203.61569f, 184.28535f, 201.57129f),
                    PathNode.CurveTo(194.57974f, 199.5269f, 201.99652f, 190.49544f, 202.0f, 180.0f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
