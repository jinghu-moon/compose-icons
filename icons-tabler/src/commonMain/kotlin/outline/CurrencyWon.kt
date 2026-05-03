package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyWon: ImageVector
    get() {
        if (_currencyWon != null) return _currencyWon!!
        _currencyWon = tablerOutlineIcon(
            name = "CurrencyWon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(7.245f, 17.358f),
                    PathNode.CurveTo(7.347273f, 17.716574f, 7.6713f, 17.96663f, 8.044088f, 17.974663f),
                    PathNode.CurveTo(8.416874f, 17.982697f, 8.751373f, 17.746834f, 8.869f, 17.393f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(15.131f, 17.393f),
                    PathNode.CurveTo(15.248627f, 17.746834f, 15.583126f, 17.982697f, 15.955913f, 17.974663f),
                    PathNode.CurveTo(16.3287f, 17.96663f, 16.652727f, 17.716574f, 16.755f, 17.358f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(21.0f, 10.0f),
                    PathNode.LineTo(3.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 14.0f),
                    PathNode.LineTo(3.0f, 14.0f)
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
        return _currencyWon!!
    }

private var _currencyWon: ImageVector? = null
