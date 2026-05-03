package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger: ImageVector
    get() {
        if (_hanger != null) return _hanger!!
        _hanger = tablerOutlineIcon(
            name = "Hanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000 C 10.000 7.667 10.670 9.000 12.000 10.000 L 11.992 10.000 L 19.963 14.428 C 20.598 14.781 20.992 15.450 20.992 16.177 L 20.992 17.000 C 20.992 18.105 20.097 19.000 18.992 19.000 L 4.992 19.000 C 3.887 19.000 2.992 18.105 2.992 17.000 L 2.992 16.177 C 2.992 15.450 3.386 14.781 4.021 14.428 L 11.992 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _hanger!!
    }

private var _hanger: ImageVector? = null
