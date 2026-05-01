package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorThinIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 126.84f),
                    PathNode.CurveTo(180.1621f, 123.96393f, 175.99214f, 121.55999f, 171.58f, 119.68f),
                    PathNode.CurveTo(168.58f, 90.3f, 149.58f, 81.28f, 141.02f, 78.68f),
                    PathNode.CurveTo(122.86f, 73.18f, 102.02f, 79.68f, 92.66f, 93.77f),
                    PathNode.CurveTo(91.43393f, 95.6091f, 91.93089f, 98.093925f, 93.77f, 99.32f),
                    PathNode.CurveTo(95.6091f, 100.546074f, 98.093925f, 100.04911f, 99.32f, 98.21f),
                    PathNode.CurveTo(106.72f, 87.11f, 124.02f, 81.89f, 138.7f, 86.34f),
                    PathNode.CurveTo(146.82f, 88.79f, 159.65f, 95.94f, 163.11f, 116.66f),
                    PathNode.CurveTo(156.37277f, 114.74828f, 149.4032f, 113.77906f, 142.4f, 113.78f),
                    PathNode.CurveTo(129.26f, 113.78f, 117.03f, 117.12f, 107.96f, 123.21f),
                    PathNode.CurveTo(97.51f, 130.21f, 91.96f, 140.21f, 91.96f, 151.99f),
                    PathNode.CurveTo(91.96f, 172.69f, 108.96f, 183.51f, 125.67f, 183.51f),
                    PathNode.CurveTo(137.56435f, 183.42311f, 148.91678f, 178.52428f, 157.14f, 169.93f),
                    PathNode.CurveTo(166.7f, 159.99f, 171.82f, 145.74f, 171.96f, 128.7f),
                    PathNode.CurveTo(174.47975f, 129.99759f, 176.885f, 131.50632f, 179.15f, 133.21f),
                    PathNode.CurveTo(190.15f, 141.53f, 195.96f, 153.55f, 195.96f, 167.99f),
                    PathNode.CurveTo(195.96f, 179.72f, 189.71f, 192.45f, 179.26f, 202.04f),
                    PathNode.CurveTo(170.36f, 210.24f, 154.21f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(77.57f, 220.0f, 52.0f, 189.05f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 66.95f, 77.57f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(162.29f, 36.0f, 185.26f, 50.5f, 196.27f, 79.08f),
                    PathNode.CurveTo(196.73975f, 80.47178f, 197.93454f, 81.49411f, 199.38222f, 81.74299f),
                    PathNode.CurveTo(200.8299f, 81.991875f, 202.29752f, 81.42725f, 203.20511f, 80.27226f),
                    PathNode.CurveTo(204.11269f, 79.11727f, 204.3142f, 77.55775f, 203.73f, 76.21f),
                    PathNode.CurveTo(191.42f, 44.22f, 165.94f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(73.05f, 28.0f, 44.0f, 62.58f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 193.42f, 73.05f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(156.79f, 228.0f, 174.72f, 217.1f, 184.7f, 207.95f),
                    PathNode.CurveTo(196.79f, 196.87f, 204.0f, 181.95f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 151.0f, 197.09f, 136.73f, 184.0f, 126.84f),
                    PathNode.Close,
                    PathNode.MoveTo(151.4f, 164.39f),
                    PathNode.CurveTo(144.6921f, 171.42442f, 135.41971f, 175.44005f, 125.7f, 175.52f),
                    PathNode.CurveTo(113.32f, 175.52f, 99.99f, 168.16f, 99.99f, 152.0f),
                    PathNode.CurveTo(99.99f, 131.24f, 121.99f, 121.79f, 142.4f, 121.79f),
                    PathNode.CurveTo(149.74359f, 121.769775f, 157.04066f, 122.95555f, 164.0f, 125.3f),
                    PathNode.CurveTo(164.0f, 126.18f, 164.05f, 127.08f, 164.05f, 128.0f),
                    PathNode.CurveTo(164.0f, 143.25f, 159.65f, 155.83f, 151.41f, 164.39f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
