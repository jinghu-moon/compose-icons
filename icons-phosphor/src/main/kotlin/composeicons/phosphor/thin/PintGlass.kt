package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorThinIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203 29.35c-.76-.859-1.853-1.351-3-1.35h-144c-1.15-.008-2.247 .478-3.013 1.336-.766 .857-1.125 2.003-.987 3.144L75.15 225.48c.749 6.025 5.879 10.541 11.95 10.52h81.8c6.076 .003 11.196-4.537 11.92-10.57L204 32.48c.13-1.138-.234-2.278-1-3.13ZM195.49 36l-3.84 32h-127.3L60.51 36ZM172.87 224.48c-.244 2.02-1.965 3.535-4 3.52h-81.77c-2.035 .015-3.756-1.5-4-3.52L65.31 76h125.38Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
