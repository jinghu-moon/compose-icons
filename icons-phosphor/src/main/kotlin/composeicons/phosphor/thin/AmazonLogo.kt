package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorThinIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 168v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-22.34l-9.1 9.1C224.52 189.37 188.3 228 128 228 66.92 228 30.55 188.36 29 186.68c-1.48-1.657-1.337-4.2 .32-5.68 1.657-1.48 4.2-1.337 5.68 .32 .35 .39 35.63 38.68 93 38.68 57.37 0 92.68-38.29 93-38.68l.14-.15L230.31 172h-22.31c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM164 105.51v-21.51C164.009 65.502 151.334 49.411 133.348 45.088 115.362 40.765 96.758 49.338 88.36 65.82c-.625 1.317-1.916 2.189-3.371 2.278-1.455 .089-2.842-.621-3.622-1.852-.78-1.231-.829-2.789-.127-4.066C91.323 42.411 113.643 32.13 135.22 37.318 156.797 42.505 172.006 61.808 172 84v92c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-17.51c-11.693 17.66-33.579 25.568-53.859 19.462C89.86 171.846 75.978 153.17 75.978 131.99c0-21.18 13.882-39.856 34.163-45.962 20.281-6.106 42.166 1.803 53.859 19.462ZM164 132C164 109.909 146.091 92 124 92c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
