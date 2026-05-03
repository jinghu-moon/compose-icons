package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = tablerOutlineIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 21.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000 L 19.000 21.000 L 16.000 19.000 L 14.000 21.000 L 12.000 19.000 L 10.000 21.000 L 8.000 19.000 L 5.000 21.000M 9.000 7.000 L 15.000 7.000M 9.000 11.000 L 15.000 11.000M 13.000 15.000 L 15.000 15.000"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
