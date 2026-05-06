package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorBoldIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.26 90.4c17.725 47.609-.126 101.135-42.88 128.574C143.626 246.412 87.529 240.345 51.63 204.4 10.99 163.894 9.119 98.681 47.369 55.911 85.619 13.142 150.635 7.748 195.41 43.63L215.51 23.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-96 96c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c-13.867-6.625-30.41-3.717-41.186 7.24-10.776 10.957-13.409 27.546-6.554 41.301 6.855 13.755 21.685 21.641 36.921 19.634 15.236-2.007 27.519-13.464 30.578-28.525 1.309-6.498 7.637-10.704 14.135-9.395 6.498 1.309 10.704 7.637 9.395 14.135-5.248 25.85-26.762 45.241-53.017 47.784C107.528 190.237 82.693 175.334 72.582 150.971 62.471 126.609 69.458 98.5 89.798 81.706c20.34-16.794 49.263-18.335 71.272-3.796L178.3 60.74C144.842 35.752 98.108 39.137 68.599 68.686 39.091 98.234 35.769 144.972 60.803 178.397c25.033 33.424 70.819 43.384 107.475 23.379 36.656-20.005 53.05-63.9 38.483-103.036-1.526-4.027-.777-8.564 1.963-11.887 2.74-3.323 7.051-4.923 11.295-4.192 4.244 .731 7.772 3.681 9.242 7.729Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
