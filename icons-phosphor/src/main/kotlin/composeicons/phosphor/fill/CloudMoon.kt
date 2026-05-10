package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorFillIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 72c-4.14-.002-8.274 .332-12.36 1C156.66 42.205 134.321 16.766 104.17 9.83c-2.684-.617-5.497 .191-7.445 2.137-1.948 1.946-2.759 4.758-2.145 7.443 3.817 16.628-.147 34.09-10.771 47.44C73.186 80.2 57.061 87.985 40 88c-4.237 .001-8.46-.476-12.59-1.42-2.686-.618-5.501 .19-7.451 2.139-1.949 1.949-2.757 4.764-2.139 7.451 4.341 18.717 15.961 34.933 32.29 45.06-11.595 15.796-13.326 36.768-4.477 54.251C54.481 212.964 72.405 223.989 92 224h80c41.974 0 76-34.026 76-76C248 106.026 213.974 72 172 72ZM37.37 104c.87 0 1.75 0 2.63 0 39.746-.044 71.956-32.254 72-72 0-.89 0-1.78 0-2.67 18.791 8.797 31.127 27.32 32 48.05-19.746 7.857-35.326 23.583-43 43.4-2.972-.519-5.983-.78-9-.78-10.754-.002-21.241 3.35-30 9.59C51.24 123.946 42.599 114.967 37.37 104Z"),
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
