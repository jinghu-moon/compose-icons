package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bandage: ImageVector
    get() {
        if (_bandage != null) return _bandage!!
        _bandage = tablerFilledIcon(
            name = "Bandage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.207 3.793c2.253 2.253 2.332 5.88 .179 8.228l-.179 .186-8 8c-2.288 2.286-5.984 2.325-8.32 .088C1.551 18.058 1.43 14.364 3.614 11.979l.179-.186L11.793 3.793c2.324-2.323 6.09-2.323 8.414 0ZM12 13c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C12.934 13.38 12.507 13 12 13ZM14 11c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C14.934 11.38 14.507 11 14 11ZM10 11c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C10.934 11.38 10.507 11 10 11ZM12 9c-.552 0-1 .448-1 1l.007 .127c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997l-.007-.127C12.934 9.38 12.507 9 12 9Z"),
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
        return _bandage!!
    }

private var _bandage: ImageVector? = null
