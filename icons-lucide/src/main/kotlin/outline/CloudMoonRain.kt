package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) return _cloudMoonRain!!
        _cloudMoonRain = lucideOutlineIcon(
            name = "CloudMoonRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 20.000 L 11.000 22.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.376 14.512 C 20.117 13.761 21.400 12.230 21.837 10.385 C 21.985 9.760 21.178 9.415 20.589 9.671 C 19.083 10.322 17.332 9.988 16.172 8.828 C 15.012 7.668 14.678 5.917 15.330 4.411 C 15.585 3.822 15.240 3.016 14.614 3.163 C 12.082 3.764 10.227 5.929 10.020 8.523"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 20.000 C 1.770 18.358 1.667 16.131 2.742 14.383 C 3.817 12.635 5.850 11.721 7.871 12.078 C 9.891 12.435 11.489 13.990 11.900 16.000 L 13.000 16.000 C 14.246 15.998 15.363 16.766 15.807 17.930 C 16.251 19.094 15.930 20.411 15.000 21.240"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 19.000 L 7.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
