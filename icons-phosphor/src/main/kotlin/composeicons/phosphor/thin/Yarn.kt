package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorThinIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 220h0-64.79c47.228-20.119 71.551-72.731 56.283-121.742C208.225 49.246 158.326 19.756 108.027 30.019 57.729 40.281 23.371 86.962 28.523 138.037 33.676 189.113 76.665 227.991 128 228h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 36c18.748-.021 37.05 5.718 52.43 16.44-12.7 5.24-24.881 11.662-36.38 19.18C126.592 60.218 107.593 51.371 87.63 45.35 100.192 39.181 114.005 35.982 128 36ZM77.85 50.91c20.862 5.46 40.761 14.094 59 25.6-9.236 6.577-17.952 13.855-26.07 21.77C92.164 87.987 71.852 81.118 50.81 78 57.838 67.185 67.048 57.958 77.85 50.91ZM46.44 85.46c20.466 2.639 40.28 8.986 58.47 18.73-7.562 7.914-14.528 16.377-20.84 25.32C69.18 122.411 53.141 118.029 36.71 116.57c1.352-10.869 4.648-21.407 9.73-31.11ZM55.76 184.9C42.943 168.705 35.979 148.653 36 128c0-1.16 0-2.3 .07-3.45 15.053 1.344 29.758 5.293 43.46 11.67-9.913 15.177-17.898 31.53-23.77 48.68ZM61.88 191.9C81.517 130.597 127.786 81.439 187.79 58.13c8.658 7.423 15.872 16.379 21.28 26.42-59.075 18.894-104.247 66.89-119.53 127C79.189 206.758 69.812 200.097 61.88 191.9ZM128 220c-10.566 .011-21.054-1.806-31-5.37C111.413 156.306 155.243 109.747 212.59 91.84c4.256 9.915 6.721 20.505 7.28 31.28C175.148 138.072 140.906 174.455 128.69 220ZM219.92 131.55c-1.826 45.867-37.138 83.393-82.81 88 11.854-40.939 42.667-73.682 82.81-88Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
