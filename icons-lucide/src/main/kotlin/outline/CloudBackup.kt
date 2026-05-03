package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudBackup: ImageVector
    get() {
        if (_cloudBackup != null) return _cloudBackup!!
        _cloudBackup = lucideOutlineIcon(
            name = "CloudBackup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 15.251 C 22.043 13.902 22.233 12.079 21.492 10.543 C 20.750 9.008 19.205 8.023 17.500 8.000 L 15.710 8.000 C 14.932 5.405 12.727 3.491 10.048 3.087 C 7.369 2.683 4.697 3.862 3.189 6.113 C 1.681 8.364 1.607 11.283 3.000 13.607"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 11.000 L 7.000 15.000 L 11.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 19.000 C 9.291 20.722 11.539 21.424 13.581 20.743 C 15.623 20.063 17.000 18.152 17.000 16.000 C 17.000 13.515 14.985 11.500 12.500 11.500 C 11.221 11.499 9.995 12.006 9.090 12.910 L 7.000 15.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _cloudBackup!!
    }

private var _cloudBackup: ImageVector? = null
