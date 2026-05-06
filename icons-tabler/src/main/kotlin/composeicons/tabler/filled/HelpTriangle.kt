package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpTriangle: ImageVector
    get() {
        if (_helpTriangle != null) return _helpTriangle!!
        _helpTriangle = tablerFilledIcon(
            name = "HelpTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.67c.955 0 1.845 .467 2.39 1.247l.105 .16 8.114 13.548c.501 .868 .521 1.933 .052 2.819-.469 .886-1.36 1.469-2.359 1.544l-.195 .008h-16.225C2.881 20.985 1.956 20.461 1.432 19.608 .908 18.756 .858 17.694 1.3 16.796l.099-.185L9.509 3.073C10.037 2.202 10.982 1.67 12 1.67ZM12 15c-.507 0-.934 .38-.993 .883L11 16l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16.01l-.007-.127C12.934 15.38 12.507 15 12 15ZM13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.344 .403-.314 1.004 .068 1.371 .382 .367 .984 .372 1.372 .012l.171-.18c.302-.277 .745-.337 1.11-.15 .394 .2 .611 .635 .533 1.07-.078 .435-.433 .767-.873 .816l-.232 .012c-.528 .058-.919 .519-.889 1.05 .03 .531 .469 .945 1 .944 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378Z"),
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
        return _helpTriangle!!
    }

private var _helpTriangle: ImageVector? = null
