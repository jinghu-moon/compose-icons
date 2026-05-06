package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodConfuzed: ImageVector
    get() {
        if (_moodConfuzed != null) return _moodConfuzed!!
        _moodConfuzed = tablerFilledIcon(
            name = "MoodConfuzed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15.57 13.502c-2.319-.161-4.63 .416-6.6 1.65-.468 .293-.611 .91-.318 1.378 .293 .468 .91 .611 1.378 .318 1.612-1.009 3.503-1.482 5.4-1.35 .551 .039 1.029-.377 1.068-.928 .039-.551-.377-1.029-.928-1.068ZM9.01 9l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L9 11l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L9.01 9ZM15.01 9l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L15 11l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L15.01 9Z"),
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
        return _moodConfuzed!!
    }

private var _moodConfuzed: ImageVector? = null
