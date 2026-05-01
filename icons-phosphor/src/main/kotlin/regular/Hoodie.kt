package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorRegularIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.31f, 120.53f),
                    PathNode.LineTo(183.0f, 39.12f),
                    PathNode.CurveTo(180.03987f, 34.683243f, 175.06357f, 32.013214f, 169.73f, 32.0f),
                    PathNode.LineTo(86.27f, 32.0f),
                    PathNode.CurveTo(80.936424f, 32.013214f, 75.96013f, 34.683243f, 73.0f, 39.12f),
                    PathNode.LineTo(18.69f, 120.53f),
                    PathNode.CurveTo(16.11994f, 124.37981f, 15.343087f, 129.15398f, 16.56f, 133.62f),
                    PathNode.LineTo(38.0f, 212.21f),
                    PathNode.CurveTo(39.89789f, 219.1687f, 46.21713f, 223.9972f, 53.43f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(88.836555f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 216.83656f, 167.16344f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(202.57f, 224.0f),
                    PathNode.CurveTo(209.78287f, 223.9972f, 216.10211f, 219.1687f, 218.0f, 212.21f),
                    PathNode.LineTo(239.44f, 133.62f),
                    PathNode.CurveTo(240.6569f, 129.15398f, 239.88007f, 124.37981f, 237.31f, 120.53f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 69.0f),
                    PathNode.LineTo(104.0f, 83.15f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 140.41827f, 107.58172f, 144.0f, 112.0f, 144.0f),
                    PathNode.CurveTo(116.41828f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 92.57f),
                    PathNode.LineTo(123.94f, 94.89f),
                    PathNode.CurveTo(126.44552f, 96.365715f, 129.55447f, 96.365715f, 132.06f, 94.89f),
                    PathNode.LineTo(136.0f, 92.57f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 139.58173f, 136.0f, 144.0f, 136.0f),
                    PathNode.CurveTo(148.41827f, 136.0f, 152.0f, 132.41827f, 152.0f, 128.0f),
                    PathNode.LineTo(152.0f, 83.14f),
                    PathNode.LineTo(176.0f, 69.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.73f, 48.0f),
                    PathNode.LineTo(172.65f, 52.39f),
                    PathNode.LineTo(128.0f, 78.71f),
                    PathNode.LineTo(83.35f, 52.39f),
                    PathNode.LineTo(86.27f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 208.0f),
                    PathNode.LineTo(53.43f, 208.0f),
                    PathNode.LineTo(32.0f, 129.41f),
                    PathNode.LineTo(64.0f, 81.41f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 184.83656f, 71.163445f, 192.0f, 80.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.57f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(184.83656f, 192.0f, 192.0f, 184.83656f, 192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 81.41f),
                    PathNode.LineTo(224.0f, 129.41f),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
