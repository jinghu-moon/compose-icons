package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorBoldIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.28f, 141.0f),
                    PathNode.CurveTo(218.86902f, 121.93001f, 207.94525f, 104.88337f, 192.88f, 92.0f),
                    PathNode.LineTo(240.0f, 92.0f),
                    PathNode.CurveTo(246.62741f, 92.0f, 252.0f, 86.62742f, 252.0f, 80.0f),
                    PathNode.CurveTo(252.0f, 73.37258f, 246.62741f, 68.0f, 240.0f, 68.0f),
                    PathNode.LineTo(161.94f, 68.0f),
                    PathNode.CurveTo(156.85367f, 53.617973f, 143.25494f, 44.00318f, 128.0f, 44.00318f),
                    PathNode.CurveTo(112.74505f, 44.00318f, 99.14633f, 53.617973f, 94.06f, 68.0f),
                    PathNode.LineTo(16.0f, 68.0f),
                    PathNode.CurveTo(9.372583f, 68.0f, 4.0f, 73.37258f, 4.0f, 80.0f),
                    PathNode.CurveTo(4.0f, 86.62742f, 9.372583f, 92.0f, 16.0f, 92.0f),
                    PathNode.LineTo(63.12f, 92.0f),
                    PathNode.CurveTo(48.05474f, 104.88337f, 37.130978f, 121.93001f, 31.72f, 141.0f),
                    PathNode.CurveTo(14.706326f, 145.05305f, 3.067229f, 160.74797f, 4.128993f, 178.20549f),
                    PathNode.CurveTo(5.190756f, 195.66301f, 18.64615f, 209.83167f, 36.025616f, 211.79294f),
                    PathNode.CurveTo(53.40508f, 213.75421f, 69.679726f, 202.9406f, 74.60541f, 186.15875f),
                    PathNode.CurveTo(79.53108f, 169.37692f, 71.68251f, 151.48282f, 56.0f, 143.74f),
                    PathNode.CurveTo(62.8545f, 123.61609f, 77.75792f, 107.24225f, 97.15f, 98.53f),
                    PathNode.CurveTo(103.66054f, 109.354744f, 115.3682f, 115.97528f, 128.0f, 115.97528f),
                    PathNode.CurveTo(140.63179f, 115.97528f, 152.33946f, 109.354744f, 158.85f, 98.53f),
                    PathNode.CurveTo(178.24208f, 107.24225f, 193.14551f, 123.61609f, 200.0f, 143.74f),
                    PathNode.CurveTo(184.31749f, 151.48282f, 176.46892f, 169.37692f, 181.39459f, 186.15875f),
                    PathNode.CurveTo(186.32027f, 202.9406f, 202.59492f, 213.75421f, 219.97438f, 211.79294f),
                    PathNode.CurveTo(237.35385f, 209.83167f, 250.80925f, 195.66301f, 251.871f, 178.20549f),
                    PathNode.CurveTo(252.93277f, 160.74797f, 241.29367f, 145.05305f, 224.28f, 141.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 188.0f),
                    PathNode.CurveTo(33.37258f, 188.0f, 28.0f, 182.62741f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 169.37259f, 33.37258f, 164.0f, 40.0f, 164.0f),
                    PathNode.CurveTo(46.62742f, 164.0f, 52.0f, 169.37259f, 52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 182.62741f, 46.62742f, 188.0f, 40.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 188.0f),
                    PathNode.CurveTo(209.37259f, 188.0f, 204.0f, 182.62741f, 204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 169.37259f, 209.37259f, 164.0f, 216.0f, 164.0f),
                    PathNode.CurveTo(222.62741f, 164.0f, 228.0f, 169.37259f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 182.62741f, 222.62741f, 188.0f, 216.0f, 188.0f),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
