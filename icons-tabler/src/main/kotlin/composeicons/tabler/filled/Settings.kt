package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = tablerFilledIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.647 4.081c.054 .225 .213 .41 .426 .498 .213 .089 .456 .07 .654-.05 2.439-1.485 5.23 1.305 3.745 3.744-.12 .197-.139 .44-.051 .653 .088 .213 .273 .372 .498 .427 2.775 .673 2.775 4.62 0 5.294-.225 .054-.41 .213-.498 .426-.089 .213-.07 .456 .05 .654 1.485 2.439-1.305 5.23-3.744 3.745-.197-.12-.44-.139-.653-.051-.213 .088-.372 .273-.427 .498-.673 2.775-4.62 2.775-5.294 0-.054-.225-.213-.41-.426-.498-.213-.089-.456-.07-.654 .05C5.834 20.956 3.043 18.166 4.528 15.727c.12-.197 .139-.44 .051-.653-.088-.213-.273-.372-.498-.427-2.775-.673-2.775-4.62 0-5.294 .225-.054 .41-.213 .498-.426 .089-.213 .07-.456-.05-.654C3.044 5.834 5.834 3.043 8.273 4.528c.197 .121 .44 .14 .654 .052 .214-.088 .372-.274 .426-.499 .673-2.775 4.62-2.775 5.294 0ZM12 9C10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9"),
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
        return _settings!!
    }

private var _settings: ImageVector? = null
