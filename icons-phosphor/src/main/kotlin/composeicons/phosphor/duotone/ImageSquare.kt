package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorDuotoneIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h8.69L166.34 106.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L216 144.69v-96.69c0-4.418-3.582-8-8-8ZM96 112C87.163 112 80 104.837 80 96 80 87.163 87.163 80 96 80c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM48 48h160v77.38L183.31 100.68c-6.248-6.243-16.372-6.243-22.62 0L53.37 208h-5.37ZM208 208h-132l96-96 36 36v60ZM96 120c13.255 0 24-10.745 24-24C120 82.745 109.255 72 96 72 82.745 72 72 82.745 72 96c0 13.255 10.745 24 24 24ZM96 88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
