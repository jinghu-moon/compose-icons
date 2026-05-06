package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorBoldIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786l4.37 4.81C38.962 54.716 36 59.114 36 64v80c-.012 36.205 21.212 69.051 54.224 83.917 33.012 14.866 71.674 8.988 98.776-15.017l10.16 11.17c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM60.19 149.09c30.419 5.6 53.254 30.98 55.62 61.82C85.391 205.31 62.556 179.93 60.19 149.09ZM128 170.61C113.746 145.542 88.586 128.584 60 124.78v-47.73c2.34 .423 4.657 .967 6.94 1.63l70.83 77.9c-3.683 4.365-6.954 9.062-9.77 14.03ZM140.19 210.9c1.016-13.207 5.852-25.834 13.92-36.34l18.7 20.57c-9.24 8.121-20.516 13.573-32.62 15.77ZM220 64v80c-.012 4.465-.346 8.923-1 13.34-.854 5.895-5.903 10.272-11.86 10.28-.582-.004-1.164-.047-1.74-.13-6.558-.953-11.102-7.042-10.15-13.6 .23-1.59 .4-3.19 .52-4.8-.76 .14-1.53 .29-2.29 .45-4.231 1.017-8.681-.337-11.629-3.537-2.948-3.2-3.933-7.746-2.574-11.88 1.36-4.134 4.85-7.207 9.123-8.033 2.49-.54 5-1 7.56-1.31v-47.71c-14.998 2.689-28.659 10.338-38.79 21.72-4.418 4.948-12.012 5.378-16.96 .96-4.948-4.418-5.378-12.012-.96-16.96 5.134-5.739 10.97-10.809 17.37-15.09C148.42 52.77 135.31 42.7 127.99 37.94c-5.604 3.657-10.818 7.879-15.56 12.6-4.681 4.694-12.281 4.706-16.975 .025C90.761 45.884 90.749 38.284 95.43 33.59c8.018-8.07 17.179-14.917 27.19-20.32 3.38-1.691 7.36-1.691 10.74 0 1.33 .66 29.36 15 44.74 43.74C187.72 53.695 197.825 52.002 208 52c6.627 0 12 5.373 12 12Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
