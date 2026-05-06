package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorRegularIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.29 114.85l-5.06 4.37c-3.347 2.886-8.399 2.512-11.285-.835-2.886-3.347-2.512-8.399 .835-11.285l5.06-4.37c.12-.1 .23-.19 .13-.5-.1-.31-.18-.27-.34-.29l-8.27-.67c-2.914-.144-5.519-1.863-6.797-4.487-1.278-2.623-1.026-5.734 .657-8.118 1.683-2.384 4.531-3.662 7.43-3.335l8.27 .66c6.6 .558 12.223 5.018 14.268 11.319 2.045 6.3 .115 13.213-4.898 17.541ZM172.58 152.64l4.08 17.22c.853 3.608 4.073 6.157 7.78 6.16 .623 0 1.244-.074 1.85-.22 2.065-.489 3.851-1.779 4.965-3.585 1.114-1.806 1.465-3.981 .975-6.045l-3-12.49 8-6.86c3.347-2.886 3.721-7.938 .835-11.285-2.886-3.347-7.938-3.721-11.285-.835l-11.64 10c-2.275 1.957-3.263 5.023-2.56 7.94ZM201.71 206.17c-1.019-4.3-5.33-6.959-9.63-5.94-4.3 1.019-6.959 5.33-5.94 9.63l1.32 5.58c.08 .18 .005 .391-.17 .48-.18 .14-.23 .11-.38 0l-6.72-4.13c-3.764-2.314-8.691-1.139-11.005 2.625-2.314 3.764-1.139 8.691 2.625 11.005l6.72 4.13c5.652 3.432 12.812 3.134 18.159-.756 5.347-3.89 7.836-10.61 6.311-17.044ZM175.36 98.05 159.72 96.78c-2.984-.253-5.578-2.151-6.72-4.92L136 50.78v133.85l7.43 4.57c3.764 2.314 4.939 7.241 2.625 11.005-2.314 3.764-7.241 4.939-11.005 2.625L128 198.49 77.47 229.57c-5.655 3.437-12.822 3.138-18.172-.757C53.948 224.917 51.464 218.187 53 211.75L66.76 153.68 21.76 114.85C16.757 110.526 14.828 103.629 16.86 97.337 18.893 91.045 24.493 86.58 31.08 86L90.08 81.24 112.84 26.16c2.52-6.14 8.499-10.149 15.135-10.149 6.636 0 12.615 4.009 15.135 10.149l22.75 55.08 10.76 .87c4.418 .356 7.711 4.227 7.355 8.645-.356 4.418-4.227 7.711-8.645 7.355ZM120 184.63v-133.85L103 91.86c-1.147 2.778-3.754 4.678-6.75 4.92l-63.92 5.16c-.15 0-.24 0-.33 .29-.095 .178-.039 .399 .13 .51l48.7 42c2.264 1.951 3.251 5.002 2.56 7.91L68.51 215.45c-.08 .18-.005 .391 .17 .48 .18 .14 .23 .11 .38 0Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
