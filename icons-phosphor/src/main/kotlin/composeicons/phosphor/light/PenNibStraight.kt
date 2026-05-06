package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorLightIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.54 124.77c-.042-.097-.092-.191-.15-.28L190 70.42v-38.42c0-7.732-6.268-14-14-14h-96C72.268 18 66 24.268 66 32v38.44L35.6 124.49c-.058 .089-.108 .183-.15 .28-2.32 4.691-1.83 10.284 1.27 14.5 .03 .034 .057 .071 .08 .11l86.44 112.28c1.136 1.476 2.893 2.341 4.755 2.341 1.862 0 3.619-.865 4.755-2.341L219.18 139.38c.023-.039 .05-.076 .08-.11 3.103-4.214 3.597-9.807 1.28-14.5ZM80 30h96c1.105 0 2 .895 2 2v34h-100v-34c0-1.105 .895-2 2-2ZM128 146c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM209.63 132.12 134 230.38v-73.09c12.835-3.044 21.356-15.217 19.824-28.319C152.292 115.87 141.191 105.992 128 105.992c-13.191 0-24.292 9.878-25.824 22.98-1.532 13.102 6.989 25.275 19.824 28.319v73.07L46.37 132.12c-.395-.566-.471-1.295-.2-1.93L75.52 78h105l29.34 52.19c.262 .64 .175 1.37-.23 1.93Z"),
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
