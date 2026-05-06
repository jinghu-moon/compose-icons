package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorBoldIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M42.06 109.94C29.769 97.848 24.908 80.093 29.326 63.426 33.743 46.76 46.76 33.743 63.426 29.326c16.666-4.417 34.422 .444 46.514 12.734 4.211 4.75 3.995 11.958-.494 16.446C104.958 62.995 97.75 63.211 93 59 83.611 49.611 68.389 49.611 59 59c-9.389 9.389-9.389 24.611 0 34 4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0ZM163 59c9.389-9.389 24.611-9.389 34 0 9.389 9.389 9.389 24.611 0 34-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0C226.291 97.908 231.152 80.153 226.734 63.486 222.317 46.82 209.3 33.803 192.634 29.386c-16.666-4.417-34.422 .444-46.514 12.734-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0ZM196.94 146c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5 9.389 9.372 9.402 24.581 .03 33.97-9.372 9.389-24.581 9.402-33.97 .03-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17 12.092 12.291 29.847 17.152 46.514 12.734 16.666-4.417 29.683-17.434 34.101-34.101 4.417-16.666-.444-34.422-12.734-46.514-4.659-4.643-12.188-4.67-16.88-.06ZM93 197c-9.389 9.389-24.611 9.389-34 0-9.389-9.389-9.389-24.611 0-34 4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0C29.709 158.092 24.848 175.847 29.266 192.514c4.417 16.666 17.434 29.683 34.101 34.101 16.666 4.417 34.422-.444 46.514-12.734 4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM164 109v38l24.49 24.48c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L147 164h-38L84.49 188.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L92 147v-38L67.51 84.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L109 92h38L171.48 67.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM116 140h24v-24h-24Z"),
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
        return _drone!!
    }

private var _drone: ImageVector? = null
