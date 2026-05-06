package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorBoldIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.76 93c-1.855-2.591-4.664-4.338-7.808-4.855-3.144-.518-6.365 .236-8.952 2.095l-9 6.44v-16.68c0-6.627-5.373-12-12-12h-176C33.373 68 28 73.373 28 80v16.68L19 90.24C13.61 86.374 6.106 87.61 2.24 93-1.626 98.39-.39 105.894 5 109.76l23 16.42v57.82c0 19.882 16.118 36 36 36h128c19.882 0 36-16.118 36-36v-57.82l23-16.42c2.591-1.855 4.338-4.664 4.855-7.808 .518-3.144-.236-6.365-2.096-8.952ZM204 184c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12v-92h152ZM76 40v-24C76 9.373 81.373 4 88 4c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12C81.373 52 76 46.627 76 40ZM116 40v-24C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM156 40v-24C156 9.373 161.373 4 168 4c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
