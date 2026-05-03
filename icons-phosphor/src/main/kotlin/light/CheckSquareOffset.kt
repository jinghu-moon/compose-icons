package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorLightIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 48.000 L 222.000 208.000 C 222.000 215.732 215.732 222.000 208.000 222.000 L 136.000 222.000 C 132.686 222.000 130.000 219.314 130.000 216.000 C 130.000 212.686 132.686 210.000 136.000 210.000 L 208.000 210.000 C 209.105 210.000 210.000 209.105 210.000 208.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 144.000 C 46.000 147.314 43.314 150.000 40.000 150.000 C 36.686 150.000 34.000 147.314 34.000 144.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 115.760 155.760 L 64.000 207.510 L 44.240 187.760 C 41.876 185.557 38.192 185.622 35.907 187.907 C 33.622 190.192 33.557 193.876 35.760 196.240 L 59.760 220.240 C 62.103 222.580 65.897 222.580 68.240 220.240 L 124.240 164.240 C 126.443 161.876 126.378 158.192 124.093 155.907 C 121.808 153.622 118.124 153.557 115.760 155.760 Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
