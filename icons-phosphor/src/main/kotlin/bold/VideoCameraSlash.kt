package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorBoldIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.45f, 69.31f),
                    PathNode.CurveTo(245.4241f, 67.26246f, 240.58951f, 67.64892f, 236.94f, 70.31f),
                    PathNode.LineTo(212.0f, 88.43f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.0f, 60.954304f, 203.0457f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(123.88f, 52.0f),
                    PathNode.CurveTo(117.25259f, 52.0f, 111.88f, 57.37258f, 111.88f, 64.0f),
                    PathNode.CurveTo(111.88f, 70.62742f, 117.25259f, 76.0f, 123.88f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 144.0f),
                    PathNode.CurveTo(188.00162f, 147.6239f, 189.64082f, 151.05298f, 192.46f, 153.33f),
                    PathNode.CurveTo(192.61f, 153.46f, 192.77f, 153.58f, 192.94f, 153.71f),
                    PathNode.LineTo(236.94f, 185.71f),
                    PathNode.CurveTo(240.591f, 188.3664f, 245.42409f, 188.74857f, 249.44719f, 186.699f),
                    PathNode.CurveTo(253.47032f, 184.64944f, 256.00247f, 180.5151f, 256.0f, 176.0f),
                    PathNode.LineTo(256.0f, 80.0f),
                    PathNode.CurveTo(255.99962f, 75.48875f, 253.46915f, 71.358864f, 249.45f, 69.31f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 152.43f),
                    PathNode.LineTo(212.0f, 137.89f),
                    PathNode.LineTo(212.0f, 118.11f),
                    PathNode.LineTo(232.0f, 103.57f),
                    PathNode.Close,
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(42.69f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(20.954306f, 52.0f, 12.0f, 60.954304f, 12.0f, 72.0f),
                    PathNode.LineTo(12.0f, 184.0f),
                    PathNode.CurveTo(12.0f, 195.0457f, 20.954306f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(180.87f, 204.0f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 180.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.LineTo(64.51f, 76.0f),
                    PathNode.LineTo(159.06f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
