package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorLightIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 128.000 L 214.000 208.000 C 214.000 215.732 207.732 222.000 200.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 56.000 C 34.000 48.268 40.268 42.000 48.000 42.000 L 128.000 42.000 C 131.314 42.000 134.000 44.686 134.000 48.000 C 134.000 51.314 131.314 54.000 128.000 54.000 L 48.000 54.000 C 46.895 54.000 46.000 54.895 46.000 56.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 200.000 210.000 C 201.105 210.000 202.000 209.105 202.000 208.000 L 202.000 128.000 C 202.000 124.686 204.686 122.000 208.000 122.000 C 211.314 122.000 214.000 124.686 214.000 128.000 ZM 230.000 60.000 C 230.000 78.778 214.778 94.000 196.000 94.000 C 177.222 94.000 162.000 78.778 162.000 60.000 C 162.000 41.222 177.222 26.000 196.000 26.000 C 214.778 26.000 230.000 41.222 230.000 60.000 ZM 218.000 60.000 C 218.000 47.850 208.150 38.000 196.000 38.000 C 183.850 38.000 174.000 47.850 174.000 60.000 C 174.000 72.150 183.850 82.000 196.000 82.000 C 208.150 82.000 218.000 72.150 218.000 60.000 Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
