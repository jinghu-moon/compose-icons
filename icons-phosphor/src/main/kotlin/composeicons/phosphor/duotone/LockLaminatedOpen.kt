package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) return _lockLaminatedOpen!!
        _lockLaminatedOpen = phosphorDuotoneIcon(
            name = "LockLaminatedOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 96v112c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 80h-112v-24C96 38.327 110.327 24 128 24c15.37 0 29.2 11 32.16 25.59 .915 4.291 5.115 7.045 9.414 6.173 4.3-.872 7.095-5.044 6.266-9.353C171.32 24.15 151.2 8 128 8 101.502 8.028 80.028 29.502 80 56v24h-32C39.163 80 32 87.163 32 96v112c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM48 128h160v16h-160ZM48 160h160v16h-160ZM208 96v16h-160v-16ZM208 208h-160v-16h160v16Z"),
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
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
