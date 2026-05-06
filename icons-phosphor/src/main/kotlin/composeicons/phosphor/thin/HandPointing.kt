package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorThinIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 92c-5.94-.007-11.67 2.2-16.07 6.19-.696-9.107-6.501-17.03-14.975-20.438C156.482 74.344 146.808 76.041 140 82.13v-38.13C140 30.745 129.255 20 116 20 102.745 20 92 30.745 92 44v94L80.75 119.94C74.106 108.466 59.419 104.551 47.945 111.195 36.471 117.839 32.556 132.526 39.2 144l4.68 8.25C61.21 182.8 72.66 203 85.66 216.33 99.28 230.3 113.86 236 136 236c46.371-.05 83.95-37.629 84-84v-36C220 102.745 209.255 92 196 92ZM212 152c-.05 41.953-34.047 75.95-76 76C96 228 84.65 207.92 50.84 148.29L46.15 140h0c-4.286-7.639-1.633-17.305 5.953-21.685 7.586-4.38 17.284-1.846 21.757 5.685 .027 .038 .05 .078 .07 .12l18.68 30c.946 1.511 2.779 2.213 4.493 1.722 1.714-.492 2.896-2.059 2.897-3.842v-108c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-4c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
