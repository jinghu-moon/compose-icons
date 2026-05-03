package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerFilledIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.661 3.000 L 20.341 3.007 C 20.825 3.002 21.287 3.210 21.603 3.577 C 21.919 3.945 22.057 4.433 21.967 4.973 L 18.629 19.624 C 18.499 20.421 17.808 21.005 17.000 21.000 L 6.990 21.000 C 6.084 20.991 5.312 20.332 5.170 19.483 L 2.022 4.907 C 1.943 4.428 2.080 3.939 2.396 3.571 C 2.713 3.203 3.176 2.994 3.661 3.000M 15.000 8.000 L 9.000 8.000 C 8.706 8.000 8.427 8.129 8.237 8.354 C 8.048 8.578 7.966 8.874 8.014 9.164 L 9.014 15.164 C 9.094 15.646 9.511 16.000 10.000 16.000 L 14.000 16.000 C 14.489 16.000 14.906 15.646 14.986 15.164 L 15.986 9.164 C 16.034 8.874 15.952 8.578 15.763 8.354 C 15.573 8.129 15.294 8.000 15.000 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
