package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorRegularIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.7f, 209.7f),
                    PathNode.CurveTo(214.6694f, 209.61412f, 214.63264f, 209.53058f, 214.59f, 209.45f),
                    PathNode.LineTo(169.11f, 112.59f),
                    PathNode.LineTo(189.61f, 80.41f),
                    PathNode.CurveTo(189.65027f, 80.35228f, 189.68701f, 80.29217f, 189.72f, 80.23f),
                    PathNode.CurveTo(192.7586f, 75.16404f, 192.7586f, 68.83596f, 189.72f, 63.77f),
                    PathNode.CurveTo(189.63f, 63.61f, 189.52f, 63.45f, 189.42f, 63.3f),
                    PathNode.LineTo(168.0f, 32.7f),
                    PathNode.LineTo(168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 3.581722f, 164.41827f, 0f, 160.0f, 0f),
                    PathNode.CurveTo(155.58173f, 0f, 152.0f, 3.581722f, 152.0f, 8.0f),
                    PathNode.LineTo(152.0f, 32.42f),
                    PathNode.LineTo(146.74f, 39.0f),
                    PathNode.CurveTo(142.18544f, 44.692535f, 135.29033f, 48.006256f, 128.0f, 48.006256f),
                    PathNode.CurveTo(120.70967f, 48.006256f, 113.81456f, 44.692535f, 109.26f, 39.0f),
                    PathNode.LineTo(104.0f, 32.42f),
                    PathNode.LineTo(104.0f, 8.0f),
                    PathNode.CurveTo(104.0f, 3.581722f, 100.41828f, 0f, 96.0f, 0f),
                    PathNode.CurveTo(91.58172f, 0f, 88.0f, 3.581722f, 88.0f, 8.0f),
                    PathNode.LineTo(88.0f, 32.7f),
                    PathNode.LineTo(66.58f, 63.3f),
                    PathNode.CurveTo(66.48f, 63.45f, 66.37f, 63.61f, 66.28f, 63.77f),
                    PathNode.CurveTo(63.241398f, 68.83596f, 63.241398f, 75.16404f, 66.28f, 80.23f),
                    PathNode.CurveTo(66.312996f, 80.29217f, 66.349724f, 80.35228f, 66.39f, 80.41f),
                    PathNode.LineTo(86.89f, 112.59f),
                    PathNode.LineTo(41.41f, 209.45f),
                    PathNode.CurveTo(41.36735f, 209.53058f, 41.33059f, 209.61412f, 41.3f, 209.7f),
                    PathNode.CurveTo(39.183025f, 214.64214f, 39.689728f, 220.31708f, 42.648773f, 224.80597f),
                    PathNode.CurveTo(45.607822f, 229.29486f, 50.62356f, 231.99748f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(205.37822f, 232.00084f, 210.39705f, 229.29959f, 213.35847f, 224.81013f),
                    PathNode.CurveTo(216.3199f, 220.3207f, 216.82767f, 214.64375f, 214.71f, 209.7f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 72.0f),
                    PathNode.LineTo(96.43f, 48.57f),
                    PathNode.LineTo(96.76f, 48.99f),
                    PathNode.CurveTo(104.35073f, 58.482506f, 115.8457f, 64.00876f, 128.0f, 64.00876f),
                    PathNode.CurveTo(140.1543f, 64.00876f, 151.64926f, 58.482506f, 159.24f, 48.99f),
                    PathNode.LineTo(159.57f, 48.57f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.LineTo(155.62f, 104.0f),
                    PathNode.LineTo(100.39f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 216.0f),
                    PathNode.LineTo(101.07f, 120.0f),
                    PathNode.LineTo(154.91f, 120.0f),
                    PathNode.LineTo(200.0f, 216.0f),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
