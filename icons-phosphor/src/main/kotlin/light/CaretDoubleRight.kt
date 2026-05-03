package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorLightIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.240 132.240 L 60.240 212.240 C 57.876 214.443 54.192 214.378 51.907 212.093 C 49.622 209.808 49.557 206.124 51.760 203.760 L 127.510 128.000 L 51.760 52.240 C 49.557 49.876 49.622 46.192 51.907 43.907 C 54.192 41.622 57.876 41.557 60.240 43.760 L 140.240 123.760 C 142.580 126.103 142.580 129.897 140.240 132.240 ZM 220.240 123.760 L 140.240 43.760 C 137.876 41.557 134.192 41.622 131.907 43.907 C 129.622 46.192 129.557 49.876 131.760 52.240 L 207.510 128.000 L 131.760 203.760 C 130.155 205.256 129.494 207.508 130.037 209.634 C 130.580 211.760 132.240 213.420 134.366 213.963 C 136.492 214.506 138.744 213.845 140.240 212.240 L 220.240 132.240 C 222.580 129.897 222.580 126.103 220.240 123.760 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
