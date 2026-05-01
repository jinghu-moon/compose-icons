package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = lucideOutlineIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.048f, 18.566f),
                    PathNode.CurveTo(1.916367f, 19.15815f, 2.060596f, 19.778042f, 2.440108f, 20.251265f),
                    PathNode.CurveTo(2.81962f, 20.72449f, 3.393395f, 20.999895f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.606606f, 20.999895f, 21.18038f, 20.72449f, 21.559893f, 20.251265f),
                    PathNode.CurveTo(21.939404f, 19.778042f, 22.083633f, 19.15815f, 21.952f, 18.566f),
                    PathNode.LineTo(19.952f, 9.566f),
                    PathNode.CurveTo(19.748625f, 8.651117f, 18.937216f, 8.000161f, 18.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(5.062785f, 8.000161f, 4.251376f, 8.651117f, 4.048f, 9.566f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.CurveTo(8.0f, 3.790861f, 9.790861f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(14.209139f, 2.0f, 16.0f, 3.790861f, 16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handbag!!
    }

private var _handbag: ImageVector? = null
