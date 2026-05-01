package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorFillIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(95.163445f, 16.0f, 88.0f, 23.163445f, 88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 108.69f),
                    PathNode.LineTo(49.25f, 147.43f),
                    PathNode.CurveTo(26.68925f, 170.51346f, 26.900745f, 207.45206f, 49.724342f, 230.27565f),
                    PathNode.CurveTo(72.54794f, 253.09926f, 109.48655f, 253.31075f, 132.57f, 230.75f),
                    PathNode.LineTo(201.0f, 162.34f),
                    PathNode.CurveTo(205.51141f, 157.8365f, 208.03226f, 151.71443f, 208.0f, 145.34f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 23.163445f, 200.83656f, 16.0f, 192.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 151.0f),
                    PathNode.LineTo(157.8f, 182.88f),
                    PathNode.CurveTo(150.41808f, 169.25946f, 150.06398f, 152.91344f, 156.84915f, 138.986f),
                    PathNode.CurveTo(163.63431f, 125.058556f, 176.72441f, 115.262276f, 192.0f, 112.68f),
                    PathNode.LineTo(192.0f, 145.37f),
                    PathNode.CurveTo(191.99373f, 147.48198f, 191.15257f, 149.50578f, 189.66f, 151.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
