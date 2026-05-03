package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorLightIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 90.000 L 166.000 90.000 L 166.000 40.000 C 166.000 36.686 163.314 34.000 160.000 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 L 34.000 160.000 C 34.000 163.314 36.686 166.000 40.000 166.000 L 90.000 166.000 L 90.000 216.000 C 90.000 219.314 92.686 222.000 96.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 96.000 C 222.000 92.686 219.314 90.000 216.000 90.000 ZM 154.480 210.000 L 46.000 101.520 L 46.000 54.520 L 201.520 210.000 ZM 54.480 46.000 L 101.480 46.000 L 210.000 154.480 L 210.000 201.480 ZM 210.000 137.520 L 174.480 102.000 L 210.000 102.000 ZM 154.000 81.520 L 118.480 46.000 L 154.000 46.000 ZM 46.000 118.520 L 81.520 154.000 L 46.000 154.000 ZM 102.000 174.520 L 137.520 210.000 L 102.000 210.000 Z"),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
