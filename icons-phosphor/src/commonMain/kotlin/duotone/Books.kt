package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorDuotoneIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.64f, 38.39f),
                    PathNode.CurveTo(190.20993f, 36.30331f, 188.96524f, 34.47437f, 187.18192f, 33.30863f),
                    PathNode.CurveTo(185.39859f, 32.14289f, 183.2239f, 31.736664f, 181.14f, 32.18f),
                    PathNode.LineTo(134.33f, 42.18f),
                    PathNode.CurveTo(129.99791f, 43.13716f, 127.25088f, 47.41181f, 128.18f, 51.75f),
                    PathNode.LineTo(139.79f, 107.0f),
                    PathNode.LineTo(202.25f, 93.58f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.65f, 194.55f),
                    PathNode.LineTo(198.46f, 36.75f),
                    PathNode.CurveTo(197.59302f, 32.58215f, 195.10083f, 28.931639f, 191.53496f, 26.606312f),
                    PathNode.CurveTo(187.96909f, 24.280985f, 183.62355f, 23.472582f, 179.46f, 24.36f),
                    PathNode.LineTo(132.65f, 34.42f),
                    PathNode.CurveTo(124.03217f, 36.306953f, 118.54383f, 44.784885f, 120.35f, 53.42f),
                    PathNode.LineTo(153.54f, 211.22f),
                    PathNode.CurveTo(155.06456f, 218.64067f, 161.58438f, 223.97507f, 169.16f, 224.0f),
                    PathNode.CurveTo(170.29616f, 223.99849f, 171.42903f, 223.87782f, 172.54f, 223.64f),
                    PathNode.LineTo(219.35f, 213.58f),
                    PathNode.CurveTo(227.9787f, 211.68855f, 233.46896f, 203.19427f, 231.65f, 194.55f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 50.15f),
                    PathNode.CurveTo(136.0f, 50.09f, 136.0f, 50.06f, 136.0f, 50.06f),
                    PathNode.LineTo(182.8f, 40.06f),
                    PathNode.LineTo(186.13f, 55.93f),
                    PathNode.LineTo(139.33f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.62f, 81.62f),
                    PathNode.LineTo(189.44f, 71.57f),
                    PathNode.LineTo(192.78f, 87.47f),
                    PathNode.LineTo(146.0f, 97.53f),
                    PathNode.Close,
                    PathNode.MoveTo(149.26f, 113.19f),
                    PathNode.LineTo(196.08f, 103.13f),
                    PathNode.LineTo(209.38f, 166.37f),
                    PathNode.LineTo(162.56f, 176.43f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 197.94f),
                    PathNode.LineTo(169.2f, 207.94f),
                    PathNode.LineTo(165.87f, 192.07f),
                    PathNode.LineTo(212.67f, 182.0f),
                    PathNode.LineTo(216.0f, 197.85f),
                    PathNode.CurveTo(216.0f, 197.91f, 216.0f, 197.94f, 216.0f, 197.94f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(112.836555f, 224.0f, 120.0f, 216.83656f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 39.163445f, 112.836555f, 32.0f, 104.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 208.0f),
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
        return _books!!
    }

private var _books: ImageVector? = null
