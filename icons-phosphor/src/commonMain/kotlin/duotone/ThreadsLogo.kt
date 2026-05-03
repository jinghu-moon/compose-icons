package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorDuotoneIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 176.0f, 192.0f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(64.0f, 224.0f, 48.0f, 176.0f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 80.0f, 64.0f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(192.0f, 32.0f, 208.0f, 80.0f, 208.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.42f, 123.65f),
                    PathNode.CurveTo(182.94847f, 121.036896f, 179.21912f, 118.78522f, 175.29f, 116.93f),
                    PathNode.CurveTo(171.29f, 87.04f, 151.29f, 77.62f, 142.19f, 74.86f),
                    PathNode.CurveTo(122.41f, 68.86f, 99.68f, 76.05f, 89.34f, 91.56f),
                    PathNode.CurveTo(86.887856f, 95.23822f, 87.88178f, 100.207855f, 91.56f, 102.66f),
                    PathNode.CurveTo(95.23822f, 105.112144f, 100.207855f, 104.11822f, 102.66f, 100.44f),
                    PathNode.CurveTo(109.03f, 90.88f, 124.66f, 86.28f, 137.55f, 90.17f),
                    PathNode.CurveTo(147.5f, 93.17f, 154.37f, 100.47f, 157.7f, 111.17f),
                    PathNode.CurveTo(152.66008f, 110.21048f, 147.54044f, 109.73167f, 142.41f, 109.74f),
                    PathNode.CurveTo(128.49f, 109.74f, 115.46f, 113.33f, 105.74f, 119.84f),
                    PathNode.CurveTo(94.3f, 127.57f, 88.0f, 139.0f, 88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 172.58f, 103.86f, 187.52f, 125.71f, 187.52f),
                    PathNode.CurveTo(138.69162f, 187.43155f, 151.08385f, 182.08864f, 160.06f, 172.71f),
                    PathNode.CurveTo(166.5f, 166.01f, 174.06f, 154.35f, 175.67f, 135.61f),
                    PathNode.CurveTo(176.05f, 135.87f, 176.41f, 136.14f, 176.77f, 136.41f),
                    PathNode.CurveTo(186.88f, 144.05f, 192.0f, 154.68f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 187.36f, 171.66f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(101.27f, 216.0f, 82.52f, 207.35f, 70.66f, 189.56f),
                    PathNode.CurveTo(60.93f, 175.0f, 56.0f, 154.26f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 101.74f, 60.93f, 81.0f, 70.66f, 66.44f),
                    PathNode.CurveTo(82.52f, 48.65f, 101.27f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(160.93f, 40.0f, 182.0f, 53.25f, 192.53f, 80.52f),
                    PathNode.CurveTo(193.53455f, 83.21874f, 195.91199f, 85.169365f, 198.75497f, 85.627396f),
                    PathNode.CurveTo(201.59795f, 86.085434f, 204.46773f, 84.980194f, 206.26903f, 82.733505f),
                    PathNode.CurveTo(208.07034f, 80.48682f, 208.5252f, 77.44538f, 207.46f, 74.77f),
                    PathNode.CurveTo(194.68f, 41.56f, 167.2f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(96.0f, 24.0f, 72.19f, 35.29f, 57.34f, 57.56f),
                    PathNode.CurveTo(45.83f, 74.83f, 40.0f, 98.52f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 157.48f, 45.83f, 181.17f, 57.34f, 198.44f),
                    PathNode.CurveTo(72.19f, 220.71f, 96.0f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(158.07f, 232.0f, 176.9f, 220.52f, 187.4f, 210.9f),
                    PathNode.CurveTo(200.3f, 199.08f, 208.0f, 183.0f, 208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 149.66f, 200.54f, 134.32f, 186.42f, 123.65f),
                    PathNode.Close,
                    PathNode.MoveTo(148.53f, 161.65f),
                    PathNode.CurveTo(142.5737f, 167.89816f, 134.34195f, 171.46933f, 125.71f, 171.55f),
                    PathNode.CurveTo(114.9f, 171.55f, 104.0f, 165.55f, 104.0f, 152.03f),
                    PathNode.CurveTo(104.0f, 139.4f, 116.0f, 125.82f, 142.41f, 125.82f),
                    PathNode.CurveTo(148.3574f, 125.803894f, 154.27791f, 126.61842f, 160.0f, 128.24f),
                    PathNode.CurveTo(160.0f, 142.32f, 156.0f, 153.86f, 148.53f, 161.62f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
