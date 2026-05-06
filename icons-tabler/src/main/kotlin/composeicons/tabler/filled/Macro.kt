package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Macro: ImageVector
    get() {
        if (_macro != null) return _macro!!
        _macro = tablerFilledIcon(
            name = "Macro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.994 2.888 18 3v3c-0 2.928-2.113 5.428-5 5.916v4.186C14.315 14.756 16.118 13.998 18 14c.552 0 1 .448 1 1 0 3.866-3.134 7-7 7C8.134 22 5 18.866 5 15c0-.552 .448-1 1-1 1.96 0 3.731 .805 5.002 2.103L11 11.917C8.113 11.429 6 8.928 6 6v-3c-0-.369 .203-.708 .528-.882 .325-.174 .72-.155 1.027 .05L9.872 3.712 11.292 2.292c.357-.356 .922-.391 1.32-.082l.095 .083 1.42 1.419L16.445 2.168c.29-.194 .661-.223 .977-.076 .317 .147 .534 .449 .573 .796M7.13 16.128l.03 .134c.471 1.798 1.899 3.188 3.71 3.61C10.44 18.012 8.989 16.56 7.13 16.128M16.872 16.13l-.134 .03c-1.798 .471-3.188 1.899-3.61 3.71 1.86-.43 3.312-1.881 3.744-3.74"),
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
        return _macro!!
    }

private var _macro: ImageVector? = null
