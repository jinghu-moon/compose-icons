package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GraduationCapLine: ImageVector
    get() {
        if (_graduationCapLine != null) return _graduationCapLine!!
        _graduationCapLine = remixIcon(
            name = "GraduationCapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 11.333 0 9 12 2 24 9v8.5h-2v-7.333l-2 1.167v6.678l-.223 .275C17.946 20.55 15.142 22 12 22 8.858 22 6.054 20.55 4.223 18.286L4 18.011v-6.678ZM6 12.5v4.792C7.467 18.954 9.611 20 12 20c2.389 0 4.533-1.046 6-2.708v-4.792L12 16 6 12.5ZM3.969 9 12 13.685 20.031 9 12 4.315 3.969 9Z"),
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
        return _graduationCapLine!!
    }

private var _graduationCapLine: ImageVector? = null
