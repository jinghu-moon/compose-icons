package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonMinus: ImageVector
    get() {
        if (_pentagonMinus != null) return _pentagonMinus!!
        _pentagonMinus = tablerOutlineIcon(
            name = "PentagonMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 21.000 Q 10.680 21.000 7.042 21.005 C 6.185 21.004 5.426 20.453 5.161 19.638 L 2.097 10.208 C 1.833 9.393 2.123 8.500 2.816 7.996 L 10.837 2.168 C 11.531 1.665 12.469 1.665 13.163 2.168 L 21.184 7.996 C 21.878 8.500 22.168 9.393 21.903 10.208 L 20.344 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 L 22.000 19.000"),
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
        return _pentagonMinus!!
    }

private var _pentagonMinus: ImageVector? = null
