package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleFit: ImageVector
    get() {
        if (_brandGoogleFit != null) return _brandGoogleFit!!
        _brandGoogleFit = tablerOutlineIcon(
            name = "BrandGoogleFit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 8.866 9.267 6.132C7.752 4.651 5.328 4.665 3.831 6.163 2.333 7.66 2.319 10.084 3.8 11.599l2.733 2.734L12 19.8l8.202-8.201c1.509-1.51 1.509-3.958-.001-5.467C18.69 4.622 16.242 4.623 14.733 6.133L6.532 14.333"),
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
        return _brandGoogleFit!!
    }

private var _brandGoogleFit: ImageVector? = null
