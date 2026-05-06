package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodHappy: ImageVector
    get() {
        if (_moodHappy != null) return _moodHappy!!
        _moodHappy = tablerFilledIcon(
            name = "MoodHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15 13h-6c-.552 0-1 .448-1 1v.05c0 2.118 1.661 3.864 3.777 3.97l.227 .005c2.121-.015 3.866-1.673 3.99-3.79L16 14.029c.008-.27-.094-.532-.282-.726C15.529 13.109 15.27 13 15 13ZM9.01 8l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C9.976 8.413 9.539 8.001 9.01 8ZM15.01 8l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C15.976 8.413 15.539 8.001 15.01 8Z"),
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
        return _moodHappy!!
    }

private var _moodHappy: ImageVector? = null
