package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorDuotoneIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 173c-2.197 2.786-5.967 3.791-9.26 2.47L171.58 158c-2.49-.997-4.315-3.174-4.86-5.8l-6.21-29.74c-.558-2.733-2.509-4.973-5.14-5.9-17.864-6.123-37.265-6.077-55.1 .13-2.651 .949-4.6 3.233-5.12 6l-5.9 29.51c-.547 2.628-2.376 4.806-4.87 5.8L35.29 175.42C32 176.767 28.215 175.781 26 173 11.4 154.17 12.74 129.17 30 111.88c53.11-53.11 142.77-53.11 195.88 0 17.35 17.24 18.69 42.24 4.12 61.12Z"),
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
                pathData = parseSvgPathData("M53.93 34.62C52.018 32.465 49.095 31.504 46.277 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L69.68 75.74C52.755 82.849 37.379 93.188 24.41 106.18c-20 20-21.92 49.46-4.69 71.67 4.341 5.554 11.805 7.614 18.38 5.07l49-17.37 .29-.11c5.022-2.008 8.69-6.417 9.75-11.72l5.9-29.51c2.804-.967 5.662-1.768 8.56-2.4l90.51 99.57c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM97.63 109.14c-5.3 1.889-9.219 6.422-10.32 11.94l-5.9 29.5L32.63 167.88c-.1 0-.17 .13-.27 .17-12.33-15.9-11-36.22 3.36-50.56C48.592 104.614 64.106 94.685 81.19 88.39l18.3 20.14c-.62 .2-1.24 .39-1.86 .61ZM236.28 177.85c-4.341 5.554-11.805 7.614-18.38 5.07l-9.25-3.28c-4.164-1.477-6.342-6.051-4.865-10.215 1.477-4.164 6.051-6.342 10.215-4.865l9.37 3.32 .3 .12c12.3-15.85 11-36.17-3.39-50.51C194.62 91.83 158.4 78.22 120.93 80.18c-4.418 .229-8.186-3.167-8.415-7.585-.229-4.418 3.167-8.186 7.585-8.415 42-2.19 82.63 13.1 111.49 42 19.99 19.99 21.92 49.46 4.69 71.67Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
