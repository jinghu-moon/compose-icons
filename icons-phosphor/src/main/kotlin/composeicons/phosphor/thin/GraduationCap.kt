package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorThinIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.88 92.47l-120-64c-1.175-.626-2.585-.626-3.76 0L6.12 92.47C4.816 93.165 4.001 94.522 4.001 96c0 1.478 .815 2.835 2.119 3.53L36 115.47v50.82c-.023 2.946 1.046 5.796 3 8 12.65 14.09 41 37.73 89 37.73 21 0 38.2-4.52 52-10.79v38.77c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-42.82c10.872-5.972 20.673-13.715 29-22.91 1.953-2.205 3.021-5.055 3-8v-50.8L249.88 99.53c1.304-.695 2.119-2.052 2.119-3.53 0-1.478-.815-2.835-2.119-3.53ZM128 204C83.17 204 56.75 182 45 168.92c-.647-.723-1.004-1.66-1-2.63v-46.56l82.12 43.8c1.175 .626 2.585 .626 3.76 0L180 136.8v55.53C166.58 199 149.39 204 128 204ZM212 166.29c-.001 .972-.357 1.911-1 2.64-6.707 7.413-14.455 13.813-23 19v-55.4l24-12.8ZM187.41 123.78c-.373-.608-.901-1.105-1.53-1.44l-56-29.87c-1.944-.993-4.324-.244-5.35 1.682-1.026 1.926-.318 4.319 1.59 5.378L179.5 128 128 155.47 16.5 96 128 36.53 239.5 96Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
