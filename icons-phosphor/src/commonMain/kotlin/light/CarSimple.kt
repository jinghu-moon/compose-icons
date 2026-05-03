package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarSimple: ImageVector
    get() {
        if (_carSimple != null) return _carSimple!!
        _carSimple = phosphorLightIcon(
            name = "CarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 106.0f),
                    PathNode.LineTo(227.9f, 106.0f),
                    PathNode.LineTo(199.59f, 42.31f),
                    PathNode.CurveTo(197.34225f, 37.25691f, 192.33046f, 34.000614f, 186.8f, 34.0f),
                    PathNode.LineTo(69.2f, 34.0f),
                    PathNode.CurveTo(63.669533f, 34.000614f, 58.657738f, 37.25691f, 56.41f, 42.31f),
                    PathNode.LineTo(28.1f, 106.0f),
                    PathNode.LineTo(16.0f, 106.0f),
                    PathNode.CurveTo(12.686292f, 106.0f, 10.0f, 108.686295f, 10.0f, 112.0f),
                    PathNode.CurveTo(10.0f, 115.313705f, 12.686292f, 118.0f, 16.0f, 118.0f),
                    PathNode.LineTo(26.0f, 118.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(64.0f, 214.0f),
                    PathNode.CurveTo(71.73199f, 214.0f, 78.0f, 207.73198f, 78.0f, 200.0f),
                    PathNode.LineTo(78.0f, 182.0f),
                    PathNode.LineTo(178.0f, 182.0f),
                    PathNode.LineTo(178.0f, 200.0f),
                    PathNode.CurveTo(178.0f, 207.73198f, 184.26802f, 214.0f, 192.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 118.0f),
                    PathNode.LineTo(240.0f, 118.0f),
                    PathNode.CurveTo(243.3137f, 118.0f, 246.0f, 115.313705f, 246.0f, 112.0f),
                    PathNode.CurveTo(246.0f, 108.686295f, 243.3137f, 106.0f, 240.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(67.37f, 47.19f),
                    PathNode.CurveTo(67.69067f, 46.466064f, 68.408226f, 45.99946f, 69.2f, 46.0f),
                    PathNode.LineTo(186.8f, 46.0f),
                    PathNode.CurveTo(187.59178f, 45.99946f, 188.30933f, 46.466064f, 188.63f, 47.19f),
                    PathNode.LineTo(214.77f, 106.0f),
                    PathNode.LineTo(41.23f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(192.0f, 202.0f),
                    PathNode.CurveTo(190.89543f, 202.0f, 190.0f, 201.10457f, 190.0f, 200.0f),
                    PathNode.LineTo(190.0f, 176.0f),
                    PathNode.CurveTo(190.0f, 172.6863f, 187.3137f, 170.0f, 184.0f, 170.0f),
                    PathNode.LineTo(72.0f, 170.0f),
                    PathNode.CurveTo(68.686295f, 170.0f, 66.0f, 172.6863f, 66.0f, 176.0f),
                    PathNode.LineTo(66.0f, 200.0f),
                    PathNode.CurveTo(66.0f, 201.10457f, 65.10457f, 202.0f, 64.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 118.0f),
                    PathNode.LineTo(218.0f, 118.0f),
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
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
