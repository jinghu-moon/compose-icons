package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorThinIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 99.77v76.23c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-76.23c18.986-2.123 33.007-18.706 31.944-37.78C162.881 42.915 147.104 27.993 128 27.993c-19.104 0-34.881 14.922-35.944 33.997C90.993 81.064 105.014 97.647 124 99.77ZM128 36c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 92 100 79.464 100 64c0-15.464 12.536-28 28-28ZM236 176c0 12.46-11.73 23.83-33 32-20.09 7.73-46.72 12-75 12C99.72 220 73.11 215.75 53 208 31.71 199.81 20 188.44 20 176c0-18.55 25.81-34.22 67.37-40.88 1.457-.34 2.983 .162 3.953 1.301 .971 1.139 1.224 2.725 .657 4.11-.567 1.385-1.86 2.338-3.35 2.469C52.93 148.74 28 162.3 28 176c0 17.39 40.18 36 100 36 59.82 0 100-18.61 100-36 0-13.7-24.93-27.26-60.63-33-1.468-.16-2.729-1.115-3.279-2.486-.55-1.37-.301-2.933 .649-4.064 .95-1.131 2.446-1.646 3.891-1.341C210.19 141.78 236 157.45 236 176Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
