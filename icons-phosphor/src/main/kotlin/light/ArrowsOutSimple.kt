package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorLightIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.000 48.000 L 214.000 96.000 C 214.000 99.314 211.314 102.000 208.000 102.000 C 204.686 102.000 202.000 99.314 202.000 96.000 L 202.000 62.480 L 148.240 116.240 C 145.876 118.443 142.192 118.378 139.907 116.093 C 137.622 113.808 137.557 110.124 139.760 107.760 L 193.520 54.000 L 160.000 54.000 C 156.686 54.000 154.000 51.314 154.000 48.000 C 154.000 44.686 156.686 42.000 160.000 42.000 L 208.000 42.000 C 211.314 42.000 214.000 44.686 214.000 48.000 ZM 107.760 139.760 L 54.000 193.520 L 54.000 160.000 C 54.000 156.686 51.314 154.000 48.000 154.000 C 44.686 154.000 42.000 156.686 42.000 160.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 L 96.000 214.000 C 99.314 214.000 102.000 211.314 102.000 208.000 C 102.000 204.686 99.314 202.000 96.000 202.000 L 62.480 202.000 L 116.240 148.240 C 118.443 145.876 118.378 142.192 116.093 139.907 C 113.808 137.622 110.124 137.557 107.760 139.760 Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
