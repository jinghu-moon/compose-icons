package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BounceRight: ImageVector
    get() {
        if (_bounceRight != null) return _bounceRight!!
        _bounceRight = tablerFilledIcon(
            name = "BounceRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.143 11.486 C 14.436 11.035 15.034 10.897 15.495 11.174 C 15.957 11.451 16.117 12.043 15.857 12.514 C 14.355 15.019 13.447 17.404 12.987 20.164 C 12.827 21.120 11.539 21.314 11.106 20.447 C 9.046 16.327 7.248 15.471 4.316 16.449 C 3.792 16.624 3.226 16.340 3.051 15.816 C 2.876 15.292 3.160 14.726 3.684 14.551 C 6.884 13.484 9.340 14.178 11.487 17.174 L 11.578 17.304 L 11.589 17.264 C 12.111 15.436 12.856 13.714 13.862 11.964 L 14.142 11.486 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 4.000 C 16.343 4.000 15.000 5.343 15.000 7.000 C 15.000 8.657 16.343 10.000 18.000 10.000 C 19.657 10.000 21.000 8.657 21.000 7.000 C 21.000 5.343 19.657 4.000 18.000 4.000"),
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
        return _bounceRight!!
    }

private var _bounceRight: ImageVector? = null
