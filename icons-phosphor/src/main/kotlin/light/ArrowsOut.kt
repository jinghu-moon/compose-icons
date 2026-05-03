package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorLightIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 48.000 L 214.000 96.000 C 214.000 99.314 211.314 102.000 208.000 102.000 C 204.686 102.000 202.000 99.314 202.000 96.000 L 202.000 62.480 L 156.240 108.240 C 153.876 110.443 150.192 110.378 147.907 108.093 C 145.622 105.808 145.557 102.124 147.760 99.760 L 193.520 54.000 L 160.000 54.000 C 156.686 54.000 154.000 51.314 154.000 48.000 C 154.000 44.686 156.686 42.000 160.000 42.000 L 208.000 42.000 C 211.314 42.000 214.000 44.686 214.000 48.000 ZM 99.760 147.760 L 54.000 193.520 L 54.000 160.000 C 54.000 156.686 51.314 154.000 48.000 154.000 C 44.686 154.000 42.000 156.686 42.000 160.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 L 96.000 214.000 C 99.314 214.000 102.000 211.314 102.000 208.000 C 102.000 204.686 99.314 202.000 96.000 202.000 L 62.480 202.000 L 108.240 156.240 C 110.443 153.876 110.378 150.192 108.093 147.907 C 105.808 145.622 102.124 145.557 99.760 147.760 ZM 208.000 154.000 C 204.686 154.000 202.000 156.686 202.000 160.000 L 202.000 193.520 L 156.240 147.760 C 153.876 145.557 150.192 145.622 147.907 147.907 C 145.622 150.192 145.557 153.876 147.760 156.240 L 193.520 202.000 L 160.000 202.000 C 156.686 202.000 154.000 204.686 154.000 208.000 C 154.000 211.314 156.686 214.000 160.000 214.000 L 208.000 214.000 C 211.314 214.000 214.000 211.314 214.000 208.000 L 214.000 160.000 C 214.000 156.686 211.314 154.000 208.000 154.000 ZM 62.480 54.000 L 96.000 54.000 C 99.314 54.000 102.000 51.314 102.000 48.000 C 102.000 44.686 99.314 42.000 96.000 42.000 L 48.000 42.000 C 44.686 42.000 42.000 44.686 42.000 48.000 L 42.000 96.000 C 42.000 99.314 44.686 102.000 48.000 102.000 C 51.314 102.000 54.000 99.314 54.000 96.000 L 54.000 62.480 L 99.760 108.240 C 102.124 110.443 105.808 110.378 108.093 108.093 C 110.378 105.808 110.443 102.124 108.240 99.760 Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
