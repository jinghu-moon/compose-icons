package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorDuotoneIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.64 160h-103.28L128 72.62Z"),
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
                pathData = parseSvgPathData("M64.34 196.07l-9.45 16c-2.248 3.805-7.155 5.068-10.96 2.82-3.805-2.248-5.068-7.155-2.82-10.96l9.46-16c1.42-2.529 4.098-4.092 6.999-4.084 2.901 .008 5.57 1.586 6.975 4.123 1.406 2.537 1.328 5.637-.204 8.1ZM232 152h-47.8L153.47 100c-1.42-2.529-4.098-4.092-6.999-4.084-2.901 .008-5.57 1.586-6.975 4.123-1.406 2.537-1.328 5.637 .204 8.1l61.41 103.93c2.248 3.805 7.155 5.068 10.96 2.82 3.805-2.248 5.068-7.155 2.82-10.96L193.66 168h38.34c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM142.47 152h-52.09L158.89 36.07c2.248-3.805 .985-8.712-2.82-10.96-3.805-2.248-8.712-.985-10.96 2.82L128 56.89l-17.11-29c-2.248-3.805-7.155-5.068-10.96-2.82-3.805 2.248-5.068 7.155-2.82 10.96l21.6 36.55L71.8 152h-47.8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h118.47c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
