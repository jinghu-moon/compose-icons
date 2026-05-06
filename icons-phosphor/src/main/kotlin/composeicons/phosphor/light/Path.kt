package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorLightIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 170c-14.251 .016-26.531 10.041-29.4 24h-98.6C53.222 194 38 178.778 38 160c0-18.778 15.222-34 34-34h96c20.987 0 38-17.013 38-38C206 67.013 188.987 50 168 50h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26h-96c-25.405 0-46 20.595-46 46 0 25.405 20.595 46 46 46h98.6c3.157 15.468 17.762 25.842 33.407 23.73 15.645-2.112 26.976-15.987 25.92-31.738C228.87 182.241 215.787 170.003 200 170ZM200 218c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
