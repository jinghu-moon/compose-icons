package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorThinIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.18 59.79c-21.093-21.022-55.217-21.022-76.31 0L128 74.51 112.13 59.74C91.03 38.662 56.838 38.68 35.76 59.78c-21.078 21.1-21.06 55.292 .04 76.37l89.35 90.66c.752 .763 1.779 1.193 2.85 1.193 1.071 0 2.098-.43 2.85-1.193l89.33-90.64c10.131-10.127 15.822-23.865 15.822-38.19 0-14.325-5.692-28.063-15.822-38.19ZM214.51 130.53 128 218.3 41.47 130.51C23.504 112.544 23.504 83.416 41.47 65.45c17.966-17.966 47.094-17.966 65.06 0l.1 .1 18.64 17.36c1.537 1.435 3.923 1.435 5.46 0L149.37 65.55l.1-.1C161.013 53.436 178.149 48.603 194.268 52.814c16.119 4.211 28.701 16.809 32.893 32.933 4.191 16.124-.663 33.255-12.691 44.783Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
