package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = tablerFilledIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 19.002 L 19.000 21.000 C 19.000 21.507 18.620 21.934 18.117 21.993 L 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 19.006 C 5.000 18.454 5.448 18.006 6.000 18.006 L 18.000 18.002 C 18.552 18.002 19.000 18.450 19.000 19.002"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 13.944 2.000 15.712 3.126 16.533 4.888 L 16.593 5.025 L 16.729 5.016 C 18.987 4.914 21.033 6.339 21.719 8.493 L 21.782 8.706 C 22.416 11.046 21.280 13.504 19.086 14.537 L 18.999 14.574 L 18.999 16.002 C 18.999 16.554 18.551 17.002 17.999 17.002 L 5.999 17.006 C 5.492 17.006 5.065 16.626 5.006 16.123 L 4.999 16.006 L 4.999 14.573 L 4.876 14.518 C 3.632 13.919 2.691 12.833 2.276 11.517 L 2.212 11.294 C 1.797 9.732 2.163 8.066 3.194 6.822 C 4.225 5.577 5.793 4.908 7.405 5.024 L 7.471 4.882 C 8.259 3.198 9.916 2.090 11.773 2.005 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
