package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorLightIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.64f, 63.0f),
                    PathNode.LineTo(194.87f, 34.74f),
                    PathNode.CurveTo(193.9914f, 34.25438f, 193.00388f, 33.99976f, 192.0f, 34.0f),
                    PathNode.LineTo(160.0f, 34.0f),
                    PathNode.CurveTo(156.6863f, 34.0f, 154.0f, 36.68629f, 154.0f, 40.0f),
                    PathNode.CurveTo(154.0f, 54.3594f, 142.3594f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(113.640594f, 66.0f, 102.0f, 54.3594f, 102.0f, 40.0f),
                    PathNode.CurveTo(102.0f, 36.68629f, 99.313705f, 34.0f, 96.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(62.992733f, 33.998062f, 62.00157f, 34.25274f, 61.12f, 34.74f),
                    PathNode.LineTo(9.36f, 63.0f),
                    PathNode.CurveTo(2.655718f, 66.53821f, 0.072144f, 74.82979f, 3.58f, 81.55f),
                    PathNode.LineTo(22.86f, 118.36f),
                    PathNode.CurveTo(25.372288f, 123.09518f, 30.309788f, 126.03995f, 35.67f, 126.0f),
                    PathNode.LineTo(58.0f, 126.0f),
                    PathNode.LineTo(58.0f, 208.0f),
                    PathNode.CurveTo(58.0f, 215.73198f, 64.26801f, 222.0f, 72.0f, 222.0f),
                    PathNode.LineTo(184.0f, 222.0f),
                    PathNode.CurveTo(191.73198f, 222.0f, 198.0f, 215.73198f, 198.0f, 208.0f),
                    PathNode.LineTo(198.0f, 126.0f),
                    PathNode.LineTo(220.34f, 126.0f),
                    PathNode.CurveTo(225.70021f, 126.03995f, 230.63771f, 123.09518f, 233.15f, 118.36f),
                    PathNode.LineTo(252.43f, 81.55f),
                    PathNode.CurveTo(255.93634f, 74.82715f, 253.348f, 66.53466f, 246.64f, 63.0f),
                    PathNode.Close,
                    PathNode.MoveTo(35.64f, 114.0f),
                    PathNode.CurveTo(34.745487f, 114.030846f, 33.906994f, 113.56544f, 33.46f, 112.79f),
                    PathNode.LineTo(14.21f, 76.0f),
                    PathNode.CurveTo(13.990733f, 75.554726f, 13.962829f, 75.03922f, 14.13275f, 74.57288f),
                    PathNode.CurveTo(14.30267f, 74.106544f, 14.655675f, 73.729836f, 15.11f, 73.53f),
                    PathNode.LineTo(58.0f, 50.11f),
                    PathNode.LineTo(58.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 208.0f),
                    PathNode.CurveTo(186.0f, 209.10457f, 185.10457f, 210.0f, 184.0f, 210.0f),
                    PathNode.LineTo(72.0f, 210.0f),
                    PathNode.CurveTo(70.89543f, 210.0f, 70.0f, 209.10457f, 70.0f, 208.0f),
                    PathNode.LineTo(70.0f, 46.0f),
                    PathNode.LineTo(90.48f, 46.0f),
                    PathNode.CurveTo(93.489876f, 64.37046f, 109.3646f, 77.855896f, 127.98f, 77.855896f),
                    PathNode.CurveTo(146.5954f, 77.855896f, 162.47014f, 64.37046f, 165.48f, 46.0f),
                    PathNode.LineTo(186.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(241.8f, 76.0f),
                    PathNode.LineTo(222.52f, 112.8f),
                    PathNode.CurveTo(222.07301f, 113.57544f, 221.23451f, 114.04084f, 220.34f, 114.01f),
                    PathNode.LineTo(198.0f, 114.01f),
                    PathNode.LineTo(198.0f, 50.11f),
                    PathNode.LineTo(240.9f, 73.51f),
                    PathNode.CurveTo(241.35588f, 73.71366f, 241.70876f, 74.09475f, 241.8768f, 74.56492f),
                    PathNode.CurveTo(242.04486f, 75.03509f, 242.0135f, 75.55351f, 241.79f, 76.0f),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
