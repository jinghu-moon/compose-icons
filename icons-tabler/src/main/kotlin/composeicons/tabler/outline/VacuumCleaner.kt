package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VacuumCleaner: ImageVector
    get() {
        if (_vacuumCleaner != null) return _vacuumCleaner!!
        _vacuumCleaner = tablerOutlineIcon(
            name = "VacuumCleaner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 10.104569f, 13.104569f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(10.895431f, 11.0f, 10.0f, 10.104569f, 10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 7.895431f, 10.895431f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(13.104569f, 7.0f, 14.0f, 7.895431f, 14.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
        return _vacuumCleaner!!
    }

private var _vacuumCleaner: ImageVector? = null
