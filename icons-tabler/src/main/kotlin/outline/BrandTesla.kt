package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTesla: ImageVector
    get() {
        if (_brandTesla != null) return _brandTesla!!
        _brandTesla = tablerOutlineIcon(
            name = "BrandTesla",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 21.000 L 15.000 10.000 C 17.359 10.000 18.000 10.000 18.000 11.000 C 18.000 11.000 19.180 9.255 20.000 8.000 C 16.923 6.536 14.000 7.000 14.000 7.000 L 12.000 9.000 L 10.000 7.000 C 10.000 7.000 7.077 6.536 4.000 8.000 C 4.820 9.255 6.000 11.000 6.000 11.000 C 6.000 10.000 6.744 10.000 9.000 10.000 L 12.000 21.000"),
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
        pathData = parseSvgPathData("M 20.000 5.000 C 14.886 3.000 9.114 3.000 4.000 5.000"),
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
        return _brandTesla!!
    }

private var _brandTesla: ImageVector? = null
