package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerClubsLine: ImageVector
    get() {
        if (_pokerClubsLine != null) return _pokerClubsLine!!
        _pokerClubsLine = remixIcon(
            name = "PokerClubsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.236 7.46c.338 1.08 .99 2.092 1.627 3.043l.149 .222c.153 .228 .304 .452 .447 .673 0 0-.557-.429-.808-.625C8.527 9.893 7.727 9.267 6.714 9.068 6.489 9.023 6.253 9 6 9 3.791 9 2 10.791 2 13c0 2.209 1.791 4 4 4 .676 0 1.353-.183 2.039-.48 .683-.295 1.377-.703 2.089-1.156-.016 .972-.133 1.78-.33 2.522-.246 .929-.617 1.755-1.07 2.668C8.398 21.22 8.875 22 9.618 22h4.764c.743 0 1.22-.78 .89-1.446-.453-.913-.824-1.739-1.07-2.668-.197-.742-.314-1.55-.33-2.522 .713 .452 1.406 .861 2.089 1.156 .686 .297 1.363 .48 2.039 .48 2.209 0 4-1.791 4-4C22 10.791 20.209 9 18 9c-.267 0-.515 .026-.752 .075-.995 .207-1.789 .829-2.9 1.698-.251 .196-.808 .625-.808 .625 .078-.12 .156-.239 .233-.357l.002-.002 0-0 0-0 0-0c.12-.183 .238-.364 .354-.544 .674-1.043 1.28-2.04 1.61-3.023C15.904 6.978 16 6.489 16 6 16 3.791 14.209 2 12 2 9.791 2 8 3.791 8 6c0 .5 .088 .987 .236 1.46ZM13.458 7.721c-.351 .681-.808 1.383-1.356 2.222l-.103 .157c-.131-.199-.258-.387-.38-.569v-0C11.239 8.964 10.901 8.461 10.598 7.9 10.189 7.141 10 6.534 10 6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 .414-.147 .954-.542 1.721ZM10.496 13.399c.476-.009 .949-.187 1.321-.53 .066-.061 .127-.126 .184-.194 .056 .068 .117 .132 .184 .194 .372 .343 .844 .522 1.321 .53-.211 .039-.417 .113-.61 .221-.418 .234-.731 .606-.894 1.04-.163-.434-.476-.806-.894-1.04-.193-.108-.399-.182-.61-.221ZM11.185 20c.367-.889 .657-1.822 .815-2.927 .157 1.106 .447 2.039 .815 2.927h-1.629ZM13.909 13.365c.545-.102 .993-.467 1.422-.815 .084-.068 .167-.136 .25-.201C17.061 11.19 17.415 11 18 11c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-.699 0-1.594-.396-3.056-1.324-.316-.2-.674-.305-1.035-.311ZM6 11c.585 0 .94 .19 2.42 1.349 .083 .065 .166 .133 .25 .201 .428 .348 .877 .714 1.422 .815-.361 .007-.719 .111-1.035 .311C7.594 14.604 6.699 15 6 15 4.895 15 4 14.105 4 13c0-1.105 .895-2 2-2Z"),
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
        return _pokerClubsLine!!
    }

private var _pokerClubsLine: ImageVector? = null
