package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorBoldIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 103.52l-80-80c-3.431-3.435-8.593-4.464-13.079-2.607C142.925 22.769 140 27.145 140 32v36.74C114.24 71.86 86.34 84.63 63.25 104.21 34.09 128.95 15.93 160.9 12.11 194.21c-.794 6.856 2.898 13.448 9.159 16.353 6.26 2.905 13.678 1.469 18.401-3.563h0C50.13 195.86 86.67 161.26 140 156.58v35.42c.004 4.85 2.928 9.221 7.409 11.077 4.481 1.856 9.639 .831 13.071-2.597l80-80c4.682-4.682 4.686-12.272 .01-16.96ZM164 163v-19c0-6.627-5.373-12-12-12-49 0-86.57 21.56-109.79 40.11 7.13-18.16 19.63-35.22 36.57-49.59C101.3 103.41 128.67 92 152 92c6.627 0 12-5.373 12-12v-19l51 51Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
