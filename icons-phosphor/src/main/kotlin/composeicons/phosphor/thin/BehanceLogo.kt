package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorThinIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108.16 122.74c12.793-8.086 18.701-23.655 14.493-38.193C118.445 70.009 105.135 60.003 90 60h-58c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4h62c18.203-.004 33.847-12.916 37.301-30.789 3.454-17.872-6.251-35.684-23.141-42.471ZM36 68h54c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26h-54ZM94 188h-58v-60h58c16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30ZM164 80c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4ZM200 108c-20.689 .004-38.581 14.42-42.984 34.635-4.403 20.215 5.871 40.767 24.684 49.375 18.813 8.608 41.082 2.947 53.5-13.6 1.328-1.767 .972-4.277-.795-5.605-1.767-1.328-4.277-.972-5.605 .795-8.856 11.811-24.025 17.018-38.268 13.137C176.289 182.855 165.859 170.671 164.22 156h75.78c2.209 0 4-1.791 4-4-.028-24.289-19.711-43.972-44-44ZM164.22 148c2.025-18.232 17.436-32.026 35.78-32.026 18.344 0 33.755 13.794 35.78 32.026Z"),
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
