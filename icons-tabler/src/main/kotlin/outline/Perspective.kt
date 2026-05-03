package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = tablerOutlineIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.141 4.163 L 18.141 5.877 C 18.634 5.947 19.000 6.369 19.000 6.867 L 19.000 17.133 C 19.000 17.631 18.634 18.053 18.141 18.123 L 6.141 19.837 C 5.854 19.878 5.564 19.792 5.345 19.602 C 5.126 19.412 5.000 19.137 5.000 18.847 L 5.000 5.153 C 5.000 4.863 5.126 4.588 5.345 4.398 C 5.564 4.208 5.854 4.122 6.141 4.163"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
