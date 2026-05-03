package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyPoundOff: ImageVector
    get() {
        if (_currencyPoundOff != null) return _currencyPoundOff!!
        _currencyPoundOff = tablerOutlineIcon(
            name = "CurrencyPoundOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 18.5f),
                    PathNode.CurveTo(15.412727f, 19.227526f, 13.587273f, 19.227526f, 12.0f, 18.5f),
                    PathNode.CurveTo(10.340449f, 17.92712f, 8.513247f, 18.10984f, 7.0f, 19.0f),
                    PathNode.CurveTo(8.092774f, 18.621773f, 8.870874f, 17.649149f, 9.0f, 16.5f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.MoveTo(10.192f, 6.175f),
                    PathNode.CurveTo(11.070599f, 5.309074f, 12.299592f, 4.896979f, 13.522608f, 5.058211f),
                    PathNode.CurveTo(14.745625f, 5.219443f, 15.82583f, 5.935962f, 16.45f, 7.0f),
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _currencyPoundOff!!
    }

private var _currencyPoundOff: ImageVector? = null
