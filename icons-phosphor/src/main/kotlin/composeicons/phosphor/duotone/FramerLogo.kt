package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorDuotoneIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 104h-72L56 40h144ZM56 168l72 72v-72h72L128 104h-72Z"),
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
                pathData = parseSvgPathData("M208 104v-64c0-4.418-3.582-8-8-8h-144c-3.331-.008-6.317 2.049-7.499 5.163-1.181 3.114-.309 6.634 2.189 8.837L107 96h-51c-4.418 0-8 3.582-8 8v64c-.002 2.122 .84 4.158 2.34 5.66l72 72c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-64h64c3.331 .008 6.317-2.049 7.499-5.163 1.181-3.114 .309-6.634-2.189-8.837L149 112h51c4.418 0 8-3.582 8-8ZM179 160h-51c-4.418 0-8 3.582-8 8v52.69l-56-56v-52.69h61ZM192 96h-61L77 48h115Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
