package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber2: ImageVector
    get() {
        if (_hexagonNumber2 != null) return _hexagonNumber2!!
        _hexagonNumber2 = tablerFilledIcon(
            name = "HexagonNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c1.001-.552 2.215-.552 3.216 0l6.775 3.995c.067 .04 .127 .084 .18 .133l.008 .007 .107 .076c.759 .569 1.228 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.763 2.002 16.68 2 15.502v-7.285C1.999 7.051 2.631 5.976 3.65 5.409ZM13 7h-3l-.117 .007C9.38 7.067 9.001 7.493 9.001 8c0 .507 .379 .933 .882 .993L10 9h3v2h-2l-.15 .005c-.984 .074-1.767 .854-1.844 1.838L9 13v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h3l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L14 15h-3v-2h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7Z"),
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
        return _hexagonNumber2!!
    }

private var _hexagonNumber2: ImageVector? = null
