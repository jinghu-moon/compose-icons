package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorBoldIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 164v68c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM208 92h-51L192.52 56.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L140 75v-51c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v51L80.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L99 92h-51c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h51L63.51 151.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L128 121l47.51 47.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L157 116h51c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
