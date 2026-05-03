package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorLightIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 40.000 C 222.000 43.314 219.314 46.000 216.000 46.000 L 40.000 46.000 C 36.686 46.000 34.000 43.314 34.000 40.000 C 34.000 36.686 36.686 34.000 40.000 34.000 L 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 ZM 206.000 80.000 L 206.000 176.000 C 206.000 183.732 199.732 190.000 192.000 190.000 L 152.000 190.000 C 144.268 190.000 138.000 183.732 138.000 176.000 L 138.000 80.000 C 138.000 72.268 144.268 66.000 152.000 66.000 L 192.000 66.000 C 199.732 66.000 206.000 72.268 206.000 80.000 ZM 194.000 80.000 C 194.000 78.895 193.105 78.000 192.000 78.000 L 152.000 78.000 C 150.895 78.000 150.000 78.895 150.000 80.000 L 150.000 176.000 C 150.000 177.105 150.895 178.000 152.000 178.000 L 192.000 178.000 C 193.105 178.000 194.000 177.105 194.000 176.000 ZM 118.000 80.000 L 118.000 216.000 C 118.000 223.732 111.732 230.000 104.000 230.000 L 64.000 230.000 C 56.268 230.000 50.000 223.732 50.000 216.000 L 50.000 80.000 C 50.000 72.268 56.268 66.000 64.000 66.000 L 104.000 66.000 C 111.732 66.000 118.000 72.268 118.000 80.000 ZM 106.000 80.000 C 106.000 78.895 105.105 78.000 104.000 78.000 L 64.000 78.000 C 62.895 78.000 62.000 78.895 62.000 80.000 L 62.000 216.000 C 62.000 217.105 62.895 218.000 64.000 218.000 L 104.000 218.000 C 105.105 218.000 106.000 217.105 106.000 216.000 Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
