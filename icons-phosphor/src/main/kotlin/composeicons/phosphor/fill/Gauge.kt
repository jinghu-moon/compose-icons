package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorFillIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 152v24c0 8.837-7.163 16-16 16h-108.07c-1.504 .001-2.882-.842-3.566-2.182-.684-1.34-.558-2.951 .326-4.168L174.27 101c2.652-3.523 2.047-8.513-1.37-11.3-1.709-1.326-3.883-1.904-6.026-1.6-2.142 .303-4.07 1.462-5.344 3.21l-72 99.06c-.766 1.041-1.988 1.649-3.28 1.63h-54.25c-8.837 0-16-7.163-16-16v-22.87c0-1.79 0-3.57 .13-5.33 .107-2.131 1.867-3.803 4-3.8h27.87c2.217 .005 4.336-.91 5.853-2.527 1.517-1.617 2.294-3.791 2.147-6.003-.367-4.275-3.979-7.538-8.27-7.47h-23.81c-1.237-.001-2.403-.574-3.16-1.552-.757-.978-1.019-2.251-.71-3.448 12-43.84 49.66-77.13 95.52-82.28 1.133-.123 2.265 .244 3.111 1.008 .846 .764 1.326 1.852 1.319 2.992v27.28c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.517 3.791 2.294 6.003 2.147 4.275-.367 7.538-3.979 7.47-8.27v-27.06c-.007-1.14 .473-2.228 1.319-2.992 .846-.764 1.978-1.131 3.111-1.008 45.818 5.149 83.82 37.807 95.8 82.33 .31 1.199 .046 2.474-.713 3.452-.759 .978-1.929 1.55-3.167 1.548h-24.08c-4.283-.058-7.883 3.202-8.25 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h27.92c2.156-.001 3.925 1.706 4 3.86 .06 1.37 .06 2.75 .06 4.14Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
