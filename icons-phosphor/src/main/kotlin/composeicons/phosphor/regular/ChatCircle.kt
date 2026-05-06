package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorRegularIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C91.477 23.992 57.627 43.143 38.822 74.453 20.017 105.763 19.014 144.642 36.18 176.88L24.83 210.93c-1.918 5.75-.421 12.09 3.865 16.375 4.286 4.286 10.626 5.782 16.375 3.865L79.12 219.82c38.207 20.321 85.005 14.86 117.505-13.713 32.501-28.573 43.911-74.286 28.651-114.781C210.016 50.831 171.275 24.018 128 24ZM128 216c-15.47 .011-30.669-4.063-44.06-11.81-1.983-1.15-4.365-1.394-6.54-.67L40 216 52.47 178.6c.727-2.174 .487-4.555-.66-6.54C31.866 137.578 37.571 93.999 65.721 65.814 93.87 37.629 137.442 31.868 171.949 51.769c34.507 19.901 51.343 60.5 41.045 98.98C202.697 189.229 167.834 215.993 128 216Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
