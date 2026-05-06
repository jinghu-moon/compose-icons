package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber9: ImageVector
    get() {
        if (_hexagonNumber9 != null) return _hexagonNumber9!!
        _hexagonNumber9 = tablerFilledIcon(
            name = "HexagonNumber9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.425 1.414c1.001-.552 2.215-.552 3.216 0l6.775 3.995c.067 .04 .127 .084 .18 .133l.008 .007 .107 .076c.759 .569 1.228 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.763 2.002 16.68 2 15.502v-7.285C1.999 7.051 2.631 5.976 3.65 5.409ZM13 7h-2l-.15 .005C9.866 7.079 9.083 7.859 9.006 8.843L9 9v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 13h2v2h-2l-.007-.117c-.062-.525-.523-.911-1.052-.88C9.413 14.034 9.001 14.471 9 15c-0 1.047 .806 1.917 1.85 1.995L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-6l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7ZM13 9v2h-2v-2h2Z"),
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
        return _hexagonNumber9!!
    }

private var _hexagonNumber9: ImageVector? = null
