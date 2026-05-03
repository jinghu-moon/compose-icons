package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorLightIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 46.000 40.000 L 46.000 216.000 C 46.000 219.314 43.314 222.000 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 L 34.000 40.000 C 34.000 36.686 36.686 34.000 40.000 34.000 C 43.314 34.000 46.000 36.686 46.000 40.000 ZM 66.000 104.000 L 66.000 64.000 C 66.000 56.268 72.268 50.000 80.000 50.000 L 176.000 50.000 C 183.732 50.000 190.000 56.268 190.000 64.000 L 190.000 104.000 C 190.000 111.732 183.732 118.000 176.000 118.000 L 80.000 118.000 C 72.268 118.000 66.000 111.732 66.000 104.000 ZM 78.000 104.000 C 78.000 105.105 78.895 106.000 80.000 106.000 L 176.000 106.000 C 177.105 106.000 178.000 105.105 178.000 104.000 L 178.000 64.000 C 178.000 62.895 177.105 62.000 176.000 62.000 L 80.000 62.000 C 78.895 62.000 78.000 62.895 78.000 64.000 ZM 230.000 152.000 L 230.000 192.000 C 230.000 199.732 223.732 206.000 216.000 206.000 L 80.000 206.000 C 72.268 206.000 66.000 199.732 66.000 192.000 L 66.000 152.000 C 66.000 144.268 72.268 138.000 80.000 138.000 L 216.000 138.000 C 223.732 138.000 230.000 144.268 230.000 152.000 ZM 218.000 152.000 C 218.000 150.895 217.105 150.000 216.000 150.000 L 80.000 150.000 C 78.895 150.000 78.000 150.895 78.000 152.000 L 78.000 192.000 C 78.000 193.105 78.895 194.000 80.000 194.000 L 216.000 194.000 C 217.105 194.000 218.000 193.105 218.000 192.000 Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
