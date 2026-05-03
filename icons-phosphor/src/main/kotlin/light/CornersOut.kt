package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorLightIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 48.000 L 214.000 88.000 C 214.000 91.314 211.314 94.000 208.000 94.000 C 204.686 94.000 202.000 91.314 202.000 88.000 L 202.000 54.000 L 168.000 54.000 C 164.686 54.000 162.000 51.314 162.000 48.000 C 162.000 44.686 164.686 42.000 168.000 42.000 L 208.000 42.000 C 211.314 42.000 214.000 44.686 214.000 48.000 ZM 88.000 202.000 L 54.000 202.000 L 54.000 168.000 C 54.000 164.686 51.314 162.000 48.000 162.000 C 44.686 162.000 42.000 164.686 42.000 168.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 L 88.000 214.000 C 91.314 214.000 94.000 211.314 94.000 208.000 C 94.000 204.686 91.314 202.000 88.000 202.000 ZM 208.000 162.000 C 204.686 162.000 202.000 164.686 202.000 168.000 L 202.000 202.000 L 168.000 202.000 C 164.686 202.000 162.000 204.686 162.000 208.000 C 162.000 211.314 164.686 214.000 168.000 214.000 L 208.000 214.000 C 211.314 214.000 214.000 211.314 214.000 208.000 L 214.000 168.000 C 214.000 164.686 211.314 162.000 208.000 162.000 ZM 88.000 42.000 L 48.000 42.000 C 44.686 42.000 42.000 44.686 42.000 48.000 L 42.000 88.000 C 42.000 91.314 44.686 94.000 48.000 94.000 C 51.314 94.000 54.000 91.314 54.000 88.000 L 54.000 54.000 L 88.000 54.000 C 91.314 54.000 94.000 51.314 94.000 48.000 C 94.000 44.686 91.314 42.000 88.000 42.000 Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
