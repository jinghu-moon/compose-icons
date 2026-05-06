package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorDuotoneIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152v32c-.003 6.032-3.399 11.549-8.782 14.27-5.383 2.721-11.839 2.184-16.698-1.39C182.53 185.26 159 176 128 176c-31 0-54.53 9.26-70.52 20.88-4.859 3.574-11.315 4.111-16.698 1.39C35.399 195.549 32.003 190.032 32 184v-32c56.889-42.667 135.111-42.667 192 0Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24C70.59 24.066 24.066 70.59 24 128v56c0 13.255 10.745 24 24 24 5.098-.008 10.063-1.633 14.18-4.64C74.33 194.53 95.6 184 128 184c32.4 0 53.67 10.52 65.81 19.35 7.293 5.346 16.971 6.14 25.037 2.053C226.913 201.316 231.998 193.042 232 184v-56C231.934 70.59 185.41 24.066 128 24ZM216 128v8.87c-12.76-7.896-26.533-14.025-40.94-18.22C171.965 91.065 162.042 64.686 146.19 41.9 186.851 50.549 215.943 86.43 216 128ZM128 44.27c15.975 20.511 26.439 44.766 30.4 70.46-20.117-3.64-40.723-3.64-60.84 0C101.568 89.042 112.043 64.796 128 44.27ZM109.81 41.9C93.956 64.689 84.034 91.071 80.94 118.66 66.533 122.855 52.76 128.984 40 136.88v-8.88C40.057 86.43 69.149 50.549 109.81 41.9ZM211.66 191.11c-2.714 1.4-5.989 1.132-8.44-.69C189.16 180.2 164.7 168 128 168c-36.7 0-61.16 12.2-75.22 22.42-2.451 1.822-5.726 2.09-8.44 .69C41.638 189.781 39.947 187.011 40 184v-27.93c52.7-37.419 123.3-37.419 176 0v27.93c.053 3.011-1.638 5.781-4.34 7.11Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
