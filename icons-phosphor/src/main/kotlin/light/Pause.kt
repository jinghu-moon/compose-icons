package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorLightIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 34.000 L 160.000 34.000 C 152.268 34.000 146.000 40.268 146.000 48.000 L 146.000 208.000 C 146.000 215.732 152.268 222.000 160.000 222.000 L 200.000 222.000 C 207.732 222.000 214.000 215.732 214.000 208.000 L 214.000 48.000 C 214.000 40.268 207.732 34.000 200.000 34.000 ZM 202.000 208.000 C 202.000 209.105 201.105 210.000 200.000 210.000 L 160.000 210.000 C 158.895 210.000 158.000 209.105 158.000 208.000 L 158.000 48.000 C 158.000 46.895 158.895 46.000 160.000 46.000 L 200.000 46.000 C 201.105 46.000 202.000 46.895 202.000 48.000 ZM 96.000 34.000 L 56.000 34.000 C 48.268 34.000 42.000 40.268 42.000 48.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 96.000 222.000 C 103.732 222.000 110.000 215.732 110.000 208.000 L 110.000 48.000 C 110.000 40.268 103.732 34.000 96.000 34.000 ZM 98.000 208.000 C 98.000 209.105 97.105 210.000 96.000 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 L 54.000 48.000 C 54.000 46.895 54.895 46.000 56.000 46.000 L 96.000 46.000 C 97.105 46.000 98.000 46.895 98.000 48.000 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
