package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorBoldIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 12.672 .005 23.761 8.52 27.037 20.761 3.276 12.241-2.078 25.157-13.053 31.49-10.975 6.334-24.837 4.507-33.796-4.455C99.228 138.836 97.404 124.974 103.74 114c1.594-2.757 2.027-6.034 1.203-9.11-.823-3.076-2.836-5.699-5.593-7.29l-48.5-28C45.109 66.289 37.771 68.259 34.46 74 10.02 116.332 17.059 169.801 51.622 204.366c34.563 34.565 88.032 41.606 130.365 17.167 42.333-24.438 62.974-74.263 50.326-121.479C219.664 52.838 176.881 20.004 128 20ZM50 96.81l28.2 16.28C76.748 117.927 76.007 122.95 76 128c0 .5 0 1 0 1.5l-31.43 8.42C44.183 134.628 43.992 131.315 44 128c.007-10.683 2.043-21.267 6-31.19ZM50.83 161.11l31.43-8.43c7.058 13.036 19.325 22.456 33.74 25.91v32.54C87.062 206.9 62.387 187.967 50.81 161.11ZM140.02 211.11v-32.52c23.442-5.568 39.989-26.509 39.984-50.603C179.999 103.893 163.444 82.958 140 77.4v-32.55c41.333 5.96 72.011 41.379 72.011 83.14 0 41.761-30.678 77.18-72.011 83.14Z"),
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
