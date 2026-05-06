package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorThinIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 144v-16c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM128 148c2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v24c0 2.209 1.791 4 4 4ZM160 148c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM212 76v104h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-92v24.4c10.06 2.053 16.931 11.391 15.899 21.606-1.032 10.215-9.631 17.99-19.899 17.99-10.267 0-18.867-7.775-19.899-17.99-1.032-10.215 5.839-19.553 15.899-21.606v-24.4h-92c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-104h-4C33.373 76 28 70.627 28 64v-16C28 41.373 33.373 36 40 36h176c6.627 0 12 5.373 12 12v16c0 6.627-5.373 12-12 12ZM128 220c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 68h176c2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4ZM204 76h-152v104h152Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
