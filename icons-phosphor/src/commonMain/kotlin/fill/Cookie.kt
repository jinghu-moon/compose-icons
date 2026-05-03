package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = phosphorFillIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.CurveTo(201.90862f, 120.0f, 184.0f, 102.09139f, 184.0f, 80.0f),
                    PathNode.CurveTo(184.0f, 75.58172f, 180.41827f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(153.90862f, 72.0f, 136.0f, 54.09139f, 136.0f, 32.0f),
                    PathNode.CurveTo(136.0f, 27.581722f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(75.51f, 99.51f),
                    PathNode.CurveTo(80.20058f, 94.83568f, 87.790985f, 94.84447f, 92.470726f, 99.52963f),
                    PathNode.CurveTo(97.150475f, 104.2148f, 97.150475f, 111.80521f, 92.470726f, 116.49037f),
                    PathNode.CurveTo(87.790985f, 121.17554f, 80.20058f, 121.18432f, 75.51f, 116.51f),
                    PathNode.CurveTo(73.25055f, 114.25838f, 71.98054f, 111.19982f, 71.98054f, 108.01f),
                    PathNode.CurveTo(71.98054f, 104.82018f, 73.25055f, 101.76162f, 75.51f, 99.51f),
                    PathNode.Close,
                    PathNode.MoveTo(100.51f, 172.51f),
                    PathNode.CurveTo(95.81941f, 177.18433f, 88.22902f, 177.17554f, 83.54927f, 172.49037f),
                    PathNode.CurveTo(78.86953f, 167.8052f, 78.86953f, 160.2148f, 83.54927f, 155.52963f),
                    PathNode.CurveTo(88.22902f, 150.84447f, 95.81941f, 150.83568f, 100.51f, 155.51f),
                    PathNode.CurveTo(102.76067f, 157.76347f, 104.02319f, 160.81923f, 104.01944f, 164.00415f),
                    PathNode.CurveTo(104.01569f, 167.18906f, 102.74598f, 170.24184f, 100.49f, 172.49f),
                    PathNode.Close,
                    PathNode.MoveTo(123.51f, 132.51f),
                    PathNode.CurveTo(118.83568f, 127.81941f, 118.84447f, 120.22902f, 123.52963f, 115.54927f),
                    PathNode.CurveTo(128.2148f, 110.86953f, 135.8052f, 110.86953f, 140.49037f, 115.54927f),
                    PathNode.CurveTo(145.17554f, 120.22902f, 145.18433f, 127.81941f, 140.51f, 132.51f),
                    PathNode.CurveTo(138.25572f, 134.7668f, 135.19566f, 136.03322f, 132.00584f, 136.02946f),
                    PathNode.CurveTo(128.81602f, 136.02571f, 125.758965f, 134.7521f, 123.51f, 132.49f),
                    PathNode.Close,
                    PathNode.MoveTo(164.51f, 180.51f),
                    PathNode.CurveTo(159.81943f, 185.18433f, 152.22902f, 185.17554f, 147.54927f, 180.49037f),
                    PathNode.CurveTo(142.86952f, 175.8052f, 142.86952f, 168.2148f, 147.54927f, 163.52963f),
                    PathNode.CurveTo(152.22902f, 158.84447f, 159.81943f, 158.83568f, 164.51f, 163.51f),
                    PathNode.CurveTo(166.76068f, 165.76347f, 168.0232f, 168.81923f, 168.01944f, 172.00415f),
                    PathNode.CurveTo(168.01569f, 175.18906f, 166.74597f, 178.24184f, 164.49f, 180.49f),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
