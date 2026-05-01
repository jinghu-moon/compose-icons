package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorDuotoneIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.0f, 171.78f),
                    PathNode.CurveTo(177.13f, 218.6f, 128.0f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(128.0f, 232.0f, 78.87f, 218.6f, 54.0f, 171.78f),
                    PathNode.LineTo(128.0f, 120.0f),
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
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 164.72f, 57.52f, 196.67f, 78.93f, 214.19f),
                    PathNode.CurveTo(101.99f, 233.05f, 124.93f, 239.45f, 125.93f, 239.72f),
                    PathNode.CurveTo(127.305016f, 240.09406f, 128.75499f, 240.09406f, 130.13f, 239.72f),
                    PathNode.CurveTo(131.13f, 239.45f, 154.04f, 233.05f, 177.13f, 214.19f),
                    PathNode.CurveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.4f, 201.42f),
                    PathNode.CurveTo(155.6728f, 211.07713f, 142.33551f, 218.59204f, 128.0f, 223.62f),
                    PathNode.CurveTo(113.85208f, 218.67969f, 100.67948f, 211.29802f, 89.08f, 201.81f),
                    PathNode.CurveTo(79.434074f, 194.01929f, 71.15106f, 184.67851f, 64.57f, 174.17f),
                    PathNode.LineTo(128.0f, 129.77f),
                    PathNode.LineTo(191.43f, 174.17f),
                    PathNode.CurveTo(184.96284f, 184.50539f, 176.84521f, 193.71077f, 167.4f, 201.42f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 112.0f),
                    PathNode.QuadTo(208.0f, 138.31f, 198.86f, 159.84f),
                    PathNode.LineTo(132.59f, 113.45f),
                    PathNode.CurveTo(129.83443f, 111.51966f, 126.16557f, 111.51966f, 123.41f, 113.45f),
                    PathNode.LineTo(57.13f, 159.84f),
                    PathNode.CurveTo(51.06f, 145.52f, 48.0f, 129.54f, 48.0f, 112.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
