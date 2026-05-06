package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorThinIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243 101.37 187 37.37c-.756-.867-1.85-1.366-3-1.37h-112c-1.15 .004-2.244 .503-3 1.37L13 101.37c-1.349 1.545-1.31 3.861 .09 5.36L125.09 226.73c.756 .808 1.813 1.266 2.92 1.266 1.107 0 2.164-.458 2.92-1.266l112-120c1.394-1.504 1.424-3.82 .07-5.36ZM77.29 108l39.07 97.66L25.2 108ZM170.09 108 128 213.23 85.91 108ZM88 100 128 46.67 168 100ZM178.71 108h52.09l-91.16 97.66ZM231.18 100h-53.18L136 44h46.18ZM73.82 44h46.18L78 100h-53.18Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
