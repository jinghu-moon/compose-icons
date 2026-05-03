package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodWrrr: ImageVector
    get() {
        if (_moodWrrr != null) return _moodWrrr!!
        _moodWrrr = tablerFilledIcon(
            name = "MoodWrrr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 15.707 14.293 C 15.370 13.956 14.842 13.903 14.445 14.168 L 13.500 14.798 L 12.555 14.168 L 12.439 14.102 C 12.120 13.946 11.741 13.971 11.445 14.168 L 10.500 14.798 L 9.555 14.168 C 9.158 13.903 8.630 13.956 8.293 14.293 L 7.293 15.293 C 6.903 15.684 6.903 16.316 7.293 16.707 L 7.387 16.790 C 7.785 17.099 8.351 17.063 8.707 16.707 L 9.127 16.287 L 9.945 16.832 L 10.061 16.898 C 10.380 17.054 10.759 17.029 11.055 16.832 L 12.000 16.202 L 12.945 16.832 L 13.061 16.898 C 13.380 17.054 13.759 17.029 14.055 16.832 L 14.872 16.287 L 15.292 16.707 C 15.682 17.098 16.316 17.098 16.706 16.708 C 17.097 16.317 17.097 15.684 16.707 15.293 ZM 9.207 7.793 C 8.816 7.403 8.184 7.403 7.793 7.793 L 7.710 7.887 C 7.401 8.285 7.437 8.851 7.793 9.207 L 8.585 10.000 L 7.793 10.793 C 7.414 11.185 7.419 11.809 7.805 12.195 C 8.191 12.581 8.815 12.586 9.207 12.207 L 10.707 10.707 C 11.097 10.316 11.097 9.684 10.707 9.293 ZM 16.207 7.793 C 15.816 7.403 15.184 7.403 14.793 7.793 L 13.293 9.293 C 12.903 9.684 12.903 10.316 13.293 10.707 L 14.793 12.207 C 15.184 12.597 15.816 12.597 16.207 12.207 L 16.290 12.113 C 16.599 11.715 16.563 11.149 16.207 10.793 L 15.415 10.000 L 16.207 9.207 C 16.597 8.816 16.597 8.184 16.207 7.793"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _moodWrrr!!
    }

private var _moodWrrr: ImageVector? = null
