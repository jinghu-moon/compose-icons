package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorThinIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 220h-20v-106.34l12.49-12.49c2.254-2.246 3.518-5.298 3.51-8.48v-44.69c0-6.627-5.373-12-12-12h-24c-2.209 0-4 1.791-4 4v28h-24v-28c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4v28h-24v-28c0-2.209-1.791-4-4-4h-24C49.373 36 44 41.373 44 48v44.69c-.008 3.182 1.256 6.234 3.51 8.48L60 113.66v106.34h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM66.83 109.17 53.17 95.51C52.422 94.762 52.002 93.748 52 92.69v-44.69c0-2.209 1.791-4 4-4h20v28c0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4v-28h24v28c0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4v-28h20c2.209 0 4 1.791 4 4v44.69c-.002 1.058-.422 2.072-1.17 2.82l-13.66 13.66c-.75 .751-1.171 1.769-1.17 2.83v108h-32v-52c0-15.464-12.536-28-28-28-15.464 0-28 12.536-28 28v52h-32v-108c.001-1.061-.42-2.079-1.17-2.83ZM148 220h-40v-52c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
