package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodSad: ImageVector
    get() {
        if (_moodSad != null) return _moodSad!!
        _moodSad = tablerFilledIcon(
            name = "MoodSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12 13.2c-1.209-0-2.368 .486-3.214 1.35-.256 .254-.356 .626-.261 .974 .095 .348 .37 .618 .72 .706 .35 .088 .72-.019 .969-.28 .47-.48 1.114-.751 1.786-.751 .672 0 1.316 .271 1.786 .751 .388 .385 1.014 .387 1.404 .004 .39-.383 .401-1.008 .024-1.404C14.368 13.686 13.209 13.2 12 13.2ZM9.01 9l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L9 11l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L9.01 9ZM15.01 9l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L15 11l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L15.01 9Z"),
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
        return _moodSad!!
    }

private var _moodSad: ImageVector? = null
