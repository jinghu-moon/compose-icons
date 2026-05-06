package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorBoldIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 84c19.882 0 36-16.118 36-36C188 28.118 171.882 12 152 12c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM152 36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM204 144v88c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-76.76c-24.92-3.37-33.94-17.29-41.38-28.76-1.55-2.39-3.05-4.71-4.67-6.88l-9.54 22L159 166.23c3.146 2.259 5.007 5.897 5 9.77v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-49.83L114.63 164.05 83 236.78c-1.633 4.047-5.334 6.889-9.665 7.421-4.331 .532-8.61-1.329-11.174-4.861C59.597 235.809 59.152 231.164 61 227.21L118.52 94.9c1.321-3.041 3.841-5.401 6.962-6.518 3.122-1.118 6.567-.894 9.518 .618 3.172 1.646 6.139 3.66 8.84 6 6.78 5.89 11.09 12.53 14.89 18.39C166.27 125 170.8 132 192 132c6.627 0 12 5.373 12 12ZM64.6 153.88 39.27 143C33.206 140.377 30.403 133.345 33 127.27l24-56C59.623 65.206 66.655 62.403 72.73 65L98.34 76c4.231 1.483 7.282 5.202 7.911 9.641 .629 4.439-1.27 8.859-4.922 11.459-3.653 2.6-8.45 2.947-12.439 .9L74.3 91.76 59.76 125.7l14.29 6.12c3.982 1.661 6.767 5.331 7.292 9.614 .526 4.283-1.289 8.518-4.752 11.092-3.463 2.574-8.041 3.091-11.991 1.354Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
