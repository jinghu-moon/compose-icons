package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppStoreLine: ImageVector
    get() {
        if (_appStoreLine != null) return _appStoreLine!!
        _appStoreLine = remixIcon(
            name = "AppStoreLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM8.823 15.343l-.79 1.371c-.226 .395-.73 .528-1.125 .302-.395-.226-.528-.73-.302-1.125l.589-1.016c.661-.206 1.202-.048 1.629 .468ZM13.21 8.661l2.423 4.194h2.141c.456 0 .823 .367 .823 .823 0 .456-.367 .823-.823 .823h-1.19l.802 1.391c.226 .395 .093 .895-.302 1.125-.395 .226-.895 .093-1.125-.302L12.919 11.448c-.69-1.19-.198-2.383 .29-2.786ZM13.488 5.617c.395 .226 .528 .73 .302 1.125l-3.528 6.109h2.552c.827 0 1.29 .972 .932 1.645h-7.48c-.456 0-.823-.367-.823-.823 0-.456 .367-.823 .823-.823h2.097L11.048 8.198 10.21 6.742c-.226-.395-.093-.895 .302-1.125 .395-.226 .895-.093 1.125 .302l.359 .633 .367-.633c.226-.395 .73-.528 1.125-.302Z"),
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
        return _appStoreLine!!
    }

private var _appStoreLine: ImageVector? = null
