package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorFillIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM184 164c0 3.03-1.712 5.8-4.422 7.155-2.71 1.355-5.954 1.063-8.378-.755l-48-36C121.186 132.889 120 130.518 120 128v36c0 3.03-1.712 5.8-4.422 7.155-2.71 1.355-5.954 1.063-8.378-.755l-48-36C57.186 132.889 56 130.518 56 128c0-2.518 1.186-4.889 3.2-6.4l48-36c2.424-1.818 5.667-2.111 8.378-.755C118.288 86.2 120 88.97 120 92v36c0-2.518 1.186-4.889 3.2-6.4l48-36c2.424-1.818 5.667-2.111 8.378-.755C182.288 86.2 184 88.97 184 92Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
