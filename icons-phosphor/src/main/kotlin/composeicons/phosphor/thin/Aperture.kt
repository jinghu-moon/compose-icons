package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorThinIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM209.08 171.56l-61-11.14L210.4 87c13.251 26.73 12.76 58.217-1.32 84.52ZM95.87 122.13 117 97.24l32.14 5.86 11 30.77L139 158.76l-32.14-5.86ZM206.24 79.58l-40.13 47.25L133.75 36.2c29.762 1.87 56.776 18.036 72.49 43.38ZM63 63C79.533 46.38 101.826 36.755 125.26 36.12L146 94.41 51.32 77.11C54.739 72.034 58.652 67.307 63 63ZM47 84.49l61 11.14L45.6 169C32.349 142.27 32.84 110.783 46.92 84.48ZM49.84 176.49 89.97 129.24l32.36 90.63C92.568 218 65.554 201.834 49.84 176.49ZM193.13 193.12C176.597 209.74 154.304 219.365 130.87 220L110 161.59l94.72 17.3c-3.413 5.093-7.322 9.837-11.67 14.16Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
