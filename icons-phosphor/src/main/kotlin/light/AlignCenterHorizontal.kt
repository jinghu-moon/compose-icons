package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorLightIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 138.000 L 134.000 138.000 L 134.000 118.000 L 184.000 118.000 C 191.732 118.000 198.000 111.732 198.000 104.000 L 198.000 64.000 C 198.000 56.268 191.732 50.000 184.000 50.000 L 134.000 50.000 L 134.000 32.000 C 134.000 28.686 131.314 26.000 128.000 26.000 C 124.686 26.000 122.000 28.686 122.000 32.000 L 122.000 50.000 L 72.000 50.000 C 64.268 50.000 58.000 56.268 58.000 64.000 L 58.000 104.000 C 58.000 111.732 64.268 118.000 72.000 118.000 L 122.000 118.000 L 122.000 138.000 L 48.000 138.000 C 40.268 138.000 34.000 144.268 34.000 152.000 L 34.000 192.000 C 34.000 199.732 40.268 206.000 48.000 206.000 L 122.000 206.000 L 122.000 224.000 C 122.000 227.314 124.686 230.000 128.000 230.000 C 131.314 230.000 134.000 227.314 134.000 224.000 L 134.000 206.000 L 208.000 206.000 C 215.732 206.000 222.000 199.732 222.000 192.000 L 222.000 152.000 C 222.000 144.268 215.732 138.000 208.000 138.000 ZM 70.000 104.000 L 70.000 64.000 C 70.000 62.895 70.895 62.000 72.000 62.000 L 184.000 62.000 C 185.105 62.000 186.000 62.895 186.000 64.000 L 186.000 104.000 C 186.000 105.105 185.105 106.000 184.000 106.000 L 72.000 106.000 C 70.895 106.000 70.000 105.105 70.000 104.000 ZM 210.000 192.000 C 210.000 193.105 209.105 194.000 208.000 194.000 L 48.000 194.000 C 46.895 194.000 46.000 193.105 46.000 192.000 L 46.000 152.000 C 46.000 150.895 46.895 150.000 48.000 150.000 L 208.000 150.000 C 209.105 150.000 210.000 150.895 210.000 152.000 Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
