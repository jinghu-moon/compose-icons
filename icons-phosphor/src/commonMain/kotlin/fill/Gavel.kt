package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorFillIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.69f, 99.31f),
                    PathNode.CurveTo(49.68863f, 96.30931f, 48.00242f, 92.2391f, 48.00242f, 87.995f),
                    PathNode.CurveTo(48.00242f, 83.7509f, 49.68863f, 79.68069f, 52.69f, 76.68f),
                    PathNode.LineTo(116.69f, 12.68f),
                    PathNode.CurveTo(122.9391f, 6.430898f, 133.07089f, 6.430898f, 139.32f, 12.68f),
                    PathNode.CurveTo(145.5691f, 18.929102f, 145.5691f, 29.060898f, 139.32f, 35.31f),
                    PathNode.LineTo(75.32f, 99.31f),
                    PathNode.CurveTo(72.31931f, 102.31137f, 68.2491f, 103.99758f, 64.005f, 103.99758f),
                    PathNode.CurveTo(59.760902f, 103.99758f, 55.690685f, 102.31137f, 52.69f, 99.31f),
                    PathNode.Close,
                    PathNode.MoveTo(243.32f, 116.68f),
                    PathNode.CurveTo(240.3193f, 113.67863f, 236.2491f, 111.99242f, 232.005f, 111.99242f),
                    PathNode.CurveTo(227.76091f, 111.99242f, 223.69069f, 113.67863f, 220.69f, 116.68f),
                    PathNode.LineTo(156.69f, 180.68f),
                    PathNode.CurveTo(153.68863f, 183.6807f, 152.00241f, 187.7509f, 152.00241f, 191.995f),
                    PathNode.CurveTo(152.00241f, 196.23909f, 153.68863f, 200.30931f, 156.69f, 203.31f),
                    PathNode.LineTo(156.69f, 203.31f),
                    PathNode.CurveTo(159.69069f, 206.31137f, 163.76091f, 207.99759f, 168.005f, 207.99759f),
                    PathNode.CurveTo(172.2491f, 207.99759f, 176.3193f, 206.31137f, 179.32f, 203.31f),
                    PathNode.LineTo(243.32f, 139.31f),
                    PathNode.CurveTo(246.32137f, 136.30931f, 248.00758f, 132.23909f, 248.00758f, 127.995f),
                    PathNode.CurveTo(248.00758f, 123.7509f, 246.32137f, 119.68069f, 243.32f, 116.68f),
                    PathNode.Close,
                    PathNode.MoveTo(208.21f, 100.88f),
                    PathNode.LineTo(155.12f, 47.79f),
                    PathNode.CurveTo(154.36972f, 47.03889f, 153.35164f, 46.61685f, 152.29f, 46.61685f),
                    PathNode.CurveTo(151.22836f, 46.61685f, 150.21027f, 47.03889f, 149.46f, 47.79f),
                    PathNode.LineTo(87.8f, 109.45f),
                    PathNode.CurveTo(87.04889f, 110.20027f, 86.626854f, 111.21836f, 86.626854f, 112.28f),
                    PathNode.CurveTo(86.626854f, 113.34164f, 87.04889f, 114.359726f, 87.8f, 115.11f),
                    PathNode.LineTo(103.0f, 130.34f),
                    PathNode.LineTo(28.69f, 204.69f),
                    PathNode.CurveTo(22.713537f, 210.98062f, 22.84039f, 220.88852f, 28.975946f, 227.02405f),
                    PathNode.CurveTo(35.111504f, 233.1596f, 45.01937f, 233.28647f, 51.31f, 227.31f),
                    PathNode.LineTo(125.66f, 153.0f),
                    PathNode.LineTo(140.89f, 168.23f),
                    PathNode.CurveTo(141.64027f, 168.98111f, 142.65836f, 169.40315f, 143.72f, 169.40315f),
                    PathNode.CurveTo(144.78163f, 169.40315f, 145.79973f, 168.98111f, 146.55f, 168.23f),
                    PathNode.LineTo(208.21f, 106.57f),
                    PathNode.CurveTo(208.97034f, 105.81855f, 209.39824f, 104.794014f, 209.39824f, 103.725f),
                    PathNode.CurveTo(209.39824f, 102.65598f, 208.97034f, 101.631454f, 208.21f, 100.88f),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
