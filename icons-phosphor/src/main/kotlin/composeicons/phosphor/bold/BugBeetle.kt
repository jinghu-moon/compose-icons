package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorBoldIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 160c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-16h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-13.55C207.668 81.684 201.195 68.344 191.67 57.3L208.49 40.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-18 18c-27.707-17.973-63.393-17.973-91.1 0l-18-18c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L64.33 57.3C54.805 68.344 48.332 81.684 45.55 96h-13.55c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v16h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12c.001 5.371 .52 10.729 1.55 16h-13.55c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h22.15c14.686 27.095 43.031 43.973 73.85 43.973 30.819 0 59.164-16.877 73.85-43.973h22.15c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-13.55c1.03-5.271 1.549-10.629 1.55-16ZM128 52c26.961 .037 50.598 18.025 57.82 44h-115.64C77.402 70.025 101.039 52.037 128 52ZM140 218.79v-70.79c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v70.79C88.083 213.056 68.034 188.5 68 160v-40h120v40c-.034 28.5-20.083 53.056-48 58.79Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
