package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorRegularIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 40C160 22.327 145.673 8 128 8 110.327 8 96 22.327 96 40c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM128 56c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM218.34 134.05 173.17 82.83C167.095 75.943 158.353 71.999 149.17 72h-42.34c-9.183-.001-17.925 3.943-24 10.83L37.66 134.05c-7.632 7.806-7.595 20.289 .083 28.049 7.678 7.76 20.161 7.93 28.047 .381L82.09 149.4 65.55 212.28c-4.562 10.065-.1 21.923 9.965 26.485 10.065 4.562 21.923 .1 26.485-9.965l26-44.87 26 44.87c4.758 9.712 16.375 13.883 26.224 9.414 9.849-4.469 14.361-15.957 10.186-25.934L173.91 149.4l16.3 13.08c7.886 7.549 20.368 7.379 28.047-.381 7.678-7.76 7.715-20.244 .083-28.049ZM206.83 150.82c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173-.21-.2-.42-.4-.65-.58L165 121.76c-2.688-2.146-6.447-2.333-9.336-.465-2.888 1.868-4.259 5.373-3.404 8.705l22.88 87c.118 .464 .279 .916 .48 1.35 .628 1.299 .508 2.835-.313 4.021-.822 1.186-2.219 1.837-3.655 1.704-1.437-.133-2.69-1.029-3.281-2.345-.098-.216-.208-.426-.33-.63L134.92 164c-1.431-2.467-4.068-3.986-6.92-3.986-2.852 0-5.489 1.519-6.92 3.986L88 221.05c-.122 .204-.232 .414-.33 .63-.449 .963-1.262 1.707-2.26 2.07-1.521 .558-3.229 .142-4.324-1.052-1.095-1.194-1.362-2.931-.676-4.398 .201-.434 .362-.886 .48-1.35L103.74 130c.855-3.332-.516-6.837-3.404-8.705-2.888-1.868-6.647-1.681-9.336 .465L55.48 150.24c-.23 .18-.44 .38-.65 .58-1 1.055-2.494 1.484-3.901 1.121-1.407-.363-2.507-1.461-2.873-2.868-.365-1.407 .061-2.901 1.114-3.903 .12-.12 .23-.24 .34-.37L94.83 93.41c3.039-3.441 7.409-5.412 12-5.41h42.34c4.591-.002 8.961 1.969 12 5.41l45.32 51.39c.11 .13 .22 .25 .34 .37 1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
