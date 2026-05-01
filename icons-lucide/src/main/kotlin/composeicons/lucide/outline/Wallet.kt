package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = lucideOutlineIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(19.0f, 3.447715f, 18.552284f, 3.0f, 18.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 6.10457f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.552284f, 7.0f, 21.0f, 7.447716f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(16.89543f, 12.0f, 16.0f, 12.895431f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 15.104569f, 16.89543f, 16.0f, 18.0f, 16.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.552284f, 16.0f, 22.0f, 15.552285f, 22.0f, 15.0f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 12.447715f, 21.552284f, 12.0f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.552284f, 21.0f, 21.0f, 20.552284f, 21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 16.0f)
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
