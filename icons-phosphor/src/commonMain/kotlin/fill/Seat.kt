package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorFillIcon(
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
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.LineTo(143.78f, 144.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(126.19f, 53.68f),
                    PathNode.CurveTo(126.23259f, 53.60978f, 126.26938f, 53.5362f, 126.3f, 53.46f),
                    PathNode.CurveTo(130.24838f, 45.559338f, 127.048f, 35.953712f, 119.15f, 32.0f),
                    PathNode.LineTo(118.68f, 31.78f),
                    PathNode.LineTo(85.0f, 17.57f),
                    PathNode.CurveTo(77.13286f, 13.812723f, 67.70576f, 17.045507f, 63.8f, 24.84f),
                    PathNode.LineTo(41.68f, 68.84f),
                    PathNode.CurveTo(39.44037f, 73.350624f, 39.44037f, 78.649376f, 41.68f, 83.16f),
                    PathNode.LineTo(99.79f, 199.16f),
                    PathNode.CurveTo(102.49037f, 204.59328f, 108.0427f, 208.02084f, 114.11f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(216.83656f, 208.0f, 224.0f, 200.83656f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 151.16344f, 216.83656f, 144.0f, 208.0f, 144.0f),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
