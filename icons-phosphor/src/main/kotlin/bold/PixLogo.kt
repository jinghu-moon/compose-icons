package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorBoldIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.16f, 113.89f),
                    PathNode.LineTo(142.16f, 17.89f),
                    PathNode.CurveTo(134.35692f, 10.122265f, 121.74308f, 10.122265f, 113.94f, 17.89f),
                    PathNode.LineTo(17.94f, 113.94f),
                    PathNode.CurveTo(10.172264f, 121.74308f, 10.172264f, 134.35692f, 17.94f, 142.16f),
                    PathNode.LineTo(113.99f, 238.16f),
                    PathNode.CurveTo(121.793076f, 245.92773f, 134.40692f, 245.92773f, 142.21f, 238.16f),
                    PathNode.LineTo(238.21f, 142.16f),
                    PathNode.CurveTo(245.97774f, 134.35692f, 245.97774f, 121.74308f, 238.21f, 113.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 37.68f),
                    PathNode.LineTo(174.32f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(156.81645f, 83.9975f, 153.76236f, 85.26014f, 151.51f, 87.51f),
                    PathNode.LineTo(128.0f, 111.0f),
                    PathNode.LineTo(104.49f, 87.51f),
                    PathNode.CurveTo(102.23763f, 85.26014f, 99.183556f, 83.9975f, 96.0f, 84.0f),
                    PathNode.LineTo(81.68f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.68f, 108.0f),
                    PathNode.LineTo(91.0f, 108.0f),
                    PathNode.LineTo(111.0f, 128.0f),
                    PathNode.LineTo(91.0f, 148.0f),
                    PathNode.LineTo(57.68f, 148.0f),
                    PathNode.LineTo(37.68f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.32f),
                    PathNode.LineTo(81.68f, 172.0f),
                    PathNode.LineTo(96.0f, 172.0f),
                    PathNode.CurveTo(99.183556f, 172.0025f, 102.23763f, 170.73987f, 104.49f, 168.49f),
                    PathNode.LineTo(128.0f, 145.0f),
                    PathNode.LineTo(151.51f, 168.52f),
                    PathNode.CurveTo(153.76727f, 170.75887f, 156.82074f, 172.01047f, 160.0f, 172.0f),
                    PathNode.LineTo(174.32f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.32f, 148.0f),
                    PathNode.LineTo(165.0f, 148.0f),
                    PathNode.LineTo(145.0f, 128.0f),
                    PathNode.LineTo(165.0f, 108.0f),
                    PathNode.LineTo(198.35f, 108.0f),
                    PathNode.LineTo(218.35f, 128.0f),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
