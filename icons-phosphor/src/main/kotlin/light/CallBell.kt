package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorLightIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 182.000 L 232.000 182.000 C 235.314 182.000 238.000 179.314 238.000 176.000 C 238.000 172.686 235.314 170.000 232.000 170.000 L 222.000 170.000 L 222.000 152.000 C 221.946 102.438 183.458 61.413 134.000 58.200 L 134.000 38.000 L 152.000 38.000 C 155.314 38.000 158.000 35.314 158.000 32.000 C 158.000 28.686 155.314 26.000 152.000 26.000 L 104.000 26.000 C 100.686 26.000 98.000 28.686 98.000 32.000 C 98.000 35.314 100.686 38.000 104.000 38.000 L 122.000 38.000 L 122.000 58.200 C 72.542 61.413 34.054 102.438 34.000 152.000 L 34.000 170.000 L 24.000 170.000 C 20.686 170.000 18.000 172.686 18.000 176.000 C 18.000 179.314 20.686 182.000 24.000 182.000 ZM 46.000 152.000 C 46.000 106.713 82.713 70.000 128.000 70.000 C 173.287 70.000 210.000 106.713 210.000 152.000 L 210.000 170.000 L 46.000 170.000 ZM 238.000 208.000 C 238.000 211.314 235.314 214.000 232.000 214.000 L 24.000 214.000 C 20.686 214.000 18.000 211.314 18.000 208.000 C 18.000 204.686 20.686 202.000 24.000 202.000 L 232.000 202.000 C 235.314 202.000 238.000 204.686 238.000 208.000 Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
