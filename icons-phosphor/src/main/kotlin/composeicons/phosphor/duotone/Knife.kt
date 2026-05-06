package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorDuotoneIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.2 65.8 174 118 146 90 198.2 37.8c7.732-7.731 20.268-7.731 28 0h0c7.731 7.732 7.731 20.268 0 28Z"),
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
                pathData = parseSvgPathData("M231.87 32.13c-10.866-10.838-28.454-10.838-39.32 0L18.34 206.4c-2.055 2.057-2.833 5.067-2.031 7.862 .802 2.795 3.058 4.934 5.891 5.588 11.87 2.752 24.015 4.144 36.2 4.15 32.95 0 65.92-10.2 96.95-30.23 31.76-20.5 50.19-43.82 51-44.81 2.495-3.184 2.22-7.729-.64-10.59L185.32 118 231.87 71.44c10.826-10.867 10.826-28.443 0-39.31ZM189.1 144.44c-12.689 13.829-27.092 25.981-42.86 36.16C111.81 202.7 76.3 211.52 40.47 206.9L146 101.33ZM220.56 60.14 174 106.7 157.32 90 203.87 43.44c4.609-4.609 12.081-4.609 16.69 0 4.609 4.609 4.609 12.081 0 16.69Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
