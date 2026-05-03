package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorLightIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 126.000 136.000 L 126.000 200.000 C 126.000 203.314 123.314 206.000 120.000 206.000 C 116.686 206.000 114.000 203.314 114.000 200.000 L 114.000 150.490 L 44.240 220.240 C 41.876 222.443 38.192 222.378 35.907 220.093 C 33.622 217.808 33.557 214.124 35.760 211.760 L 105.510 142.000 L 56.000 142.000 C 52.686 142.000 50.000 139.314 50.000 136.000 C 50.000 132.686 52.686 130.000 56.000 130.000 L 120.000 130.000 C 123.314 130.000 126.000 132.686 126.000 136.000 ZM 208.000 34.000 L 80.000 34.000 C 72.268 34.000 66.000 40.268 66.000 48.000 L 66.000 96.000 C 66.000 99.314 68.686 102.000 72.000 102.000 C 75.314 102.000 78.000 99.314 78.000 96.000 L 78.000 48.000 C 78.000 46.895 78.895 46.000 80.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 176.000 C 210.000 177.105 209.105 178.000 208.000 178.000 L 160.000 178.000 C 156.686 178.000 154.000 180.686 154.000 184.000 C 154.000 187.314 156.686 190.000 160.000 190.000 L 208.000 190.000 C 215.732 190.000 222.000 183.732 222.000 176.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
