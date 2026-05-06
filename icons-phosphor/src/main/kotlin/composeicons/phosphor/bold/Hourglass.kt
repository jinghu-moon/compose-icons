package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = phosphorBoldIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 75.64v-35.64C204 28.954 195.046 20 184 20h-112C60.954 20 52 28.954 52 40v36c.016 6.291 2.976 12.213 8 16l48 36L60 164c-5.024 3.787-7.984 9.709-8 16v36c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-35.64c-.006-6.28-2.942-12.197-7.94-16L147.9 128 196.06 91.6c4.986-3.794 7.921-9.694 7.94-15.96ZM180 212h-104v-30l52-39 52 39.33ZM180 73.65 128 113 76 74v-30h104Z"),
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
