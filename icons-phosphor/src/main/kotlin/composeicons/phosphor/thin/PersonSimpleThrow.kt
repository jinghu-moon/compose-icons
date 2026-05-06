package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorThinIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c15.464 0 28-12.536 28-28C156 40.536 143.464 28 128 28c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 36c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 76 108 67.046 108 56c0-11.046 8.954-20 20-20ZM52 96C52 89.373 57.373 84 64 84c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C57.373 108 52 102.627 52 96ZM219.12 108.1c-1.381 1.722-3.897 2-5.62 .62-1.2-.94-26.41-20.11-65.7 1.3 0 .28 0 .54 0 .84-.245 11.254-1.392 22.47-3.43 33.54l34.23 28.53c1.26 1.054 1.748 2.771 1.23 4.33l-16 48c-.547 1.648-2.094 2.755-3.83 2.74-.429-.001-.854-.072-1.26-.21-1.007-.335-1.839-1.057-2.313-2.006-.474-.949-.553-2.048-.217-3.054l15.13-45.41-29-24.13c-1.675 6.758-3.858 13.381-6.53 19.81-13.26 31.58-37 52.71-70.66 62.8-.371 .125-.759 .193-1.15 .2-1.983-.002-3.666-1.457-3.954-3.419-.288-1.962 .905-3.839 2.804-4.411 69.32-20.8 75.54-86.09 76.74-113.21l-1.34 .9C109.24 135.58 86.78 140 72.42 140c-11.24 0-17.51-2.73-18.08-3-2.01-.917-2.897-3.29-1.98-5.3 .917-2.01 3.29-2.897 5.3-1.98 .25 .11 28.44 11.87 76.09-20.52C159.64 91.6 181.16 90.6 194.66 92.86c14.86 2.48 23.48 9.29 23.84 9.58 .839 .664 1.377 1.637 1.493 2.7 .117 1.064-.198 2.13-.873 2.96Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
