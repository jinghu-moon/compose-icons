package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorFillIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.23f, 170.26f),
                    PathNode.CurveTo(195.6f, 179.26f, 186.9f, 184.0f, 176.07f, 184.0f),
                    PathNode.CurveTo(155.34f, 184.0f, 141.26f, 158.69f, 126.35f, 131.89f),
                    PathNode.CurveTo(115.47f, 112.33f, 101.93f, 88.0f, 90.61f, 88.0f),
                    PathNode.CurveTo(78.18f, 88.0f, 64.0f, 116.88f, 64.0f, 142.21f),
                    PathNode.CurveTo(64.0f, 150.47f, 65.5f, 157.21f, 68.34f, 161.77f),
                    PathNode.CurveTo(71.0f, 166.0f, 74.68f, 168.0f, 79.93f, 168.0f),
                    PathNode.CurveTo(86.01f, 168.0f, 93.45f, 161.0f, 102.67f, 146.49f),
                    PathNode.CurveTo(105.1015f, 142.91376f, 109.93486f, 141.9172f, 113.58265f, 144.24f),
                    PathNode.CurveTo(117.23043f, 146.56279f, 118.37197f, 151.36397f, 116.16f, 155.08f),
                    PathNode.CurveTo(99.84f, 180.71f, 88.22f, 184.0f, 79.93f, 184.0f),
                    PathNode.CurveTo(69.1f, 184.0f, 60.4f, 179.25f, 54.77f, 170.26f),
                    PathNode.CurveTo(50.34f, 163.18f, 48.0f, 153.48f, 48.0f, 142.26f),
                    PathNode.CurveTo(48.176376f, 126.55221f, 51.938747f, 111.09227f, 59.0f, 97.06f),
                    PathNode.CurveTo(67.34f, 80.9f, 78.57f, 72.0f, 90.61f, 72.0f),
                    PathNode.CurveTo(111.34f, 72.0f, 125.42f, 97.31f, 140.33f, 124.11f),
                    PathNode.CurveTo(151.21f, 143.66f, 164.75f, 168.0f, 176.07f, 168.0f),
                    PathNode.CurveTo(181.32f, 168.0f, 185.0f, 166.0f, 187.66f, 161.77f),
                    PathNode.CurveTo(190.5f, 157.24f, 192.0f, 150.47f, 192.0f, 142.21f),
                    PathNode.CurveTo(192.0f, 116.88f, 177.82f, 88.0f, 165.39f, 88.0f),
                    PathNode.CurveTo(161.99f, 88.0f, 158.04f, 90.31f, 153.65f, 94.88f),
                    PathNode.CurveTo(150.58759f, 98.06668f, 145.52168f, 98.16742f, 142.335f, 95.105f),
                    PathNode.CurveTo(139.14832f, 92.04258f, 139.04758f, 86.976685f, 142.11f, 83.79f),
                    PathNode.CurveTo(149.74f, 75.86f, 157.35f, 72.0f, 165.39f, 72.0f),
                    PathNode.CurveTo(177.39f, 72.0f, 188.66f, 80.9f, 197.01f, 97.06f),
                    PathNode.CurveTo(204.06386f, 111.07714f, 207.82603f, 126.51913f, 208.01f, 142.21f),
                    PathNode.CurveTo(208.0f, 153.48f, 205.66f, 163.18f, 201.23f, 170.26f),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
