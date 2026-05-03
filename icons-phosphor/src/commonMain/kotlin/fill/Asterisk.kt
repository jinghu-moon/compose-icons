package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorFillIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.43f, 153.07f),
                    PathNode.CurveTo(190.56764f, 154.87964f, 192.09795f, 158.57162f, 191.16058f, 162.07031f),
                    PathNode.CurveTo(190.22322f, 165.56902f, 187.0521f, 168.0014f, 183.43f, 168.0f),
                    PathNode.CurveTo(182.02538f, 168.00435f, 180.64485f, 167.63506f, 179.43f, 166.93f),
                    PathNode.LineTo(136.0f, 141.86f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 196.41827f, 132.41827f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 141.86f),
                    PathNode.LineTo(76.57f, 166.93f),
                    PathNode.CurveTo(72.74502f, 169.13326f, 67.85829f, 167.82207f, 65.65f, 164.0f),
                    PathNode.CurveTo(63.43826f, 160.17538f, 64.74556f, 155.282f, 68.57f, 153.07f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(68.57f, 102.93f),
                    PathNode.CurveTo(64.74267f, 100.72086f, 63.430862f, 95.82733f, 65.64f, 92.0f),
                    PathNode.CurveTo(67.84914f, 88.17267f, 72.742676f, 86.86086f, 76.57f, 89.07f),
                    PathNode.LineTo(120.0f, 114.14f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 59.581722f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 114.14f),
                    PathNode.LineTo(179.43f, 89.07f),
                    PathNode.CurveTo(183.25734f, 86.86086f, 188.15086f, 88.17267f, 190.36f, 92.0f),
                    PathNode.CurveTo(192.56914f, 95.82733f, 191.25734f, 100.72086f, 187.43f, 102.93f),
                    PathNode.LineTo(144.0f, 128.0f),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
