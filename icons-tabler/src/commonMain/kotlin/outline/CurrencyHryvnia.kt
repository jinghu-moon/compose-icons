package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyHryvnia: ImageVector
    get() {
        if (_currencyHryvnia != null) return _currencyHryvnia!!
        _currencyHryvnia = tablerOutlineIcon(
            name = "CurrencyHryvnia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.293771f, 5.824344f, 9.350197f, 4.999656f, 10.562f, 5.0f),
                    PathNode.LineTo(13.938f, 5.0f),
                    PathNode.CurveTo(15.149803f, 4.999656f, 16.20623f, 5.824344f, 16.5f, 7.0f),
                    PathNode.CurveTo(16.79214f, 8.168611f, 16.233418f, 9.383329f, 15.156f, 9.922f),
                    PathNode.LineTo(9.28f, 12.86f),
                    PathNode.CurveTo(7.933886f, 13.533276f, 7.204844f, 15.024126f, 7.5f, 16.5f),
                    PathNode.CurveTo(7.7908f, 17.953804f, 9.067398f, 19.000195f, 10.55f, 19.0f),
                    PathNode.LineTo(13.438f, 19.0f),
                    PathNode.CurveTo(14.649803f, 19.000345f, 15.706229f, 18.175655f, 16.0f, 17.0f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(18.0f, 10.0f)
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
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f)
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
        return _currencyHryvnia!!
    }

private var _currencyHryvnia: ImageVector? = null
