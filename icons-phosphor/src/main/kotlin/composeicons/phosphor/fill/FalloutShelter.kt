package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorFillIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.94 124.55C230.17 70.06 185.94 25.83 131.45 24.06 102.694 23.133 74.837 34.149 54.493 54.493 34.149 74.837 23.133 102.694 24.06 131.45c1.77 54.49 46 98.72 100.49 100.49 28.756 .927 56.613-10.089 76.957-30.433 20.344-20.344 31.36-48.201 30.433-76.957ZM198.38 141.47l-23.45 32.83c-1.6 2.237-4.18 3.564-6.93 3.564-2.75 0-5.33-1.327-6.93-3.564L128 128 94.93 174.3c-1.6 2.237-4.18 3.564-6.93 3.564-2.75 0-5.33-1.327-6.93-3.564L57.62 141.47c-1.853-2.597-2.101-6.011-.642-8.848 1.459-2.837 4.381-4.621 7.572-4.622h63.45L97.62 85.47c-1.853-2.597-2.101-6.011-.642-8.848 1.459-2.837 4.381-4.621 7.572-4.622h46.9c3.19 .002 6.112 1.785 7.572 4.622 1.459 2.837 1.212 6.251-.642 8.848L128 128h63.45c3.19 .002 6.112 1.785 7.572 4.622 1.459 2.837 1.212 6.251-.642 8.848Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
