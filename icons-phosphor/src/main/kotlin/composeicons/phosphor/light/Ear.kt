package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorLightIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 104c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C202 63.131 168.869 30 128 30 87.131 30 54 63.131 54 104c0 27.55 8.83 36.06 18.18 45.08 4.31 4.15 8.77 8.45 12.16 14.47C88.15 170.31 90 178.3 90 188c0 20.987 17.013 38 38 38 10.74 0 19.69-4.52 27.37-13.82 2.11-2.557 5.893-2.92 8.45-.81 2.557 2.11 2.92 5.893 .81 8.45C154.66 231.88 142.34 238 128 238 100.399 237.967 78.033 215.601 78 188 78 171.36 71.76 165.34 63.85 157.71 54.12 148.33 42 136.64 42 104 42 56.504 80.504 18 128 18c47.496 0 86 38.504 86 86ZM176.86 162.81c-2.867-1.654-6.531-.674-8.19 2.19-2.259 3.93-6.878 5.849-11.257 4.677C153.035 168.504 149.992 164.533 150 160c0-10 5-16.67 10.8-24.4C167 127.35 174 118 174 104 174 78.595 153.405 58 128 58 102.595 58 82 78.595 82 104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C94 85.222 109.222 70 128 70c18.778 0 34 15.222 34 34 0 10-5 16.67-10.8 24.4C145 136.65 138 146 138 160c.002 9.956 6.689 18.669 16.306 21.246 9.616 2.577 19.765-1.625 24.744-10.246 1.654-2.867 .674-6.531-2.19-8.19Z"),
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
