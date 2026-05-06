package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorBoldIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.88 108.11l-25.53-51c-2.362-4.753-6.517-8.373-11.55-10.061-5.032-1.688-10.529-1.306-15.28 1.061L178.34 59.7 131.7 44.58c-2.407-.77-4.993-.77-7.4 0L77.66 59.7 54.48 48.11C49.729 45.743 44.232 45.361 39.2 47.049c-5.032 1.688-9.187 5.307-11.55 10.061l-25.53 51c-2.367 4.751-2.749 10.248-1.061 15.28 1.688 5.032 5.307 9.187 10.061 11.55l26.67 13.34 51.18 37.41c1.212 .887 2.579 1.541 4.03 1.93l62 16c.98 .25 1.988 .378 3 .38 3.182-.003 6.232-1.269 8.48-3.52l52.62-52.62 25.83-12.92c9.88-4.938 13.887-16.95 8.95-26.83ZM195.76 137.26 168.24 111.26c-4.731-4.476-12.17-4.361-16.76 .26-9.66 9.74-25.06 16.81-40.81 9.55l38.19-37h22.72l25.81 51.63ZM47.32 71.37 60.59 78l-22 43.9L25.32 115.27ZM154.32 178.67 101.23 165 59.23 134.34 85.17 82.5 128 68.61l1.69 .55L90 107.68l-.13 .12c-4.284 4.289-6.392 10.289-5.731 16.315 .661 6.026 4.019 11.427 9.131 14.685 20.95 13.39 46 12.07 66.33-2.73l19.2 18.15ZM217.32 121.9 195.32 78l13.27-6.63 21.95 43.9ZM118.55 219c-.795 3.082-2.783 5.722-5.525 7.338-2.742 1.617-6.014 2.078-9.095 1.282L77.33 220.75c-1.47-.379-2.854-1.034-4.08-1.93L48.92 201c-5.176-3.967-6.236-11.341-2.387-16.606 3.848-5.264 11.197-6.492 16.547-2.764l22.47 16.42 24.38 6.29c3.091 .795 5.738 2.788 7.355 5.539 1.618 2.751 2.073 6.033 1.265 9.121Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null
