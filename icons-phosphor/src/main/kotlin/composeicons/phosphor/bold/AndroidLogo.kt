package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorBoldIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 148c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM92 132c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM244 160v24c0 11.046-8.954 20-20 20h-192C20.954 204 12 195.046 12 184v-22.87C11.969 130.286 24.083 100.671 45.72 78.69L23.51 56.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L64.3 63.33C83.03 50.79 105.049 44.065 127.59 44h.41c22.718-.062 44.948 6.597 63.89 19.14L215.51 39.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-22 22C232.032 100.162 244.077 129.472 244 160ZM220 160c0-24.457-9.738-47.908-27.063-65.171C175.612 77.566 152.127 67.912 127.67 68 77.12 68.18 36 110 36 161.13v18.87h184Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
