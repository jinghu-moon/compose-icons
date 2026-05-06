package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorBoldIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.93 152.31 182.11 141.14 72.49 31.51C70.174 29.194 67.011 27.926 63.737 28c-3.275 .074-6.377 1.483-8.587 3.9C32.48 56.68 20 88 20 120v72c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-41.71l1.07 .71c17.516 12.02 31.115 28.919 39.11 48.6 3.065 7.534 10.407 12.444 18.54 12.4h85.28c11.046 0 20-8.954 20-20v-4.73c.048-16.811-11.646-31.375-28.07-34.96ZM68 188h-24v-55.33c8.186 .904 16.239 2.753 24 5.51ZM232 188h-78.65c-9.89-22.947-26.069-42.628-46.67-56.77C88.282 118.522 66.939 110.732 44.68 108.6 46.891 90.215 53.849 72.721 64.87 57.84L167.51 160.49c1.559 1.552 3.513 2.648 5.65 3.17l49.2 12 .25 .06c5.48 1.159 9.398 5.999 9.39 11.6Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
