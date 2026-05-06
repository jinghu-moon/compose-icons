package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorLightIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 194h-131.89l25.45-28h50.44c24.795-.026 47.19-14.823 56.94-37.621 9.75-22.798 4.979-49.212-12.13-67.159L212.44 44c1.665-1.545 2.314-3.899 1.678-6.079-.637-2.181-2.451-3.815-4.686-4.221-2.235-.407-4.508 .484-5.872 2.301L187.73 53.38C177.292 45.966 164.803 41.989 152 42h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c9.818-.011 19.419 2.888 27.59 8.33L96.25 154h-40.25c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h29.35L43.56 212c-1.865 2.484-1.526 5.981 .782 8.06 2.308 2.079 5.821 2.053 8.098-.06L65.2 206h142.8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM188.73 70.12c13.446 14.594 16.99 35.758 9.03 53.936C189.8 142.233 171.844 153.984 152 154h-39.53Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
