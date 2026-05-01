package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorFillIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(143.37f, 24.0f, 157.2f, 35.0f, 160.16f, 49.59f),
                    PathNode.CurveTo(161.07465f, 53.880913f, 165.27452f, 56.634617f, 169.5743f, 55.762596f),
                    PathNode.CurveTo(173.87408f, 54.890575f, 176.66931f, 50.71822f, 175.84f, 46.41f),
                    PathNode.CurveTo(171.32f, 24.15f, 151.2f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(101.501755f, 8.02756f, 80.02756f, 29.501757f, 80.0f, 56.0f),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
