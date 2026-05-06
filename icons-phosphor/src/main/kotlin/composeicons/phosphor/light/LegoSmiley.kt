package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LegoSmiley: ImageVector
    get() {
        if (_legoSmiley != null) return _legoSmiley!!
        _legoSmiley = phosphorLightIcon(
            name = "LegoSmiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 122c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM156 102c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM152.8 146.92c-15.188 9.434-34.412 9.434-49.6 0-2.806-1.767-6.513-.926-8.28 1.88-1.767 2.806-.926 6.513 1.88 8.28 19.098 11.899 43.302 11.899 62.4 0 2.806-1.767 3.647-5.474 1.88-8.28-1.767-2.806-5.474-3.647-8.28-1.88ZM214 80v96c-.016 14.251-10.041 26.531-24 29.4v18.6c0 7.732-6.268 14-14 14h-96c-7.732 0-14-6.268-14-14v-18.6C52.041 202.531 42.016 190.251 42 176v-96C42 63.431 55.431 50 72 50h18v-18c0-7.732 6.268-14 14-14h48c7.732 0 14 6.268 14 14v18h18c16.569 0 30 13.431 30 30ZM102 50h52v-18c0-1.105-.895-2-2-2h-48c-1.105 0-2 .895-2 2ZM178 224v-18h-100v18c0 1.105 .895 2 2 2h96c1.105 0 2-.895 2-2ZM202 80c0-9.941-8.059-18-18-18h-112C62.059 62 54 70.059 54 80v96c0 9.941 8.059 18 18 18h112c9.941 0 18-8.059 18-18Z"),
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
        return _legoSmiley!!
    }

private var _legoSmiley: ImageVector? = null
