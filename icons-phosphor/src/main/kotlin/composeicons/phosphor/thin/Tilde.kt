package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorThinIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.12 128.09c-13.82 17.18-27.26 26.24-41.11 27.7-1.329 .139-2.664 .209-4 .21-18 0-33.48-12.64-48.53-24.9C109.91 118.42 95.19 106.44 78.84 108.17c-11.62 1.22-23.3 9.32-35.71 24.76-1.403 1.643-3.857 1.875-5.543 .524-1.686-1.351-1.995-3.797-.697-5.524C50.7 110.73 64.14 101.67 78 100.21c19.67-2.08 36.38 11.53 52.54 24.69 15.57 12.68 30.29 24.66 46.64 22.93 11.62-1.22 23.3-9.32 35.71-24.76 .876-1.166 2.318-1.763 3.762-1.557 1.444 .206 2.662 1.181 3.178 2.546 .516 1.365 .247 2.902-.7 4.011Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
