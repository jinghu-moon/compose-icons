package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) return _arrowSquareDown!!
        _arrowSquareDown = phosphorLightIcon(
            name = "ArrowSquareDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 164.240 131.760 C 166.580 134.103 166.580 137.897 164.240 140.240 L 132.240 172.240 C 129.897 174.580 126.103 174.580 123.760 172.240 L 91.760 140.240 C 89.557 137.876 89.622 134.192 91.907 131.907 C 94.192 129.622 97.876 129.557 100.240 131.760 L 122.000 153.510 L 122.000 88.000 C 122.000 84.686 124.686 82.000 128.000 82.000 C 131.314 82.000 134.000 84.686 134.000 88.000 L 134.000 153.510 L 155.760 131.760 C 158.103 129.420 161.897 129.420 164.240 131.760 Z"),
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
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
