package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorThinIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.27 60.21l-96-32c-.824-.276-1.716-.276-2.54 0l-96 32C29.1 60.756 28.001 62.281 28 64v80c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-74.45L79.88 84.18C68.903 98.924 65.29 117.885 70.076 135.633c4.786 17.747 17.443 32.321 34.344 39.547-20.86 5.74-39 19.13-51.77 38.65-1.099 1.845-.545 4.229 1.255 5.4 1.8 1.171 4.204 .712 5.445-1.04C75.17 193.92 100.2 180 128 180c27.8 0 52.83 13.92 68.65 38.18 1.242 1.752 3.645 2.211 5.445 1.04 1.8-1.171 2.354-3.555 1.255-5.4C190.63 194.3 172.44 180.91 151.58 175.17c16.901-7.226 29.558-21.8 34.344-39.547 4.786-17.747 1.173-36.709-9.804-51.453L225.27 67.78c1.626-.549 2.721-2.074 2.721-3.79 0-1.716-1.095-3.241-2.721-3.79ZM180 120c.001 22.929-15.017 43.153-36.967 49.782-21.95 6.629-45.652-1.903-58.342-21C72 129.684 73.316 104.529 87.93 86.86l38.8 12.93c.824 .28 1.716 .28 2.54 0L168.07 86.86c7.722 9.316 11.942 21.04 11.93 33.14ZM128 91.78 44.65 64 128 36.22 211.35 64Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
