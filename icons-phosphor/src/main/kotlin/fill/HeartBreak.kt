package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorFillIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.81f, 107.5f),
                    PathNode.CurveTo(234.62f, 174.92f, 136.11f, 228.73f, 131.81f, 231.04f),
                    PathNode.CurveTo(129.44366f, 232.31297f, 126.59633f, 232.31297f, 124.23f, 231.04f),
                    PathNode.CurveTo(119.8f, 228.67f, 16.0f, 172.0f, 16.0f, 102.0f),
                    PathNode.CurveTo(15.994329f, 79.114975f, 28.595669f, 58.087753f, 48.7797f, 47.302155f),
                    PathNode.CurveTo(68.96373f, 36.516552f, 93.44788f, 37.726665f, 112.47f, 50.45f),
                    PathNode.CurveTo(113.47183f, 51.1143f, 114.121796f, 52.193924f, 114.24006f, 53.390156f),
                    PathNode.CurveTo(114.35833f, 54.586388f, 113.93235f, 55.772385f, 113.08f, 56.62f),
                    PathNode.LineTo(99.72f, 70.0f),
                    PathNode.CurveTo(96.598274f, 73.12377f, 96.598274f, 78.18623f, 99.72f, 81.31f),
                    PathNode.LineTo(132.25f, 113.84f),
                    PathNode.LineTo(111.0f, 135.0f),
                    PathNode.CurveTo(108.89251f, 137.00224f, 108.03699f, 139.99011f, 108.76537f, 142.80435f),
                    PathNode.CurveTo(109.49376f, 145.61859f, 111.691414f, 147.81624f, 114.505646f, 148.54462f),
                    PathNode.CurveTo(117.319885f, 149.27301f, 120.30776f, 148.41748f, 122.31f, 146.31f),
                    PathNode.LineTo(149.19f, 119.44f),
                    PathNode.CurveTo(152.31172f, 116.31623f, 152.31172f, 111.25377f, 149.19f, 108.13f),
                    PathNode.LineTo(116.7f, 75.63f),
                    PathNode.LineTo(134.17f, 58.16f),
                    PathNode.LineTo(134.17f, 58.16f),
                    PathNode.CurveTo(145.87126f, 46.39881f, 161.82014f, 39.851982f, 178.41f, 40.0f),
                    PathNode.CurveTo(214.73f, 40.23f, 242.59f, 71.29f, 239.81f, 107.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
