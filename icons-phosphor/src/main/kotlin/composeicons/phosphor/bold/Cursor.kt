package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorBoldIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.15 179.17 177.32 132.35l37.93-13.51 .76-.3c7.56-3.339 12.287-10.983 11.897-19.238-.39-8.255-5.817-15.42-13.657-18.032L54.16 29C47.022 26.706 39.2 28.597 33.899 33.899 28.597 39.2 26.706 47.022 29 54.16L81.27 214.24c2.612 7.841 9.777 13.267 18.032 13.657 8.255 .39 15.899-4.338 19.238-11.897 .11-.25 .21-.5 .3-.76l13.51-37.92 46.83 46.82c7.81 7.808 20.47 7.808 28.28 0l16.69-16.68c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM193.32 204.34 144.84 155.86c-3.75-3.751-8.836-5.859-14.14-5.86-1.255 .003-2.507 .12-3.74 .35-6.496 1.23-11.965 5.59-14.61 11.65-.11 .25-.21 .5-.3 .76l-11.65 32.74L54.29 54.29l141.21 46.1-32.71 11.66c-.26 .09-.51 .19-.76 .3-6.068 2.639-10.438 8.108-11.673 14.609-1.235 6.501 .825 13.191 5.503 17.871h0l48.49 48.48Z"),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
