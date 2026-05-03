package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZapOff: ImageVector
    get() {
        if (_zapOff != null) return _zapOff!!
        _zapOff = lucideOutlineIcon(
            name = "ZapOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.513 4.856 L 13.120 2.170 C 13.273 1.993 13.528 1.946 13.734 2.057 C 13.940 2.167 14.042 2.405 13.980 2.630 L 12.603 6.947"),
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
                pathData = parseSvgPathData("M 15.656 10.000 L 20.000 10.000 C 20.386 9.999 20.739 10.220 20.905 10.568 C 21.072 10.917 21.023 11.330 20.780 11.630 L 19.060 13.403"),
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
                pathData = parseSvgPathData("M 16.273 16.273 L 10.880 21.830 C 10.727 22.007 10.472 22.054 10.266 21.943 C 10.060 21.833 9.958 21.595 10.020 21.370 L 11.940 15.350 C 12.055 15.042 12.012 14.698 11.824 14.429 C 11.636 14.159 11.328 13.999 11.000 14.000 L 4.000 14.000 C 3.614 14.001 3.261 13.780 3.095 13.432 C 2.928 13.083 2.977 12.670 3.220 12.370 L 7.727 7.727"),
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
                pathData = parseSvgPathData("M 2.000 2.000 L 22.000 22.000"),
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
        return _zapOff!!
    }

private var _zapOff: ImageVector? = null
