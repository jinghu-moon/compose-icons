package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorDuotoneIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.2 72 176.85 225c-.505 4.005-3.914 7.006-7.95 7h-81.8c-4.036 .006-7.445-2.995-7.95-7L60.8 72Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M206 26.69C204.478 24.975 202.293 23.995 200 24h-144c-2.296-.001-4.483 .985-6.002 2.707C48.479 28.43 47.773 30.722 48.06 33L71.21 226c1.009 8.006 7.821 14.008 15.89 14h81.8c8.099 .002 14.923-6.048 15.89-14.09L207.94 33c.292-2.285-.415-4.584-1.94-6.31ZM191 40l-2.9 24h-120.2L65 40ZM168.9 224h-81.8L69.82 80h116.36Z"),
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
