package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorDuotoneIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 200c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M200 168c-14.591 .014-27.332 9.878-31 24h-97C54.327 192 40 177.673 40 160c0-17.673 14.327-32 32-32h96c22.091 0 40-17.909 40-40C208 65.909 190.091 48 168 48h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24h-96c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48h97c4.157 16.099 19.951 26.333 36.344 23.548 16.393-2.785 27.921-17.66 26.528-34.229C230.478 180.75 216.627 168.008 200 168ZM200 216c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
