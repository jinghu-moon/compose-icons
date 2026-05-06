package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorLightIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-176C32.268 50 26 56.268 26 64v160c-.03 5.452 3.135 10.416 8.09 12.69 1.852 .859 3.868 1.306 5.91 1.31 3.298 .002 6.489-1.172 9-3.31l.06-.05L82.23 206h133.77c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM218 192c0 1.105-.895 2-2 2h-136c-1.439 .001-2.831 .519-3.92 1.46L41.26 225.53c-.596 .483-1.415 .583-2.11 .257C38.456 225.462 38.009 224.767 38 224v-160c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM166 112c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM166 144c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6Z"),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
