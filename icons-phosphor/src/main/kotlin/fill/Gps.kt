package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorFillIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 248.000 132.418 244.418 136.000 240.000 136.000 L 215.630 136.000 C 211.718 178.252 178.252 211.718 136.000 215.630 L 136.000 240.000 C 136.000 244.418 132.418 248.000 128.000 248.000 C 123.582 248.000 120.000 244.418 120.000 240.000 L 120.000 215.630 C 77.748 211.718 44.282 178.252 40.370 136.000 L 16.000 136.000 C 11.582 136.000 8.000 132.418 8.000 128.000 C 8.000 123.582 11.582 120.000 16.000 120.000 L 40.370 120.000 C 44.282 77.748 77.748 44.282 120.000 40.370 L 120.000 16.000 C 120.000 11.582 123.582 8.000 128.000 8.000 C 132.418 8.000 136.000 11.582 136.000 16.000 L 136.000 40.370 C 178.252 44.282 211.718 77.748 215.630 120.000 L 240.000 120.000 C 244.418 120.000 248.000 123.582 248.000 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _gps!!
    }

private var _gps: ImageVector? = null
