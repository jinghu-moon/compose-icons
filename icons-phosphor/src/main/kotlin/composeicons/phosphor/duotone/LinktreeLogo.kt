package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorDuotoneIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 104c0 44.183-35.817 80-80 80C83.817 184 48 148.183 48 104 48 59.817 83.817 24 128 24c44.183 0 80 35.817 80 80Z"),
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
                pathData = parseSvgPathData("M136 160v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM208 96h-60.69L189.66 53.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L136 84.69v-60.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v60.69L77.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L108.69 96h-60.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h60.69L66.34 154.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L128 115.31l50.34 50.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L147.31 112h60.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
