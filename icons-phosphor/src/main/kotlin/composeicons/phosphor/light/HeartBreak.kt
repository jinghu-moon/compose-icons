package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorLightIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 42c-15.922-.043-31.2 6.284-42.43 17.57L128 67.15l-7.57-7.58C103.27 42.407 77.46 37.272 55.038 46.56 32.616 55.849 17.997 77.73 18 102c0 29.2 18.2 59.59 54.1 90.31 16.45 14.018 34.22 26.409 53.06 37 1.773 .953 3.907 .953 5.68 0 18.84-10.591 36.61-22.982 53.06-37C219.8 161.59 238 131.2 238 102 237.961 68.879 211.121 42.039 178 42ZM128 217.11C111.59 207.64 30 157.72 30 102 30.001 82.587 41.696 65.085 59.632 57.656c17.936-7.429 38.581-3.323 52.309 10.404l7.57 7.57L107.76 87.39c-1.127 1.125-1.76 2.653-1.76 4.245 0 1.592 .633 3.12 1.76 4.245l25.94 25.94-17.94 17.94c-2.203 2.364-2.138 6.048 .147 8.333 2.285 2.285 5.969 2.35 8.333 .147l22.19-22.18c1.127-1.125 1.76-2.653 1.76-4.245 0-1.592-.633-3.12-1.76-4.245L120.49 91.63 144.06 68.06C157.788 54.333 178.433 50.227 196.368 57.656 214.304 65.085 225.999 82.587 226 102c0 55.72-81.59 105.64-98 115.11Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
