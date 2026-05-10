package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorFillIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 56C96 38.327 110.327 24 128 24c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 88 96 73.673 96 56ZM221 99.36c-1.5-1.2-37.22-29-89.51 6.57C86 136.84 59.57 126.23 59.32 126.12c-2.608-1.232-5.678-.964-8.034 .701-2.356 1.665-3.633 4.469-3.342 7.339 .291 2.87 2.104 5.361 4.746 6.52 .61 .28 7.49 3.27 19.67 3.27 14.21 0 35.64-4.11 62.77-21.29-2.28 29.41-12.73 83.47-73.43 101.68-2.798 .77-4.96 2.995-5.649 5.815-.689 2.819 .203 5.791 2.331 7.764 2.128 1.974 5.158 2.64 7.918 1.741 34.83-10.45 59.45-32.34 73.2-65.08 1.955-4.682 3.657-9.466 5.1-14.33l22.08 18.4-14.27 42.82c-1.397 4.192 .868 8.723 5.06 10.12 4.192 1.397 8.723-.868 10.12-5.06l16-48c1.043-3.126 .062-6.572-2.47-8.68l-32.42-27c1.714-10.03 2.716-20.169 3-30.34 36.18-18.57 59-.85 59.28-.65 2.219 1.895 5.293 2.431 8.023 1.4 2.729-1.031 4.681-3.467 5.092-6.355 .412-2.889-.782-5.772-3.115-7.525ZM64 112c8.837 0 16-7.163 16-16C80 87.163 72.837 80 64 80 55.163 80 48 87.163 48 96c0 8.837 7.163 16 16 16Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
