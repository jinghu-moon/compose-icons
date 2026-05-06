package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorFillIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 136c-.007 19.88-10.553 38.267-27.71 48.31-17.157 10.043-38.352 10.237-55.69 .51l11.06 36.88c.727 2.422 .266 5.045-1.243 7.074-1.509 2.029-3.888 3.225-6.417 3.226h-48c-2.529-.001-4.908-1.197-6.417-3.226-1.509-2.029-1.97-4.652-1.243-7.074l11.06-36.88c-17.338 9.727-38.533 9.533-55.69-.51C34.553 174.267 24.007 155.88 24 136 24 104 41.65 73.16 75 46.73 90.311 34.655 107.071 24.54 124.89 16.62c1.969-.83 4.191-.83 6.16 0 17.84 7.916 34.62 18.031 49.95 30.11C214.35 73.16 232 104 232 136Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
