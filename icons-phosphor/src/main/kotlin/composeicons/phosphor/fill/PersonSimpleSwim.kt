package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorFillIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 72c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C158.327 104 144 89.673 144 72ZM210.89 184.19c-31.83 26.39-53.72 14.51-79.07 .74C105.21 170.49 75.06 154.12 34.89 187.42c-2.225 1.818-3.304 4.689-2.827 7.522 .477 2.833 2.436 5.193 5.133 6.183 2.697 .99 5.718 .457 7.914-1.395 31.83-26.39 53.72-14.5 79.07-.74 15.11 8.2 31.35 17 49.93 17 14.14 0 29.64-5.11 47-19.5 3.402-2.822 3.872-7.868 1.05-11.27-2.822-3.402-7.868-3.872-11.27-1.05ZM34.89 147.43c-2.225 1.818-3.304 4.689-2.827 7.522 .477 2.833 2.436 5.193 5.133 6.183 2.697 .99 5.718 .457 7.914-1.395C76.94 133.36 98.83 145.24 124.18 159c15.11 8.2 31.35 17 49.93 17 14.14 0 29.64-5.11 47-19.5 2.225-1.818 3.304-4.689 2.827-7.522-.477-2.833-2.436-5.193-5.133-6.183-2.697-.99-5.718-.457-7.914 1.395-5.784 4.967-12.283 9.033-19.28 12.06L137.77 102.43C118.305 82.878 91.829 71.921 64.24 72h-24.24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24.24c14.622-.028 29.019 3.602 41.88 10.56L76.49 128.17c-12.67 1.19-26.42 6.67-41.6 19.25Z"),
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
