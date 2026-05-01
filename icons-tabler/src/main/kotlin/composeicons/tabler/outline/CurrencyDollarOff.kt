package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyDollarOff: ImageVector
    get() {
        if (_currencyDollarOff != null) return _currencyDollarOff!!
        _currencyDollarOff = tablerOutlineIcon(
            name = "CurrencyDollarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.7f, 8.0f),
                    PathNode.CurveTo(16.29278f, 6.844582f, 15.223939f, 6.052847f, 14.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.MoveTo(7.443f, 7.431f),
                    PathNode.CurveTo(6.874941f, 8.356766f, 6.85164f, 9.517273f, 7.38208f, 10.465095f),
                    PathNode.CurveTo(7.91252f, 11.412916f, 8.913845f, 12.000001f, 10.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(16.564f, 16.558f),
                    PathNode.CurveTo(16.019817f, 17.453463f, 15.047849f, 18.0001f, 14.0f, 18.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.CurveTo(8.776061f, 17.947153f, 7.707219f, 17.155418f, 7.3f, 16.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _currencyDollarOff!!
    }

private var _currencyDollarOff: ImageVector? = null
