package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorLightIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM82 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM154 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM182 168c0 3.314-2.686 6-6 6-9 0-13.51-6-16.8-10.4C156.2 159.54 154.74 158 152 158c-2.74 0-4.15 1.54-7.2 5.6C141.51 168 137 174 128 174c-9 0-13.51-6-16.8-10.4C108.2 159.54 106.74 158 104 158c-2.74 0-4.15 1.54-7.2 5.6C93.51 168 89 174 80 174c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 2.74 0 4.15-1.54 7.2-5.6C90.49 152 95 146 104 146c9 0 13.51 6 16.8 10.4 3 4.06 4.46 5.6 7.2 5.6 2.74 0 4.15-1.54 7.2-5.6C138.49 152 143 146 152 146c9 0 13.51 6 16.8 10.4 3 4.06 4.46 5.6 7.2 5.6 3.314 0 6 2.686 6 6Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
