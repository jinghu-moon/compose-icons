package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HousePlus: ImageVector
    get() {
        if (_housePlus != null) return _housePlus!!
        _housePlus = lucideOutlineIcon(
            name = "HousePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.35f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(2.999518f, 9.410265f, 3.259334f, 8.850379f, 3.71f, 8.47f),
                    PathNode.LineTo(10.71f, 2.47f),
                    PathNode.CurveTo(11.455044f, 1.841154f, 12.544956f, 1.841154f, 13.29f, 2.47f),
                    PathNode.LineTo(20.29f, 8.47f),
                    PathNode.CurveTo(20.740665f, 8.850379f, 21.000483f, 9.410265f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 12.35f)
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
                    PathNode.MoveTo(14.8f, 12.4f),
                    PathNode.CurveTo(14.611146f, 12.148194f, 14.314757f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(9.447715f, 12.0f, 9.0f, 12.447715f, 9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 21.0f)
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
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f)
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
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
        return _housePlus!!
    }

private var _housePlus: ImageVector? = null
