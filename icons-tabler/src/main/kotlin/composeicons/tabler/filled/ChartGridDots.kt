package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartGridDots: ImageVector
    get() {
        if (_chartGridDots != null) return _chartGridDots!!
        _chartGridDots = tablerFilledIcon(
            name = "ChartGridDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c.552 0 1 .448 1 1v.171c.855 .303 1.527 .975 1.83 1.83L21 5c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-.171c-.303 .854-.974 1.526-1.828 1.829L19 11h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2v2.171c.855 .303 1.527 .975 1.83 1.83L21 17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-.171c-.303 .854-.974 1.526-1.828 1.829L19 21c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.17C16.146 20.527 15.474 19.854 15.171 19h-2.171v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2h-2.171c-.303 .854-.974 1.526-1.828 1.829L7 21c0 .552-.448 1-1 1C5.448 22 5 21.552 5 21v-.17C4.146 20.527 3.474 19.854 3.171 19h-.171C2.448 19 2 18.552 2 18c0-.552 .448-1 1-1h.17C3.473 16.145 4.145 15.473 5 15.17v-.34C4.146 14.527 3.474 13.854 3.171 13h-.171C2.448 13 2 12.552 2 12c0-.552 .448-1 1-1h.17C3.473 10.145 4.145 9.473 5 9.17v-2.17h-2C2.448 7 2 6.552 2 6 2 5.448 2.448 5 3 5h2v-2C5 2.448 5.448 2 6 2c.552 0 1 .448 1 1v2h4v-2c0-.552 .448-1 1-1 .552 0 1 .448 1 1v2h2.17C15.473 4.145 16.145 3.473 17 3.17v-.17c0-.552 .448-1 1-1ZM11 13h-2.171c-.303 .854-.974 1.526-1.828 1.829v.342c.854 .303 1.525 .975 1.828 1.829h2.171v-4ZM17 13h-4v4h2.17c.303-.855 .975-1.527 1.83-1.83v-2.17ZM11 7h-4v2.171c.855 .303 1.527 .975 1.83 1.83L11 11v-4ZM15.171 7h-2.171v4h4v-2.17C16.146 8.527 15.474 7.854 15.171 7Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chartGridDots!!
    }

private var _chartGridDots: ImageVector? = null
