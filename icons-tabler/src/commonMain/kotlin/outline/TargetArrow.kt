package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TargetArrow: ImageVector
    get() {
        if (_targetArrow != null) return _targetArrow!!
        _targetArrow = tablerOutlineIcon(
            name = "TargetArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 12.552285f, 11.447715f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.552285f, 13.0f, 13.0f, 12.552285f, 13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 11.447715f, 12.552285f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(11.447715f, 11.0f, 11.0f, 11.447715f, 11.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(9.238576f, 7.0f, 7.0f, 9.238576f, 7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 14.761424f, 9.238576f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(14.761424f, 17.0f, 17.0f, 14.761424f, 17.0f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 3.055f),
                    PathNode.CurveTo(9.2003f, 2.62872f, 5.54602f, 4.649784f, 3.887441f, 8.094859f),
                    PathNode.CurveTo(2.228862f, 11.539935f, 2.928074f, 15.65692f, 5.631041f, 18.36125f),
                    PathNode.CurveTo(8.334008f, 21.065578f, 12.450642f, 21.766863f, 15.896552f, 20.11002f),
                    PathNode.CurveTo(19.342463f, 18.453176f, 21.365366f, 14.799913f, 20.941f, 11.0f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.LineTo(15.0f, 6.0f)
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
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
        return _targetArrow!!
    }

private var _targetArrow: ImageVector? = null
