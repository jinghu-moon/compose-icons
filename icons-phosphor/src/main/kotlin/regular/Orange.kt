package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorRegularIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.87f, 72.58f),
                    PathNode.CurveTo(186.84627f, 61.49526f, 199.97847f, 39.72499f, 200.0f, 16.0f),
                    PathNode.CurveTo(200.0f, 11.581722f, 196.41827f, 8.0f, 192.0f, 8.0f),
                    PathNode.LineTo(184.0f, 8.0f),
                    PathNode.CurveTo(160.7082f, 8.008826f, 139.26013f, 20.670853f, 128.0f, 41.06f),
                    PathNode.CurveTo(116.739876f, 20.670853f, 95.291794f, 8.008826f, 72.0f, 8.0f),
                    PathNode.LineTo(64.0f, 8.0f),
                    PathNode.CurveTo(59.581722f, 8.0f, 56.0f, 11.581722f, 56.0f, 16.0f),
                    PathNode.CurveTo(56.0f, 20.418278f, 59.581722f, 24.0f, 64.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(95.572105f, 24.032309f, 115.64456f, 41.148952f, 119.4f, 64.42f),
                    PathNode.CurveTo(75.608696f, 68.706245f, 41.713604f, 104.67839f, 40.03634f, 148.64699f),
                    PathNode.CurveTo(38.35907f, 192.61557f, 69.41519f, 231.06541f, 112.75269f, 238.67535f),
                    PathNode.CurveTo(156.0902f, 246.2853f, 198.38786f, 220.71617f, 211.79057f, 178.80653f),
                    PathNode.CurveTo(225.19327f, 136.8969f, 205.58125f, 91.52906f, 165.87f, 72.58f),
                    PathNode.Close,
                    PathNode.MoveTo(183.33f, 24.0f),
                    PathNode.CurveTo(179.4369f, 46.828995f, 159.82578f, 63.64093f, 136.67f, 64.0f),
                    PathNode.CurveTo(140.5631f, 41.171005f, 160.17422f, 24.35907f, 183.33f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(88.2355f, 224.0f, 56.0f, 191.7645f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 112.2355f, 88.2355f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(167.7645f, 80.0f, 200.0f, 112.2355f, 200.0f, 152.0f),
                    PathNode.CurveTo(199.95592f, 191.74623f, 167.74623f, 223.95592f, 128.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(183.89f, 161.32f),
                    PathNode.CurveTo(179.67473f, 185.0765f, 161.0765f, 203.67473f, 137.32f, 207.89f),
                    PathNode.CurveTo(136.88351f, 207.96086f, 136.44218f, 207.99765f, 136.0f, 208.0f),
                    PathNode.CurveTo(131.8412f, 207.99374f, 128.38078f, 204.80206f, 128.03908f, 200.65732f),
                    PathNode.CurveTo(127.69737f, 196.51256f, 130.58836f, 192.79726f, 134.69f, 192.11f),
                    PathNode.CurveTo(151.74149f, 189.08029f, 165.09029f, 175.73149f, 168.12f, 158.68f),
                    PathNode.CurveTo(168.88437f, 154.35773f, 172.98865f, 151.45853f, 177.31783f, 152.1828f),
                    PathNode.CurveTo(181.64699f, 152.90707f, 184.5841f, 156.9843f, 183.9f, 161.32f),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
