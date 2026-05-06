package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorDuotoneIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56v144c0 8.837-7.163 16-16 16h-8L192 200l-16 16h-136c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M192 144h-128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM232 80h-208c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 176h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM221.66 170.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L192 188.69 173.66 170.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L180.69 200l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L192 211.31l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L203.31 200l18.35-18.34c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
