package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorFillIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.34 112 183.88 44.08C146.366 6.641 85.624 6.641 48.11 44.08l-.09 .09L34.25 58.4c-2.967 3.189-2.838 8.165 .291 11.196 3.129 3.031 8.107 3.001 11.199-.066L59.47 55.35C64.994 49.827 71.298 45.144 78.18 41.45L124.68 88l-96 96c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l20.69 20.69c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l96-96 32 32c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l28.69-28.69c3.004-2.998 4.694-7.067 4.698-11.311 .004-4.244-1.679-8.316-4.678-11.319ZM162.34 114.33 140 136.67 119.31 116 141.66 93.65c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66L94.32 35c27.849-7.843 57.762-.039 78.23 20.41l44.22 44.51L188 128.66 173.66 114.32c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346ZM211.34 151.99l-12-12L228 111.25l12 12Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
