package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorBoldIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 144c0 6.627-5.373 12-12 12h-48c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567L225.57 79.25c2.839-3.773 3.201-8.861 .926-12.998-2.276-4.137-6.766-6.556-11.473-6.179-4.707 .377-8.755 3.48-10.343 7.927-2.209 6.249-9.066 9.524-15.315 7.315C183.116 73.106 179.841 66.249 182.05 60c1.233-3.465 2.986-6.723 5.2-9.66 12.017-15.714 34.463-18.787 50.262-6.882 15.799 11.906 19.031 34.329 7.238 50.212L216 132h24c6.627 0 12 5.373 12 12ZM151.86 70.94c-2.404-2.086-5.538-3.132-8.714-2.907-3.175 .225-6.131 1.702-8.216 4.107L92 121.68 49.07 72.14C44.729 67.131 37.149 66.589 32.14 70.93c-5.009 4.341-5.551 11.921-1.21 16.93L76.12 140 30.93 192.14c-4.341 5.009-3.799 12.589 1.21 16.93 5.009 4.341 12.589 3.799 16.93-1.21L92 158.32l42.93 49.54c4.341 5.009 11.921 5.551 16.93 1.21 5.009-4.341 5.551-11.921 1.21-16.93L107.88 140 153.07 87.86c4.335-5.007 3.794-12.58-1.21-16.92Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
