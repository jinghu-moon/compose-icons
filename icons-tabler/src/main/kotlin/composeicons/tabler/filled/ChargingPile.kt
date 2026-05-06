package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChargingPile: ImageVector
    get() {
        if (_chargingPile != null) return _chargingPile!!
        _chargingPile = tablerFilledIcon(
            name = "ChargingPile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c1.657 0 3 1.343 3 3v4c1.657 0 3 1.343 3 3v3c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-6.585l-1-1-.293 .292c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L16.585 7l-.292-.293c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.024-.39 1.414 0l3 3c.188 .187 .293 .442 .293 .707v7c0 1.381-1.119 2.5-2.5 2.5C17.119 18.5 16 17.381 16 16v-3c0-.552-.448-1-1-1v7c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-12C2.448 21 2 20.552 2 20c0-.552 .448-1 1-1v-13C3 4.343 4.343 3 6 3ZM9.514 10.643c-.473-.283-1.087-.13-1.371 .343L6.643 13.486l-.054 .1c-.141 .31-.115 .67 .07 .956 .184 .286 .501 .459 .841 .458h1.233l-.59 .986c-.26 .471-.1 1.063 .362 1.34 .461 .277 1.059 .139 1.352-.312l1.5-2.5 .054-.1c.141-.31 .115-.67-.07-.956-.184-.286-.501-.459-.841-.458h-1.235l.592-.986c.283-.473 .13-1.087-.343-1.371M12 5h-6C5.448 5 5 5.448 5 6v1h8v-1C13 5.448 12.552 5 12 5"),
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
        return _chargingPile!!
    }

private var _chargingPile: ImageVector? = null
