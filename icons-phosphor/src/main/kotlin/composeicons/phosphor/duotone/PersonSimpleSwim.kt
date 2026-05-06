package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorDuotoneIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132.14 108.12l57.45 57.46C147.85 178.63 119.12 134.49 80 136L118.94 97.05c4.723 3.287 9.141 6.992 13.2 11.07ZM176 48c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C200 58.745 189.255 48 176 48Z"),
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
                pathData = parseSvgPathData("M176 104c17.673 0 32-14.327 32-32C208 54.327 193.673 40 176 40c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM176 56c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM222.16 185.24c2.829 3.387 2.382 8.425-1 11.26C203.8 210.89 188.3 216 174.16 216c-18.58 0-34.82-8.82-49.93-17C98.88 185.24 76.99 173.35 45.16 199.74c-2.196 1.852-5.217 2.385-7.914 1.395-2.697-.99-4.656-3.35-5.133-6.183-.477-2.833 .602-5.704 2.827-7.522 40.17-33.29 70.32-16.93 96.93-2.49 25.35 13.77 47.24 25.65 79.07-.74 3.391-2.793 8.4-2.329 11.22 1.04ZM34.89 147.42c-2.225 1.818-3.304 4.689-2.827 7.522 .477 2.833 2.436 5.193 5.133 6.183 2.697 .99 5.718 .457 7.914-1.395 31.83-26.38 53.72-14.5 79.07-.74 15.11 8.2 31.35 17 49.93 17 14.14 0 29.64-5.11 47-19.5 2.225-1.818 3.304-4.689 2.827-7.522-.477-2.833-2.436-5.193-5.133-6.183-2.697-.99-5.718-.457-7.914 1.395-5.784 4.967-12.283 9.033-19.28 12.06L137.77 102.42C118.303 82.872 91.828 71.919 64.24 72h-24.24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24.24c14.622-.028 29.019 3.602 41.88 10.56L76.49 128.17c-12.67 1.18-26.42 6.67-41.6 19.25ZM126.46 113.75l46.13 46.12c-14-.43-26.88-7.39-40.77-14.93-10.75-5.84-22.09-12-34.42-15.05l22.26-22.26c2.372 1.92 4.642 3.962 6.8 6.12Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
