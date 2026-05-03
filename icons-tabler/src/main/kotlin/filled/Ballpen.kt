package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerFilledIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.828 2.000 C 18.555 2.000 19.258 2.264 19.805 2.743 L 19.950 2.879 L 21.121 4.049 C 22.240 5.166 22.299 6.960 21.257 8.149 L 21.121 8.293 L 19.415 10.000 L 21.707 12.293 C 22.063 12.649 22.099 13.215 21.790 13.613 L 21.707 13.707 L 17.707 17.707 C 17.334 18.079 16.735 18.097 16.340 17.749 C 15.944 17.400 15.887 16.804 16.210 16.387 L 16.293 16.293 L 19.585 13.000 L 17.999 11.415 L 10.535 18.879 C 9.874 19.540 8.994 19.936 8.061 19.993 L 7.828 20.001 C 7.154 20.001 6.498 19.823 5.923 19.493 L 4.707 20.707 C 4.334 21.079 3.735 21.097 3.340 20.749 C 2.944 20.400 2.887 19.804 3.210 19.387 L 3.293 19.293 L 4.507 18.077 C 3.690 16.652 3.872 14.865 4.961 13.635 L 5.121 13.465 L 15.707 2.879 C 16.221 2.365 16.904 2.054 17.630 2.006 L 17.828 2.000 ZM 17.828 4.000 C 17.608 4.000 17.395 4.072 17.220 4.206 L 17.121 4.293 L 15.414 6.000 L 18.000 8.585 L 19.707 6.879 C 19.862 6.723 19.962 6.521 19.991 6.303 L 20.001 6.172 C 20.001 5.952 19.928 5.738 19.794 5.563 L 19.707 5.464 L 18.536 4.293 C 18.348 4.105 18.094 4.000 17.828 4.000 Z"),
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
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
