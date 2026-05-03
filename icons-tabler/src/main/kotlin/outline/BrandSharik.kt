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
                pathData = parseSvgPathData("M 4.281 16.606 C 2.156 13.069 2.719 8.539 5.644 5.629 C 8.574 2.714 13.109 2.160 16.655 4.283 C 15.071 8.975 14.240 11.243 12.000 13.000 C 10.416 14.242 8.164 15.240 4.281 16.606M 20.616 9.300 C 22.729 16.890 15.724 22.661 9.314 20.564 C 11.245 17.464 12.549 15.958 14.000 14.499 C 15.705 12.784 17.591 11.269 20.616 9.300"),
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
