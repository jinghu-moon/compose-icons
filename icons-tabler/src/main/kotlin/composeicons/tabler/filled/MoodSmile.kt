package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodSmile: ImageVector
    get() {
        if (_moodSmile != null) return _moodSmile!!
        _moodSmile = tablerFilledIcon(
            name = "MoodSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15.2 14.286c-.394-.387-1.027-.38-1.414 .014-.47 .48-1.114 .751-1.786 .751-.672 0-1.316-.271-1.786-.751-.388-.385-1.014-.387-1.404-.004-.39 .383-.401 1.008-.024 1.404 .846 .864 2.005 1.35 3.214 1.35 1.209 0 2.368-.487 3.214-1.35 .387-.394 .38-1.027-.014-1.414ZM9.01 9l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C9.976 9.413 9.539 9.001 9.01 9ZM15.01 9l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C15.976 9.413 15.539 9.001 15.01 9Z"),
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
        return _moodSmile!!
    }

private var _moodSmile: ImageVector? = null
