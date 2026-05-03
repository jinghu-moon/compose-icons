package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) return _suitcaseSimple!!
        _suitcaseSimple = phosphorLightIcon(
            name = "SuitcaseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 58.000 L 174.000 58.000 L 174.000 48.000 C 174.000 35.850 164.150 26.000 152.000 26.000 L 104.000 26.000 C 91.850 26.000 82.000 35.850 82.000 48.000 L 82.000 58.000 L 40.000 58.000 C 32.268 58.000 26.000 64.268 26.000 72.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 72.000 C 230.000 64.268 223.732 58.000 216.000 58.000 ZM 94.000 48.000 C 94.000 42.477 98.477 38.000 104.000 38.000 L 152.000 38.000 C 157.523 38.000 162.000 42.477 162.000 48.000 L 162.000 58.000 L 94.000 58.000 ZM 40.000 70.000 L 216.000 70.000 C 217.105 70.000 218.000 70.895 218.000 72.000 L 218.000 146.000 L 38.000 146.000 L 38.000 72.000 C 38.000 70.895 38.895 70.000 40.000 70.000 ZM 216.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 158.000 L 218.000 158.000 L 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 Z"),
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
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null
