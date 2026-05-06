package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorDuotoneIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 96l16 120h-33.66c-3.714 .001-6.94-2.554-7.79-6.17L32 80ZM168 96 152 216h33.66c3.714 .001 6.94-2.554 7.79-6.17L224 80Z"),
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
                pathData = parseSvgPathData("M229.52 74.21c-1.906-1.793-4.569-2.54-7.13-2C219.253 60.931 211.75 51.368 201.542 45.636 191.334 39.905 179.263 38.477 168 41.67 160.832 26.029 145.205 16 128 16c-17.205 0-32.832 10.028-40 25.67C76.74 38.473 64.669 39.895 54.46 45.621 44.251 51.347 36.744 60.905 33.6 72.18c-2.671-.548-5.437 .302-7.339 2.255-1.902 1.953-2.679 4.74-2.061 7.395L54.76 211.67c1.703 7.227 8.155 12.333 15.58 12.33h115.32c7.425 .003 13.877-5.103 15.58-12.33L231.79 81.83c.648-2.763-.215-5.662-2.27-7.62ZM76 56c4.572-.013 9.076 1.107 13.11 3.26 2.207 1.171 4.835 1.243 7.104 .195 2.268-1.048 3.917-3.095 4.456-5.535C103.523 41.116 114.882 32.009 128 32.009c13.118 0 24.477 9.107 27.33 21.911 .54 2.44 2.188 4.487 4.456 5.535 2.268 1.048 4.896 .976 7.104-.195 7.501-3.979 16.402-4.339 24.199-.98 7.798 3.359 13.65 10.076 15.911 18.26l-38.56 11L133.95 73.74c-3.813-1.525-8.067-1.525-11.88 0L87.57 87.56 49 76.54C52.356 64.4 63.405 55.995 76 56ZM159.25 101.11 145 208h-34L96.75 101.11 128 88.62ZM42.91 91.44l37.85 10.81L94.86 208h-24.52ZM185.66 208h-24.52L175.24 102.25 213.09 91.44Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
