package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorDuotoneIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.004 34.314-18.307 66.021-48.03 83.168-29.723 17.146-66.338 17.124-96.04-.058h0L42.54 223.58c-2.875 .959-6.045 .211-8.188-1.932-2.143-2.143-2.891-5.313-1.932-8.188L44.89 176.07h0C24.688 141.127 28.501 97.279 54.431 66.348 80.361 35.416 122.87 24.007 160.803 37.799 198.736 51.591 223.991 87.637 224 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
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
