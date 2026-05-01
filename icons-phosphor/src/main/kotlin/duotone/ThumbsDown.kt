package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorDuotoneIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(27.581722f, 152.0f, 24.0f, 148.41827f, 24.0f, 144.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 51.581722f, 27.581722f, 48.0f, 32.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.82f, 157.0f),
                    PathNode.LineTo(227.82f, 61.0f),
                    PathNode.CurveTo(226.30775f, 48.996887f, 216.098f, 39.995846f, 204.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(23.163445f, 40.0f, 16.0f, 47.163445f, 16.0f, 56.0f),
                    PathNode.LineTo(16.0f, 144.0f),
                    PathNode.CurveTo(16.0f, 152.83656f, 23.163445f, 160.0f, 32.0f, 160.0f),
                    PathNode.LineTo(75.06f, 160.0f),
                    PathNode.LineTo(112.84f, 235.58f),
                    PathNode.CurveTo(114.19651f, 238.29086f, 116.96868f, 240.00217f, 120.0f, 240.0f),
                    PathNode.CurveTo(142.09138f, 240.0f, 160.0f, 222.09138f, 160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(222.88945f, 184.00237f, 229.44768f, 181.0439f, 234.00551f, 175.8776f),
                    PathNode.CurveTo(238.56334f, 170.71129f, 240.68118f, 163.83542f, 239.82f, 157.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 165.29f),
                    PathNode.CurveTo(220.49126f, 167.02557f, 218.29962f, 168.01546f, 216.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(147.58173f, 168.0f, 144.0f, 171.58173f, 144.0f, 176.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.CurveTo(144.0032f, 211.44164f, 135.92914f, 221.29459f, 124.71f, 223.54f),
                    PathNode.LineTo(88.0f, 150.11f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.LineTo(204.0f, 56.0f),
                    PathNode.CurveTo(208.03267f, 55.998615f, 211.43591f, 58.998962f, 211.94f, 63.0f),
                    PathNode.LineTo(223.94f, 159.0f),
                    PathNode.CurveTo(224.2433f, 161.2794f, 223.53453f, 163.57744f, 222.0f, 165.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
