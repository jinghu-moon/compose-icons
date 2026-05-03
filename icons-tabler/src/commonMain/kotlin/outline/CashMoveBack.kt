package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashMoveBack: ImageVector
    get() {
        if (_cashMoveBack != null) return _cashMoveBack!!
        _cashMoveBack = tablerOutlineIcon(
            name = "CashMoveBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(3.447715f, 15.0f, 3.0f, 14.552285f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 5.447716f, 3.447715f, 5.0f, 4.0f, 5.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.552284f, 5.0f, 17.0f, 5.447716f, 17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(7.447716f, 19.0f, 7.0f, 18.552284f, 7.0f, 18.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 9.447715f, 7.447716f, 9.0f, 8.0f, 9.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.552284f, 9.0f, 21.0f, 9.447715f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 12.5f)
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
                    PathNode.MoveTo(15.914f, 13.417f),
                    PathNode.CurveTo(15.633914f, 12.498951f, 14.741139f, 11.909323f, 13.786837f, 12.012125f),
                    PathNode.CurveTo(12.832533f, 12.114927f, 12.08582f, 12.88117f, 12.007686f, 13.837809f),
                    PathNode.CurveTo(11.92955f, 14.794447f, 12.542027f, 15.671704f, 13.467f, 15.928f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _cashMoveBack!!
    }

private var _cashMoveBack: ImageVector? = null
