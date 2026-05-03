package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorLightIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 34.000 L 64.000 34.000 C 56.268 34.000 50.000 40.268 50.000 48.000 L 50.000 208.000 C 50.000 215.732 56.268 222.000 64.000 222.000 L 104.000 222.000 C 111.732 222.000 118.000 215.732 118.000 208.000 L 118.000 48.000 C 118.000 40.268 111.732 34.000 104.000 34.000 ZM 106.000 208.000 C 106.000 209.105 105.105 210.000 104.000 210.000 L 64.000 210.000 C 62.895 210.000 62.000 209.105 62.000 208.000 L 62.000 48.000 C 62.000 46.895 62.895 46.000 64.000 46.000 L 104.000 46.000 C 105.105 46.000 106.000 46.895 106.000 48.000 ZM 192.000 34.000 L 152.000 34.000 C 144.268 34.000 138.000 40.268 138.000 48.000 L 138.000 208.000 C 138.000 215.732 144.268 222.000 152.000 222.000 L 192.000 222.000 C 199.732 222.000 206.000 215.732 206.000 208.000 L 206.000 48.000 C 206.000 40.268 199.732 34.000 192.000 34.000 ZM 194.000 208.000 C 194.000 209.105 193.105 210.000 192.000 210.000 L 152.000 210.000 C 150.895 210.000 150.000 209.105 150.000 208.000 L 150.000 48.000 C 150.000 46.895 150.895 46.000 152.000 46.000 L 192.000 46.000 C 193.105 46.000 194.000 46.895 194.000 48.000 Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
