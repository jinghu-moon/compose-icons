package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorThinIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.81 44.19C201.431 33.772 184.761 33.158 173.644 42.785c-11.117 9.627-12.892 26.214-4.064 37.975L80.76 169.58c-11.149-8.336-26.729-7.215-36.57 2.63h0c-10.557 10.576-10.949 27.578-.891 38.629 10.058 11.051 27.022 12.256 38.542 2.738 11.52-9.518 13.535-26.405 4.579-38.367L175.24 86.39c11.761 8.828 28.348 7.053 37.975-4.064 9.627-11.117 9.013-27.787-1.405-38.166ZM78.14 206.19c-5.719 5.721-14.322 7.433-21.797 4.338C48.869 207.433 43.996 200.14 43.996 192.05c0-8.09 4.873-15.383 12.348-18.478 7.474-3.095 16.077-1.383 21.797 4.338 7.781 7.805 7.781 20.435 0 28.24ZM206.14 78.19c-7.81 7.808-20.47 7.808-28.28 0h0c-5.721-5.719-7.433-14.322-4.338-21.797C176.617 48.919 183.91 44.046 192 44.046c8.09 0 15.383 4.873 18.478 12.348 3.095 7.474 1.383 16.077-4.338 21.797Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
