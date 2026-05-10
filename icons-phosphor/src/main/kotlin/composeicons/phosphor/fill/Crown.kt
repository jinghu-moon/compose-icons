package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorFillIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 80c.011-12.034-7.669-22.728-19.075-26.564-11.406-3.836-23.987 .046-31.25 9.64-7.263 9.595-7.583 22.757-.795 32.694l-26.79 33L146 73.4c9-7.575 12.306-19.967 8.274-31.019C150.243 31.33 139.734 23.978 127.97 23.978c-11.764 0-22.273 7.353-26.304 18.404-4.032 11.051-.726 23.444 8.274 31.019L85.91 128.74 59.12 95.74C66.192 85.378 65.508 71.576 57.447 61.964 49.385 52.351 35.914 49.274 24.479 54.433 13.043 59.592 6.435 71.728 8.306 84.133c1.871 12.405 11.766 22.051 24.214 23.607L47 194.63c1.286 7.714 7.959 13.369 15.78 13.37h130.44c7.821-.001 14.494-5.656 15.78-13.37l14.47-86.85C237.482 106.03 247.998 94.121 248 80ZM128 40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM24 80C24 73.373 29.373 68 36 68c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C29.373 92 24 86.627 24 80ZM220 92c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
