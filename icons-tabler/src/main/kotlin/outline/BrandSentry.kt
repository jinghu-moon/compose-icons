package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSentry: ImageVector
    get() {
        if (_brandSentry != null) return _brandSentry!!
        _brandSentry = tablerOutlineIcon(
            name = "BrandSentry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 18.000 C 2.994 18.381 3.100 18.755 3.306 19.076 C 3.653 19.622 4.244 19.966 4.890 20.000 C 5.536 20.033 4.353 20.000 5.000 20.000 L 8.000 20.000 C 8.000 17.756 6.502 15.789 4.340 15.190 C 4.898 14.217 5.580 13.041 6.380 11.659 C 9.777 13.036 12.000 16.335 12.000 20.000 L 16.000 20.000 C 16.663 20.000 18.337 20.000 19.000 20.000 C 19.663 19.995 20.280 19.663 20.648 19.112 C 21.017 18.562 21.088 17.864 20.840 17.250 L 13.740 5.000 C 13.388 4.363 12.718 3.968 11.990 3.968 C 11.262 3.968 10.592 4.363 10.240 5.000 L 8.400 8.176 C 12.882 10.226 16.000 14.747 16.000 20.000"),
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
        return _brandSentry!!
    }

private var _brandSentry: ImageVector? = null
