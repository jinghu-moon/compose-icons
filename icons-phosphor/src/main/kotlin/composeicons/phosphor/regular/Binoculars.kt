package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorRegularIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.2 151.87h0c-.668-1.864-1.453-3.685-2.35-5.45L193.26 51.8c-.393-.911-.957-1.739-1.66-2.44-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375C144.845 50.857 144.004 52.885 144 55v25h-32v-25c.002-2.122-.84-4.158-2.34-5.66C103.659 43.337 95.518 39.965 87.03 39.965c-8.488 0-16.629 3.372-22.63 9.375-.703 .701-1.267 1.529-1.66 2.44L21.15 146.4c-.897 1.765-1.682 3.586-2.35 5.45h0c-6.437 18.011-1.567 38.125 12.397 51.197 13.964 13.071 34.355 16.605 51.903 8.994C100.647 204.43 112.002 187.127 112 168v-72h32v72c-.01 19.129 11.34 36.438 28.888 44.055 17.548 7.617 37.943 4.087 51.91-8.984 13.967-13.071 18.84-33.188 12.402-51.201ZM76.71 59.75c5.481-4.615 13.361-5.023 19.29-1v73.51C83.288 120.846 65.46 117.066 49.21 122.34ZM64 200C46.327 200 32 185.673 32 168c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM160 58.74c5.929-4.023 13.809-3.615 19.29 1l27.5 62.58c-16.251-5.271-34.08-1.488-46.79 9.93ZM192 200c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
