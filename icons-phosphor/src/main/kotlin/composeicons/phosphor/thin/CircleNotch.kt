package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorThinIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 88.6 50.9 52.63 86.33 36.37c2.008-.922 4.383-.043 5.305 1.965 .922 2.008 .043 4.383-1.965 5.305C57.07 58.6 36 91.71 36 128c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 91.71 198.93 58.6 166.33 43.64c-2.008-.922-2.887-3.297-1.965-5.305 .922-2.008 3.297-2.887 5.305-1.965C205.1 52.63 228 88.6 228 128Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
