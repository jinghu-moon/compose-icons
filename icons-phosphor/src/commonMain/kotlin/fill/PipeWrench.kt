package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorFillIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.28f, 55.0f),
                    PathNode.LineTo(220.11f, 54.83f),
                    PathNode.LineTo(175.21f, 12.55f),
                    PathNode.CurveTo(168.95457f, 6.40819f, 158.9216f, 6.443862f, 152.71f, 12.63f),
                    PathNode.LineTo(108.17f, 56.87f),
                    PathNode.LineTo(106.63f, 55.31f),
                    PathNode.CurveTo(96.76676f, 46.323578f, 81.58474f, 46.666817f, 72.1377f, 56.089806f),
                    PathNode.CurveTo(62.690674f, 65.512794f, 62.308743f, 80.69389f, 71.27f, 90.58f),
                    PathNode.LineTo(72.73f, 92.06f),
                    PathNode.LineTo(52.69f, 112.0f),
                    PathNode.CurveTo(49.68863f, 115.00069f, 48.00242f, 119.07089f, 48.00242f, 123.315f),
                    PathNode.CurveTo(48.00242f, 127.5591f, 49.68863f, 131.62932f, 52.69f, 134.63f),
                    PathNode.LineTo(65.37f, 147.31f),
                    PathNode.CurveTo(71.61408f, 153.53348f, 81.71591f, 153.53348f, 87.96f, 147.31f),
                    PathNode.LineTo(107.89f, 127.66f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.LineTo(55.31f, 205.37f),
                    PathNode.CurveTo(48.493443f, 211.57338f, 45.642952f, 221.02414f, 47.892685f, 229.96205f),
                    PathNode.CurveTo(50.142414f, 238.89995f, 57.127403f, 245.87506f, 66.06848f, 248.11212f),
                    PathNode.CurveTo(75.00956f, 250.3492f, 84.45628f, 247.48535f, 90.65f, 240.66f),
                    PathNode.LineTo(179.32f, 151.31f),
                    PathNode.CurveTo(185.55014f, 145.06476f, 185.55014f, 134.95525f, 179.32f, 128.71f),
                    PathNode.LineTo(143.63f, 92.66f),
                    PathNode.LineTo(156.56f, 80.0f),
                    PathNode.LineTo(156.66f, 80.09f),
                    PathNode.LineTo(194.0f, 115.4f),
                    PathNode.CurveTo(200.26175f, 121.55888f, 210.31764f, 121.51871f, 216.53f, 115.31f),
                    PathNode.LineTo(220.24f, 111.6f),
                    PathNode.CurveTo(227.7419f, 104.09849f, 231.95645f, 93.92402f, 231.95645f, 83.315f),
                    PathNode.CurveTo(231.95645f, 72.705986f, 227.7419f, 62.531513f, 220.24f, 55.03f),
                    PathNode.Close,
                    PathNode.MoveTo(76.69f, 136.0f),
                    PathNode.LineTo(64.0f, 123.33f),
                    PathNode.LineTo(84.0f, 103.45f),
                    PathNode.LineTo(96.69f, 116.31f),
                    PathNode.Close,
                    PathNode.MoveTo(209.0f, 100.28f),
                    PathNode.LineTo(205.25f, 104.0f),
                    PathNode.CurveTo(205.20178f, 103.94179f, 205.14821f, 103.88822f, 205.09f, 103.84f),
                    PathNode.LineTo(167.69f, 68.5f),
                    PathNode.CurveTo(161.42647f, 62.468025f, 151.4985f, 62.521236f, 145.3f, 68.62f),
                    PathNode.LineTo(132.37f, 81.29f),
                    PathNode.LineTo(119.43f, 68.23f),
                    PathNode.LineTo(164.0f, 24.0f),
                    PathNode.LineTo(164.17f, 24.16f),
                    PathNode.LineTo(209.05f, 66.42f),
                    PathNode.CurveTo(218.34654f, 75.80523f, 218.31079f, 90.938805f, 208.97f, 100.28f),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
