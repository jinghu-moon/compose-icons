package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HouseHeart: ImageVector
    get() {
        if (_houseHeart != null) return _houseHeart!!
        _houseHeart = lucideOutlineIcon(
            name = "HouseHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.620 13.800 C 8.047 13.203 7.848 12.339 8.103 11.551 C 8.357 10.763 9.024 10.179 9.838 10.029 C 10.652 9.880 11.483 10.190 12.000 10.836 C 12.520 10.197 13.348 9.893 14.158 10.044 C 14.968 10.195 15.630 10.776 15.885 11.560 C 16.140 12.343 15.946 13.203 15.380 13.802 L 12.754 16.658 C 12.564 16.876 12.290 17.002 12.000 17.002 C 11.711 17.002 11.437 16.876 11.247 16.658 Z"),
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
        pathData = parseSvgPathData("M 3.000 10.000 C 3.000 9.411 3.259 8.852 3.709 8.472 L 10.709 2.472 C 11.454 1.842 12.546 1.842 13.291 2.472 L 20.291 8.472 C 20.741 8.852 21.000 9.411 21.000 10.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 Z"),
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
        return _houseHeart!!
    }

private var _houseHeart: ImageVector? = null
