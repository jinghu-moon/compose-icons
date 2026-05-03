package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) return _chatCircleSlash!!
        _chatCircleSlash = phosphorFillIcon(
            name = "ChatCircleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(191.82f, 210.09f),
                    PathNode.CurveTo(159.45613f, 235.26646f, 115.320045f, 239.07697f, 79.12f, 219.82f),
                    PathNode.LineTo(45.07f, 231.17f),
                    PathNode.CurveTo(39.320145f, 233.08752f, 32.980404f, 231.59138f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(24.408623f, 223.0196f, 22.912483f, 216.67986f, 24.83f, 210.93f),
                    PathNode.LineTo(36.18f, 176.88f),
                    PathNode.CurveTo(15.235644f, 137.48799f, 21.732185f, 89.12799f, 52.33f, 56.66f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(114.14915f, 23.974592f, 100.43438f, 26.732508f, 87.67f, 32.11f),
                    PathNode.CurveTo(85.27959f, 33.119007f, 83.52698f, 35.22465f, 82.96854f, 37.758488f),
                    PathNode.CurveTo(82.4101f, 40.29232f, 83.1152f, 42.93962f, 84.86f, 44.86f),
                    PathNode.LineTo(206.66f, 178.86f),
                    PathNode.CurveTo(208.40562f, 180.79651f, 210.98543f, 181.76091f, 213.57332f, 181.44438f),
                    PathNode.CurveTo(216.16121f, 181.12787f, 218.43253f, 179.57014f, 219.66f, 177.27f),
                    PathNode.CurveTo(237.00427f, 145.02856f, 236.11864f, 106.04237f, 217.3282f, 74.621796f),
                    PathNode.CurveTo(198.53775f, 43.201202f, 164.61057f, 23.974852f, 128.0f, 24.0f),
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
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
