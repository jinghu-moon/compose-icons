package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorRegularIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L73.55 80h-41.55C23.163 80 16 87.163 16 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c2.411 1.874 5.679 2.213 8.423 .871 2.744-1.341 4.485-4.127 4.487-7.181v-48.91l42.08 46.29c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM32 96h40v64h-40ZM144 207.64 88 164.09v-68.2l56 61.6ZM186 143.87c7.983-9.067 7.983-22.653 0-31.72-2.001-2.127-2.684-5.176-1.782-7.954 .902-2.778 3.247-4.843 6.117-5.388 2.869-.545 5.808 .518 7.665 2.771 13.313 15.113 13.313 37.767 0 52.88-2.924 3.314-7.981 3.629-11.295 .705-3.314-2.924-3.629-7.981-.705-11.295ZM105.84 67.87c-1.304-1.675-1.889-3.799-1.627-5.905 .263-2.106 1.351-4.022 3.027-5.325l39.85-31c2.418-1.88 5.698-2.214 8.446-.861 2.748 1.354 4.481 4.157 4.464 7.221v74.83c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-58.47l-26.94 21c-3.499 2.698-8.522 2.049-11.22-1.45ZM248 128c.011 19.682-7.242 38.676-20.37 53.34-2.965 3.208-7.956 3.445-11.211 .531-3.255-2.914-3.571-7.9-.709-11.201 21.728-24.294 21.728-61.036 0-85.33-1.96-2.121-2.625-5.135-1.739-7.884 .886-2.749 3.185-4.807 6.015-5.385 2.83-.577 5.752 .416 7.644 2.598C240.761 89.328 248.016 108.32 248 128Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
