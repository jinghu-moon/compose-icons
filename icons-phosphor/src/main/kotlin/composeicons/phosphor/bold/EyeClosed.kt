package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorBoldIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.42 162c3.314 5.755 1.335 13.106-4.42 16.42-5.755 3.314-13.106 1.335-16.42-4.42L196.72 144.5c-9.408 5.918-19.551 10.578-30.17 13.86L171.84 190c1.084 6.536-3.335 12.713-9.87 13.8-.66 .116-1.33 .173-2 .17-5.851-.006-10.845-4.231-11.82-10L143 163.17c-9.989 1.107-20.071 1.107-30.06 0L107.84 194c-.976 5.777-5.981 10.004-11.84 10-.67 .003-1.34-.054-2-.17-3.139-.529-5.939-2.283-7.785-4.877C84.37 196.36 83.63 193.139 84.16 190l5.29-31.72C78.831 154.998 68.688 150.338 59.28 144.42L42.42 174c-3.314 5.755-10.665 7.734-16.42 4.42C20.245 175.106 18.266 167.755 21.58 162L40 129.85C33.757 124.212 27.969 118.09 22.69 111.54 18.817 106.374 19.725 99.07 24.746 95.01c5.021-4.06 12.353-3.419 16.594 1.45C57.38 116.32 85.44 140 128 140c42.56 0 70.62-23.68 86.66-43.54 4.179-5.105 11.694-5.879 16.826-1.734 5.132 4.145 5.956 11.655 1.844 16.814-5.285 6.55-11.08 12.673-17.33 18.31Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
