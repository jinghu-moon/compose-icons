package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaDivingTank: ImageVector
    get() {
        if (_scubaDivingTank != null) return _scubaDivingTank!!
        _scubaDivingTank = tablerOutlineIcon(
            name = "ScubaDivingTank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 8.790861f, 9.790861f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(14.209139f, 7.0f, 16.0f, 8.790861f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 11.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 20.10457f, 8.895431f, 21.0f, 10.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(15.104569f, 21.0f, 16.0f, 20.10457f, 16.0f, 19.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 4.0f),
                    PathNode.CurveTo(7.0f, 4.552285f, 7.447716f, 5.0f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.552285f, 5.0f, 9.0f, 4.552285f, 9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 3.447715f, 8.552285f, 3.0f, 8.0f, 3.0f),
                    PathNode.CurveTo(7.447716f, 3.0f, 7.0f, 3.447715f, 7.0f, 4.0f)
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
                    PathNode.MoveTo(11.5f, 4.0f),
                    PathNode.CurveTo(11.5f, 4.276143f, 11.723858f, 4.5f, 12.0f, 4.5f),
                    PathNode.CurveTo(12.276142f, 4.5f, 12.5f, 4.276143f, 12.5f, 4.0f),
                    PathNode.CurveTo(12.5f, 3.723858f, 12.276142f, 3.5f, 12.0f, 3.5f),
                    PathNode.CurveTo(11.723858f, 3.5f, 11.5f, 3.723858f, 11.5f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scubaDivingTank!!
    }

private var _scubaDivingTank: ImageVector? = null
