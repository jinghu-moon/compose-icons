package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DownloadSimple: ImageVector
    get() {
        if (_downloadSimple != null) return _downloadSimple!!
        _downloadSimple = phosphorLightIcon(
            name = "DownloadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 144v64c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v58h164v-58c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM123.76 148.24c2.343 2.34 6.137 2.34 8.48 0l40-40c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L134 129.51v-97.51c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v97.51L92.24 99.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333Z"),
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
        return _downloadSimple!!
    }

private var _downloadSimple: ImageVector? = null
