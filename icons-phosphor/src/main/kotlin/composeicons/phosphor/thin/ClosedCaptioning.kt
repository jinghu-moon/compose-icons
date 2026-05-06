package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorThinIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM228 192c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM115.46 153.71c.533 .919 .678 2.012 .404 3.038-.274 1.026-.945 1.901-1.864 2.432-15.13 8.732-34.345 5.341-45.574-8.041-11.228-13.383-11.228-32.895 0-46.278C79.655 91.479 98.87 88.088 114 96.82c1.809 1.15 2.39 3.522 1.317 5.377-1.073 1.856-3.418 2.536-5.317 1.543C98.232 96.958 83.293 99.601 74.565 110.008c-8.728 10.407-8.728 25.577 0 35.985 8.728 10.407 23.666 13.049 35.435 6.268 1.909-1.104 4.351-.456 5.46 1.45ZM195.46 153.71c.533 .919 .678 2.012 .404 3.038-.274 1.026-.945 1.901-1.864 2.432-15.13 8.732-34.345 5.341-45.574-8.041-11.228-13.383-11.228-32.895 0-46.278C159.655 91.479 178.87 88.088 194 96.82c1.809 1.15 2.39 3.522 1.317 5.377-1.073 1.856-3.418 2.536-5.317 1.543-11.768-6.782-26.707-4.139-35.435 6.268-8.728 10.407-8.728 25.577 0 35.985 8.728 10.407 23.666 13.049 35.435 6.268 1.909-1.104 4.351-.456 5.46 1.45Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
