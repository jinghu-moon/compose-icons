package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorBoldIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 208c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12v-160C20 41.373 25.373 36 32 36c6.627 0 12 5.373 12 12v11l52 52L119.51 87.48c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529L188 139v-11c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40q0 .6-.06 1.2c0 .16-.05 .33-.07 .49-.02 .16-.06 .45-.1 .67-.04 .22-.09 .38-.14 .56-.05 .18-.09 .39-.15 .58l-.19 .54c-.07 .19-.13 .38-.21 .56-.08 .18-.15 .34-.23 .5-.08 .16-.17 .38-.27 .57-.1 .19-.18 .3-.27 .45-.09 .15-.21 .38-.33 .56-.12 .18-.24 .32-.36 .47-.12 .15-.22 .32-.34 .47-.12 .15-.46 .53-.71 .78l-.08 .1-.1 .08c-.25 .25-.51 .48-.78 .71l-.46 .34c-.16 .12-.32 .25-.48 .36-.16 .11-.37 .22-.55 .33-.18 .11-.3 .19-.46 .27-.16 .08-.37 .18-.56 .27-.19 .09-.33 .16-.51 .23l-.54 .21-.57 .19c-.18 .057-.364 .104-.55 .14l-.58 .15-.64 .09-.53 .08c-.392 .037-.786 .054-1.18 .05h-40c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h11L128 113l-23.51 23.52c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L44 93v103h180c6.627 0 12 5.373 12 12Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
