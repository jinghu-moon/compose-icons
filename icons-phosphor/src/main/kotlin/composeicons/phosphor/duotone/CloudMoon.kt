package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorDuotoneIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M106.31 130.38ZM102.38 17.62h0c4.931 21.499-1.545 44.022-17.141 59.619C69.642 92.835 47.119 99.311 25.62 94.38h0c4.622 19.971 18.515 36.529 37.38 44.55h0c11.873-10.398 28.399-13.656 43.33-8.54 6.061-22.515 23.215-40.367 45.47-47.32h.15c0-1 .07-2 .07-3C152.058 50.226 131.464 24.316 102.38 17.62Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M172 72c-4.14-.002-8.274 .333-12.36 1C156.66 42.205 134.321 16.766 104.17 9.83c-2.684-.617-5.497 .191-7.445 2.137-1.948 1.946-2.759 4.758-2.145 7.443 3.817 16.628-.147 34.09-10.771 47.44C73.186 80.2 57.061 87.985 40 88c-4.237 .001-8.46-.476-12.59-1.42-2.686-.618-5.501 .19-7.451 2.139-1.949 1.949-2.757 4.764-2.139 7.451 4.341 18.717 15.961 34.933 32.29 45.06-11.595 15.796-13.326 36.768-4.477 54.251C54.481 212.964 72.405 223.989 92 224h80c41.974 0 76-34.026 76-76C248 106.026 213.974 72 172 72ZM37.37 104c.87 0 1.75 0 2.63 0 39.746-.044 71.956-32.254 72-72 0-.89 0-1.78 0-2.67 18.778 8.787 31.111 27.287 32 48-19.754 7.844-35.339 23.574-43 43.4-13.661-2.364-27.701 .826-39 8.86C51.24 123.946 42.599 114.967 37.37 104ZM172 208h-80C78.582 207.975 66.291 200.49 60.111 188.579c-6.18-11.911-5.222-26.27 2.484-37.254 7.706-10.985 20.882-16.772 34.185-15.015-.37 2.37-.63 4.79-.77 7.23-.254 4.418 3.122 8.206 7.54 8.46 4.418 .254 8.206-3.122 8.46-7.54 .224-3.99 .854-7.947 1.88-11.81 0-.16 .09-.32 .12-.48 8.168-30.015 37.902-48.827 68.523-43.353 30.621 5.475 51.995 33.424 49.257 64.41C229.051 184.213 203.107 207.981 172 208Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
