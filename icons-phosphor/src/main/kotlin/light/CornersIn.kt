package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorLightIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 154.000 96.000 L 154.000 48.000 C 154.000 44.686 156.686 42.000 160.000 42.000 C 163.314 42.000 166.000 44.686 166.000 48.000 L 166.000 90.000 L 208.000 90.000 C 211.314 90.000 214.000 92.686 214.000 96.000 C 214.000 99.314 211.314 102.000 208.000 102.000 L 160.000 102.000 C 156.686 102.000 154.000 99.314 154.000 96.000 ZM 96.000 154.000 L 48.000 154.000 C 44.686 154.000 42.000 156.686 42.000 160.000 C 42.000 163.314 44.686 166.000 48.000 166.000 L 90.000 166.000 L 90.000 208.000 C 90.000 211.314 92.686 214.000 96.000 214.000 C 99.314 214.000 102.000 211.314 102.000 208.000 L 102.000 160.000 C 102.000 156.686 99.314 154.000 96.000 154.000 ZM 208.000 154.000 L 160.000 154.000 C 156.686 154.000 154.000 156.686 154.000 160.000 L 154.000 208.000 C 154.000 211.314 156.686 214.000 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 L 166.000 166.000 L 208.000 166.000 C 211.314 166.000 214.000 163.314 214.000 160.000 C 214.000 156.686 211.314 154.000 208.000 154.000 ZM 96.000 42.000 C 92.686 42.000 90.000 44.686 90.000 48.000 L 90.000 90.000 L 48.000 90.000 C 44.686 90.000 42.000 92.686 42.000 96.000 C 42.000 99.314 44.686 102.000 48.000 102.000 L 96.000 102.000 C 99.314 102.000 102.000 99.314 102.000 96.000 L 102.000 48.000 C 102.000 44.686 99.314 42.000 96.000 42.000 Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
