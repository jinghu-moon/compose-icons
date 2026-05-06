package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorLightIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.19 213C213.38 185.68 188.56 166.51 159.72 158.38c28.863-14.672 43.897-47.223 36.354-78.709C188.53 48.184 160.378 25.979 128 25.979c-32.378 0-60.53 22.205-68.074 53.691-7.543 31.487 7.491 64.038 36.354 78.709C67.44 166.5 42.62 185.67 26.81 213c-1.182 1.86-1.25 4.218-.176 6.143 1.074 1.924 3.117 3.105 5.32 3.075 2.204-.03 4.214-1.265 5.235-3.218C56.4 185.81 90.34 166 128 166c37.66 0 71.6 19.81 90.81 53 1.022 1.953 3.032 3.188 5.235 3.218 2.204 .03 4.246-1.151 5.32-3.075 1.074-1.925 1.007-4.283-.176-6.143ZM70 96C70 63.967 95.967 38 128 38c32.033 0 58 25.967 58 58 0 32.033-25.967 58-58 58C95.983 153.961 70.039 128.017 70 96Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
