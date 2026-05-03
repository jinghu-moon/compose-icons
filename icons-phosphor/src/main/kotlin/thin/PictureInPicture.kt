package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = phosphorThinIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 ZM 36.000 192.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 L 220.000 124.000 L 136.000 124.000 C 133.791 124.000 132.000 125.791 132.000 128.000 L 132.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 ZM 216.000 196.000 L 140.000 196.000 L 140.000 132.000 L 220.000 132.000 L 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 Z"),
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
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
