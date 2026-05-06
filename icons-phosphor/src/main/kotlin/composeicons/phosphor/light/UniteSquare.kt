package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorLightIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-50v-50c0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6h50v50c0 3.314 2.686 6 6 6h120c3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6ZM154.48 210 46 101.52v-47L201.52 210ZM54.48 46h47L210 154.48v47ZM210 137.52 174.48 102h35.52ZM154 81.52 118.48 46h35.52ZM46 118.52 81.52 154h-35.52ZM102 174.52 137.52 210h-35.52Z"),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
