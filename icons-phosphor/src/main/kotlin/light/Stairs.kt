package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorLightIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 152.000 142.000 L 202.000 142.000 L 202.000 170.000 L 110.000 170.000 L 110.000 142.000 ZM 158.000 130.000 L 158.000 102.000 L 202.000 102.000 L 202.000 130.000 ZM 56.000 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 L 202.000 90.000 L 152.000 90.000 C 148.686 90.000 146.000 92.686 146.000 96.000 L 146.000 130.000 L 104.000 130.000 C 100.686 130.000 98.000 132.686 98.000 136.000 L 98.000 170.000 L 54.000 170.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 ZM 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 182.000 L 202.000 182.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
