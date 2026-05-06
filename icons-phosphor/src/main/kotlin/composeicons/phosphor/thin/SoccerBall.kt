package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorThinIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM168.87 175.42 157.18 159.33l13.95-40.64 18.93-6.15 29.65 22.74c-1.11 14.203-5.528 27.949-12.9 40.14ZM87.13 175.42h-37.94C41.818 163.229 37.4 149.483 36.29 135.28L65.94 112.54l18.93 6.15 13.95 40.64ZM51.69 76.66l8.87 29.92L36 125.39c.482-17.406 5.925-34.313 15.69-48.73ZM106.13 156 92.77 117.08 128 92.85l35.23 24.23L149.87 156ZM195.44 106.58l8.87-29.92c9.765 14.417 15.208 31.324 15.69 48.73ZM198.31 68.74l-10.72 36.19-19 6.16L132 85.9v-19.8L164.68 43.64c12.986 5.678 24.492 14.266 33.63 25.1ZM155.54 40.21 128 59.15 100.46 40.21c17.931-5.613 37.149-5.613 55.08 0ZM91.32 43.64 124 66.1v19.8L87.36 111.09l-19-6.16L57.69 68.74C66.828 57.906 78.334 49.318 91.32 43.64ZM54.61 183.42h31.73l11.1 31.36C80.405 208.738 65.515 197.835 54.61 183.42ZM106.91 217.56 93.64 180.06 105.32 164h45.36l11.68 16.06-13.27 37.5c-13.872 3.253-28.308 3.253-42.18 0ZM158.56 214.78l11.1-31.36h31.73c-10.905 14.415-25.795 25.318-42.83 31.36Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
