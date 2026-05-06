package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) return _helpOctagon!!
        _helpOctagon = tablerFilledIcon(
            name = "HelpOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.897 1c.983-0 1.931 .362 2.664 1.016l.165 .156 4.1 4.1c.697 .695 1.112 1.623 1.168 2.605L23 9.104v5.794c0 .983-.362 1.931-1.016 2.664l-.156 .165-4.1 4.1c-.695 .696-1.621 1.112-2.603 1.168l-.227 .006h-5.795C8.12 23.001 7.172 22.639 6.439 21.984l-.165-.156L2.174 17.728C1.478 17.033 1.062 16.106 1.006 15.124L1 14.897v-5.794C1 8.12 1.362 7.172 2.016 6.439l.156-.165L6.272 2.174C6.967 1.477 7.895 1.062 8.877 1.006L9.104 1h5.793ZM12 15c-.507 0-.934 .38-.993 .883L11 16l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16.01l-.007-.127C12.934 15.38 12.507 15 12 15ZM13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.344 .403-.314 1.004 .068 1.371 .382 .367 .984 .372 1.372 .012l.171-.18c.302-.277 .745-.337 1.11-.15 .394 .2 .611 .635 .533 1.07-.078 .435-.433 .767-.873 .816l-.232 .012c-.528 .058-.919 .519-.889 1.05 .03 .531 .469 .945 1 .944 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378Z"),
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
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null
