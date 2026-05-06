package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorThinIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 76c2.209 0 4-1.791 4-4C203.967 43.295 180.705 20.033 152 20h-72C73.373 20 68 25.373 68 32v48c0 15.464-12.536 28-28 28-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4C59.882 116 76 99.882 76 80v-4h40v28.62c.02 8.51-3.851 16.562-10.51 21.86l-16 12.79C80.935 146.087 75.966 156.441 76 167.38v56.62c0 6.627 5.373 12 12 12h104c6.627 0 12-5.373 12-12v-12.53C204.01 163.828 191.265 117.052 167.09 76ZM76 32c0-2.209 1.791-4 4-4h72c22.74 .027 41.725 17.356 43.82 40h-119.82ZM196 211.47v12.53c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4v-56.62c-.02-8.51 3.851-16.562 10.51-21.86l16-12.79c8.555-6.817 13.524-17.171 13.49-28.11v-28.62h33.76c25.017 40.757 38.253 87.648 38.24 135.47Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
