package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorLightIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 138.0f),
                    PathNode.LineTo(128.0f, 138.0f),
                    PathNode.CurveTo(124.686295f, 138.0f, 122.0f, 140.6863f, 122.0f, 144.0f),
                    PathNode.LineTo(122.0f, 201.45f),
                    PathNode.CurveTo(121.99701f, 204.35332f, 124.07322f, 206.84224f, 126.93f, 207.36f),
                    PathNode.LineTo(206.93f, 221.9f),
                    PathNode.CurveTo(207.28252f, 221.96844f, 207.64091f, 222.00194f, 208.0f, 222.0f),
                    PathNode.CurveTo(211.3137f, 222.0f, 214.0f, 219.3137f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 140.6863f, 211.3137f, 138.0f, 208.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 208.81f),
                    PathNode.LineTo(134.0f, 196.45f),
                    PathNode.LineTo(134.0f, 150.0f),
                    PathNode.LineTo(202.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 138.0f),
                    PathNode.LineTo(32.0f, 138.0f),
                    PathNode.CurveTo(28.68629f, 138.0f, 26.0f, 140.6863f, 26.0f, 144.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.001846f, 186.89955f, 28.076933f, 189.38292f, 30.93f, 189.9f),
                    PathNode.LineTo(94.93f, 201.54f),
                    PathNode.CurveTo(95.2832f, 201.60345f, 95.64115f, 201.63692f, 96.0f, 201.64f),
                    PathNode.CurveTo(99.313705f, 201.64f, 102.0f, 198.9537f, 102.0f, 195.64f),
                    PathNode.LineTo(102.0f, 144.0f),
                    PathNode.CurveTo(102.0f, 140.6863f, 99.313705f, 138.0f, 96.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 188.45f),
                    PathNode.LineTo(38.0f, 179.0f),
                    PathNode.LineTo(38.0f, 150.0f),
                    PathNode.LineTo(90.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.84f, 35.39f),
                    PathNode.CurveTo(210.47482f, 34.254677f, 208.67691f, 33.782314f, 206.93f, 34.1f),
                    PathNode.LineTo(126.93f, 48.64f),
                    PathNode.CurveTo(124.07322f, 49.157757f, 121.99701f, 51.646683f, 122.0f, 54.55f),
                    PathNode.LineTo(122.0f, 112.0f),
                    PathNode.CurveTo(122.0f, 115.313705f, 124.686295f, 118.0f, 128.0f, 118.0f),
                    PathNode.LineTo(208.0f, 118.0f),
                    PathNode.CurveTo(211.3137f, 118.0f, 214.0f, 115.313705f, 214.0f, 112.0f),
                    PathNode.LineTo(214.0f, 40.0f),
                    PathNode.CurveTo(213.99992f, 38.218903f, 213.20854f, 36.5299f, 211.84f, 35.39f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 106.0f),
                    PathNode.LineTo(134.0f, 106.0f),
                    PathNode.LineTo(134.0f, 59.55f),
                    PathNode.LineTo(202.0f, 47.19f),
                    PathNode.Close,
                    PathNode.MoveTo(99.84f, 55.76f),
                    PathNode.CurveTo(98.4765f, 54.621128f, 96.67841f, 54.145058f, 94.93f, 54.46f),
                    PathNode.LineTo(30.93f, 66.1f),
                    PathNode.CurveTo(28.076933f, 66.61709f, 26.001846f, 69.10046f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 112.0f),
                    PathNode.CurveTo(26.0f, 115.313705f, 28.68629f, 118.0f, 32.0f, 118.0f),
                    PathNode.LineTo(96.0f, 118.0f),
                    PathNode.CurveTo(99.313705f, 118.0f, 102.0f, 115.313705f, 102.0f, 112.0f),
                    PathNode.LineTo(102.0f, 60.36f),
                    PathNode.CurveTo(101.99696f, 58.582405f, 101.205864f, 56.89766f, 99.84f, 55.76f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 106.0f),
                    PathNode.LineTo(38.0f, 106.0f),
                    PathNode.LineTo(38.0f, 77.0f),
                    PathNode.LineTo(90.0f, 67.54f),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
