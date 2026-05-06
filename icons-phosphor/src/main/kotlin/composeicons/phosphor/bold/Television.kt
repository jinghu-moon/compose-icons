package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorBoldIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 60h-59L184.52 32.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17-0L128 55 88.49 15.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L99 60h-59C28.954 60 20 68.954 20 80v120c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-120C236 68.954 227.046 60 216 60ZM44 84h84v112h-84ZM212 196h-60v-112h60ZM168 116c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM200 164c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _television!!
    }

private var _television: ImageVector? = null
