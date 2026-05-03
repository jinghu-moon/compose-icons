package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorRegularIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 26.69f),
                    PathNode.CurveTo(204.47797f, 24.974861f, 202.29309f, 23.995314f, 200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(53.703514f, 23.999212f, 51.517437f, 24.985365f, 49.99816f, 26.707468f),
                    PathNode.CurveTo(48.478886f, 28.42957f, 47.772938f, 30.72153f, 48.06f, 33.0f),
                    PathNode.LineTo(71.21f, 226.0f),
                    PathNode.CurveTo(72.21864f, 234.00586f, 79.03085f, 240.00781f, 87.1f, 240.0f),
                    PathNode.LineTo(168.9f, 240.0f),
                    PathNode.CurveTo(176.99948f, 240.00223f, 183.82312f, 233.95157f, 184.79f, 225.91f),
                    PathNode.LineTo(207.94f, 33.0f),
                    PathNode.CurveTo(208.23177f, 30.715473f, 207.5248f, 28.416027f, 206.0f, 26.69f),
                    PathNode.Close,
                    PathNode.MoveTo(191.0f, 40.0f),
                    PathNode.LineTo(188.1f, 64.0f),
                    PathNode.LineTo(67.9f, 64.0f),
                    PathNode.LineTo(65.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.9f, 224.0f),
                    PathNode.LineTo(87.1f, 224.0f),
                    PathNode.LineTo(69.82f, 80.0f),
                    PathNode.LineTo(186.18f, 80.0f),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
