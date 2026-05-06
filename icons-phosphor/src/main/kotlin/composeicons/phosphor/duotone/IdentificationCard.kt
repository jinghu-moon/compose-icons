package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorDuotoneIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-176c-4.418 0-8 3.582-8 8v144c0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8ZM96 144C82.745 144 72 133.255 72 120 72 106.745 82.745 96 96 96c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
                pathData = parseSvgPathData("M200 112c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM192 136h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM216 200v-144h-176v144h176ZM135.74 166c1.105 4.28-1.47 8.645-5.75 9.75-4.28 1.105-8.645-1.47-9.75-5.75C117.61 159.74 107.18 152 95.99 152c-11.19 0-21.61 7.74-24.25 18-1.105 4.28-5.47 6.855-9.75 5.75C57.71 174.645 55.135 170.28 56.24 166c2.596-9.662 8.733-17.994 17.19-23.34C64.239 133.523 61.466 119.744 66.408 107.763 71.349 95.783 83.03 87.965 95.99 87.965c12.96 0 24.641 7.817 29.582 19.798 4.942 11.981 2.169 25.76-7.022 34.897 8.467 5.338 14.609 13.672 17.2 23.34ZM96 136c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
