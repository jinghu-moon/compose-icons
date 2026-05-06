package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorLightIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.9 181.42 197.31 144.82 160.71 24C158.705 17.396 153.399 12.318 146.713 10.605 140.028 8.892 132.933 10.794 128 15.62 123.067 10.794 115.972 8.892 109.287 10.605 102.601 12.318 97.295 17.396 95.29 24L58.69 144.82 22.1 181.42c-5.461 5.466-5.461 14.324 0 19.79l32.69 32.69c5.466 5.461 14.324 5.461 19.79 0l48.29-48.28c1.935-1.936 3.655-4.075 5.13-6.38 1.475 2.305 3.195 4.444 5.13 6.38l48.29 48.28c5.466 5.461 14.324 5.461 19.79 0l32.69-32.69c5.461-5.466 5.461-14.324 0-19.79ZM66.1 225.42c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L30.58 192.73c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L44.69 175.8l35.51 35.51ZM114.38 177.13 88.69 202.83 53.17 167.31 68.24 152.24c.698-.697 1.213-1.556 1.5-2.5l37-122.22c1.072-3.754 4.759-6.132 8.621-5.56 3.861 .572 6.701 3.917 6.639 7.82v129c.008 6.888-2.735 13.494-7.62 18.35ZM134 158.75v-129c.007-3.85 2.829-7.115 6.637-7.681 3.808-.565 7.457 1.739 8.583 5.421l37 122.22c.287 .944 .802 1.803 1.5 2.5l15.93 15.94-36.28 34.74L141.58 177.1c-4.87-4.863-7.599-11.468-7.58-18.35ZM225.42 192.75l-32.69 32.69c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587l-14-14 36.29-34.74 13.24 13.23c.76 .78 .755 2.025-.01 2.8Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
