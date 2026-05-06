package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorFillIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.06 192v12c0 19.899-16.131 36.03-36.03 36.03C160.131 240.03 144 223.899 144 204v-12c0-4.418 3.582-8 8-8h56c2.132-.016 4.182 .82 5.696 2.322 1.513 1.502 2.364 3.546 2.364 5.678ZM104 160h-56c-4.418 0-8 3.582-8 8v12c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-12c0-4.418-3.582-8-8-8ZM76 16C64.36 16 53.07 26.31 44.2 45c-13.93 29.38-18.56 73 .29 96 1.522 1.858 3.798 2.934 6.2 2.93h50.55c2.402 .004 4.678-1.072 6.2-2.93 18.85-23 14.22-66.65 .29-96C98.85 26.31 87.57 16 76 16ZM154.8 168h50.55c2.402 .004 4.678-1.072 6.2-2.93 18.85-23 14.22-66.65 .29-96C202.93 50.31 191.64 40 180 40c-11.64 0-22.89 10.31-31.77 29-13.93 29.38-18.56 73 .29 96 1.517 1.895 3.813 2.998 6.24 3Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
