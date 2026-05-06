package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorBoldIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 216c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12v-176C36 33.373 41.373 28 48 28h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-52v152h52c6.627 0 12 5.373 12 12ZM232.49 119.51l-40-40c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L195 116h-83c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h83l-19.52 19.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l40-40c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
