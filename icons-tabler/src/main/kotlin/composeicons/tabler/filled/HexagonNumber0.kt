package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber0: ImageVector
    get() {
        if (_hexagonNumber0 != null) return _hexagonNumber0!!
        _hexagonNumber0 = tablerFilledIcon(
            name = "HexagonNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c1.001-.552 2.215-.552 3.216 0l6.775 3.995c.067 .04 .127 .084 .18 .133l.008 .007 .107 .076c.759 .569 1.228 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.763 2.002 16.68 2 15.502v-7.285C1.999 7.051 2.631 5.976 3.65 5.409ZM12 7C10.411 7 9.098 8.238 9.005 9.824L9 10v4l.005 .176c.092 1.587 1.405 2.827 2.995 2.827 1.59 0 2.903-1.24 2.995-2.827L15 14v-4l-.005-.176C14.902 8.238 13.589 7 12 7ZM12 9c.507 0 .934 .38 .993 .883L13 10v4l-.007 .117c-.06 .503-.486 .882-.993 .882-.507 0-.933-.379-.993-.882L11 14v-4l.007-.117C11.066 9.38 11.493 9 12 9Z"),
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
        return _hexagonNumber0!!
    }

private var _hexagonNumber0: ImageVector? = null
