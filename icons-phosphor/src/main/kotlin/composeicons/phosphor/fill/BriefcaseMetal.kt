package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorFillIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 112h200c2.209 0 4 1.791 4 4v40c0 2.209-1.791 4-4 4h-200c-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4ZM24 200c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-20c0-2.209-1.791-4-4-4h-200c-2.209 0-4 1.791-4 4ZM232 72v20c0 2.209-1.791 4-4 4h-200c-2.209 0-4-1.791-4-4v-20C24 63.163 31.163 56 40 56h40v-8C80 34.745 90.745 24 104 24h48c13.255 0 24 10.745 24 24v8h40c8.837 0 16 7.163 16 16ZM160 48c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8v8h64Z"),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
