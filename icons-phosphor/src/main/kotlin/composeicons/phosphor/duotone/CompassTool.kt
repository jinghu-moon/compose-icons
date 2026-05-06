package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorDuotoneIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 80c0 17.673-14.327 32-32 32C110.327 112 96 97.673 96 80 96 62.327 110.327 48 128 48c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M215.12 123.64c1.403-2.555 1.305-5.67-.254-8.132-1.56-2.462-4.335-3.881-7.244-3.704-2.909 .177-5.492 1.923-6.741 4.556-7.396 14.247-18.927 25.925-33.08 33.5L151.22 112.54c12.95-9.247 19.187-25.289 15.885-40.855C163.803 56.12 151.588 43.992 136 40.8v-16.8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16.8C104.412 43.992 92.197 56.12 88.895 71.685c-3.302 15.565 2.935 31.608 15.885 40.855L56.69 220.75c-1.177 2.614-.865 5.659 .818 7.98 1.683 2.321 4.479 3.564 7.33 3.259 2.851-.306 5.32-2.113 6.472-4.739L96.45 170.69c10.143 3.532 20.81 5.327 31.55 5.31 10.746-.012 21.419-1.772 31.6-5.21l25.09 56.46c1.808 4.015 6.521 5.815 10.545 4.026 4.024-1.789 5.845-6.494 4.075-10.526l-25-56.25c17.482-9.099 31.733-23.367 40.81-40.86ZM128 56c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 104 104 93.255 104 80c0-13.255 10.745-24 24-24ZM128 160c-8.493 .01-16.934-1.34-25-4l16.42-36.94c5.665 1.253 11.535 1.253 17.2 0l16.48 37.06c-8.119 2.57-16.584 3.879-25.1 3.88Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
