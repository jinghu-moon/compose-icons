package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareDownRight: ImageVector
    get() {
        if (_arrowSquareDownRight != null) return _arrowSquareDownRight!!
        _arrowSquareDownRight = phosphorLightIcon(
            name = "ArrowSquareDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 166.000 112.000 L 166.000 160.000 C 166.000 163.314 163.314 166.000 160.000 166.000 L 112.000 166.000 C 108.686 166.000 106.000 163.314 106.000 160.000 C 106.000 156.686 108.686 154.000 112.000 154.000 L 145.520 154.000 L 91.760 100.240 C 89.557 97.876 89.622 94.192 91.907 91.907 C 94.192 89.622 97.876 89.557 100.240 91.760 L 154.000 145.520 L 154.000 112.000 C 154.000 108.686 156.686 106.000 160.000 106.000 C 163.314 106.000 166.000 108.686 166.000 112.000 Z"),
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
        return _arrowSquareDownRight!!
    }

private var _arrowSquareDownRight: ImageVector? = null
