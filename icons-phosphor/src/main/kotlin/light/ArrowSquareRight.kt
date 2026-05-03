package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) return _arrowSquareRight!!
        _arrowSquareRight = phosphorLightIcon(
            name = "ArrowSquareRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 172.240 123.760 C 174.580 126.103 174.580 129.897 172.240 132.240 L 140.240 164.240 C 137.876 166.443 134.192 166.378 131.907 164.093 C 129.622 161.808 129.557 158.124 131.760 155.760 L 153.510 134.000 L 88.000 134.000 C 84.686 134.000 82.000 131.314 82.000 128.000 C 82.000 124.686 84.686 122.000 88.000 122.000 L 153.510 122.000 L 131.760 100.240 C 129.557 97.876 129.622 94.192 131.907 91.907 C 134.192 89.622 137.876 89.557 140.240 91.760 Z"),
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
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
