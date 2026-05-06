package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorFillIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 96c.024 24.327-12.237 47.021-32.598 60.334-20.361 13.313-46.067 15.444-68.342 5.666L79 222.22c-.12 .14-.26 .29-.39 .42-12.498 12.498-32.762 12.498-45.26 0-12.498-12.498-12.498-32.762 0-45.26 .14-.13 .28-.27 .43-.39L94 124.94C82.993 99.761 87.262 70.515 105.007 49.533 122.751 28.551 150.883 19.486 177.54 26.16c2.74 .687 4.915 2.768 5.722 5.476 .807 2.707 .126 5.64-1.792 7.714L144 80l5.66 26.35L176 112 216.65 74.48c2.075-1.918 5.007-2.599 7.714-1.792 2.707 .807 4.789 2.982 5.476 5.722 1.436 5.753 2.161 11.66 2.16 17.59Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
