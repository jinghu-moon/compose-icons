package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorThinIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h38.35L154.82 95.52C124.198 67.966 77.199 69.824 48.847 99.71c-28.351 29.886-27.732 76.918 1.397 106.046 29.128 29.128 76.16 29.748 106.046 1.397 29.886-28.351 31.744-75.351 4.19-105.973L212 49.66v38.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM152.07 200.11c-26.558 26.55-69.609 26.546-96.162-.009-26.553-26.555-26.553-69.607 0-96.162 26.553-26.555 69.604-26.559 96.162-.009 26.521 26.575 26.521 69.605 0 96.18Z"),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
