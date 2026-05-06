package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorBoldIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 76h-68v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v28h-68C36.954 76 28 84.954 28 96v64c0 11.046 8.954 20 20 20h68v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h68c11.046 0 20-8.954 20-20v-64C228 84.954 219.046 76 208 76ZM204 156h-152v-56h152Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
