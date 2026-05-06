package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorBoldIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 168 148 96 167.2 81.6C170.222 79.334 172 75.777 172 72 172.011 48.757 153.943 29.515 130.745 28.065 107.548 26.615 87.224 43.457 84.34 66.52c-.828 6.578 3.832 12.582 10.41 13.41 6.578 .828 12.582-3.832 13.41-10.41 1.194-9.435 8.868-16.724 18.352-17.433 9.484-.708 18.155 5.36 20.738 14.513L121 86.24c-.15 .1-.29 .21-.43 .32L12 168c-6.887 5.165-9.696 14.158-6.974 22.325C7.749 198.491 15.391 204 24 204h208c8.609 0 16.251-5.509 18.974-13.675C253.696 182.158 250.887 173.165 244 168ZM36 180l92-69 92 69Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
