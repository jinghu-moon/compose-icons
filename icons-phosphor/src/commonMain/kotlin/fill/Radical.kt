package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorFillIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 116.41828f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(195.58173f, 120.0f, 192.0f, 116.41828f, 192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.LineTo(125.42f, 104.0f),
                    PathNode.LineTo(95.42f, 179.0f),
                    PathNode.CurveTo(94.206535f, 182.04016f, 91.26339f, 184.03435f, 87.99f, 184.03435f),
                    PathNode.CurveTo(84.71661f, 184.03435f, 81.773476f, 182.04016f, 80.56f, 179.0f),
                    PathNode.LineTo(48.56f, 99.0f),
                    PathNode.CurveTo(46.903145f, 94.89376f, 48.888763f, 90.221855f, 52.995f, 88.565f),
                    PathNode.CurveTo(57.10124f, 86.90814f, 61.773148f, 88.89376f, 63.43f, 93.0f),
                    PathNode.LineTo(88.0f, 154.46f),
                    PathNode.LineTo(112.57f, 93.0f),
                    PathNode.CurveTo(113.79434f, 89.973335f, 116.735085f, 87.99437f, 120.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(204.41827f, 88.0f, 208.0f, 91.58172f, 208.0f, 96.0f),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
