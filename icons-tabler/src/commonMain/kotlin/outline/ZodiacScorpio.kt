package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacScorpio: ImageVector
    get() {
        if (_zodiacScorpio != null) return _zodiacScorpio!!
        _zodiacScorpio = tablerOutlineIcon(
            name = "ZodiacScorpio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 4.0f),
                    PathNode.CurveTo(4.10457f, 4.0f, 5.0f, 4.895431f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 15.0f)
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
                    PathNode.MoveTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 4.895431f, 5.895431f, 4.0f, 7.0f, 4.0f),
                    PathNode.CurveTo(8.10457f, 4.0f, 9.0f, 4.895431f, 9.0f, 6.0f),
                    PathNode.LineTo(9.0f, 15.0f)
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
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.895431f, 9.895431f, 4.0f, 11.0f, 4.0f),
                    PathNode.CurveTo(12.104569f, 4.0f, 13.0f, 4.895431f, 13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 17.656855f, 14.343145f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(21.0f, 19.0f)
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
        return _zodiacScorpio!!
    }

private var _zodiacScorpio: ImageVector? = null
