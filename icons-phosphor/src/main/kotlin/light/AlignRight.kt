package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorLightIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 40.000 L 222.000 216.000 C 222.000 219.314 219.314 222.000 216.000 222.000 C 212.686 222.000 210.000 219.314 210.000 216.000 L 210.000 40.000 C 210.000 36.686 212.686 34.000 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 ZM 190.000 64.000 L 190.000 104.000 C 190.000 111.732 183.732 118.000 176.000 118.000 L 80.000 118.000 C 72.268 118.000 66.000 111.732 66.000 104.000 L 66.000 64.000 C 66.000 56.268 72.268 50.000 80.000 50.000 L 176.000 50.000 C 183.732 50.000 190.000 56.268 190.000 64.000 ZM 178.000 64.000 C 178.000 62.895 177.105 62.000 176.000 62.000 L 80.000 62.000 C 78.895 62.000 78.000 62.895 78.000 64.000 L 78.000 104.000 C 78.000 105.105 78.895 106.000 80.000 106.000 L 176.000 106.000 C 177.105 106.000 178.000 105.105 178.000 104.000 ZM 190.000 152.000 L 190.000 192.000 C 190.000 199.732 183.732 206.000 176.000 206.000 L 40.000 206.000 C 32.268 206.000 26.000 199.732 26.000 192.000 L 26.000 152.000 C 26.000 144.268 32.268 138.000 40.000 138.000 L 176.000 138.000 C 183.732 138.000 190.000 144.268 190.000 152.000 ZM 178.000 152.000 C 178.000 150.895 177.105 150.000 176.000 150.000 L 40.000 150.000 C 38.895 150.000 38.000 150.895 38.000 152.000 L 38.000 192.000 C 38.000 193.105 38.895 194.000 40.000 194.000 L 176.000 194.000 C 177.105 194.000 178.000 193.105 178.000 192.000 Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
