package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorLightIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM194.48 122 134 61.52v-15.52h15.52L210 106.48v15.52ZM134 78.48 177.52 122h-43.52ZM210 48v41.52L166.48 46h41.52c1.105 0 2 .895 2 2ZM48 46h74v76h-76v-74c0-1.105 .895-2 2-2ZM106.48 210 46 149.52v-15.52h15.52L122 194.48v15.52ZM122 177.52 78.48 134h43.52ZM46 208v-41.52L89.52 210h-41.52c-1.105 0-2-.895-2-2ZM208 210h-74v-18h0v-58h76v74c0 1.105-.895 2-2 2Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
