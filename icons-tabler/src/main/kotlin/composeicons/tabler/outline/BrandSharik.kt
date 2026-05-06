package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSharik: ImageVector
    get() {
        if (_brandSharik != null) return _brandSharik!!
        _brandSharik = tablerOutlineIcon(
            name = "BrandSharik",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.281 16.606C2.156 13.069 2.719 8.539 5.644 5.629 8.574 2.714 13.109 2.16 16.655 4.283 15.071 8.975 14.24 11.243 12 13c-1.584 1.242-3.836 2.24-7.719 3.606M20.616 9.3C22.729 16.89 15.724 22.661 9.314 20.564 11.245 17.464 12.549 15.958 14 14.499c1.705-1.715 3.591-3.23 6.616-5.199"),
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
        return _brandSharik!!
    }

private var _brandSharik: ImageVector? = null
