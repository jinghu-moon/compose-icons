package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorLightIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.72 50.25 152.21 30.6 186.68 13.37c2.966-1.48 4.17-5.084 2.69-8.05C187.89 2.354 184.286 1.15 181.32 2.63L134.51 26C92.031 26.849 58.03 61.512 58 104v104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h20v58c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-128C181.966 80.928 164.87 61.44 142 58.4v-18.33l72.27 21.68c.562 .165 1.144 .25 1.73 .25 2.98 .003 5.511-2.182 5.943-5.131 .432-2.949-1.367-5.768-4.223-6.619ZM70 162v-58C70.042 69.893 96.037 41.423 130 38.29v20.11C107.13 61.44 90.034 80.928 90 104v58ZM168 234h-64c-1.105 0-2-.895-2-2v-58h68v58c0 1.105-.895 2-2 2ZM170 104v58h-68v-58c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
