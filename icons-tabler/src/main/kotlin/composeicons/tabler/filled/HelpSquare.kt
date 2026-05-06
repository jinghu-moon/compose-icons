package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpSquare: ImageVector
    get() {
        if (_helpSquare != null) return _helpSquare!!
        _helpSquare = tablerFilledIcon(
            name = "HelpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.589-0 2.902 1.238 2.995 2.824L22 5v14c0 1.589-1.238 2.902-2.824 2.995L19 22h-14C3.411 22 2.098 20.762 2.005 19.176L2 19v-14C2 3.411 3.238 2.098 4.824 2.005L5 2h14ZM12 15c-.507 0-.934 .38-.993 .883L11 16l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16.01l-.007-.127C12.934 15.38 12.507 15 12 15ZM13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.344 .403-.314 1.004 .068 1.371 .382 .367 .984 .372 1.372 .012l.171-.18c.302-.277 .745-.337 1.11-.15 .394 .2 .611 .635 .533 1.07-.078 .435-.433 .767-.873 .816l-.232 .012c-.528 .058-.919 .519-.889 1.05 .03 .531 .469 .945 1 .944 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378Z"),
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
        return _helpSquare!!
    }

private var _helpSquare: ImageVector? = null
