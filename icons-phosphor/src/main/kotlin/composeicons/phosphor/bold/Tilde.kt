package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorBoldIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.35 133.1c-15.22 18.93-30.43 29-46.5 30.65-1.611 .167-3.23 .251-4.85 .25-20.81 0-38.16-14.13-53.59-26.7C106.17 125.7 92.73 114.76 79.66 116.12c-9.26 1-19.46 8.32-30.32 21.82-4.241 4.799-11.504 5.422-16.5 1.414-4.996-4.008-5.964-11.233-2.2-16.414C45.87 104 61.08 94 77.15 92.25c23-2.42 41.82 12.92 58.43 26.45 14.24 11.6 27.68 22.54 40.75 21.18 9.26-1 19.46-8.32 30.32-21.82 2.6-3.579 6.959-5.437 11.342-4.835 4.383 .602 8.079 3.567 9.617 7.714 1.539 4.148 .671 8.805-2.259 12.12Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
