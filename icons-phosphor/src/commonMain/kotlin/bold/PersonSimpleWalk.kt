package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorBoldIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 84.0f),
                    PathNode.CurveTo(171.88223f, 84.0f, 188.0f, 67.88225f, 188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 28.117748f, 171.88223f, 12.0f, 152.0f, 12.0f),
                    PathNode.CurveTo(132.11775f, 12.0f, 116.0f, 28.117748f, 116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 67.88225f, 132.11775f, 84.0f, 152.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 36.0f),
                    PathNode.CurveTo(158.62741f, 36.0f, 164.0f, 41.37258f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 54.62742f, 158.62741f, 60.0f, 152.0f, 60.0f),
                    PathNode.CurveTo(145.37259f, 60.0f, 140.0f, 54.62742f, 140.0f, 48.0f),
                    PathNode.CurveTo(140.0f, 41.37258f, 145.37259f, 36.0f, 152.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 148.0f),
                    PathNode.CurveTo(220.0f, 154.62741f, 214.62741f, 160.0f, 208.0f, 160.0f),
                    PathNode.CurveTo(171.0f, 160.0f, 152.73f, 141.53f, 138.0f, 126.7f),
                    PathNode.CurveTo(136.29f, 124.98f, 134.64f, 123.3f, 133.0f, 121.7f),
                    PathNode.LineTo(124.37f, 141.55f),
                    PathNode.LineTo(159.0f, 166.23f),
                    PathNode.CurveTo(162.14554f, 168.48906f, 164.00748f, 172.12732f, 164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 232.0f),
                    PathNode.CurveTo(164.0f, 238.62741f, 158.62741f, 244.0f, 152.0f, 244.0f),
                    PathNode.CurveTo(145.37259f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 182.17f),
                    PathNode.LineTo(114.63f, 164.05f),
                    PathNode.LineTo(83.0f, 236.78f),
                    PathNode.CurveTo(81.36728f, 240.82707f, 77.66616f, 243.66875f, 73.33471f, 244.20087f),
                    PathNode.CurveTo(69.00326f, 244.73299f, 64.72437f, 242.87167f, 62.160618f, 239.34013f),
                    PathNode.CurveTo(59.59685f, 235.8086f, 59.15242f, 231.16362f, 61.0f, 227.21f),
                    PathNode.LineTo(111.06f, 112.08f),
                    PathNode.QuadTo(100.42f, 112.83f, 86.06f, 120.48f),
                    PathNode.CurveTo(75.33603f, 126.390274f, 65.327f, 133.5137f, 56.23f, 141.71f),
                    PathNode.CurveTo(51.397507f, 146.24702f, 43.80202f, 146.00749f, 39.265f, 141.175f),
                    PathNode.CurveTo(34.72798f, 136.34251f, 34.96751f, 128.74702f, 39.8f, 124.21f),
                    PathNode.CurveTo(42.41f, 121.76f, 104.16f, 64.54f, 143.89f, 99.03f),
                    PathNode.CurveTo(147.83f, 102.45f, 151.53f, 106.19f, 155.11f, 109.81f),
                    PathNode.CurveTo(168.43f, 123.28f, 181.0f, 136.0f, 208.0f, 136.0f),
                    PathNode.CurveTo(214.62741f, 136.0f, 220.0f, 141.37259f, 220.0f, 148.0f),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
