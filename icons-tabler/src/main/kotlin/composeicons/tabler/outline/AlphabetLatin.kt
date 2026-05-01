package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetLatin: ImageVector
    get() {
        if (_alphabetLatin != null) return _alphabetLatin!!
        _alphabetLatin = tablerOutlineIcon(
            name = "AlphabetLatin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(9.104569f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(5.895431f, 17.0f, 5.0f, 16.10457f, 5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 13.895431f, 5.895431f, 13.0f, 7.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 17.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 14.895431f, 10.0f, 16.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(18.10457f, 10.0f, 19.0f, 10.895431f, 19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 16.10457f, 18.10457f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(14.895431f, 17.0f, 14.0f, 16.10457f, 14.0f, 15.0f),
                    PathNode.LineTo(14.0f, 12.0f)
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
        return _alphabetLatin!!
    }

private var _alphabetLatin: ImageVector? = null
