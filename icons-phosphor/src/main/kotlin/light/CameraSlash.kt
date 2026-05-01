package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorLightIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(56.25f, 58.0f),
                    PathNode.LineTo(48.0f, 58.0f),
                    PathNode.CurveTo(35.849735f, 58.0f, 26.0f, 67.84974f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 204.15027f, 35.849735f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(198.07f, 214.0f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(105.5f, 112.2f),
                    PathNode.LineTo(145.61f, 156.33f),
                    PathNode.CurveTo(140.49432f, 160.04854f, 134.32426f, 162.03516f, 128.0f, 162.0f),
                    PathNode.CurveTo(116.20874f, 161.99892f, 105.51154f, 155.09067f, 100.65992f, 144.34378f),
                    PathNode.CurveTo(95.8083f, 133.5969f, 97.70204f, 121.004524f, 105.5f, 112.16f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 202.0f),
                    PathNode.CurveTo(42.477154f, 202.0f, 38.0f, 197.52284f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(38.0f, 74.47715f, 42.477154f, 70.0f, 48.0f, 70.0f),
                    PathNode.LineTo(67.16f, 70.0f),
                    PathNode.LineTo(97.39f, 103.25f),
                    PathNode.CurveTo(82.26065f, 119.2022f, 81.993835f, 144.12267f, 96.77817f, 160.39514f),
                    PathNode.CurveTo(111.56249f, 176.66762f, 136.3943f, 178.78477f, 153.72f, 165.25f),
                    PathNode.LineTo(187.16f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 80.0f),
                    PathNode.LineTo(230.0f, 186.0f),
                    PathNode.CurveTo(230.0f, 189.3137f, 227.3137f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(220.6863f, 192.0f, 218.0f, 189.3137f, 218.0f, 186.0f),
                    PathNode.LineTo(218.0f, 80.0f),
                    PathNode.CurveTo(218.0f, 74.47715f, 213.52284f, 70.0f, 208.0f, 70.0f),
                    PathNode.LineTo(176.0f, 70.0f),
                    PathNode.CurveTo(173.9915f, 70.002975f, 172.11472f, 69.00078f, 171.0f, 67.33f),
                    PathNode.LineTo(156.78f, 46.0f),
                    PathNode.LineTo(99.21f, 46.0f),
                    PathNode.LineTo(98.98f, 46.34f),
                    PathNode.CurveTo(97.143654f, 49.101425f, 93.41641f, 49.851345f, 90.655f, 48.015f),
                    PathNode.CurveTo(87.89358f, 46.178654f, 87.143654f, 42.451424f, 88.98f, 39.69f),
                    PathNode.LineTo(90.98f, 36.69f),
                    PathNode.CurveTo(92.09403f, 35.005684f, 93.980606f, 33.99475f, 96.0f, 34.0f),
                    PathNode.LineTo(160.0f, 34.0f),
                    PathNode.CurveTo(162.0085f, 33.997025f, 163.88528f, 34.99922f, 165.0f, 36.67f),
                    PathNode.LineTo(179.21f, 58.0f),
                    PathNode.LineTo(208.0f, 58.0f),
                    PathNode.CurveTo(220.15027f, 58.0f, 230.0f, 67.84974f, 230.0f, 80.0f),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
