package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorBoldIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.92 122.11c-.1-.19-.19-.37-.3-.56L196 68.85v-36.85C196 20.954 187.046 12 176 12h-96C68.954 12 60 20.954 60 32v36.87L30.38 121.55c-.112 .184-.212 .374-.3 .57-3.334 6.698-2.627 14.7 1.83 20.71 .09 .13 .18 .25 .28 .37l86.44 108.29c2.277 2.85 5.727 4.509 9.375 4.509 3.648 0 7.098-1.659 9.375-4.509L223.81 143.2c.1-.12 .19-.24 .28-.37 4.456-6.014 5.163-14.018 1.83-20.72ZM172 36v24h-88v-24ZM128 144c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM140 209.74v-43.93c15.368-5.797 24.395-21.752 21.449-37.911C158.502 111.74 144.425 99.998 128 99.998c-16.425 0-30.502 11.742-33.449 27.901-2.946 16.159 6.08 32.114 21.449 37.911v43.92L52.83 130.59 79 84h98l26.19 46.59Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
