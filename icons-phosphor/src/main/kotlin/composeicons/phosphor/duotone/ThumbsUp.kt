package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorDuotoneIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 104v104h-48c-4.418 0-8-3.582-8-8v-88c0-4.418 3.582-8 8-8Z"),
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
                pathData = parseSvgPathData("M234 80.12C229.443 74.956 222.887 71.999 216 72h-56v-16C160 33.909 142.091 16 120 16c-3.031-.002-5.803 1.709-7.16 4.42L75.06 96h-43.06c-8.837 0-16 7.163-16 16v88c0 8.837 7.163 16 16 16h172c12.098 .004 22.308-8.997 23.82-21l12-96C240.68 92.163 238.56 85.286 234 80.12ZM32 112h40v88h-40ZM223.94 97l-12 96c-.504 4.001-3.907 7.001-7.94 7h-116v-94.11L124.71 32.46C135.929 34.705 144.003 44.558 144 56v24c0 4.418 3.582 8 8 8h64c2.296-.001 4.483 .985 6.002 2.707 1.519 1.722 2.225 4.014 1.938 6.293Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
