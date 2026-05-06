package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorThinIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.49 211.12c-1.722 1.373-4.229 1.096-5.61-.62C219.54 208.82 188 168.48 188 88 188 54.863 161.137 28 128 28 94.863 28 68 54.863 68 88 68 168.48 36.47 208.82 35.12 210.5c-1.381 1.726-3.899 2.006-5.625 .625-1.726-1.381-2.006-3.899-.625-5.625C29.18 205.11 60 165.45 60 88 60 50.445 90.445 20 128 20c37.555 0 68 30.445 68 68 0 40.48 8.47 70.27 15.57 88.14 7.69 19.35 15.48 29.27 15.56 29.36 1.375 1.729 1.088 4.245-.64 5.62ZM100 92c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM164 100c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM97.79 132.42c-1.977-.989-4.381-.187-5.37 1.79-.989 1.977-.187 4.381 1.79 5.37l32 16c1.127 .564 2.453 .564 3.58 0l32-16c1.977-.989 2.779-3.393 1.79-5.37-.989-1.977-3.393-2.779-5.37-1.79L128 147.53ZM128 180c-18.147 .156-34.788 10.124-43.49 26.05-1.074 1.933-.378 4.371 1.555 5.445 1.933 1.074 4.371 .378 5.445-1.555 7.177-13.496 21.215-21.93 36.5-21.93 15.285 0 29.323 8.434 36.5 21.93 .704 1.269 2.039 2.057 3.49 2.06 .68 0 1.348-.175 1.94-.51 1.93-1.074 2.624-3.51 1.55-5.44C162.785 190.127 146.146 180.161 128 180Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
