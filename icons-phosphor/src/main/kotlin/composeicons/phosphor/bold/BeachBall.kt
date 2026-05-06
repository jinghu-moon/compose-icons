package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorBoldIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM212 128c-.007 4.943-.449 9.875-1.32 14.74-5.223-11.027-11.421-21.566-18.52-31.49 6.46 1.514 12.831 3.39 19.08 5.62 .497 3.689 .751 7.407 .76 11.13ZM202.39 89.06c-9.85-2.568-19.878-4.397-30-5.47C171.317 73.468 169.488 63.44 166.92 53.59c15.14 7.962 27.508 20.33 35.47 35.47ZM139.13 44.76c2.23 6.249 4.106 12.62 5.62 19.08C134.826 56.741 124.287 50.543 113.26 45.32c8.54-1.546 17.271-1.735 25.87-.56ZM81.07 58.36c17.802 5.714 34.604 14.169 49.8 25.06C100.732 86.335 71.619 95.916 45.64 111.47 50.023 89.803 62.748 70.728 81.07 58.36ZM45 140.65c30.45-22.04 67.031-34.005 104.62-34.22-.215 37.589-12.18 74.17-34.22 104.62C79.09 205.451 50.599 176.96 45 140.65ZM144.58 210.36c15.554-25.979 25.135-55.092 28.05-85.23 10.891 15.196 19.346 31.998 25.06 49.8-12.38 18.332-31.475 31.059-53.16 35.43Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
