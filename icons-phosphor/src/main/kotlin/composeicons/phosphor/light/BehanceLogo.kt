package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorLightIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112.15 122.36c12.099-9.46 16.864-25.553 11.866-40.075C119.018 67.763 105.358 58.01 90 58h-58c-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6h62c18.492-.005 34.571-12.685 38.886-30.667 4.315-17.982-4.259-36.578-20.736-44.973ZM38 70h52c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-52ZM94 186h-56v-56h56c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM162 80c0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6ZM200 106c-21.629 .004-40.335 15.075-44.938 36.209-4.604 21.134 6.138 42.62 25.806 51.62 19.668 9 42.95 3.081 55.932-14.219 1.991-2.651 1.456-6.414-1.195-8.405-2.651-1.991-6.414-1.456-8.405 1.195-8.119 10.828-21.887 15.81-35.055 12.685C178.977 181.959 168.917 171.322 166.53 158h73.47c3.314 0 6-2.686 6-6-.033-25.391-20.609-45.967-46-46ZM166.53 146c2.897-16.214 16.999-28.02 33.47-28.02 16.471 0 30.573 11.806 33.47 28.02Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
