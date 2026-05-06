package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorBoldIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.61 60.92l-96-40c-2.957-1.233-6.283-1.233-9.24 0L27.37 60.92c-5.015 2.089-8.001 7.286-7.28 12.67l16 120c.526 3.938 2.968 7.361 6.52 9.14l80 40c3.38 1.691 7.36 1.691 10.74 0l80-40c3.552-1.779 5.994-5.202 6.52-9.14l16-120c.724-5.379-2.253-10.575-7.26-12.67ZM197 184.11l-69 34.47L59.05 184.11 45.11 79.54 128 45l82.89 34.54ZM117.51 82.17l-40 72c-3.22 5.799-1.129 13.11 4.67 16.33 5.799 3.22 13.11 1.129 16.33-4.67L106.17 152h43.66l7.68 13.83c3.22 5.799 10.531 7.89 16.33 4.67 5.799-3.22 7.89-10.531 4.67-16.33l-40-72c-2.113-3.82-6.135-6.191-10.5-6.191-4.365 0-8.387 2.371-10.5 6.191ZM119.51 128 128 112.71 136.49 128Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
