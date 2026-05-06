package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorFillIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 152c-.06 48.498-39.302 87.829-87.8 88C77.54 240.12 37.99 197 40.08 146.38 41.29 117.17 51.79 85.84 69.31 59.56 87.5 32.29 109.43 16 128 16c13.25 0 28.23 8.32 42.34 23 1.449 1.511 1.488 3.882 .09 5.44L122 98.67c-1.866 2.086-2.507 4.995-1.689 7.672 .818 2.677 2.975 4.731 5.689 5.418l24.61 6.15-6.51 32.52c-.864 4.333 1.947 8.545 6.28 9.41 .533 .11 1.076 .164 1.62 .16 3.808-.007 7.083-2.696 7.83-6.43l8-40c.838-4.186-1.759-8.292-5.9-9.33L142.77 99.45 179.66 58.12c.82-.919 2.016-1.409 3.245-1.329 1.228 .08 2.352 .721 3.045 1.739 .24 .34 .47 .68 .7 1C205.3 87.54 216 121.23 216 152Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
