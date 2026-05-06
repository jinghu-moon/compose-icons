package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorLightIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 58h-162v-18c0-3.314-2.686-6-6-6h-16C31.431 34 18 47.431 18 64v112c0 16.569 13.431 30 30 30h184c3.314 0 6-2.686 6-6v-136c0-3.314-2.686-6-6-6ZM30 64C30 54.059 38.059 46 48 46h10v100h-10c-6.493-.009-12.812 2.097-18 6ZM226 194h-178c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18h16c3.314 0 6-2.686 6-6v-82h156ZM104 138c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h28v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-20h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-28v-10c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v20ZM134 118h28v20h-28Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
