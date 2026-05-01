package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyTaka: ImageVector
    get() {
        if (_currencyTaka != null) return _currencyTaka!!
        _currencyTaka = tablerOutlineIcon(
            name = "CurrencyTaka",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 15.5f),
                    PathNode.CurveTo(15.5f, 16.052284f, 15.947715f, 16.5f, 16.5f, 16.5f),
                    PathNode.CurveTo(17.052284f, 16.5f, 17.5f, 16.052284f, 17.5f, 15.5f),
                    PathNode.CurveTo(17.5f, 14.947715f, 17.052284f, 14.5f, 16.5f, 14.5f),
                    PathNode.CurveTo(15.947715f, 14.5f, 15.5f, 14.947715f, 15.5f, 15.5f)
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
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 5.895431f, 7.895431f, 5.0f, 9.0f, 5.0f),
                    PathNode.CurveTo(10.104569f, 5.0f, 11.0f, 5.895431f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 17.656855f, 12.343145f, 19.0f, 14.0f, 19.0f),
                    PathNode.CurveTo(15.656855f, 19.0f, 17.0f, 17.656855f, 17.0f, 16.0f),
                    PathNode.LineTo(17.0f, 15.5f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f)
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
        return _currencyTaka!!
    }

private var _currencyTaka: ImageVector? = null
