package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWhatsapp: ImageVector
    get() {
        if (_brandWhatsapp != null) return _brandWhatsapp!!
        _brandWhatsapp = tablerFilledIcon(
            name = "BrandWhatsapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.497 4.409 C 22.246 7.608 23.105 13.061 20.521 17.258 C 17.937 21.455 12.682 23.143 8.137 21.237 L 7.914 21.139 L 3.155 21.988 L 3.045 21.999 C 3.008 22.001 2.972 22.001 2.935 21.999 L 2.833 21.986 L 2.725 21.962 L 2.620 21.925 L 2.521 21.878 L 2.428 21.820 L 2.414 21.809 L 2.402 21.802 L 2.316 21.729 L 2.239 21.649 L 2.172 21.561 L 2.116 21.467 L 2.082 21.397 L 2.042 21.289 L 2.014 21.161 L 2.002 21.059 C 1.999 21.017 1.999 20.976 2.002 20.934 L 2.014 20.834 L 2.038 20.724 L 2.083 20.602 L 3.516 17.298 L 3.507 17.284 C 1.030 13.285 1.675 8.100 5.056 4.830 L 5.271 4.627 C 8.995 1.233 14.663 1.140 18.497 4.410M 9.500 7.500 C 8.672 7.500 8.000 8.172 8.000 9.000 L 8.000 10.000 C 8.000 13.314 10.686 16.000 14.000 16.000 L 15.000 16.000 C 15.828 16.000 16.500 15.328 16.500 14.500 C 16.500 13.672 15.828 13.000 15.000 13.000 L 14.000 13.000 L 13.856 13.007 C 13.392 13.052 12.975 13.309 12.728 13.704 L 12.686 13.778 L 12.664 13.771 C 11.527 13.367 10.633 12.473 10.229 11.336 L 10.221 11.313 L 10.296 11.272 C 10.734 10.998 11.000 10.517 11.000 10.000 L 11.000 9.000 C 11.000 8.172 10.328 7.500 9.500 7.500"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandWhatsapp!!
    }

private var _brandWhatsapp: ImageVector? = null
