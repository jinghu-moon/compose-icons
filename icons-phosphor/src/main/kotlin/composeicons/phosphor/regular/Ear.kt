package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorRegularIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 104c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C200 64.235 167.764 32 128 32 88.235 32 56 64.235 56 104c0 26.7 8.53 34.92 17.57 43.64C82.21 156 92 165.41 92 188c0 19.882 16.118 36 36 36 10.24 0 18.45-4.16 25.83-13.09 1.799-2.267 4.683-3.386 7.54-2.925 2.857 .461 5.243 2.429 6.239 5.147 .995 2.718 .445 5.761-1.438 7.958C155.81 233.64 143 240 128 240 99.295 239.967 76.033 216.705 76 188 76 172.21 70.32 166.73 62.46 159.16 52.46 149.5 40 137.5 40 104 40 55.399 79.399 16 128 16c48.601 0 88 39.399 88 88ZM177.87 161.08c-1.838-1.065-4.023-1.356-6.075-.808-2.052 .548-3.802 1.889-4.865 3.728-1.81 3.138-5.502 4.668-9 3.731-3.499-.937-5.931-4.109-5.93-7.731 0-9.33 4.82-15.76 10.4-23.2C168.77 128.3 176 118.67 176 104 176 77.49 154.51 56 128 56 101.49 56 80 77.49 80 104c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 9.33-4.82 15.76-10.4 23.2C143.23 135.7 136 145.33 136 160c.004 10.859 7.298 20.363 17.788 23.174 10.489 2.811 21.559-1.772 26.992-11.174 2.207-3.82 .905-8.705-2.91-10.92Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
