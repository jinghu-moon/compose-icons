package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorFillIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.18f, 129.52f),
                    PathNode.CurveTo(59.783794f, 130.73596f, 58.83004f, 131.68918f, 57.613846f, 132.08469f),
                    PathNode.CurveTo(56.397648f, 132.4802f, 55.06565f, 132.27032f, 54.03f, 131.52f),
                    PathNode.LineTo(22.66f, 109.0f),
                    PathNode.CurveTo(16.939907f, 104.956795f, 14.569849f, 97.62672f, 16.84f, 91.0f),
                    PathNode.CurveTo(19.131426f, 84.36302f, 25.40891f, 79.933754f, 32.43f, 80.0f),
                    PathNode.LineTo(70.74f, 80.0f),
                    PathNode.CurveTo(72.02239f, 79.99774f, 73.22812f, 80.61047f, 73.98227f, 81.647675f),
                    PathNode.CurveTo(74.73642f, 82.684875f, 74.94754f, 84.02078f, 74.55f, 85.24f),
                    PathNode.Close,
                    PathNode.MoveTo(53.18f, 203.0f),
                    PathNode.CurveTo(50.95919f, 209.59128f, 53.32482f, 216.85889f, 59.0f, 220.88f),
                    PathNode.CurveTo(64.57227f, 225.0186f, 72.19773f, 225.0186f, 77.77f, 220.88f),
                    PathNode.LineTo(109.82f, 197.82f),
                    PathNode.CurveTo(110.867165f, 197.06866f, 111.48815f, 195.85881f, 111.48815f, 194.57f),
                    PathNode.CurveTo(111.48815f, 193.28119f, 110.867165f, 192.07133f, 109.82f, 191.32f),
                    PathNode.LineTo(71.38f, 163.72f),
                    PathNode.CurveTo(70.34479f, 162.97392f, 69.01573f, 162.76654f, 67.80243f, 163.16174f),
                    PathNode.CurveTo(66.58913f, 163.55696f, 65.63719f, 164.50734f, 65.24f, 165.72f),
                    PathNode.Close,
                    PathNode.MoveTo(143.23f, 19.26f),
                    PathNode.CurveTo(141.18376f, 12.573421f, 135.01613f, 8.003037f, 128.02347f, 7.991555f),
                    PathNode.CurveTo(121.0308f, 7.980072f, 114.84818f, 12.530176f, 112.78f, 19.21f),
                    PathNode.LineTo(100.0f, 58.76f),
                    PathNode.CurveTo(99.6051f, 59.970867f, 99.81045f, 61.29742f, 100.55297f, 62.33222f),
                    PathNode.CurveTo(101.2955f, 63.367016f, 102.486435f, 63.98635f, 103.76f, 64.0f),
                    PathNode.LineTo(152.24f, 64.0f),
                    PathNode.CurveTo(153.51997f, 64.00122f, 154.72322f, 63.389816f, 155.47688f, 62.35526f),
                    PathNode.CurveTo(156.23055f, 61.320705f, 156.44359f, 59.98795f, 156.05f, 58.77f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(94.26703f, 80.002686f, 92.73289f, 81.12099f, 92.2f, 82.77f),
                    PathNode.LineTo(73.0f, 141.77f),
                    PathNode.CurveTo(72.46425f, 143.4241f, 73.0584f, 145.23486f, 74.47f, 146.25f),
                    PathNode.LineTo(125.64f, 183.07f),
                    PathNode.CurveTo(127.037224f, 184.07782f, 128.92278f, 184.07782f, 130.32f, 183.07f),
                    PathNode.LineTo(181.49f, 146.25f),
                    PathNode.CurveTo(182.9016f, 145.23486f, 183.49576f, 143.4241f, 182.96f, 141.77f),
                    PathNode.LineTo(163.81f, 82.77f),
                    PathNode.CurveTo(163.27597f, 81.117485f, 161.73665f, 79.998344f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(239.13f, 91.0f),
                    PathNode.CurveTo(236.83858f, 84.36302f, 230.56111f, 79.933754f, 223.54f, 80.0f),
                    PathNode.LineTo(185.26f, 80.0f),
                    PathNode.CurveTo(183.97762f, 79.99774f, 182.77188f, 80.61047f, 182.01773f, 81.647675f),
                    PathNode.CurveTo(181.26358f, 82.684875f, 181.05246f, 84.02078f, 181.45f, 85.24f),
                    PathNode.LineTo(195.82f, 129.53f),
                    PathNode.CurveTo(196.2172f, 130.74266f, 197.16913f, 131.69304f, 198.38243f, 132.08826f),
                    PathNode.CurveTo(199.59573f, 132.48346f, 200.92479f, 132.27608f, 201.96f, 131.53f),
                    PathNode.LineTo(233.37f, 108.93f),
                    PathNode.CurveTo(239.0563f, 104.89401f, 241.41188f, 97.59941f, 239.16f, 91.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.58f, 163.75f),
                    PathNode.LineTo(146.18f, 191.38f),
                    PathNode.CurveTo(145.13284f, 192.13133f, 144.51184f, 193.34119f, 144.51184f, 194.63f),
                    PathNode.CurveTo(144.51184f, 195.9188f, 145.13284f, 197.12868f, 146.18f, 197.88f),
                    PathNode.LineTo(178.18f, 220.88f),
                    PathNode.CurveTo(183.78537f, 224.99248f, 191.40494f, 225.0146f, 197.0341f, 220.93477f),
                    PathNode.CurveTo(202.66328f, 216.85493f, 205.01366f, 209.6069f, 202.85f, 203.0f),
                    PathNode.LineTo(190.76f, 165.73f),
                    PathNode.CurveTo(190.36612f, 164.51231f, 189.4133f, 163.55663f, 188.1968f, 163.15903f),
                    PathNode.CurveTo(186.9803f, 162.76144f, 185.64702f, 162.96997f, 184.61f, 163.72f),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
