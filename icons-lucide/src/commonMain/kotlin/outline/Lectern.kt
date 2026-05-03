package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = lucideOutlineIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.865885f, 12.000228f, 20.633575f, 11.443229f, 20.902f, 10.62f),
                    PathNode.LineTo(21.958f, 7.287f),
                    PathNode.CurveTo(22.048708f, 6.984242f, 21.99095f, 6.656423f, 21.802233f, 6.402896f),
                    PathNode.CurveTo(21.613516f, 6.149369f, 21.316053f, 5.999978f, 21.0f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(2.683946f, 5.999978f, 2.386484f, 6.149369f, 2.197767f, 6.402896f),
                    PathNode.CurveTo(2.00905f, 6.656423f, 1.951292f, 6.984242f, 2.042f, 7.287f),
                    PathNode.LineTo(3.098f, 10.621f),
                    PathNode.CurveTo(3.366774f, 11.443833f, 4.134383f, 12.000369f, 5.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f)
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
                    PathNode.MoveTo(18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.0f, 2.447715f, 17.552284f, 2.0f, 17.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 10.447715f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.CurveTo(16.0f, 21.552284f, 15.552285f, 22.0f, 15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(8.447715f, 22.0f, 8.0f, 21.552284f, 8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 10.447715f, 8.447715f, 10.0f, 9.0f, 10.0f),
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
        }
        return _lectern!!
    }

private var _lectern: ImageVector? = null
