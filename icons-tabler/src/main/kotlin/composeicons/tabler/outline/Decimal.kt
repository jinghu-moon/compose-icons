package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Decimal: ImageVector
    get() {
        if (_decimal != null) return _decimal!!
        _decimal = tablerOutlineIcon(
            name = "Decimal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.CurveTo(18.10457f, 8.0f, 19.0f, 8.895431f, 19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 15.104569f, 18.10457f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(15.895431f, 16.0f, 15.0f, 15.104569f, 15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.895431f, 15.895431f, 8.0f, 17.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.CurveTo(11.104569f, 8.0f, 12.0f, 8.895431f, 12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.CurveTo(12.0f, 15.104569f, 11.104569f, 16.0f, 10.0f, 16.0f),
                    PathNode.CurveTo(8.895431f, 16.0f, 8.0f, 15.104569f, 8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 8.895431f, 8.895431f, 8.0f, 10.0f, 8.0f)
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
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.LineTo(5.01f, 16.0f)
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
        return _decimal!!
    }

private var _decimal: ImageVector? = null
