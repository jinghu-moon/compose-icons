package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNonbinary: ImageVector
    get() {
        if (_genderNonbinary != null) return _genderNonbinary!!
        _genderNonbinary = phosphorFillIcon(
            name = "GenderNonbinary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM128 208C100.84 207.997 78.257 187.091 76.161 160.012 74.065 132.933 93.163 108.802 120 104.62v-20.8L91 95.43C86.897 97.087 82.227 95.103 80.57 91 78.913 86.897 80.897 82.227 85 80.57L106.46 72 85 63.43C80.897 61.773 78.913 57.103 80.57 53 82.227 48.897 86.897 46.913 91 48.57l37 14.81L165 48.57c4.103-1.657 8.773 .327 10.43 4.43 1.657 4.103-.327 8.773-4.43 10.43L149.54 72 171 80.57c4.103 1.657 6.087 6.327 4.43 10.43-1.657 4.103-6.327 6.087-10.43 4.43L136 83.82v20.8c26.837 4.182 45.935 28.313 43.839 55.392C177.743 187.091 155.16 207.997 128 208ZM164 156c0 19.882-16.118 36-36 36C108.118 192 92 175.882 92 156c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36Z"),
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
        return _genderNonbinary!!
    }

private var _genderNonbinary: ImageVector? = null
