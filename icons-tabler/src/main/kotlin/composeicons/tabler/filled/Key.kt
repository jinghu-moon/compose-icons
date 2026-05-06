package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = tablerFilledIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.52 2c1.029 0 2.015 .409 2.742 1.136l3.602 3.602c.727 .727 1.136 1.713 1.136 2.741 0 1.028-.408 2.014-1.136 2.741l-2.643 2.643c-1.323 1.322-3.4 1.512-4.941 .452l-.105-.078L7.293 21.121c-.455 .454-1.044 .749-1.68 .843l-.22 .027L5.172 22h-1.172C2.986 22 2.133 21.241 2.009 20.177L2 20v-1.172c0-.704 .248-1.386 .73-1.96l.149-.161 .414-.414C3.48 16.105 3.735 16 4 16h1v-1c0-.507 .38-.934 .883-.993L6 14h1v-1c-0-.22 .072-.433 .206-.608l.087-.1L8.761 10.823l-.076-.103C8.286 10.139 8.051 9.461 8.007 8.757L8 8.521C8 7.492 8.409 6.506 9.136 5.779L11.779 3.136C12.506 2.409 13.492 2.001 14.52 2M15.015 7h-.02c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2h.02c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _key!!
    }

private var _key: ImageVector? = null
