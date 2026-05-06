package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorLightIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192c-3.314 0-6 2.686-6 6v144c0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6v-144c0-3.314-2.686-6-6-6ZM86 146v-36h84v36ZM38 146v-36h36v36ZM182 110h36v36h-36ZM218 98h-84v-36h84ZM122 62v36h-84v-36ZM38 158h84v36h-84ZM134 194v-36h84v36Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
