package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorBoldIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 56.0f),
                    PathNode.LineTo(244.0f, 104.0f),
                    PathNode.CurveTo(244.0f, 110.62742f, 238.62741f, 116.0f, 232.0f, 116.0f),
                    PathNode.LineTo(184.0f, 116.0f),
                    PathNode.CurveTo(177.37259f, 116.0f, 172.0f, 110.62742f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 97.37258f, 177.37259f, 92.0f, 184.0f, 92.0f),
                    PathNode.LineTo(201.1f, 92.0f),
                    PathNode.LineTo(182.1f, 74.62f),
                    PathNode.CurveTo(181.97f, 74.5f, 181.84f, 74.38f, 181.72f, 74.25f),
                    PathNode.CurveTo(157.47882f, 50.023624f, 120.02218f, 45.018787f, 90.27084f, 62.030857f),
                    PathNode.CurveTo(60.519512f, 79.04292f, 45.83487f, 113.862595f, 54.418774f, 147.04193f),
                    PathNode.CurveTo(63.002674f, 180.22128f, 92.7312f, 203.55072f, 127.0f, 204.0f),
                    PathNode.LineTo(128.0f, 204.0f),
                    PathNode.CurveTo(147.39917f, 204.04675f, 166.07259f, 196.62752f, 180.15f, 183.28f),
                    PathNode.CurveTo(184.96869f, 178.72641f, 192.5664f, 178.94131f, 197.12f, 183.76f),
                    PathNode.CurveTo(201.67358f, 188.57869f, 201.45868f, 196.1764f, 196.64f, 200.73f),
                    PathNode.CurveTo(178.10889f, 218.29414f, 153.53229f, 228.05818f, 128.0f, 228.0f),
                    PathNode.LineTo(126.63f, 228.0f),
                    PathNode.CurveTo(81.59045f, 227.36516f, 42.534348f, 196.69656f, 31.236156f, 153.09248f),
                    PathNode.CurveTo(19.937965f, 109.48841f, 39.186646f, 63.71254f, 78.250725f, 41.28572f),
                    PathNode.CurveTo(117.31481f, 18.858902f, 166.5513f, 25.317198f, 198.51f, 57.06f),
                    PathNode.LineTo(220.0f, 76.72f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 225.37259f, 44.0f, 232.0f, 44.0f),
                    PathNode.CurveTo(238.62741f, 44.0f, 244.0f, 49.37258f, 244.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
