package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZoom: ImageVector
    get() {
        if (_brandZoom != null) return _brandZoom!!
        _brandZoom = tablerOutlineIcon(
            name = "BrandZoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.011 9.385 L 17.011 14.513 L 21.000 18.000 L 21.000 6.000 L 17.011 9.385"),
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
        pathData = parseSvgPathData("M 3.887 6.000 L 13.967 6.000 C 15.435 6.000 17.000 7.203 17.000 8.803 L 17.000 16.999 C 17.005 17.544 16.570 17.990 16.025 17.999 L 5.652 17.999 C 3.985 17.999 3.000 16.499 3.000 14.999 L 3.010 6.999 C 2.972 6.743 3.048 6.484 3.218 6.289 C 3.386 6.096 3.633 5.991 3.888 6.002 L 3.887 6.000"),
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
        return _brandZoom!!
    }

private var _brandZoom: ImageVector? = null
