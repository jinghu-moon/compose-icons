package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorThinIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 76c-3.327-0-6.65 .247-9.94 .74C160.534 66.622 153.077 57.686 144.11 50.44 107.61 21 57.55 27.74 55.43 28c-1.642 .235-2.969 1.459-3.336 3.077-.366 1.618 .304 3.294 1.686 4.213C73.74 48.64 82 71.09 85 92.08 53.66 93.427 27.308 116.037 21.215 146.809c-6.093 30.771 9.654 61.718 38.115 74.906 28.462 13.189 62.252 5.196 81.789-19.345 24.647 14.73 55.89 12.392 78.069-5.843 22.18-18.235 30.516-48.436 20.83-75.466C230.333 94.031 204.713 75.998 176 76ZM66.62 35.27c16-.4 48 1.66 72.47 21.39 7.519 6.079 13.872 13.472 18.75 21.82-13.806 3.849-26.051 11.945-35 23.14C113.821 96.218 103.664 92.999 93.18 92.22 89.88 67.78 80.83 48.37 66.62 35.27ZM88 220C55.402 219.818 28.913 193.64 28.345 161.046c-.568-32.594 24.993-59.678 57.565-60.996 1.065 13.273 .635 26.623-1.28 39.8-11.7-.93-17.56-6.44-17.8-6.68-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66 .38 .37 9.37 9.17 26.83 9.17 17.46 0 26.45-8.8 26.83-9.17 1.568-1.557 1.577-4.092 .02-5.66-1.557-1.568-4.092-1.577-5.66-.02-.25 .25-5.65 5.35-16.43 6.58C94.587 126.669 95.003 113.45 94 100.3c31.813 3.193 55.533 30.771 53.932 62.704C146.332 194.936 119.972 220.004 88 220ZM176 204c-10.627 .014-21.066-2.806-30.24-8.17 18.437-29.639 11.382-68.43-16.31-89.68 8.248-10.109 19.555-17.268 32.22-20.4 5.17 11 8.49 23.68 9.93 38-11-1.16-16.53-6.36-16.77-6.59-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66 .38 .37 9.37 9.17 26.83 9.17 17.46 0 26.45-8.8 26.83-9.17 1.568-1.557 1.577-4.092 .02-5.66-1.557-1.568-4.092-1.577-5.66-.02-.26 .25-6 5.68-17.55 6.68q-2.1-22.14-9.81-39.49c22.079-2.325 43.637 7.732 56.042 26.143 12.405 18.412 13.63 42.168 3.184 61.758C218.61 191.821 198.201 204.042 176 204Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
