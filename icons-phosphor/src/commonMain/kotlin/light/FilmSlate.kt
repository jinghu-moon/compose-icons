package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorLightIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 106.0f),
                    PathNode.LineTo(86.68f, 106.0f),
                    PathNode.LineTo(209.53f, 73.57f),
                    PathNode.CurveTo(211.07733f, 73.16229f, 212.39769f, 72.153404f, 213.19765f, 70.767586f),
                    PathNode.CurveTo(213.99759f, 69.38175f, 214.21085f, 67.7338f, 213.79f, 66.19f),
                    PathNode.LineTo(205.63f, 36.19f),
                    PathNode.CurveTo(203.5763f, 28.84517f, 196.0015f, 24.514164f, 188.63f, 26.47f),
                    PathNode.LineTo(36.32f, 66.67f),
                    PathNode.CurveTo(32.738914f, 67.599846f, 29.682673f, 69.93167f, 27.84f, 73.14f),
                    PathNode.CurveTo(26.005642f, 76.28973f, 25.515512f, 80.044975f, 26.48f, 83.56f),
                    PathNode.LineTo(34.0f, 111.34f),
                    PathNode.CurveTo(34.0f, 111.56f, 34.0f, 111.78f, 34.0f, 112.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 207.73198f, 40.268013f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(215.73198f, 214.0f, 222.0f, 207.73198f, 222.0f, 200.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 108.686295f, 219.3137f, 106.0f, 216.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.75f, 55.48f),
                    PathNode.LineTo(158.75f, 74.55f),
                    PathNode.LineTo(116.32f, 85.75f),
                    PathNode.LineTo(83.32f, 66.68f),
                    PathNode.Close,
                    PathNode.MoveTo(191.75f, 38.07f),
                    PathNode.CurveTo(192.74162f, 37.795074f, 193.77368f, 38.3508f, 194.09f, 39.33f),
                    PathNode.LineTo(200.66f, 63.51f),
                    PathNode.LineTo(175.26f, 70.2f),
                    PathNode.LineTo(142.26f, 51.13f),
                    PathNode.Close,
                    PathNode.MoveTo(38.23f, 79.14f),
                    PathNode.CurveTo(38.479877f, 78.70639f, 38.89477f, 78.39252f, 39.38f, 78.27f),
                    PathNode.LineTo(66.86f, 71.0f),
                    PathNode.LineTo(99.86f, 90.08f),
                    PathNode.LineTo(44.66f, 104.68f),
                    PathNode.LineTo(38.06f, 80.41f),
                    PathNode.CurveTo(37.940926f, 79.98121f, 38.002342f, 79.52238f, 38.23f, 79.14f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 200.0f),
                    PathNode.CurveTo(210.0f, 201.10457f, 209.10457f, 202.0f, 208.0f, 202.0f),
                    PathNode.LineTo(48.0f, 202.0f),
                    PathNode.CurveTo(46.89543f, 202.0f, 46.0f, 201.10457f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 118.0f),
                    PathNode.LineTo(210.0f, 118.0f),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
