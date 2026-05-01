package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VaccineBottle: ImageVector
    get() {
        if (_vaccineBottle != null) return _vaccineBottle!!
        _vaccineBottle = tablerOutlineIcon(
            name = "VaccineBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 3.447715f, 9.447715f, 3.0f, 10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.552285f, 3.0f, 15.0f, 3.447715f, 15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 5.552285f, 14.552285f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(9.447715f, 6.0f, 9.0f, 5.552285f, 9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 4.0f)
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
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.98f),
                    PathNode.CurveTo(10.0f, 7.857f, 9.366f, 8.606f, 8.5f, 8.75f),
                    PathNode.CurveTo(7.634f, 8.894f, 7.0f, 9.643f, 7.0f, 10.52f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 20.10457f, 7.895431f, 21.0f, 9.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(16.10457f, 21.0f, 17.0f, 20.10457f, 17.0f, 19.0f),
                    PathNode.LineTo(17.0f, 10.52f),
                    PathNode.CurveTo(17.0f, 9.643f, 16.366f, 8.894f, 15.5f, 8.75f),
                    PathNode.CurveTo(14.634649f, 8.605824f, 14.00029f, 7.857279f, 14.0f, 6.98f),
                    PathNode.LineTo(14.0f, 6.0f)
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
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f)
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
                    PathNode.MoveTo(7.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f)
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
                    PathNode.MoveTo(11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f)
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
        return _vaccineBottle!!
    }

private var _vaccineBottle: ImageVector? = null
