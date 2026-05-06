package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorDuotoneIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64v128c0 4.418-3.582 8-8 8h-136L45.15 230.11c-2.379 2.001-5.702 2.443-8.521 1.133C33.81 229.933 32.005 227.109 32 224v-160c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L44.46 48h-4.46C31.163 48 24 55.163 24 64v160c-.037 6.229 3.578 11.902 9.24 14.5 2.118 .983 4.425 1.495 6.76 1.5 3.759-.011 7.393-1.35 10.26-3.78l.08-.07L83 208h106.92l12.16 13.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM80 192c-1.921 .001-3.777 .693-5.23 1.95L40 224v-160h19L175.37 192ZM232 64v122c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-122h-110.21c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h110.21c8.837 0 16 7.163 16 16Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
