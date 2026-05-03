package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BleachOff: ImageVector
    get() {
        if (_bleachOff != null) return _bleachOff!!
        _bleachOff = tablerOutlineIcon(
            name = "BleachOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 19.000 L 19.000 19.000M 20.986 17.023 C 20.989 16.758 20.939 16.495 20.840 16.250 L 13.740 4.000 C 13.388 3.363 12.718 2.968 11.990 2.968 C 11.262 2.968 10.592 3.363 10.240 4.000 L 9.425 5.405M 7.937 7.973 L 3.140 16.250 C 2.896 16.850 2.958 17.530 3.306 18.076 C 3.653 18.623 4.244 18.967 4.890 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _bleachOff!!
    }

private var _bleachOff: ImageVector? = null
