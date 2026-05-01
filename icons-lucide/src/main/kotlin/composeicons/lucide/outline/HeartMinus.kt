package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartMinus: ImageVector
    get() {
        if (_heartMinus != null) return _heartMinus!!
        _heartMinus = lucideOutlineIcon(
            name = "HeartMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.876f, 18.99f),
                    PathNode.LineTo(13.508f, 20.313f),
                    PathNode.CurveTo(13.131067f, 20.745916f, 12.586294f, 20.99601f, 12.012289f, 20.999645f),
                    PathNode.CurveTo(11.438283f, 21.00328f, 10.890386f, 20.760109f, 10.508f, 20.332f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(3.5f, 13.5f, 2.0f, 11.8f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.000042f, 7.221946f, 3.404444f, 5.179691f, 5.531609f, 4.364399f),
                    PathNode.CurveTo(7.658774f, 3.549108f, 10.06839f, 4.129542f, 11.591f, 5.824f),
                    PathNode.CurveTo(11.696891f, 5.937222f, 11.844977f, 6.001484f, 12.0f, 6.001484f),
                    PathNode.CurveTo(12.155023f, 6.001484f, 12.303109f, 5.937222f, 12.409f, 5.824f),
                    PathNode.CurveTo(13.927118f, 4.118204f, 16.342613f, 3.530239f, 18.474874f, 4.347483f),
                    PathNode.CurveTo(20.607136f, 5.164728f, 22.010878f, 7.216515f, 22.0f, 9.5f),
                    PathNode.CurveTo(21.999775f, 10.033413f, 21.917479f, 10.563616f, 21.756f, 11.072f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f)
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
        return _heartMinus!!
    }

private var _heartMinus: ImageVector? = null
