package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorBoldIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.6 62.64l-88-48.17c-5.977-3.29-13.223-3.29-19.2 0L30.4 62.64C23.986 66.149 19.998 72.879 20 80.19v95.62c-.002 7.311 3.986 14.041 10.4 17.55l88 48.17c5.976 3.294 13.224 3.294 19.2 0l88-48.17c6.414-3.509 10.402-10.239 10.4-17.55v-95.62c.002-7.311-3.986-14.041-10.4-17.55ZM128 36.57 200 76l-72 39.4L56 76ZM44 96.79l72 39.4v76.67L44 173.44ZM140 212.86v-76.67L212 96.79v76.65Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
