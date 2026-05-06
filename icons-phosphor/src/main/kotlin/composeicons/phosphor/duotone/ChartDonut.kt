package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorDuotoneIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96v-56c22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88v-56c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8 14.483 .003 27.158 9.733 30.904 23.723 3.746 13.99-2.371 28.752-14.914 35.992-12.543 7.24-28.385 5.153-38.626-5.088C95.124 140.385 93.039 124.542 100.28 112c1.061-1.838 1.349-4.022 .799-6.072-.55-2.05-1.891-3.797-3.729-4.858l-48.5-28c-1.838-1.061-4.022-1.349-6.072-.799-2.05 .55-3.797 1.891-4.858 3.729C14.385 116.764 21.163 168.252 54.445 201.537c33.282 33.284 84.771 40.065 125.536 16.533 40.765-23.532 60.643-71.51 48.465-116.977C216.267 55.625 175.07 24.006 128 24ZM48.09 91.1 83 111.26c-1.987 5.357-3.002 11.026-3 16.74 0 1.53 .08 3 .22 4.52L41.28 143c-3.037-17.59-.662-35.688 6.81-51.9ZM45.42 158.41l39-10.44c6.62 14.43 19.933 24.664 35.58 27.35v40.31C86.2 212.497 57.198 190.246 45.42 158.41ZM136 215.63v-40.31c23.085-3.913 39.979-23.911 39.979-47.325C175.979 104.581 159.085 84.583 136 80.67v-40.31c45.31 4.14 79.993 42.136 79.993 87.635 0 45.499-34.683 83.495-79.993 87.635Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
