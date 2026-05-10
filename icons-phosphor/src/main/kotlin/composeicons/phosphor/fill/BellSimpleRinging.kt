package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorFillIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 224c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM227.39 60.32C218.399 42.747 204.898 27.879 188.27 17.24c-2.417-1.544-5.476-1.676-8.018-.345-2.541 1.331-4.175 3.92-4.283 6.786-.108 2.866 1.327 5.571 3.761 7.089 14.266 9.075 25.824 21.825 33.46 36.91 2.098 3.791 6.834 5.223 10.681 3.229 3.847-1.994 5.407-6.689 3.519-10.589ZM35.71 72c2.988-.001 5.726-1.667 7.1-4.32C50.446 52.595 62.004 39.845 76.27 30.77c2.434-1.518 3.869-4.223 3.761-7.089-.108-2.866-1.742-5.456-4.283-6.786-2.541-1.331-5.6-1.199-8.018 .345C51.102 27.879 37.601 42.747 28.61 60.32c-1.285 2.479-1.183 5.449 .267 7.835 1.451 2.386 4.04 3.843 6.833 3.845ZM208 112C208 67.817 172.183 32 128 32 83.817 32 48 67.817 48 112c0 26.28-4.78 48.39-13.81 63.94-2.885 4.947-2.906 11.058-.055 16.025 2.851 4.967 8.138 8.031 13.865 8.035h160c5.723-.011 11.004-3.078 13.85-8.044 2.846-4.965 2.823-11.072-.06-16.016C212.78 160.38 208 138.27 208 112Z"),
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
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
