package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Baseball: ImageVector
    get() {
        if (_baseball != null) return _baseball!!
        _baseball = phosphorRegularIcon(
            name = "Baseball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM72.09 195.91c.82-1 1.64-1.93 2.42-2.91 2.761-3.455 2.2-8.494-1.255-11.255C69.8 178.984 64.761 179.545 62 183l-1.34 1.62C33.074 151.913 33.074 104.087 60.66 71.38L62 73c2.761 3.455 7.8 4.016 11.255 1.255C76.71 71.494 77.271 66.455 74.51 63c-.78-1-1.6-2-2.42-2.91 32.46-26.788 79.36-26.788 111.82 0-.82 1-1.64 1.92-2.42 2.91-2.761 3.455-2.2 8.494 1.255 11.255 3.455 2.761 8.494 2.2 11.255-1.255l1.34-1.62c27.586 32.707 27.586 80.533 0 113.24L194 183c-1.752-2.333-4.636-3.526-7.525-3.115-2.889 .412-5.324 2.363-6.355 5.092-1.031 2.729-.495 5.804 1.4 8.023 .78 1 1.6 1.95 2.42 2.91-32.46 26.788-79.36 26.788-111.82 0ZM95.89 145.32c-.994 5.901-2.493 11.706-4.48 17.35-1.475 4.167-6.048 6.35-10.215 4.875-4.167-1.475-6.35-6.048-4.875-10.215 1.686-4.764 2.954-9.666 3.79-14.65 .448-2.841 2.387-5.222 5.077-6.238 2.691-1.016 5.719-.509 7.933 1.327 2.213 1.836 3.271 4.719 2.77 7.551ZM95.89 110.68c.729 4.357-2.213 8.481-6.57 9.21-.436 .071-.878 .108-1.32 .11-3.905-.005-7.236-2.829-7.88-6.68-.836-4.984-2.104-9.886-3.79-14.65-1.475-4.167 .708-8.74 4.875-10.215 4.167-1.475 8.74 .708 10.215 4.875 1.984 5.645 3.479 11.449 4.47 17.35ZM174.8 167.54c-4.164 1.474-8.735-.706-10.21-4.87-1.987-5.644-3.486-11.449-4.48-17.35-.501-2.832 .557-5.715 2.77-7.551 2.213-1.836 5.242-2.343 7.933-1.327 2.691 1.016 4.629 3.397 5.077 6.238 .836 4.984 2.104 9.886 3.79 14.65 .707 2.001 .59 4.201-.325 6.116-.915 1.915-2.554 3.388-4.555 4.094ZM160.11 110.68c.994-5.901 2.493-11.706 4.48-17.35 1.475-4.167 6.048-6.35 10.215-4.875 4.167 1.475 6.35 6.048 4.875 10.215-1.686 4.764-2.954 9.666-3.79 14.65-.645 3.855-3.981 6.68-7.89 6.68-.446-.002-.89-.039-1.33-.11-4.353-.734-7.289-4.856-6.56-9.21Z"),
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
        return _baseball!!
    }

private var _baseball: ImageVector? = null
