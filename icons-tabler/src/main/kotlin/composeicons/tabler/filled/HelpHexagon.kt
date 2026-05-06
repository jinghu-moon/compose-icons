package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpHexagon: ImageVector
    get() {
        if (_helpHexagon != null) return _helpHexagon!!
        _helpHexagon = tablerFilledIcon(
            name = "HelpHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c.935-.515 2.06-.552 3.026-.097l.19 .097 6.775 3.995 .096 .063 .092 .077 .107 .075c.702 .527 1.159 1.317 1.266 2.188l.018 .202L22 8.218v7.284c0 1.106-.57 2.129-1.454 2.693l-.17 .1-6.803 4.302c-.918 .504-2.019 .535-3.004 .068l-.196-.1L3.678 18.328C2.71 17.798 2.079 16.81 2.007 15.709L2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414ZM12 15c-.507 0-.934 .38-.993 .883L11 16l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16.01l-.007-.127C12.934 15.38 12.507 15 12 15ZM13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.344 .403-.314 1.004 .068 1.371 .382 .367 .984 .372 1.372 .012l.171-.18c.302-.277 .745-.337 1.11-.15 .394 .2 .611 .635 .533 1.07-.078 .435-.433 .767-.873 .816l-.232 .012c-.528 .058-.919 .519-.889 1.05 .03 .531 .469 .945 1 .944 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378Z"),
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
        return _helpHexagon!!
    }

private var _helpHexagon: ImageVector? = null
