package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFacebook: ImageVector
    get() {
        if (_brandFacebook != null) return _brandFacebook!!
        _brandFacebook = tablerOutlineIcon(
            name = "BrandFacebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 10.000 L 7.000 14.000 L 10.000 14.000 L 10.000 21.000 L 14.000 21.000 L 14.000 14.000 L 17.000 14.000 L 18.000 10.000 L 14.000 10.000 L 14.000 8.000 C 14.000 7.448 14.448 7.000 15.000 7.000 L 18.000 7.000 L 18.000 3.000 L 15.000 3.000 C 12.239 3.000 10.000 5.239 10.000 8.000 L 10.000 10.000 L 7.000 10.000"),
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
        return _brandFacebook!!
    }

private var _brandFacebook: ImageVector? = null
