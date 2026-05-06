package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorDuotoneIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 48c0 13.255-10.745 24-24 24C162.745 72 152 61.255 152 48c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M176 80c17.673 0 32-14.327 32-32C208 30.327 193.673 16 176 16c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM176 32c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM168 168c0 35.346-28.654 64-64 64C68.654 232 40 203.346 40 168c0-35.346 28.654-64 64-64 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM206.19 130.93c1.516 1.855 2.122 4.291 1.65 6.64l-16 80c-.748 3.737-4.029 6.428-7.84 6.43-.531 .001-1.06-.053-1.58-.16-4.328-.869-7.135-5.081-6.27-9.41L190.24 144h-62.24c-2.86 .004-5.505-1.519-6.937-3.995-1.432-2.476-1.433-5.528-.003-8.005L141.12 97.1C112.607 82.207 77.95 85.818 53.12 106.27c-2.161 2.065-5.294 2.753-8.121 1.783-2.828-.97-4.879-3.435-5.318-6.391-.439-2.957 .806-5.912 3.23-7.662C75.265 67.301 121.209 64.701 156.37 87.58c3.557 2.317 4.686 7.009 2.57 10.69L141.82 128h58.18c2.398-.001 4.67 1.075 6.19 2.93Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
