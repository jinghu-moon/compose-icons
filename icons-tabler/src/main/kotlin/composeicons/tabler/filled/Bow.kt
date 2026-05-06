package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bow: ImageVector
    get() {
        if (_bow != null) return _bow!!
        _bow = tablerFilledIcon(
            name = "Bow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 2l.081 .003 .12 .017 .111 .03 .111 .044 .098 .052 .096 .067 .09 .08q.054 .053 .097 .112l.071 .11 .031 .062 .034 .081 .024 .076 .03 .148L22 3v4c0 .552-.448 1-1 1C20.448 8 20 7.552 20 7v-1.586L17.93 7.484C19.231 9.108 20 11.19 20 13.5c0 2.703-1.047 5.462-2.793 7.207-.391 .39-1.024 .39-1.414 0L10.25 15.165 7 18.414v2.586c0 .552-.448 1-1 1C5.448 22 5 21.552 5 21v-2h-2c-.507-0-.934-.38-.993-.883L2 18c0-.552 .448-1 1-1h2.584L8.835 13.75 3.293 8.207C2.903 7.817 2.903 7.186 3.291 6.795 5.036 5.04 7.78 4 10.5 4c2.31 0 4.393 .768 6.015 2.07L18.584 4h-1.584c-.507-0-.934-.38-.993-.883L16 3c0-.552 .448-1 1-1ZM16.505 8.91 12.415 13l4.595 4.594c.6-1.178 .936-2.473 .985-3.795L18 13.5c0-1.754-.55-3.336-1.495-4.59M10.5 6C9.06 6 7.61 6.36 6.402 6.987L11 11.585 15.09 7.495C13.836 6.55 12.254 6 10.5 6"),
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
        return _bow!!
    }

private var _bow: ImageVector? = null
