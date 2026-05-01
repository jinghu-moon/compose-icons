package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorDuotoneIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 201.0f),
                    PathNode.LineTo(201.0f, 213.66f),
                    PathNode.CurveTo(197.87624f, 216.78172f, 192.81377f, 216.78172f, 189.69f, 213.66f),
                    PathNode.LineTo(138.38f, 162.35f),
                    PathNode.CurveTo(136.50925f, 160.4748f, 133.83159f, 159.64713f, 131.22897f, 160.13962f),
                    PathNode.CurveTo(128.62636f, 160.63211f, 126.43625f, 162.3809f, 125.38f, 164.81f),
                    PathNode.LineTo(107.56f, 211.22f),
                    PathNode.CurveTo(106.20481f, 214.20346f, 103.16724f, 216.05882f, 99.89416f, 215.90233f),
                    PathNode.CurveTo(96.62108f, 215.74583f, 93.77437f, 213.60913f, 92.71f, 210.51f),
                    PathNode.LineTo(40.41f, 50.44f),
                    PathNode.CurveTo(39.537792f, 47.60738f, 40.303127f, 44.524666f, 42.398895f, 42.428898f),
                    PathNode.CurveTo(44.494667f, 40.33313f, 47.577377f, 39.56779f, 50.41f, 40.44f),
                    PathNode.LineTo(210.51f, 92.68f),
                    PathNode.CurveTo(213.60913f, 93.74437f, 215.74583f, 96.59108f, 215.90233f, 99.86416f),
                    PathNode.CurveTo(216.05882f, 103.13724f, 214.20346f, 106.17481f, 211.22f, 107.53f),
                    PathNode.LineTo(164.81f, 125.35f),
                    PathNode.CurveTo(162.3809f, 126.40625f, 160.63211f, 128.59636f, 160.13962f, 131.19897f),
                    PathNode.CurveTo(159.64713f, 133.80159f, 160.4748f, 136.47925f, 162.35f, 138.35f),
                    PathNode.LineTo(213.66f, 189.66f),
                    PathNode.CurveTo(215.16835f, 191.16135f, 216.01633f, 193.20181f, 216.01633f, 195.33f),
                    PathNode.CurveTo(216.01633f, 197.45818f, 215.16835f, 199.49866f, 213.66f, 201.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 24.0f),
                    PathNode.LineTo(88.0f, 16.0f),
                    PathNode.CurveTo(88.0f, 11.581722f, 91.58172f, 8.0f, 96.0f, 8.0f),
                    PathNode.CurveTo(100.41828f, 8.0f, 104.0f, 11.581722f, 104.0f, 16.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(104.0f, 28.418278f, 100.41828f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(91.58172f, 32.0f, 88.0f, 28.418278f, 88.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 104.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(28.418278f, 104.0f, 32.0f, 100.41828f, 32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 91.58172f, 28.418278f, 88.0f, 24.0f, 88.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(11.581722f, 88.0f, 8.0f, 91.58172f, 8.0f, 96.0f),
                    PathNode.CurveTo(8.0f, 100.41828f, 11.581722f, 104.0f, 16.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.42f, 39.16f),
                    PathNode.CurveTo(126.31872f, 40.110874f, 128.51758f, 40.267853f, 130.53212f, 39.596344f),
                    PathNode.CurveTo(132.54665f, 38.92483f, 134.21155f, 37.47993f, 135.16f, 35.58f),
                    PathNode.LineTo(143.16f, 19.58f),
                    PathNode.CurveTo(145.13718f, 15.628403f, 143.53659f, 10.82218f, 139.585f, 8.845f),
                    PathNode.CurveTo(135.6334f, 6.867821f, 130.82718f, 8.468403f, 128.85f, 12.42f),
                    PathNode.LineTo(120.85f, 28.42f),
                    PathNode.CurveTo(119.89841f, 30.31749f, 119.73996f, 32.515385f, 120.40954f, 34.52975f),
                    PathNode.CurveTo(121.07912f, 36.544113f, 122.52183f, 38.209778f, 124.42f, 39.16f),
                    PathNode.Close,
                    PathNode.MoveTo(28.42f, 120.85f),
                    PathNode.LineTo(12.42f, 128.85f),
                    PathNode.CurveTo(8.468403f, 130.82718f, 6.867821f, 135.6334f, 8.845f, 139.585f),
                    PathNode.CurveTo(10.82218f, 143.53659f, 15.628403f, 145.13718f, 19.58f, 143.16f),
                    PathNode.LineTo(35.58f, 135.16f),
                    PathNode.CurveTo(39.531597f, 133.18282f, 41.13218f, 128.3766f, 39.155f, 124.425f),
                    PathNode.CurveTo(37.177822f, 120.4734f, 32.371597f, 118.87282f, 28.42f, 120.85f),
                    PathNode.Close,
                    PathNode.MoveTo(219.31f, 184.0f),
                    PathNode.CurveTo(222.31137f, 187.00069f, 223.99759f, 191.0709f, 223.99759f, 195.315f),
                    PathNode.CurveTo(223.99759f, 199.5591f, 222.31137f, 203.62932f, 219.31f, 206.63f),
                    PathNode.LineTo(206.63f, 219.31f),
                    PathNode.CurveTo(203.62932f, 222.31137f, 199.5591f, 223.99759f, 195.315f, 223.99759f),
                    PathNode.CurveTo(191.0709f, 223.99759f, 187.00069f, 222.31137f, 184.0f, 219.31f),
                    PathNode.LineTo(132.7f, 168.0f),
                    PathNode.LineTo(115.0f, 214.09f),
                    PathNode.CurveTo(115.0f, 214.19f, 114.92f, 214.3f, 114.87f, 214.41f),
                    PathNode.CurveTo(112.367096f, 220.24548f, 106.61956f, 224.02075f, 100.27f, 224.0f),
                    PathNode.LineTo(99.48f, 224.0f),
                    PathNode.CurveTo(92.8448f, 223.71906f, 87.09038f, 219.32637f, 85.07f, 213.0f),
                    PathNode.LineTo(32.8f, 52.92f),
                    PathNode.CurveTo(30.970638f, 47.21236f, 32.484673f, 40.96096f, 36.722816f, 36.722816f),
                    PathNode.CurveTo(40.96096f, 32.484673f, 47.21236f, 30.970638f, 52.92f, 32.8f),
                    PathNode.LineTo(213.0f, 85.07f),
                    PathNode.CurveTo(219.26216f, 87.16482f, 223.5942f, 92.89145f, 223.90628f, 99.48732f),
                    PathNode.CurveTo(224.21837f, 106.0832f, 220.4464f, 112.19326f, 214.41f, 114.87f),
                    PathNode.LineTo(214.09f, 115.0f),
                    PathNode.LineTo(168.0f, 132.69f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 195.31f),
                    PathNode.LineTo(156.69f, 144.0f),
                    PathNode.LineTo(156.69f, 144.0f),
                    PathNode.CurveTo(152.94017f, 140.25706f, 151.28635f, 134.90057f, 152.27338f, 129.69514f),
                    PathNode.CurveTo(153.2604f, 124.4897f, 156.76028f, 120.11042f, 161.62f, 118.0f),
                    PathNode.LineTo(161.94f, 117.86f),
                    PathNode.LineTo(207.89f, 100.22f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(100.2f, 207.86f),
                    PathNode.LineTo(117.85f, 161.86f),
                    PathNode.CurveTo(117.85f, 161.75f, 117.93f, 161.64f, 117.98f, 161.53f),
                    PathNode.CurveTo(120.09116f, 156.67415f, 124.467926f, 153.17725f, 129.67f, 152.19f),
                    PathNode.CurveTo(130.65953f, 152.00658f, 131.6636f, 151.91286f, 132.67f, 151.91f),
                    PathNode.CurveTo(136.90924f, 151.91461f, 140.97339f, 153.60141f, 143.97f, 156.6f),
                    PathNode.LineTo(195.31f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
