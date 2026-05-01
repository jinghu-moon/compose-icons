package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorRegularIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.LineTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(56.0f, 60.69f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(56.0f, 229.25484f, 66.74516f, 240.0f, 80.0f, 240.0f),
                    PathNode.LineTo(176.0f, 240.0f),
                    PathNode.CurveTo(188.13506f, 239.99728f, 198.35873f, 230.93675f, 199.82f, 218.89f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 216.0f),
                    PathNode.CurveTo(184.0f, 220.41827f, 180.41827f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(75.58172f, 224.0f, 72.0f, 220.41827f, 72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 78.29f),
                    PathNode.LineTo(184.0f, 201.49f),
                    PathNode.Close,
                    PathNode.MoveTo(68.7f, 24.0f),
                    PathNode.CurveTo(68.7f, 19.581722f, 72.28172f, 16.0f, 76.7f, 16.0f),
                    PathNode.LineTo(176.0f, 16.0f),
                    PathNode.CurveTo(189.25484f, 16.0f, 200.0f, 26.745167f, 200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 150.83f),
                    PathNode.CurveTo(200.0f, 155.24828f, 196.41827f, 158.83f, 192.0f, 158.83f),
                    PathNode.CurveTo(187.58173f, 158.83f, 184.0f, 155.24828f, 184.0f, 150.83f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.CurveTo(184.0f, 35.581722f, 180.41827f, 32.0f, 176.0f, 32.0f),
                    PathNode.LineTo(76.7f, 32.0f),
                    PathNode.CurveTo(72.28172f, 32.0f, 68.7f, 28.418278f, 68.7f, 24.0f),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
