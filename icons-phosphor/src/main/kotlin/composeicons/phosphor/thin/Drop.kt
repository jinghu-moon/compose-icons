package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorThinIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171 50.38C158.862 36.355 145.202 23.724 130.27 12.72c-1.376-.961-3.204-.961-4.58 0C110.772 23.726 97.125 36.357 85 50.38 58.17 81.21 44 113.58 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 113.58 197.83 81.21 171 50.38ZM128 220C86.045 219.956 52.044 185.955 52 144 52 108.1 73.15 76.2 90.9 55.76 102.078 42.966 114.506 31.322 128 21c13.496 10.334 25.924 21.992 37.1 34.8C182.85 76.2 204 108.1 204 144c-.044 41.955-34.045 75.956-76 76ZM179.94 152.67c-3.941 22.064-21.215 39.334-43.28 43.27-.218 .04-.439 .06-.66 .06-2.069-.015-3.785-1.606-3.957-3.669-.171-2.062 1.258-3.915 3.297-4.271 18.18-3.06 33.63-18.51 36.72-36.73 .447-2.098 2.468-3.469 4.583-3.11 2.114 .36 3.569 2.323 3.297 4.45Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
