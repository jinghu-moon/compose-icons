package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorLightIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 122.000 L 176.000 122.000 C 179.314 122.000 182.000 124.686 182.000 128.000 C 182.000 131.314 179.314 134.000 176.000 134.000 L 80.000 134.000 C 76.686 134.000 74.000 131.314 74.000 128.000 C 74.000 124.686 76.686 122.000 80.000 122.000 ZM 104.000 170.000 L 64.000 170.000 C 40.804 170.000 22.000 151.196 22.000 128.000 C 22.000 104.804 40.804 86.000 64.000 86.000 L 104.000 86.000 C 107.314 86.000 110.000 83.314 110.000 80.000 C 110.000 76.686 107.314 74.000 104.000 74.000 L 64.000 74.000 C 34.177 74.000 10.000 98.177 10.000 128.000 C 10.000 157.823 34.177 182.000 64.000 182.000 L 104.000 182.000 C 107.314 182.000 110.000 179.314 110.000 176.000 C 110.000 172.686 107.314 170.000 104.000 170.000 ZM 192.000 74.000 L 152.000 74.000 C 148.686 74.000 146.000 76.686 146.000 80.000 C 146.000 83.314 148.686 86.000 152.000 86.000 L 192.000 86.000 C 215.196 86.000 234.000 104.804 234.000 128.000 C 234.000 151.196 215.196 170.000 192.000 170.000 L 152.000 170.000 C 148.686 170.000 146.000 172.686 146.000 176.000 C 146.000 179.314 148.686 182.000 152.000 182.000 L 192.000 182.000 C 221.823 182.000 246.000 157.823 246.000 128.000 C 246.000 98.177 221.823 74.000 192.000 74.000 Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
