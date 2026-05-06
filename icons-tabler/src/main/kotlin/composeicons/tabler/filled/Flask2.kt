package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask2: ImageVector
    get() {
        if (_flask2 != null) return _flask2!!
        _flask2 = tablerFilledIcon(
            name = "Flask2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v5.674l.062 .03c2.049 .996 3.485 2.926 3.85 5.174l.037 .262c.326 2.634-.866 5.226-3.078 6.693-.164 .109-.356 .167-.553 .167h-6.635c-.196 0-.388-.058-.552-.166C6.035 20.446 4.844 18.041 5.011 15.533 5.177 13.024 6.676 10.798 8.938 9.7L9 9.672v-5.672C8.448 4 8 3.552 8 3 8 2.448 8.448 2 9 2h6ZM13 4h-2v6.34c0 .378-.213 .724-.551 .894l-.116 .049C9.025 11.744 7.967 12.729 7.413 14h9.172c-.554-1.27-1.611-2.254-2.918-2.715-.4-.141-.667-.519-.667-.943v-6.342Z"),
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
        return _flask2!!
    }

private var _flask2: ImageVector? = null
