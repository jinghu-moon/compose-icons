package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorBoldIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 56c0 6.627-5.373 12-12 12h-43l11.51 11.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-32-32c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L201 44h43c6.627 0 12 5.373 12 12ZM188 116c-3.83-.013-7.631 .664-11.22 2C170.126 104.305 154.743 97.195 140 101v-25C140 58.327 125.673 44 108 44 90.327 44 76 58.327 76 76v66.83C65.131 130.473 46.661 128.375 33.297 137.979 19.933 147.584 16.033 165.758 24.28 180l.12 .2 25.31 42c3.424 5.677 10.803 7.504 16.48 4.08 5.677-3.424 7.504-10.803 4.08-16.48L45 167.92c-2.187-3.844-.844-8.733 3-10.92 3.844-2.187 8.733-.844 10.92 3l.21 .34 18.68 30c2.83 4.55 8.334 6.673 13.487 5.201 5.153-1.472 8.704-6.182 8.703-11.541v-108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v36c0 11.08-1.28 21.67-3.42 28.32-1.399 4.104-.476 8.643 2.414 11.874 2.891 3.231 7.3 4.652 11.533 3.716 4.233-.936 7.633-4.082 8.893-8.23 3-9.16 4.58-21.83 4.58-35.68v-36c0-17.673-14.327-32-32-32Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
