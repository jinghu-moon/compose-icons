package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorBoldIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 104C235.961 70.879 209.121 44.039 176 44h-35.6C142.301 34.687 150.495 27.998 160 28c6.627 0 12-5.373 12-12C172 9.373 166.627 4 160 4c-22.737 .032-41.715 17.36-43.81 40h-36.19C46.879 44.039 20.039 70.879 20 104c0 6.295 2.964 12.223 8 16v8c0 37.45 34 64.71 61.23 86.61 10.22 8.2 25.63 20.58 26.77 25.56 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 1.14-5 16.55-17.36 26.77-25.56C194.05 192.71 228 165.45 228 128v-8c5.036-3.777 8-9.705 8-16ZM80 68h96c18.325 .026 33.717 13.791 35.78 32h-167.56C46.283 81.791 61.675 68.026 80 68ZM151.74 195.9c-9.17 7.36-17.46 14-23.74 20.55-6.28-6.53-14.57-13.19-23.74-20.55C81 177.2 52 153.94 52 128v-4h152v4c0 25.94-29 49.2-52.26 67.9Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
