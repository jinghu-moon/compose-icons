package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop32: ImageVector
    get() {
        if (_crop32 != null) return _crop32!!
        _crop32 = tablerOutlineIcon(
            name = "Crop32",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 9.000 C 4.000 7.895 4.895 7.000 6.000 7.000 L 18.000 7.000 C 19.105 7.000 20.000 7.895 20.000 9.000 L 20.000 15.000 C 20.000 16.105 19.105 17.000 18.000 17.000 L 6.000 17.000 C 4.895 17.000 4.000 16.105 4.000 15.000 L 4.000 9.000"),
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
        return _crop32!!
    }

private var _crop32: ImageVector? = null
