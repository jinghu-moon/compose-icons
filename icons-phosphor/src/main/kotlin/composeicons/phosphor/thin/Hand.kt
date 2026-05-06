package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorThinIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 52c-5.908-.004-11.608 2.179-16 6.13v-14.13C171.983 31.108 161.784 20.532 148.901 20.048c-12.883-.484-23.847 9.297-24.831 22.152C117.031 35.854 106.917 34.245 98.257 38.092 89.596 41.94 84.01 50.523 84 60v78L72.75 119.94C66.145 108.447 51.473 104.485 39.98 111.09c-11.493 6.605-15.455 21.277-8.85 32.77C64.44 214.12 82.17 236 128 236c46.371-.05 83.95-37.629 84-84v-76C212 62.745 201.255 52 188 52ZM204 152c-.05 41.953-34.047 75.95-76 76C90.71 228 74.41 216.49 38.29 140.29L38.14 140c-4.286-7.639-1.633-17.305 5.953-21.685 7.586-4.38 17.284-1.846 21.757 5.685 .027 .038 .05 .078 .07 .12l18.68 30c.943 1.521 2.781 2.231 4.502 1.738 1.72-.493 2.904-2.069 2.898-3.858v-92c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v60c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-76c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v76c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-44c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
