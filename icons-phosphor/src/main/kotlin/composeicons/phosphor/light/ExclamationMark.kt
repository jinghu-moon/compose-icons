package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorLightIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 200c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM128 158c3.314 0 6-2.686 6-6v-104c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v104c0 3.314 2.686 6 6 6Z"),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
