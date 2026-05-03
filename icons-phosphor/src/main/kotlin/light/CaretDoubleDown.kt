package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorLightIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 131.760 C 214.580 134.103 214.580 137.897 212.240 140.240 L 132.240 220.240 C 129.897 222.580 126.103 222.580 123.760 220.240 L 43.760 140.240 C 41.557 137.876 41.622 134.192 43.907 131.907 C 46.192 129.622 49.876 129.557 52.240 131.760 L 128.000 207.510 L 203.760 131.760 C 206.103 129.420 209.897 129.420 212.240 131.760 ZM 123.760 140.240 C 126.103 142.580 129.897 142.580 132.240 140.240 L 212.240 60.240 C 214.443 57.876 214.378 54.192 212.093 51.907 C 209.808 49.622 206.124 49.557 203.760 51.760 L 128.000 127.510 L 52.240 51.760 C 49.876 49.557 46.192 49.622 43.907 51.907 C 41.622 54.192 41.557 57.876 43.760 60.240 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
