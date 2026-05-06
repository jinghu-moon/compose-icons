package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) return _webhooksLogo!!
        _webhooksLogo = phosphorLightIcon(
            name = "WebhooksLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.37 174h-69.77c-2.515 19.114-16.682 34.631-35.488 38.872C55.306 217.113 35.851 209.178 25.376 192.993 14.901 176.809 15.629 155.81 27.2 140.39c1.991-2.651 5.754-3.186 8.405-1.195 2.651 1.991 3.186 5.754 1.195 8.405C32.365 153.474 29.977 160.64 30 168c0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34 0-3.314 2.686-6 6-6h75.37c2.806-5.915 9.337-9.096 15.724-7.658 6.387 1.438 10.925 7.111 10.925 13.658 0 6.547-4.538 12.22-10.925 13.658-6.387 1.438-12.918-1.743-15.724-7.658ZM64 182c5.129-.005 9.845-2.815 12.291-7.324 2.446-4.508 2.231-9.993-.561-14.296l36.42-59.18c.829-1.359 1.085-2.992 .71-4.539-.375-1.547-1.35-2.882-2.71-3.711C97.696 85.266 91.556 70.475 94.907 56.23 98.258 41.985 110.347 31.482 124.92 30.155c14.573-1.327 28.361 6.82 34.23 20.225 .828 2.008 2.676 3.412 4.832 3.671 2.156 .259 4.284-.668 5.564-2.423 1.279-1.755 1.511-4.064 .604-6.038C162.521 28.101 144.887 17.137 125.827 18.033 106.767 18.929 90.239 31.499 84.284 49.626 78.33 67.754 84.184 87.676 99 99.7L65.52 154.08c-.5-.05-1-.08-1.52-.08-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14ZM192 122c-6.478-.005-12.885 1.358-18.8 4L139.73 71.61c3.482-5.376 2.871-12.429-1.483-17.127-4.354-4.698-11.341-5.841-16.965-2.777-5.625 3.064-8.452 9.554-6.867 15.76C116 73.671 121.595 78.01 128 78c.508 0 1.016-.03 1.52-.09l36.4 59.17c.841 1.353 2.181 2.319 3.73 2.69 1.547 .366 3.176 .104 4.53-.73 12.273-7.549 27.971-6.543 39.179 2.512 11.208 9.054 15.492 24.19 10.692 37.776C219.251 192.913 206.409 201.997 192 202c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 25.405 0 46-20.595 46-46 0-25.405-20.595-46-46-46Z"),
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
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
