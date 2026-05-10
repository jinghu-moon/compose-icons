package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorFillIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 48c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C158.327 80 144 65.673 144 48ZM160 160c-4.418 0-8 3.582-8 8 0 26.51-21.49 48-48 48C77.49 216 56 194.51 56 168c0-26.51 21.49-48 48-48 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-35.346 0-64 28.654-64 64 0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64 0-4.418-3.582-8-8-8ZM200 128h-58.18L158.94 98.22c2.116-3.681 .987-8.373-2.57-10.69C121.199 64.665 75.254 67.285 42.91 94c-2.324 1.781-3.49 4.688-3.039 7.581 .45 2.893 2.445 5.308 5.2 6.298 2.755 .99 5.831 .396 8.019-1.549C77.92 85.878 112.577 82.267 141.09 97.16L121.06 132c-1.43 2.477-1.429 5.529 .003 8.005 1.432 2.476 4.077 3.999 6.937 3.995h62.24l-14.08 70.43c-.865 4.329 1.942 8.541 6.27 9.41 .517 .106 1.043 .16 1.57 .16 3.808-.007 7.083-2.696 7.83-6.43l16-80c.47-2.348-.137-4.783-1.653-6.636C204.661 129.081 202.394 128.004 200 128Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
