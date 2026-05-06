package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber1: ImageVector
    get() {
        if (_hexagonNumber1 != null) return _hexagonNumber1!!
        _hexagonNumber1 = tablerFilledIcon(
            name = "HexagonNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c1.001-.552 2.215-.552 3.216 0l6.775 3.995c.067 .04 .127 .084 .18 .133l.008 .007 .107 .076c.759 .569 1.228 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.763 2.002 16.68 2 15.502v-7.285C1.999 7.051 2.631 5.976 3.65 5.409ZM11.377 7.217l-.084 .076-2 2-.083 .094c-.28 .361-.28 .865 0 1.226l.083 .094 .094 .083c.361 .28 .865 .28 1.226 0l.094-.083L11 10.414v5.586l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16v-8l-.006-.114C12.911 7.109 11.986 6.726 11.377 7.216Z"),
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
        return _hexagonNumber1!!
    }

private var _hexagonNumber1: ImageVector? = null
