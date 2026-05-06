package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorDuotoneIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 136v64c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M240 136v64c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-64c0-8.837 7.163-16 16-16h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40v64h192v-64h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c8.837 0 16 7.163 16 16ZM122.34 133.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l48-48c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L136 108.69v-84.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v84.69L85.66 74.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32ZM200 168c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
