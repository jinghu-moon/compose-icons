package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorLightIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.06 135.52C226.244 117.5 213.056 102.896 195.619 96.274c-17.437-6.622-36.995-4.454-52.559 5.826-.69-.41-1.41-.8-2.14-1.15L157.78 33.63c.627-2.499-.412-5.119-2.58-6.51C137.13 15.592 114.175 14.969 95.507 25.501 76.839 36.032 65.501 56.001 66.022 77.429c.522 21.428 12.819 40.821 31.978 50.431v.14c0 .77 0 1.54 .1 2.3L31.37 149.36c-2.486 .699-4.247 2.91-4.37 5.49-.801 21.328 10.175 41.373 28.577 52.185 18.401 10.812 41.254 10.645 59.495-.436C133.313 195.517 143.994 175.314 142.88 154c.7-.4 1.39-.83 2.06-1.29L194.81 201c1.858 1.791 4.652 2.194 6.94 1 24.172-12.54 36.365-40.208 29.31-66.51ZM110 128c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM78 76C77.995 59.953 86.352 45.064 100.053 36.71c13.701-8.354 30.764-8.964 45.027-1.61L129.32 98q-.66 0-1.32 0c-11.788 .006-22.481 6.915-27.33 17.66C86.595 107.415 77.962 92.312 78 76ZM108 197.3c-13.896 8.047-30.983 8.265-45.08 .575C48.823 190.185 39.757 175.7 39 159.66l62.39-17.82c5.162 9.928 15.42 16.157 26.61 16.16 1.002 .001 2.003-.049 3-.15-.107 16.304-8.864 31.325-23 39.45ZM214.9 173.54c-3.673 6.357-8.817 11.741-15 15.7L153.27 144.12c6.617-10.336 6.248-23.665-.93-33.62 18.05-10.221 40.707-7.098 55.318 7.625 14.611 14.723 17.561 37.404 7.202 55.375Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
