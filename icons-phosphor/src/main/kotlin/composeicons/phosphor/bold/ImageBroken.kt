package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorBoldIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231 112c-3.129-2.255-7.151-2.869-10.81-1.65l-23.81 7.93c-3.347 1.119-6.031 3.653-7.34 6.93l-13.67 34.18-34.18 13.67c-3.277 1.309-5.811 3.993-6.93 7.34l-7.93 23.81c-1.219 3.661-.602 7.686 1.656 10.814 2.259 3.129 5.885 4.98 9.744 4.976h78.27c11.046 0 20-8.954 20-20v-78.27c-.005-3.859-1.866-7.479-5-9.73ZM212 196h-57.62l.91-2.73 33.79-13.51c3.046-1.22 5.46-3.634 6.68-6.68l13.51-33.79 2.73-.91ZM216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h55.57c5.183 .019 9.793-3.292 11.43-8.21L123.21 163l35.09-14c3.058-1.22 5.48-3.642 6.7-6.7l14-35.09L227.79 91c4.918-1.637 8.229-6.247 8.21-11.43v-23.57C236 44.954 227.046 36 216 36ZM102.2 150.16 86.92 196h-42.92v-22.34l48-48 17.14 17.14h0c-3.285 1.311-5.824 4.004-6.94 7.36ZM212 70.92 166.16 86.2c-3.35 1.116-6.039 3.651-7.35 6.93l-14.2 35.48-11.22 4.49L106.14 105.86c-7.81-7.808-20.47-7.808-28.28 0L44 139.72v-79.72h168Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
