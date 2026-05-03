package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SmartphoneCharging: ImageVector
    get() {
        if (_smartphoneCharging != null) return _smartphoneCharging!!
        _smartphoneCharging = lucideOutlineIcon(
            name = "SmartphoneCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 2.0f),
                    PathNode.LineTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.10457f, 2.0f, 19.0f, 2.895431f, 19.0f, 4.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(19.0f, 21.10457f, 18.10457f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.895431f, 22.0f, 5.0f, 21.10457f, 5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(5.0f, 2.895431f, 5.895431f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.667f, 8.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(11.333f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smartphoneCharging!!
    }

private var _smartphoneCharging: ImageVector? = null
