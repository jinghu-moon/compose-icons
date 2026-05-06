package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) return _handsClapping!!
        _handsClapping = phosphorFillIcon(
            name = "HandsClapping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.87 65C183.899 56.371 172.874 53.404 164.245 58.375 155.616 63.346 152.649 74.371 157.62 83L133.36 41C128.389 32.379 117.371 29.419 108.75 34.39 100.129 39.361 97.169 50.379 102.14 59L96.4 49C91.429 40.379 80.411 37.419 71.79 42.39 63.169 47.361 60.209 58.379 65.18 67l3.34 5.77C58.4 70.259 47.759 74.037 41.488 82.368 35.217 90.698 34.529 101.969 39.74 111l3 5.2c-8.637 1.096-16.153 6.442-20.021 14.243-3.868 7.8-3.575 17.019 .781 24.557l35.27 61c18.099 31.309 54.924 46.618 89.885 37.366 34.96-9.252 59.393-40.772 59.635-76.936 14.535-22.663 15.195-51.547 1.71-74.85ZM190.07 192.56c-6.735 25.021-27.867 43.53-53.557 46.908C110.823 242.846 85.624 230.43 72.65 208L37.38 147c-2.761-4.788-1.118-10.909 3.67-13.67 4.788-2.761 10.909-1.118 13.67 3.67L75 172c2.209 3.83 7.105 5.144 10.935 2.935 3.83-2.209 5.144-7.105 2.935-10.935L53.62 103C50.859 98.201 52.511 92.071 57.31 89.31 62.109 86.549 68.239 88.201 71 93l31.81 55c2.209 3.83 7.105 5.144 10.935 2.935 3.83-2.209 5.144-7.105 2.935-10.935l-26-45C87.919 90.209 89.564 84.086 94.355 81.325c4.791-2.761 10.914-1.116 13.675 3.675l36.5 63c2.209 3.83 7.105 5.144 10.935 2.935 3.83-2.209 5.144-7.105 2.935-10.935L145.8 118.25c-1.978-4.779 .015-10.279 4.596-12.681 4.581-2.402 10.238-.914 13.044 3.431l20.22 35c8.545 14.682 10.854 32.174 6.41 48.57ZM160.22 24v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM193.44 30l8-13.1c2.3-3.778 7.227-4.975 11.005-2.675 3.778 2.3 4.975 7.227 2.675 11.005l-8 13.11c-1.455 2.383-4.048 3.834-6.84 3.83-2.896 .005-5.568-1.556-6.987-4.08-1.419-2.524-1.363-5.618 .147-8.09ZM238.44 63.66l-15.05 4.85c-.795 .255-1.625 .387-2.46 .39-3.947 .012-7.312-2.857-7.926-6.755-.614-3.899 1.707-7.663 5.466-8.865l15.06-4.85c4.206-1.356 8.714 .954 10.07 5.16 1.356 4.206-.954 8.714-5.16 10.07Z"),
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
        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
