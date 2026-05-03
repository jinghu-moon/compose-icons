package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorRegularIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.31f, 81.37f),
                    PathNode.LineTo(190.63f, 28.69f),
                    PathNode.CurveTo(187.62932f, 25.688627f, 183.5591f, 24.002417f, 179.315f, 24.002417f),
                    PathNode.CurveTo(175.0709f, 24.002417f, 171.00069f, 25.688627f, 168.0f, 28.69f),
                    PathNode.LineTo(60.69f, 136.0f),
                    PathNode.CurveTo(57.68863f, 139.00069f, 56.00242f, 143.0709f, 56.00242f, 147.315f),
                    PathNode.CurveTo(56.00242f, 151.5591f, 57.68863f, 155.62932f, 60.69f, 158.63f),
                    PathNode.LineTo(81.37f, 179.31f),
                    PathNode.LineTo(34.37f, 226.31f),
                    PathNode.CurveTo(31.244068f, 229.43594f, 31.244068f, 234.50407f, 34.37f, 237.63f),
                    PathNode.CurveTo(37.495934f, 240.75594f, 42.564068f, 240.75594f, 45.69f, 237.63f),
                    PathNode.LineTo(92.69f, 190.63f),
                    PathNode.LineTo(113.37f, 211.31f),
                    PathNode.CurveTo(116.37069f, 214.31137f, 120.4409f, 215.99759f, 124.685f, 215.99759f),
                    PathNode.CurveTo(128.9291f, 215.99759f, 132.99931f, 214.31137f, 136.0f, 211.31f),
                    PathNode.LineTo(243.31f, 104.0f),
                    PathNode.CurveTo(246.31137f, 100.99931f, 247.99759f, 96.92911f, 247.99759f, 92.685f),
                    PathNode.CurveTo(247.99759f, 88.4409f, 246.31137f, 84.37069f, 243.31f, 81.37f),
                    PathNode.Close,
                    PathNode.MoveTo(124.69f, 200.0f),
                    PathNode.LineTo(104.0f, 179.31f),
                    PathNode.LineTo(133.66f, 149.66f),
                    PathNode.CurveTo(136.78593f, 146.53407f, 136.78593f, 141.46593f, 133.66f, 138.34f),
                    PathNode.CurveTo(130.53407f, 135.21407f, 125.465935f, 135.21407f, 122.34f, 138.34f),
                    PathNode.LineTo(92.69f, 168.0f),
                    PathNode.LineTo(72.0f, 147.31f),
                    PathNode.LineTo(107.31f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(160.0f, 164.69f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 92.69f),
                    PathNode.LineTo(176.0f, 148.69f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 99.58172f, 172.41827f, 96.0f, 168.0f, 96.0f),
                    PathNode.LineTo(123.31f, 96.0f),
                    PathNode.LineTo(179.31f, 40.0f),
                    PathNode.LineTo(232.0f, 92.68f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 88.0f),
                    PathNode.CurveTo(75.463974f, 88.0f, 88.0f, 75.463974f, 88.0f, 60.0f),
                    PathNode.CurveTo(88.0f, 44.53603f, 75.463974f, 32.0f, 60.0f, 32.0f),
                    PathNode.CurveTo(44.53603f, 32.0f, 32.0f, 44.53603f, 32.0f, 60.0f),
                    PathNode.CurveTo(32.0f, 75.463974f, 44.53603f, 88.0f, 60.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 48.0f),
                    PathNode.CurveTo(66.62742f, 48.0f, 72.0f, 53.37258f, 72.0f, 60.0f),
                    PathNode.CurveTo(72.0f, 66.62742f, 66.62742f, 72.0f, 60.0f, 72.0f),
                    PathNode.CurveTo(53.37258f, 72.0f, 48.0f, 66.62742f, 48.0f, 60.0f),
                    PathNode.CurveTo(48.0f, 53.37258f, 53.37258f, 48.0f, 60.0f, 48.0f),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
