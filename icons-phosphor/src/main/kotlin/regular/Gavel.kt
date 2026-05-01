package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorRegularIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.32f, 116.69f),
                    PathNode.LineTo(227.32f, 100.69f),
                    PathNode.CurveTo(221.7115f, 95.0879f, 212.84653f, 94.437065f, 206.48f, 99.16f),
                    PathNode.LineTo(156.84f, 49.52f),
                    PathNode.CurveTo(161.56557f, 43.155876f, 160.919f, 34.291084f, 155.32f, 28.68f),
                    PathNode.LineTo(139.32f, 12.68f),
                    PathNode.CurveTo(136.3193f, 9.678628f, 132.2491f, 7.992417f, 128.005f, 7.992417f),
                    PathNode.CurveTo(123.7609f, 7.992417f, 119.69069f, 9.678628f, 116.69f, 12.68f),
                    PathNode.LineTo(52.69f, 76.68f),
                    PathNode.CurveTo(49.68863f, 79.68069f, 48.00242f, 83.7509f, 48.00242f, 87.995f),
                    PathNode.CurveTo(48.00242f, 92.2391f, 49.68863f, 96.30931f, 52.69f, 99.31f),
                    PathNode.LineTo(68.69f, 115.31f),
                    PathNode.CurveTo(74.29966f, 120.90336f, 83.157776f, 121.54975f, 89.52f, 116.83f),
                    PathNode.LineTo(96.69f, 124.0f),
                    PathNode.LineTo(31.31f, 189.38f),
                    PathNode.CurveTo(22.2863f, 199.24905f, 22.626694f, 214.47165f, 32.08252f, 223.92747f),
                    PathNode.CurveTo(41.538345f, 233.3833f, 56.760952f, 233.7237f, 66.63f, 224.7f),
                    PathNode.LineTo(132.0f, 159.32f),
                    PathNode.LineTo(139.17f, 166.48f),
                    PathNode.CurveTo(134.44443f, 172.84412f, 135.091f, 181.70892f, 140.69f, 187.32f),
                    PathNode.LineTo(156.69f, 203.32f),
                    PathNode.CurveTo(159.69069f, 206.32137f, 163.76091f, 208.00758f, 168.005f, 208.00758f),
                    PathNode.CurveTo(172.2491f, 208.00758f, 176.3193f, 206.32137f, 179.32f, 203.32f),
                    PathNode.LineTo(243.32f, 139.32f),
                    PathNode.CurveTo(246.32137f, 136.3193f, 248.00758f, 132.2491f, 248.00758f, 128.005f),
                    PathNode.CurveTo(248.00758f, 123.7609f, 246.32137f, 119.69069f, 243.32f, 116.69f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 104.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(55.32f, 213.38f),
                    PathNode.CurveTo(51.80966f, 216.8695f, 46.14034f, 216.8695f, 42.63f, 213.38f),
                    PathNode.CurveTo(39.147106f, 209.87083f, 39.147106f, 204.20917f, 42.63f, 200.7f),
                    PathNode.LineTo(108.0f, 135.32f),
                    PathNode.LineTo(120.69f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.0f, 105.66f),
                    PathNode.LineTo(145.66f, 61.0f),
                    PathNode.LineTo(195.0f, 110.34f),
                    PathNode.LineTo(150.35f, 155.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 192.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(232.0f, 128.0f),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
