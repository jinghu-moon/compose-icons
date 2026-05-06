package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorLightIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM174.68 86.63c-2.032-1.014-4.463-.793-6.28 .57L122 122v-30c0-2.273-1.284-4.35-3.317-5.367-2.033-1.016-4.465-.797-6.283 .567l-48 36C62.889 124.333 62 126.111 62 128c0 1.889 .889 3.667 2.4 4.8l48 36c1.818 1.364 4.251 1.583 6.283 .567C120.716 168.35 122 166.273 122 164v-30l46.4 34.8c1.818 1.364 4.251 1.583 6.283 .567C176.716 168.35 178 166.273 178 164v-72c.001-2.275-1.285-4.354-3.32-5.37ZM110 152 78 128l32-24ZM166 152 134 128l32-24Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
