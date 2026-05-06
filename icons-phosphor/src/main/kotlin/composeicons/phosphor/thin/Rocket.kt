package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorThinIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 224c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM128 108c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM219.72 155l-12.37 55.6c-.881 4.05-3.806 7.349-7.72 8.71-1.285 .452-2.637 .686-4 .69-2.699-.002-5.318-.918-7.43-2.6L159.85 196h-63.7L67.81 217.4c-2.112 1.682-4.731 2.598-7.43 2.6-1.363-.004-2.715-.238-4-.69-3.914-1.361-6.839-4.66-7.72-8.71L36.28 155c-.804-3.629 .12-7.425 2.5-10.28L68.13 109.49C71.43 56.16 109.96 22.81 120.65 14.55c4.327-3.352 10.373-3.352 14.7 0 10.69 8.26 49.22 41.61 52.52 94.94l29.35 35.23c2.38 2.855 3.304 6.651 2.5 10.28ZM97.11 188h61.78C214.07 92.49 145 32.05 130.46 20.84c-1.446-1.128-3.474-1.128-4.92 0C111 32.05 41.93 92.49 97.11 188ZM89.59 190.93C75.12 165.56 68.93 142.52 68 122.06L44.92 149.8c-.793 .953-1.1 2.22-.83 3.43l12.36 55.63c.297 1.351 1.272 2.453 2.576 2.913 1.305 .46 2.755 .213 3.834-.653l.09-.07ZM211.08 149.8 188 122.06c-.89 20.46-7.08 43.5-21.55 68.87l26.64 20.12 .09 .07c1.079 .866 2.529 1.113 3.834 .653 1.305-.46 2.279-1.562 2.576-2.913l12.36-55.63c.259-1.216-.063-2.484-.87-3.43Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
