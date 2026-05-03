package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorRegularIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 232.0f),
                    PathNode.CurveTo(224.0f, 236.41827f, 220.41827f, 240.0f, 216.0f, 240.0f),
                    PathNode.LineTo(112.0f, 240.0f),
                    PathNode.CurveTo(107.58172f, 240.0f, 104.0f, 236.41827f, 104.0f, 232.0f),
                    PathNode.CurveTo(104.0f, 227.58173f, 107.58172f, 224.0f, 112.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 227.58173f, 224.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 200.83656f, 216.83656f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(114.11f, 208.0f),
                    PathNode.CurveTo(108.04047f, 208.01897f, 102.48756f, 204.58717f, 99.79f, 199.15f),
                    PathNode.LineTo(41.68f, 83.15f),
                    PathNode.CurveTo(39.44037f, 78.63937f, 39.44037f, 73.34063f, 41.68f, 68.83f),
                    PathNode.LineTo(63.8f, 24.83f),
                    PathNode.CurveTo(67.70576f, 17.03551f, 77.13286f, 13.802723f, 85.0f, 17.56f),
                    PathNode.LineTo(118.69f, 31.78f),
                    PathNode.LineTo(119.16f, 32.0f),
                    PathNode.CurveTo(127.05799f, 35.953712f, 130.25838f, 45.559338f, 126.31f, 53.46f),
                    PathNode.CurveTo(126.27938f, 53.5362f, 126.24259f, 53.60978f, 126.2f, 53.68f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(143.78f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(216.83656f, 144.0f, 224.0f, 151.16344f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.LineTo(143.77f, 160.0f),
                    PathNode.CurveTo(137.70274f, 160.0199f, 132.15231f, 156.58725f, 129.46f, 151.15f),
                    PathNode.LineTo(97.67f, 87.15f),
                    PathNode.CurveTo(95.43564f, 82.64869f, 95.43564f, 77.36131f, 97.67f, 72.86f),
                    PathNode.LineTo(97.79f, 72.64f),
                    PathNode.LineTo(112.0f, 46.32f),
                    PathNode.LineTo(78.57f, 32.21f),
                    PathNode.CurveTo(78.40972f, 32.148388f, 78.25283f, 32.07829f, 78.1f, 32.0f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.LineTo(114.1f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
