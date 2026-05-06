package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorDuotoneIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M176 160c-.001 22.082-12.979 42.102-33.137 51.118-20.158 9.015-43.732 5.343-60.193-9.378-2.24-1.874-3.281-4.821-2.715-7.686 .566-2.866 2.649-5.195 5.434-6.076 2.785-.882 5.829-.175 7.941 1.843 13.29 11.881 32.838 13.535 47.934 4.054 15.096-9.481 22.097-27.807 17.166-44.938C153.499 131.805 137.826 120.004 120 120c-3.03 0-5.8-1.712-7.155-4.422-1.355-2.71-1.063-5.954 .755-8.378L152 56h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c3.03 0 5.8 1.712 7.155 4.422 1.355 2.71 1.063 5.954-.755 8.378l-39.84 53.12c24.431 6.614 41.408 28.769 41.44 54.08Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
