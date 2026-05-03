package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorFillIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 29.490332f, 154.50967f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(101.49033f, 8.0f, 80.0f, 29.490332f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 158.63f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 132.41827f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 158.63f),
                    PathNode.CurveTo(108.97963f, 154.7337f, 102.369026f, 143.46468f, 104.345634f, 131.94414f),
                    PathNode.CurveTo(106.32224f, 120.4236f, 116.31113f, 112.00259f, 128.0f, 112.00259f),
                    PathNode.CurveTo(139.68887f, 112.00259f, 149.67775f, 120.4236f, 151.65436f, 131.94414f),
                    PathNode.CurveTo(153.63098f, 143.46468f, 147.02037f, 154.7337f, 136.0f, 158.63f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(145.67311f, 24.0f, 160.0f, 38.32689f, 160.0f, 56.0f),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
