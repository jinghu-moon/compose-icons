package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorLightIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 160c0 3.314-2.686 6-6 6h-114.44L52.44 220c-1.364 1.817-3.637 2.707-5.872 2.301-2.235-.407-4.049-2.041-4.686-4.221-.637-2.181 .013-4.534 1.678-6.079L85.35 166h-45.35c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h56.25l47.28-52h-103.53c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h114.44L203.56 36c1.364-1.817 3.637-2.707 5.872-2.301 2.235 .407 4.049 2.041 4.686 4.221 .637 2.181-.013 4.534-1.678 6.079L170.65 90h45.35c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-56.25l-47.28 52h103.53c3.314 0 6 2.686 6 6Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
