package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorLightIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.69 51.27c-1.457-1.137-3.357-1.539-5.15-1.09L160.7 65.64l-62-31c-1.282-.639-2.751-.799-4.14-.45l-64 16C27.887 50.851 26.007 53.246 26 56v144c-0 1.849 .852 3.594 2.309 4.731 1.457 1.137 3.358 1.539 5.151 1.089L95.3 190.36l62 31c1.282 .639 2.751 .799 4.14 .45l64-16c2.673-.661 4.553-3.056 4.56-5.81v-144c-0-1.848-.853-3.593-2.31-4.73ZM102 49.71l52 26v130.58l-52-26ZM38 60.71l52-13v131.61l-52 13ZM218 195.32l-52 13v-131.64l52-13Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
