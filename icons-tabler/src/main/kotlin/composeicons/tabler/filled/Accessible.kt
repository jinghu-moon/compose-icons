package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Accessible: ImageVector
    get() {
        if (_accessible != null) return _accessible!!
        _accessible = tablerFilledIcon(
            name = "Accessible",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15.949 10.184c-.16-.481-.655-.766-1.152-.663l-.113 .03L12 10.446 9.316 9.551 9.203 9.521c-.496-.102-.99 .183-1.15 .663-.16 .48 .064 1.005 .522 1.221l.109 .044L11 12.22v.976L9.168 15.946l-.06 .1c-.209 .41-.111 .909 .237 1.21l.1 .076 .101 .06c.41 .209 .909 .111 1.21-.237l.076-.1L12 15.303l1.168 1.752 .07 .093c.328 .387 .895 .467 1.317 .185 .422-.282 .567-.835 .336-1.287l-.059-.1L13 13.196v-.977l2.316-.771 .109-.044c.459-.215 .684-.74 .524-1.221ZM12 6c-.828 0-1.5 .672-1.5 1.5C10.5 8.328 11.172 9 12 9c.828 0 1.5-.672 1.5-1.5C13.5 6.672 12.828 6 12 6"),
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
        return _accessible!!
    }

private var _accessible: ImageVector? = null
